---
title: "SageMaker JumpStart añade Muse-Glimmer-30B y Qwen 3.8-27B para agentes y razonamiento multimodal"
description: "AWS incorpora dos modelos abiertos orientados a flujos agentic, coding y multimodalidad que pueden desplegarse directamente desde SageMaker JumpStart."
date: 2026-08-28

source: "AWS"
source_url: "https://aws.amazon.com/about-aws/whats-new/2026/01/muse-glimmer-30b-qwen-3.8-27b-on-sagemaker-jumpstart/"

category: "AI"

tags:
  - agents
  - aws
  - open-models
  - sagemaker

featured: false
priority: 80
placement: secondary
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-08-28T09:05:00+02:00
---

Amazon SageMaker JumpStart ya permite desplegar Muse-Glimmer-30B, de Meta Superintelligence Lab, y Qwen 3.8-27B, de Alibaba. Los dos modelos están orientados a cargas de trabajo agentic, aunque con perfiles distintos: Muse-Glimmer prioriza razonamiento con herramientas y recuperación ante fallos, mientras que Qwen 3.8-27B combina coding, tareas de varios pasos y comprensión multimodal.

Según AWS, Muse-Glimmer-30B es un modelo denso de 30.000 millones de parámetros con entradas intercaladas de texto e imagen, un contexto superior a 131.000 tokens y niveles configurables de razonamiento. Se distribuye bajo Apache 2.0 y está diseñado para ejecutar secuencias de herramientas y recuperarse de errores durante una tarea.

Qwen 3.8-27B es un modelo vision-language denso de 27.000 millones de parámetros con una ventana de contexto de 262.000 tokens, ampliable mediante YaRN. Puede trabajar con texto, imágenes y vídeo y admite distintos niveles de esfuerzo de razonamiento.

La novedad práctica es la disponibilidad administrada en JumpStart: equipos que quieran evaluar modelos abiertos para agentes o coding pueden desplegarlos mediante la consola o el SDK de SageMaker sin construir primero una plataforma propia de serving. Las cifras de benchmarks publicadas por AWS sirven como referencia inicial, pero conviene validarlas con cargas reales antes de elegir un modelo.
