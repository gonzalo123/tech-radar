---
title: "Copilot code review amplía su análisis con shell tools y un ensemble de agentes"
description: "GitHub amplía Copilot code review para ejecutar builds, tests y scripts durante el análisis, mientras Lite pasa a combinar los resultados de varios agentes."
date: 2026-09-13

source: "GitHub"
source_url: "https://github.blog/changelog/2026-09-11-auto-resolution-and-analysis-updates-in-copilot-code-review/"

category: "DevTools"

tags:
  - copilot
  - agents
  - code-review
  - developer-tools

featured: false
priority: 88
placement: lead
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-09-13T06:27:46+02:00
---

GitHub ha ampliado Copilot code review para que pueda utilizar el conjunto completo de shell tools del Copilot SDK durante sus revisiones. El agente puede ejecutar builds, tests y scripts específicos para validar el código, mientras esas operaciones se mantienen detrás del firewall de agentes de Copilot.

El nivel de esfuerzo Lite también ha pasado de un único agente a un ensemble: varios agentes analizan el cambio desde perspectivas distintas y Copilot combina sus resultados en una sola revisión. GitHub afirma que en sus experimentos aumentaron los comentarios de severidad alta y media que los desarrolladores terminaron corrigiendo, al tiempo que el coste medio de la revisión bajó aproximadamente un 8 %.

La actualización añade además resolución automática de comentarios cuando un commit posterior corrige el problema señalado y genera mensajes de commit específicos al aplicar sugerencias de Copilot.

En la práctica, el cambio acerca el code review de Copilot a un proceso de validación activa: ya no se limita a inspeccionar el código y el contexto del repositorio, sino que puede comprobar parte de sus conclusiones ejecutando herramientas del proyecto.
