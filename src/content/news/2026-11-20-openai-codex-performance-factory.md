---
title: "OpenAI automatiza el diagnóstico y la reparación de regresiones con agentes Codex"
description: "Performance Factory conecta alertas, análisis de causa raíz, revisión adversarial, propuestas de cambios y verificación posterior al despliegue."
date: 2026-11-20
source: "OpenAI"
source_url: "https://openai.com/index/how-openai-performance-factory-keeps-chatgpt-fast/"
category: "DevTools"
tags:
  - codex
  - agents
  - observability
  - automation
featured: false
priority: 8
placement: lead
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-11-20T06:31:19+01:00
---

OpenAI describió el 19 de noviembre Performance Factory, un sistema interno que utiliza agentes Codex para investigar regresiones de rendimiento de ChatGPT, proponer correcciones y comprobar su efecto después del despliegue. El flujo empieza con una alerta de observabilidad y mantiene una revisión humana antes de incorporar los cambios.

La arquitectura combina un servicio de tareas con estados y transiciones configurables, un despachador de trabajos, ejecución de Codex en la nube y suscripciones a eventos que reactivan agentes cuando llega una revisión o termina un despliegue. Los agentes consultan métricas, trazas, perfiles y código mediante herramientas internas; una habilidad compartida, `perf-forensics`, codifica el procedimiento de investigación.

OpenAI comunica más de 1.700 investigaciones y más de 600 casos con causa raíz identificada en algo más de tres meses. En una revisión manual de 100 diagnósticos, el 70 % se consideró acertado. Para reducir conclusiones precipitadas, otro agente intenta refutar la hipótesis inicial y, posteriormente, revisa también los parches propuestos. Un ingeniero decide qué cambios se fusionan.

No se trata del lanzamiento de un producto ni de un servicio gestionado disponible para terceros. Su interés práctico está en el patrón de arquitectura: conservar el estado de la tarea fuera del contexto del agente, usar eventos en vez de sesiones permanentemente activas y separar diagnóstico, contradicción, corrección y verificación. El artículo reconoce que las correcciones siguen siendo más difíciles que los diagnósticos.

Fuente: [OpenAI](https://openai.com/index/how-openai-performance-factory-keeps-chatgpt-fast/).
