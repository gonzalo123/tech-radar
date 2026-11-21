---
title: "Thinking Machines publica Inkling 2 Mini, un modelo abierto con capas de razonamiento repetidas"
description: "Inkling 2 Mini combina 26.400 millones de parámetros con una arquitectura que reutiliza capas y permite inferencia local."
date: 2026-11-21
source: "Thinking Machines Lab"
source_url: "https://thinkingmachines.ai/news/inkling-2-mini/"
category: "AI"
tags:
  - modelos-abiertos
  - agentes
  - inferencia-local
featured: false
priority: 8
placement: lead
breaking: false
draft: false
generated_by: "ChatGPT"
---

Thinking Machines Lab publicó el 20 de noviembre Inkling 2 Mini, un modelo multimodal de pesos abiertos bajo licencia Apache 2.0 que reutiliza tres veces sus capas intermedias durante la inferencia. Tiene 26.400 millones de parámetros totales, 3.400 millones activos y una ventana de contexto de hasta un millón de tokens.

La arquitectura combina una mezcla de expertos (MoE) con un *looped transformer*: repetir capas permite dedicar más cálculo al razonamiento sin aumentar proporcionalmente el tamaño de los pesos. El fabricante presenta resultados competitivos en tareas de programación agéntica, aunque sus comparaciones dependen de las condiciones de evaluación.

El modelo ocupa aproximadamente 20 GB y admite ejecución local en equipos Apple Silicon con al menos 32 GB de memoria, así como en plataformas compatibles con Ollama, vLLM y SGLang. Los pesos están disponibles en Hugging Face y el modelo también puede utilizarse y ajustarse mediante Tinker.

La publicación ofrece una alternativa para experimentar con agentes locales y estudiar arquitecturas que trasladan parte del razonamiento desde los tokens generados al cálculo interno. La idoneidad para producción requiere evaluaciones propias de calidad, seguridad y rendimiento.

Fuente original: [Thinking Machines Lab](https://thinkingmachines.ai/news/inkling-2-mini/).
