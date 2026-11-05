---
title: "Ricursive libera Ripple-65B Preview para programación agéntica con licencia Apache 2.0"
description: "El modelo denso de 65B parámetros declara 80,52 en Terminal-Bench 2.1 y pesos descargables; la API de OpenRouter limita el contexto a 16K."
date: 2026-11-05
source: "Ricursive Intelligence"
source_url: "https://huggingface.co/ricursiveAI/Ripple-65B-Preview"
category: "AI"
tags:
  - models
  - coding
  - open-weights
  - agents
featured: false
priority: 9
placement: secondary
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-11-05T07:18:00+01:00
---

Ricursive Intelligence publicó el 4 de noviembre Ripple-65B Preview, un modelo Transformer denso de 65.000 millones de parámetros entrenado desde cero con 12 billones de tokens, principalmente texto y código. Los pesos se ofrecen bajo Apache 2.0 en BF16 y NVFP4, además de un checkpoint base.

El laboratorio comunica un resultado de 80,52 en Terminal-Bench 2.1, con el que afirma competir con modelos estadounidenses de pesos abiertos mucho mayores. La comparación depende de los entornos de evaluación y aún necesita verificación independiente. Ricursive indica que su entrenamiento fue realizado por un equipo pequeño y priorizó la simplicidad de infraestructura frente a una arquitectura de mezcla de expertos.

El modelo anuncia soporte de hasta un millón de tokens de contexto, pero ese máximo no equivale al contexto disponible en todos los proveedores. La ficha de OpenRouter ofrece actualmente 16.384 tokens, con precios publicados de 0,20 dólares por millón de entrada y 0,60 por millón de salida.

Para quienes evalúan modelos de programación en infraestructura propia, la publicación aporta pesos utilizables y una alternativa densa de tamaño relativamente contenido frente a los grandes MoE. Antes de adoptarlo conviene medir consumo de memoria, rendimiento de herramientas y límites reales de contexto.

Fuente: [Ricursive Intelligence](https://huggingface.co/ricursiveAI/Ripple-65B-Preview).
