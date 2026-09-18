---
title: "GitHub Actions hace GA las protecciones de ejecución de workflows"
description: "GitHub permite controlar quién y qué eventos pueden lanzar workflows, con reglas por fichero, modo de evaluación, insights y gestión mediante API."
date: 2026-09-18

source: "GitHub"
source_url: "https://github.blog/changelog/2026-09-17-workflow-execution-protections-in-github-actions-generally-available/"

category: "Security"

tags:
  - github-actions
  - security
  - supply-chain

featured: false
priority: 84
placement: secondary
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-09-18T06:31:38+02:00
---

GitHub ha hecho generalmente disponibles las protecciones de ejecución de GitHub Actions para empresas, organizaciones y repositorios. Las reglas permiten definir quién puede iniciar un workflow y qué eventos pueden dispararlo, y ahora pueden aplicarse a ficheros de workflow concretos en lugar de afectar necesariamente a todo el repositorio.

La versión GA añade además Insights para auditar cómo se evalúan y aplican las reglas y una API REST para administrarlas como código. El modo de evaluación permite probar una política sin bloquear ejecuciones y comprobar qué jobs quedarían afectados antes de activarla.

GitHub también está introduciendo una protección por defecto para `pull_request_target` en repositorios públicos que no tengan ya una política de eventos aplicable. Este trigger puede ejecutar workflows con acceso a secretos en el contexto del repositorio base y es una fuente conocida de ataques cuando termina ejecutándose código no confiable procedente de forks. La nueva regla comienza en modo de evaluación y GitHub prevé aplicarla automáticamente el 2 de noviembre de 2026 a los repositorios afectados que sigan usando la política por defecto.

Para equipos que gestionan CI/CD a escala, las nuevas protecciones permiten separar políticas por workflow —por ejemplo, restringir `deploy.yml` sin cerrar los workflows de CI— y mantener esas reglas mediante API junto al resto de la configuración de seguridad.
