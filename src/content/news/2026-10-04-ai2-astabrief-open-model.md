---
title: "Ai2 libera AstaBrief 8B para generar informes científicos con citas"
description: "Los pesos y datos publicados permiten generar informes científicos en infraestructura propia."
date: 2026-10-04

source: "Ai2"
source_url: "https://allenai.org/blog/astabrief"

category: "AI"

tags:
  - models
  - open-weights
  - rag
  - evaluation

featured: false
priority: 76
placement: normal
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-10-04T13:00:11.496Z
---

Ai2 publicó el 2 de octubre **AstaBrief 8B**, un modelo de pesos abiertos que convierte una pregunta de investigación y fragmentos de literatura previamente recuperados en un informe con citas. También libera sus datos de entrenamiento y un ejemplo de workflow para trabajar con PDFs propios.

El modelo parte de Qwen3-8B y está disponible como **Fast mode** en Asta, junto al modo de razonamiento basado en Claude. Genera el informe completo en una pasada, en lugar de producirlo sección por sección.

Ai2 mide 51,1 segundos de media por informe en el pipeline completo de Fast mode, frente a 178,5 segundos en Thinking mode: alrededor de 3,5 veces más rápido. La entidad advierte de que gran parte del entrenamiento y la evaluación se realizó en 2025 y no ha repetido la comparación completa con los modelos frontera actuales.

El modelo puede desplegarse en infraestructura propia. Requiere fuentes previamente recuperadas y comprobar que las citas respaldan sus afirmaciones.
