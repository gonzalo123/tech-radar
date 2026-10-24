---
title: "Shanghai AI Laboratory publica los pesos de Atria Dawn para agentes"
description: "Atria Dawn amplía a 512.000 tokens su contexto y ofrece pesos MIT de un modelo de 744.000 millones de parámetros orientado a tareas de agentes."
date: 2026-10-24
source: "Shanghai AI Laboratory"
source_url: "https://huggingface.co/internlm/Atria-Dawn"
category: "AI"
tags:
  - models
  - agents
  - open-weights
featured: false
priority: 8
placement: secondary
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-10-24T11:55:00+02:00
---

Shanghai AI Laboratory ha publicado en Hugging Face la versión completa de Atria Dawn, un modelo orientado a tareas prolongadas con herramientas, programación, investigación y producción de entregables. Está construido sobre GLM-5.2, una arquitectura de mezcla de expertos con 744.000 millones de parámetros totales.

La versión completa ofrece una ventana de contexto de 512.000 tokens, frente a los 256.000 de la vista previa. El laboratorio distribuye pesos estándar y una variante FP8, además de instrucciones para despliegue con SGLang y vLLM. El código y los pesos se publican bajo licencia MIT.

El equipo ofrece acceso alojado mediante API compatible con clientes de OpenAI y Anthropic, y documenta configuraciones para Codex, Claude Code y Kimi Code. Los resultados de los benchmarks publicados proceden del propio laboratorio y deben contrastarse con evaluaciones independientes.

Para equipos que necesitan agentes personalizables o alojados en infraestructura propia, Atria Dawn es una nueva alternativa de pesos abiertos, aunque su tamaño exige recursos de inferencia considerables.

Fuente: [Shanghai AI Laboratory](https://huggingface.co/internlm/Atria-Dawn).
