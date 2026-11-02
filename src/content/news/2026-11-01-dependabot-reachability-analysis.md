---
title: "Dependabot añade análisis de alcanzabilidad de vulnerabilidades"
description: "GitHub emplea CodeQL para comprobar si existen rutas de llamadas desde la aplicación hasta funciones vulnerables de dependencias."
date: 2026-11-01
source: "GitHub"
source_url: "https://github.blog/changelog/2026-10-28-prioritize-dependabot-alerts-with-reachability-analysis/"
category: "Security"
tags:
  - dependabot
  - security
  - codeql
priority: 8
placement: normal
draft: false
generated_by: "ChatGPT"
generated_at: 2026-11-02T06:53:00+01:00
---

GitHub anunció el 28 de octubre una vista previa de análisis de alcanzabilidad para alertas de Dependabot. CodeQL comprueba si existe una ruta de llamadas desde el código de la aplicación hasta una función vulnerable de sus dependencias.

Las alertas distinguen entre funciones alcanzables, potencialmente alcanzables, no alcanzables y casos en los que el análisis no está disponible. Este resultado ayuda a priorizar las correcciones, pero no cierra ni descarta automáticamente vulnerabilidades.

La vista previa admite JavaScript y TypeScript con archivos de bloqueo de npm, Yarn o pnpm en GitHub Enterprise Cloud. Es gratuita y requiere activación explícita.

La alcanzabilidad no demuestra por sí sola la posibilidad de explotación; debe combinarse con el contexto de ejecución y la gravedad del problema.

Fuente: [GitHub](https://github.blog/changelog/2026-10-28-prioritize-dependabot-alerts-with-reachability-analysis/).
