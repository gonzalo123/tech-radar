---
title: "Meituan publica los pesos de LongCat-2.5 bajo licencia MIT"
description: "La versión multimodal de 1,6 billones de parámetros ya puede descargarse en Hugging Face; el despliegue propio exige infraestructura de gran escala."
date: 2026-11-10
source: "Meituan LongCat"
source_url: "https://huggingface.co/meituan-longcat/LongCat-2.5"
category: "AI"
tags:
  - longcat
  - open-weights
  - models
  - agents
featured: false
priority: 8
placement: normal
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-11-10T06:54:00+01:00
---

Meituan ha publicado en Hugging Face los pesos de LongCat-2.5 bajo licencia MIT. Tech Radar cubrió el anuncio del modelo el 3 de noviembre, cuando la disponibilidad se centraba en chat y API. La publicación de los archivos cambia ahora las posibilidades de evaluación y despliegue.

LongCat-2.5 es un modelo multimodal de mezcla de expertos con 1,6 billones de parámetros totales y unos 48.000 millones activos por token. Está entrenado para tareas agénticas largas, programación sobre repositorios complejos y comprensión visual. La ficha oficial incluye ejemplos de uso y documentación para despliegue en NPU.

El repositorio contiene varios terabytes de pesos BF16. La licencia permite estudiar y adaptar el modelo, pero ejecutarlo localmente no es viable en una estación de trabajo convencional. También hay que distinguir pesos disponibles de un sistema completo de entrenamiento reproducible: los datos y la infraestructura íntegra de entrenamiento no forman parte de esta liberación.

Las mejoras anunciadas por Meituan en programación y navegación son evaluaciones del fabricante. La novedad verificable de esta edición es la disponibilidad efectiva de los pesos, no una nueva versión del modelo.

Fuente: [Meituan LongCat](https://huggingface.co/meituan-longcat/LongCat-2.5).
