# gonzalo123 Tech Radar

Web estática de noticias construida con Astro y Content Collections. El contenido vive en `src/content/news/`: para publicar una noticia basta con añadir un `.md` con el frontmatter documentado en los ejemplos.

## Desarrollo

```sh
npm install
npm run dev
```

En VS Code puedes pulsar `F5` y elegir **Astro: iniciar servidor**. Esto arranca Astro en la terminal integrada sin abrir ningún navegador.

En GitHub Pages, el workflow calcula automáticamente `SITE` y `BASE` para un repositorio de proyecto (`https://usuario.github.io/nombre-repo/`). En un repositorio de usuario o dominio propio, ajusta `SITE` y deja `BASE` vacío en `.github/workflows/deploy.yml`. El workflow despliega desde `main`; en la configuración del repositorio activa Pages usando **GitHub Actions** como fuente.

## App Android (APK)

El proyecto Android de `android/` muestra la web publicada en
`https://gonzalo123.github.io/tech-radar/` mediante WebView. Requiere Internet;
las noticias nuevas aparecen sin reinstalar la app. Incluye portada, recarga,
navegación con Atrás, enlaces externos en el navegador y reintento de conexión.
Android mínimo: 8.0 (API 26). Identificador: `com.gonzalo123.techradar`.

### Compilar e instalar

Necesitas JDK 17 o 21 y Android SDK con la plataforma 35. Abre `android/`
en Android Studio o configura `ANDROID_HOME` con la ruta a tu SDK
(alternativamente, crea `android/local.properties` con `sdk.dir=/ruta/al/sdk`).

```sh
npm run android:apk
# APK generado: android/app/build/outputs/apk/debug/app-debug.apk
adb install -r android/app/build/outputs/apk/debug/app-debug.apk
```

También puedes copiar el APK al teléfono, abrirlo y permitir la instalación
para la aplicación desde la que lo abres cuando Android lo solicite.
El APK de desarrollo está firmado con la clave debug local y es instalable;
para distribuir una versión definitiva o publicar en Google Play, genera una
versión release con una clave propia desde Android Studio (Build > Generate
Signed App Bundle / APK). Conserva esa clave para firmar futuras actualizaciones.
No subas claves ni contraseñas al repositorio.

El icono se define en `android/app/src/main/res/drawable/ic_launcher.xml`;
la URL y navegación en `android/app/src/main/java/com/gonzalo123/techradar/MainActivity.java`.
Implementación basada en la [documentación de WebView de Android](https://developer.android.com/develop/ui/views/layout/webapps/webview).
