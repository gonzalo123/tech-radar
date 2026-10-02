---
title: "GitHub Copilot añade computer use para controlar aplicaciones de escritorio"
description: "Copilot CLI y la aplicación de Copilot pueden interactuar con interfaces gráficas en macOS y Windows, incluidos flujos sin API, CLI ni MCP."
date: 2026-10-02

source: "GitHub"
source_url: "https://github.blog/changelog/2026-10-01-github-copilot-can-now-interact-with-desktop-apps/"

category: "DevTools"

tags:
  - copilot
  - agents
  - computer-use

featured: true
priority: 96
placement: lead
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-10-02T07:17:00+02:00
---

GitHub ha añadido **computer use** en public preview a Copilot CLI y a la aplicación de GitHub Copilot para macOS y Windows. La función permite al agente leer contenido accesible y contexto visual, pulsar controles, escribir texto, usar el teclado, hacer scroll, arrastrar elementos y recorrer flujos entre aplicaciones.

La principal consecuencia es que Copilot puede automatizar tareas en software legacy o aplicaciones que solo ofrecen interfaz gráfica y carecen de API, CLI o integración MCP. Esto amplía el alcance del agente más allá del código y de las herramientas diseñadas específicamente para automatización.

Copilot solicita aprobación antes de tomar el control de una aplicación. En macOS también guía al usuario para conceder los permisos necesarios de Accesibilidad y Grabación de pantalla, y las organizaciones pueden desactivar la capacidad mediante políticas administradas.

En Copilot CLI se activa con `/computer on`; en la aplicación de escritorio se habilita desde la configuración de Computer Use. GitHub mantiene la funcionalidad en public preview, por lo que su comportamiento y disponibilidad pueden cambiar.