---
title: "Sarvam libera Prism, un modelo de decisión de baja latencia basado en Sarvam 105B"
description: "Prism devuelve opciones y probabilidades calibradas; Sarvam anuncia 44 ms de latencia mediana en B200 y publica pesos para despliegue propio."
date: 2026-11-05
source: "Sarvam AI"
source_url: "https://www.sarvam.ai/blogs/sarvam-prism"
category: "AI"
tags:
  - decision-models
  - agents
  - open-weights
featured: false
priority: 8
placement: normal
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-11-05T07:18:00+01:00
---

Sarvam AI presentó el 3 de noviembre Prism, un modelo de decisión de la familia System One construido a partir de Sarvam 105B-10B. En vez de generar explicaciones extensas, el modelo elige entre opciones y devuelve probabilidades para decisiones estructuradas.

La empresa anuncia una puntuación media de 71,8 en tres índices y una latencia mediana de 44 milisegundos en una GPU NVIDIA B200. La comparación abarca 25 modelos y fue ejecutada por Sarvam, con algunas cifras de terceros procedentes de sus proveedores; por tanto, no equivale a una clasificación independiente.

Sarvam también publica pruebas de calibración: entre las respuestas con confianza de al menos el 90 %, Prism predijo un 3,3 % de errores en inglés y registró un 2,2 % en el conjunto evaluado. En lenguas de la India, predijo un 5,4 % y registró un 4,4 %. Estos resultados no garantizan calibración idéntica en otros dominios.

Los pesos se publican para permitir adaptación con datos propios y despliegue en infraestructura empresarial. Es una opción interesante para clasificación, enrutamiento de solicitudes y decisiones frecuentes de agentes, siempre que el umbral de confianza se valide con datos representativos.

Fuente: [Sarvam AI](https://www.sarvam.ai/blogs/sarvam-prism).
