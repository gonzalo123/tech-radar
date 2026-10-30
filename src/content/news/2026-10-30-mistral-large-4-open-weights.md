---
title: "Mistral libera los pesos de Large 4, un modelo multimodal de un billón de parámetros"
description: "Mistral Large 4, conocido como Le Chonk, ya puede descargarse en formatos FP8 y NVFP4, con un millón de tokens de contexto y una licencia con restricciones para servicios comerciales."
date: 2026-10-30
source: "Hugging Face"
source_url: "https://huggingface.co/blog/mistral-large4"
category: "AI"
tags:
  - mistral
  - open-weights
  - models
featured: false
priority: 10
placement: lead
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-10-30T07:24:00+01:00
---

El 29 de octubre se publicaron los pesos de Mistral Large 4, también llamado Le Chonk, después de su presentación inicial en vista previa el 6 de octubre. El modelo es multimodal, admite texto e imágenes y tiene aproximadamente un billón de parámetros totales, con cerca de 49.000 millones activos por token según la descripción de Hugging Face.

El contexto máximo anunciado es de un millón de tokens. Se distribuye en variantes FP8 y NVFP4, además de conversiones GGUF realizadas por la comunidad. La licencia Mistral Ecosystem Open-Weight License permite descargar y ejecutar los pesos, pero establece restricciones para determinados servicios comerciales de modelos; no debe confundirse con una licencia permisiva sin condiciones.

Hugging Face sitúa a Large 4 entre los modelos abiertos destacados para programación, ciberseguridad y tareas multimodales. La publicación recoge un 61,7 % en DeepSWE v1.1, un 28,3 % en Terminal-Bench 4 y una puntuación de 49,8 en Coding Agent Index. Estos resultados dependen de la metodología de evaluación y no garantizan el mismo comportamiento en aplicaciones propias.

La disponibilidad de los pesos permite desplegarlo en infraestructura controlada, algo especialmente interesante para entornos con requisitos de residencia de datos. Su enorme tamaño, sin embargo, exige una evaluación cuidadosa del hardware, la cuantización y el coste de inferencia.

Fuente: [Hugging Face](https://huggingface.co/blog/mistral-large4).
