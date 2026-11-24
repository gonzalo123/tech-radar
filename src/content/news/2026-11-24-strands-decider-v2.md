---
title: "Strands Decider v2 amplía a cinco modelos su familia de decisión abierta"
description: "Los nuevos modelos basados en Gemma 4 devuelven probabilidades sin generar texto y mejoran los resultados de las evaluaciones del proyecto."
date: 2026-11-24
source: "Strands Agents"
source_url: "https://huggingface.co/StrandsAgents/strands-decider-E2B-gemma4-v2-2611"
category: "AI"
tags:
  - strands-agents
  - decision-models
  - agents
  - open-source
featured: false
priority: 8
placement: secondary
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-11-24T06:32:06+01:00
---

Strands Labs ha publicado en noviembre la segunda generación de Strands Decider, cinco modelos de decisión basados en Gemma 4 con licencia Apache 2.0. La novedad, difundida el 23 de noviembre, permite escoger entre alternativas, responder preguntas binarias y asignar puntuaciones sin generar una respuesta textual.

Los tamaños abarcan desde E2B hasta 31B y comparten una interfaz. El modelo menor ocupa 10,3 GB en bf16 y admite ejecución en CPU, aunque más lenta que en GPU. Puede integrarse desde Python o mediante un servidor HTTP.

La nueva arquitectura obtiene las probabilidades directamente de los códigos de respuesta y sustituye el cabezal específico de la versión anterior. En Decision Index 0.3, el equipo comunica una puntuación de 57,1 para E2B, 27,8 puntos superior a su predecesor. Son resultados del propio proyecto, no una garantía de precisión en producción.

El caso de uso es delegar decisiones repetitivas de un agente, como elegir una herramienta o enrutar una petición. La confianza estimada debe validarse con datos propios antes de emplearla como criterio de autorización.

Fuente original: [Strands Agents](https://huggingface.co/StrandsAgents/strands-decider-E2B-gemma4-v2-2611).
