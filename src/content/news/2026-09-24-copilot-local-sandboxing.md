---
title: "GitHub Copilot App añade sandboxing local para agentes"
description: "Copilot App puede limitar por proyecto el acceso de sesiones locales a ficheros, red y credenciales, y falla de forma cerrada si el sistema operativo no puede aplicar la política."
date: 2026-09-24

source: "GitHub"
source_url: "https://github.blog/changelog/2026-09-23-local-sandboxing-in-the-github-copilot-app/"

category: "DevTools"

tags:
  - copilot
  - agents
  - security
  - sandbox

featured: false
priority: 90
placement: secondary
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-09-24T06:31:21+02:00
---

GitHub añadió el 23 de septiembre **sandboxing local a GitHub Copilot App**, con controles por proyecto para limitar los ficheros, recursos de red y credenciales a los que puede acceder una sesión de agente que trabaja sobre un repositorio local. La función está en public preview y desactivada por defecto.

La política permite definir carpetas adicionales de lectura/escritura, solo lectura o denegadas; habilitar o bloquear Internet y la red local; y controlar el acceso a credenciales Git y GitHub CLI. Las políticas administradas por una empresa pueden imponer restricciones adicionales a las configuradas por el proyecto.

GitHub aplica un comportamiento de fallo cerrado: si el sistema operativo no puede hacer cumplir la política solicitada, el shell sandboxed termina con error en lugar de ejecutar la sesión sin aislamiento. El sandbox puede activarse para una sesión existente con `/sandbox on`, aunque los cambios de política se aplican a sesiones nuevas o reiniciadas.

La medida reduce el radio de impacto de comandos no intencionados generados por un coding agent, especialmente cuando dispone de acceso al shell. El sandbox local es independiente del de Copilot CLI y no se aplica a sesiones cloud ni a agentes ejecutados en hosts remotos.
