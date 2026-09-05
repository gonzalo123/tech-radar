---
title: "GitHub Copilot prueba HydraFusion para orquestar varios modelos según coste y calidad"
description: "HydraFusion llega como research preview a Copilot CLI y selecciona dinámicamente flujos de uno o varios modelos para equilibrar calidad, coste y latencia en tareas de coding."
date: 2026-09-05

source: "GitHub"
source_url: "https://github.blog/ai-and-ml/github-copilot/project-hydrafusion-frontier-quality-via-multi-model-orchestration/"

category: "DevTools"

tags:
  - copilot
  - agents
  - coding-agents
  - model-routing

featured: false
priority: 90
placement: lead
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-09-05T06:28:00+02:00
---

GitHub ha presentado Project HydraFusion, un sistema experimental de orquestación para GitHub Copilot que decide en tiempo de ejecución qué modelos y qué patrón de ejecución utilizar para una tarea de programación. Está disponible como *research preview* para todos los planes de Copilot a través del modo experimental de Copilot CLI.

HydraFusion puede resolver una petición con un único modelo, comenzar con un modelo más eficiente y escalar a otro más potente si no supera un control de calidad, o combinar un modelo que redacta con un crítico independiente de otra familia y una revisión posterior. El objetivo es optimizar conjuntamente calidad, coste y latencia sin obligar al desarrollador a seleccionar manualmente cada modelo o cada etapa del flujo.

En evaluaciones internas, GitHub afirma que HydraFusion mejoró en 4,9 puntos el resultado verificado de Claude Opus 5 en TerminalBench 2.1 con un coste estimado un 67 % inferior. En otros benchmarks quedó cerca de Opus 5 con reducciones estimadas de coste del 36 % al 65 %. GitHub advierte de que son resultados controlados y que el comportamiento, los modelos utilizados y la disponibilidad pueden cambiar durante el preview.

Para equipos que trabajan con coding agents, la parte relevante no es un nuevo modelo sino el cambio de abstracción: Copilot empieza a experimentar con seleccionar y combinar modelos automáticamente según la tarea, en lugar de tratar el selector de modelo como una decisión fija del usuario.