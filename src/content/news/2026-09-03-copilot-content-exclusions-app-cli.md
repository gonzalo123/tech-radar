---
title: "GitHub Copilot aplica las exclusiones de contenido también en la app y la CLI"
description: "Las políticas de exclusión configuradas por administradores ya se respetan en GitHub Copilot app y Copilot CLI para evitar usar ficheros sensibles como contexto."
date: 2026-09-03

source: "GitHub"
source_url: "https://github.blog/changelog/2026-09-02-content-exclusions-generally-available-in-copilot-app-and-cli/"

category: "DevTools"

tags:
  - copilot
  - security
  - agents

featured: false
priority: 88
placement: secondary
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-09-03T09:00:00+02:00
---

GitHub Copilot app y Copilot CLI ya respetan las políticas de exclusión de contenido configuradas por administradores de empresa, organización o repositorio. Los ficheros excluidos no se utilizan como contexto en estos flujos agentic, ampliando a nuevas superficies un control que resulta especialmente relevante para repositorios con código o configuración sensible.

La función está disponible con Copilot Business y Copilot Enterprise. Para equipos que usan agentes de programación fuera del editor, el cambio reduce la diferencia entre las políticas aplicadas en el repositorio y el contexto que puede consumir Copilot desde la aplicación o la línea de comandos.
