---
title: "RadixArk publica DaisyRose-27B y documenta un entrenamiento de agentes con 1.200 tareas"
description: "El modelo abierto ajustado con aprendizaje por refuerzo mejora resultados de Terminal-Bench en pruebas del fabricante y expone su infraestructura de entrenamiento."
date: 2026-11-23
source: "RadixArk / Hugging Face"
source_url: "https://huggingface.co/blog/RadixArk/daisyrose-27b-pushing-the-frontier-of-post-trainin"
category: "AI"
tags:
  - modelos-abiertos
  - agents
  - reinforcement-learning
featured: false
priority: 7
placement: secondary
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-11-23T06:32:33+01:00
---

RadixArk publicó el 18 de noviembre DaisyRose-27B, un modelo de 27.000 millones de parámetros derivado de Qwen3.8-27B y ajustado con aprendizaje por refuerzo para tareas agénticas prolongadas. La publicación incluye checkpoints BF16, FP8 y NVFP4 bajo licencia Apache 2.0, además de detalles sobre el entrenamiento y la ejecución.

El equipo seleccionó unas 1.200 tareas de varias etapas, con sesiones de hasta una hora y media y más de cien llamadas a herramientas. El entrenamiento se realizó durante 18 días sobre 144 GPU H200. En la evaluación publicada por RadixArk, Terminal-Bench 4.1 pass@1 pasó del 5,6 % del modelo base al 12,0 % de DaisyRose. Son resultados comunicados por los autores, no una validación independiente.

RadixArk describe un sistema de aprendizaje asíncrono con el framework abierto Miles y entornos aislados basados en AgentENV. Afirma que su infraestructura redujo un 57 % el tiempo de GPU necesario para entrenar frente a una implementación abierta de referencia y que gestionó cerca de 944.000 sandboxes durante el proyecto. Las cifras dependen de las condiciones de comparación.

El modelo conserva la capacidad de interpretar imágenes y el contexto de 256.000 tokens del modelo base. El equipo recomienda SGLang para servirlo y ofrece instrucciones de inferencia. Más allá de los benchmarks, la aportación interesante es el método reproducible de selección de tareas, ejecución en sandboxes y entrenamiento para agentes.

Fuente original: [RadixArk / Hugging Face](https://huggingface.co/blog/RadixArk/daisyrose-27b-pushing-the-frontier-of-post-trainin).
