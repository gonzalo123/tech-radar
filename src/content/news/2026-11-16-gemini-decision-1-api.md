---
title: "Google lanza Gemini Decision 1: decisiones multimodales rápidas sin generar tokens de salida"
description: "La Decisions API evalúa hasta 1.000 preguntas por entrada y devuelve probabilidades para enrutamiento, políticas y selección de herramientas."
date: 2026-11-16
source: "Google DeepMind"
source_url: "https://blog.google/innovation-and-ai/technology/developers-tools/gemini-decisions-api/"
category: "AI"
tags:
  - google
  - decision-models
  - agents
  - api
featured: false
priority: 10
placement: lead
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-11-16T06:53:00+01:00
---

Google presentó el 11 de noviembre Gemini Decision 1 y la nueva Gemini Decisions API, un endpoint especializado en decisiones acotadas. En vez de producir texto token a token, el modelo evalúa opciones y devuelve probabilidades para preguntas de sí/no, elección entre alternativas y puntuaciones de rúbricas.

La API admite texto, imágenes, audio, vídeo y PDF. Puede procesar hasta 1.000 preguntas sobre una misma entrada compartida, con un contexto máximo anunciado de 256.000 tokens. Google comunica una latencia extremo a extremo de 150 a 250 milisegundos en las configuraciones evaluadas y un coste de 0,10 dólares por millón de tokens de entrada, sin cargos por tokens de salida. La latencia real depende de la modalidad y del tamaño de la petición.

El modelo está disponible como `gemini-decision-1` en Google AI Studio, con ejemplos en Python, JavaScript y REST. También se ofrece mediante Vercel AI Gateway. Google anuncia integraciones con LangChain, LiteLLM, Pydantic AI y otros frameworks.

La aplicación más inmediata está en los agentes: seleccionar herramientas, verificar condiciones de seguridad, enrutar tareas entre modelos y decidir cuándo escalar a revisión humana. Es una alternativa interesante a invocar un LLM generativo para cada clasificación. Las comparaciones de precisión y calibración publicadas proceden del fabricante y conviene evaluarlas con decisiones reales del sistema.

Fuente: [Google DeepMind](https://blog.google/innovation-and-ai/technology/developers-tools/gemini-decisions-api/).
