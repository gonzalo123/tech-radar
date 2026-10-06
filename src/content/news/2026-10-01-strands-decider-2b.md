---
title: "Strands publica Decider 2B, un modelo pequeño para decisiones dentro de agentes"
description: "El modelo open source está optimizado para elegir rápidamente entre opciones y permite experimentar localmente con arquitecturas System One sin recurrir a un LLM generativo para cada decisión."
date: 2026-10-01

source: "Strands Agents"
source_url: "https://strandsagents.com/blog/introducing-strands-decider/"

category: "AI"

tags:
  - strands-agents
  - agents
  - models

featured: false
priority: 91
placement: normal
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-10-06T07:10:00+02:00
---

Strands Agents ha publicado **Strands Decider 2B**, un modelo pequeño y open source diseñado para tomar decisiones rápidas entre un conjunto de opciones dentro de sistemas agentic. Su objetivo es cubrir tareas como clasificación, routing o selección de acciones sin utilizar un LLM generativo completo en cada paso.

El modelo pertenece a la categoría de decision models o System One que ha ganado visibilidad tras la aparición de Jev. A diferencia de un LLM convencional, recibe las alternativas disponibles y devuelve una elección, reduciendo el espacio de salida y permitiendo inferencia más ligera.

Con aproximadamente 2.000 millones de parámetros, Decider está orientado a experimentación y desarrollo local. Para arquitecturas con muchos pasos de routing o clasificación, este patrón abre la posibilidad de reservar los modelos frontier para las partes que realmente requieren generación o razonamiento complejo.