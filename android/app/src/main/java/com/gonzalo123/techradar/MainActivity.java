package com.gonzalo123.techradar;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.*;
import android.widget.*;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

public class MainActivity extends Activity {
    private static final String HOME = "https://gonzalo123.github.io/tech-radar/";
    private WebView web;
    private LinearLayout error;
    private ProgressBar progress;
    private SwipeRefreshLayout refresh;
    private String retryUrl = HOME;

    @Override public void onCreate(Bundle state) {
        super.onCreate(state);
        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setBackgroundColor(0xFFF5F1E8);
        root.setOnApplyWindowInsetsListener((v, insets) -> {
            v.setPadding(insets.getSystemWindowInsetLeft(), insets.getSystemWindowInsetTop(),
                insets.getSystemWindowInsetRight(), insets.getSystemWindowInsetBottom());
            return insets;
        });
        progress = new ProgressBar(this, null, android.R.attr.progressBarStyleHorizontal);
        progress.setVisibility(View.GONE);
        root.addView(progress, new LinearLayout.LayoutParams(-1, 6));
        error = new LinearLayout(this); error.setOrientation(LinearLayout.VERTICAL);
        error.setPadding(24, 32, 24, 24);
        TextView message = new TextView(this);
        message.setText("No se ha podido cargar la página. Comprueba tu conexión a Internet.");
        Button retry = new Button(this); retry.setText("Reintentar");
        retry.setOnClickListener(v -> web.loadUrl(retryUrl));
        error.addView(message); error.addView(retry); error.setVisibility(View.GONE); root.addView(error);
        web = new WebView(this);
        web.getSettings().setJavaScriptEnabled(true);
        web.getSettings().setDomStorageEnabled(true);
        web.getSettings().setAllowFileAccess(false);
        web.getSettings().setAllowContentAccess(false);
        web.getSettings().setMixedContentMode(WebSettings.MIXED_CONTENT_NEVER_ALLOW);
        web.getSettings().setSupportMultipleWindows(true);
        web.setWebViewClient(new WebViewClient() {
            @Override public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                if (!request.isForMainFrame()) return false;
                Uri uri = request.getUrl();
                if (isInternal(uri)) return false;
                openExternal(uri); return true;
            }
            @Override public void onPageStarted(WebView view, String url, android.graphics.Bitmap icon) {
                error.setVisibility(View.GONE); web.setVisibility(View.VISIBLE);
                refresh.setEnabled(true);
                progress.setVisibility(refresh.isRefreshing() ? View.GONE : View.VISIBLE);
                if (isInternal(Uri.parse(url))) retryUrl = url;
            }
            @Override public void onPageFinished(WebView view, String url) {
                progress.setVisibility(View.GONE);
                refresh.setRefreshing(false);
            }
            @Override public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError failure) {
                if (request.isForMainFrame()) showError();
            }
            @Override public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse response) {
                if (request.isForMainFrame()) showError();
            }
        });
        web.setWebChromeClient(new WebChromeClient() {
            @Override public void onProgressChanged(WebView view, int value) { progress.setProgress(value); }
            @Override public boolean onCreateWindow(WebView view, boolean dialog, boolean gesture, android.os.Message result) {
                if (!gesture) return false;
                WebView popup = new WebView(MainActivity.this);
                popup.setWebViewClient(new WebViewClient() {
                    @Override public boolean shouldOverrideUrlLoading(WebView v, WebResourceRequest request) {
                        Uri uri = request.getUrl();
                        if (isInternal(uri)) web.loadUrl(uri.toString()); else openExternal(uri);
                        v.destroy(); return true;
                    }
                });
                ((WebView.WebViewTransport) result.obj).setWebView(popup);
                result.sendToTarget(); return true;
            }
        });
        refresh = new SwipeRefreshLayout(this);
        refresh.setColorSchemeColors(0xFFB13B2E);
        refresh.setProgressBackgroundColorSchemeColor(0xFFF5F1E8);
        // Only intercept the downward gesture when the page is already at the top.
        refresh.setOnChildScrollUpCallback((parent, child) -> web.canScrollVertically(-1));
        refresh.setOnRefreshListener(() -> web.reload());
        refresh.addView(web);
        root.addView(refresh, new LinearLayout.LayoutParams(-1, 0, 1)); setContentView(root);
        if (state == null || web.restoreState(state) == null) web.loadUrl(HOME);
    }
    private boolean isInternal(Uri uri) {
        return "https".equals(uri.getScheme()) && "gonzalo123.github.io".equals(uri.getHost())
            && (uri.getPort() == -1 || uri.getPort() == 443)
            && uri.getPath() != null && uri.getPath().startsWith("/tech-radar/");
    }
    private void openExternal(Uri uri) {
        String scheme = uri.getScheme();
        if (!"https".equals(scheme) && !"http".equals(scheme) && !"mailto".equals(scheme) && !"tel".equals(scheme)) return;
        try { startActivity(new Intent(Intent.ACTION_VIEW, uri).addCategory(Intent.CATEGORY_BROWSABLE)); }
        catch (ActivityNotFoundException e) { Toast.makeText(this, "No hay una aplicación para abrir este enlace", Toast.LENGTH_SHORT).show(); }
    }
    private void showError() {
        refresh.setRefreshing(false);
        refresh.setEnabled(false);
        web.setVisibility(View.GONE);
        error.setVisibility(View.VISIBLE);
        progress.setVisibility(View.GONE);
    }
    @Override public void onBackPressed() { if (web.canGoBack()) web.goBack(); else super.onBackPressed(); }
    @Override protected void onSaveInstanceState(Bundle state) { web.saveState(state); super.onSaveInstanceState(state); }
    @Override protected void onDestroy() { web.destroy(); super.onDestroy(); }
}
