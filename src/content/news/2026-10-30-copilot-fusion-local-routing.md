---
title: "Copilot Fusion empieza a seleccionar modelos locales y en la nube"
description: "La vista previa experimental permite enrutar tareas hacia modelos ejecutados en el dispositivo, aunque las decisiones de enrutamiento siguen realizándose en la nube."
date: 2026-10-30
source: "GitHub"
source_url: "https://github.blog/changelog/2026-10-28-github-copilot-fusion-now-supports-selection-of-local-models/"
category: "DevTools"
tags:
  - copilot
  - local-models
  - inference
featured: false
priority: 7
placement: normal
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-10-30T07:24:00+01:00
---

GitHub anunció el 28 de octubre una vista previa experimental de enrutamiento entre modelos locales y modelos en la nube para Copilot Fusion. La función permite utilizar recursos del propio dispositivo sin cambiar manualmente de modelo para cada solicitud.

En equipos Windows compatibles, el modelo MAI Code 1.1 Flash puede descargarse y configurarse mediante Windows ML. Copilot CLI también admite servidores locales compatibles con la API de OpenAI en Windows, macOS y Linux, con modelos admitidos como MAI Code 1.1 Flash y Qwen3.8 Flash Next.

Para activar el enrutamiento experimental se selecciona el nivel Standard de Copilot Fusion después de configurar el proveedor local. La experiencia administrada de descarga es exclusiva de Windows, mientras que la configuración manual requiere instalar y mantener el servidor de inferencia.

Una advertencia importante: ejecutar la inferencia local no convierte la sesión en completamente desconectada. Copilot Fusion sigue tomando las decisiones de enrutamiento en la nube. Por tanto, antes de usarlo con código sensible deben revisarse los flujos de datos y las políticas aplicables.

Fuente: [GitHub](https://github.blog/changelog/2026-10-28-github-copilot-fusion-now-supports-selection-of-local-models/).
