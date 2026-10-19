---
title: "Meta publica los pesos de Muse Spark Open para agentes de programación"
description: "El modelo multimodal de 816.000 millones de parámetros puede desplegarse en infraestructura propia y dispone de integraciones con varios motores de inferencia."
date: 2026-10-19
source: "Meta AI Research"
source_url: "https://research.meta.ai/blog/muse-spark-open"
category: "AI"
tags:
  - modelos-abiertos
  - agents
  - coding
featured: true
priority: 10
placement: lead
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-10-19T06:56:00+02:00
---

Meta publicó el 15 de octubre los pesos de Muse Spark Open, un modelo multimodal orientado a programación y tareas con agentes. Tiene 816.000 millones de parámetros totales, de los que activa aproximadamente 42.000 millones, y admite una ventana de contexto de hasta un millón de tokens.

El modelo procesa texto, imágenes, audio y vídeo y genera respuestas de texto. Sus pesos están disponibles a través de Hugging Face y catálogos de plataformas en la nube; también puede utilizarse mediante proveedores de API. Meta documenta compatibilidad con motores como SGLang, vLLM, llama.cpp y MLX.

La compañía afirma haber ejecutado el modelo localmente sobre dos Mac Studio con M5 Ultra. Esta configuración ilustra la posibilidad de mantener la inferencia fuera de servicios externos, aunque exige hardware de alta capacidad. Los pesos se distribuyen bajo la licencia Muse Model License, que incluye condiciones comerciales: no equivale a una licencia de código abierto sin restricciones.

Para equipos que desarrollan agentes de programación, la novedad es poder evaluar y adaptar un modelo de gran tamaño en infraestructura controlada. Su conveniencia frente a alternativas cerradas dependerá de las pruebas propias, los costes de inferencia y las condiciones de licencia.

Fuente: [Meta AI Research](https://research.meta.ai/blog/muse-spark-open).
