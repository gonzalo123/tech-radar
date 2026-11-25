---
title: "PrismML publica Bonsai 2.5 27B para agentes locales con pesos de 5,9 GB"
description: "El modelo ternario basado en Qwen3.8 mejora las tareas de programación y uso de herramientas sin aumentar el tamaño de los pesos."
date: 2026-11-25
source: "PrismML"
source_url: "https://prismml.com/news/bonsai-2-5-27b"
category: "AI"
tags:
  - modelos-abiertos
  - agents
  - inferencia-local
featured: false
priority: 8
placement: lead
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-11-25T06:30:38+01:00
---

PrismML publicó el 24 de noviembre Ternary Bonsai 2.5 27B, una actualización de su modelo basado en Qwen3.8 27B que mejora la ejecución de tareas con herramientas y la programación. Los pesos están disponibles bajo licencia Apache 2.0 y ocupan aproximadamente 5,9 GB en su variante ternaria.

La representación utiliza 1,76 bits efectivos por peso. En las evaluaciones del fabricante, SWE-bench Verified pasa de 60,8 a 75,6 puntos respecto a Bonsai 2, frente a 80,6 del modelo base sin comprimir. Son resultados publicados por PrismML, no una validación independiente.

El modelo puede ejecutarse mediante llama.cpp y MLX. Su tamaño facilita experimentar con asistentes locales sobre repositorios privados, aunque la memoria total necesaria también depende del contexto y del motor de inferencia.

Los pesos y las instrucciones de ejecución están disponibles en [Hugging Face](https://huggingface.co/prism-ml/Ternary-Bonsai-2.5-27B-GGUF).

Fuente: [PrismML](https://prismml.com/news/bonsai-2-5-27b).
