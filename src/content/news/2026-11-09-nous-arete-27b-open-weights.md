---
title: "Nous Research libera Arete-27B, un ajuste de Qwen3.8 para modificar sesgos de respuesta"
description: "Modelo Apache 2.0 de 27B parámetros; Nous comunica mejoras en una evaluación propia de sesgos sin regresiones apreciables en sus pruebas generales."
date: 2026-11-09
source: "Nous Research"
source_url: "https://huggingface.co/NousResearch/Arete-27B"
category: "AI"
tags:
  - models
  - open-weights
  - evaluation
  - alignment
featured: false
priority: 9
placement: secondary
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-11-09T07:05:00+01:00
---

Nous Research publicó Arete-27B, un ajuste supervisado de Qwen3.8-27B destinado a modificar determinados patrones de respuesta relacionados con temas políticos y sociales. Los pesos están disponibles bajo Apache 2.0 y el laboratorio ha compartido información sobre los datos y el procedimiento de entrenamiento.

Según Nous, en una evaluación propia de 803 preguntas la proporción de respuestas clasificadas como propaganda pasó del 22 % en el modelo base al 0,9 % en Arete. La puntuación factual media subió de 2,32 a 2,98 sobre cinco. Son métricas definidas por el equipo y deben interpretarse dentro de su metodología: no prueban neutralidad universal ni ausencia de sesgos.

El entrenamiento utilizó fine-tuning supervisado, sin aprendizaje por refuerzo ni cambios arquitectónicos. Nous informa de resultados similares en Hermes Bench y de 70 % frente a 67 % en Terminal-Bench 2.1, aunque desaconseja atribuir esa diferencia al ajuste.

El caso demuestra hasta qué punto un modelo de pesos abiertos puede adaptarse a criterios de comportamiento diferentes. También recuerda que cualquier evaluación de alineamiento depende de cómo se definan las categorías, quién etiquete los ejemplos y qué conjunto de pruebas se utilice.

Fuente: [Nous Research](https://huggingface.co/NousResearch/Arete-27B).
