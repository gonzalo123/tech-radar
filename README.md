# gonzalo123 Tech Radar

Web estática de noticias construida con Astro y Content Collections. El contenido vive en `src/content/news/`: para publicar una noticia basta con añadir un `.md` con el frontmatter documentado en los ejemplos.

## Desarrollo

```sh
npm install
npm run dev
```

En VS Code puedes pulsar `F5` y elegir **Astro: iniciar servidor**. Esto arranca Astro en la terminal integrada sin abrir ningún navegador.

En GitHub Pages, el workflow calcula automáticamente `SITE` y `BASE` para un repositorio de proyecto (`https://usuario.github.io/nombre-repo/`). En un repositorio de usuario o dominio propio, ajusta `SITE` y deja `BASE` vacío en `.github/workflows/deploy.yml`. El workflow despliega desde `main`; en la configuración del repositorio activa Pages usando **GitHub Actions** como fuente.
