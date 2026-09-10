---
title: "GitHub Copilot permite gestionar permisos de operaciones agentic a nivel enterprise"
description: "GitHub añade controles centralizados para decidir qué comandos, accesos a ficheros y dominios de red de Copilot se bloquean, requieren aprobación o pueden ejecutarse sin confirmación."
date: 2026-09-10

source: "GitHub"
source_url: "https://github.blog/changelog/2026-09-09-enterprise-managed-permissions-for-github-copilot-agent-operations/"

category: "DevTools"

tags:
  - copilot
  - agents
  - security
  - enterprise

featured: false
priority: 90
placement: lead
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-09-10T06:27:42+02:00
---

GitHub añadió el 9 de septiembre controles gestionados por la empresa para las operaciones agentic de GitHub Copilot. Los administradores de Copilot Business y Enterprise pueden decidir de forma centralizada qué acciones se bloquean, cuáles requieren aprobación humana y cuáles pueden ejecutarse sin confirmación.

Las políticas cubren comandos de shell, lectura y edición de ficheros y acceso a dominios de red. Las restricciones definidas por la organización tienen precedencia sobre la configuración del usuario o del workspace, el auto-approval y las aprobaciones guardadas previamente. También es posible aplicar políticas distintas a diferentes equipos dentro de una empresa.

Los controles están disponibles de forma general en la aplicación de GitHub Copilot, Copilot CLI y las sesiones de Visual Studio Code que utilizan Agent Host. Para organizaciones que permiten a los agentes ejecutar comandos y modificar código, la novedad introduce una capa de gobierno central sin tener que desactivar esos flujos de trabajo por completo.
