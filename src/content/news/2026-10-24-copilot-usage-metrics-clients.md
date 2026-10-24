---
title: "GitHub Copilot identifica el consumo de modelos desde OpenCode y otros clientes"
description: "La API de métricas incorpora peticiones, sesiones y tokens desglosados por cliente, incluidos Claude Code, Codex y OpenCode cuando utilizan Copilot."
date: 2026-10-24
source: "GitHub"
source_url: "https://github.blog/changelog/2026-10-23-usage-metrics-api-adds-usage-from-tools-like-opencode/"
category: "DevTools"
tags:
  - copilot
  - agents
  - observability
featured: false
priority: 7
placement: normal
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-10-24T11:55:00+02:00
---

GitHub anunció el 23 de octubre que la API de métricas de Copilot identifica el consumo de modelos generado desde herramientas externas como OpenCode, Claude Code o Codex cuando utilizan Copilot como proveedor. Antes, parte de ese tráfico no aparecía en las métricas asociadas a los editores.

El nuevo campo `totals_by_client` desglosa por herramienta el número de solicitudes correctas, las sesiones, los tokens de entrada y salida y el uso por modelo. También indica si el modelo fue seleccionado por el usuario, automáticamente o por el producto. Se incluye en informes diarios y de 28 días para empresas, organizaciones y usuarios.

GitHub advierte que las solicitudes no equivalen a prompts: una interacción puede producir varias llamadas al modelo. Además, la identificación del cliente depende del identificador comunicado por la integración y no constituye una verificación de identidad.

La mejora permite comparar el uso real de Copilot entre distintos entornos de desarrollo y tomar decisiones de costes y gobierno. Requiere habilitar la política de métricas y disponer de permisos para consultarlas.

Fuente: [GitHub](https://github.blog/changelog/2026-10-23-usage-metrics-api-adds-usage-from-tools-like-opencode/).
