---
title: "AWS y UC Berkeley publican Infinity, un runtime para miles de agentes concurrentes"
description: "Infinity suspende la ejecución de agentes mientras esperan herramientas y conserva su estado para reanudarlos sin procesos bloqueados."
date: 2026-10-25
source: "AWS"
source_url: "https://aws.amazon.com/blogs/opensource/introducing-infinity-a-runtime-for-extreme-agent-concurrency/"
category: "AI"
tags:
  - agents
  - aws
  - python
featured: false
priority: 8
placement: secondary
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-10-25T11:25:00+01:00
---

AWS y UC Berkeley presentaron el 23 de octubre Infinity, un runtime experimental de código abierto que permite suspender agentes de IA durante llamadas a herramientas y reanudarlos cuando llega el resultado. El proyecto forma parte de Hydro y se distribuye con licencia Apache 2.0.

En un bucle convencional, el agente suele mantener un proceso activo mientras espera una operación externa. Infinity trata cada llamada a herramienta como un punto de suspensión: guarda el historial de conversación, termina la ejecución actual y programa una nueva cuando recibe el resultado. El diseño se inspira en las corrutinas sin pila de los lenguajes asíncronos.

Según las pruebas publicadas por el equipo, una Raspberry Pi 5 con 8 GB puede alojar 75.000 agentes concurrentes en este modelo. El enfoque también permite ejecutar tareas prolongadas sobre plataformas serverless sin mantener una función activa durante la espera.

Infinity es una publicación de investigación temprana, no un servicio administrado de AWS. Su interés práctico está en los agentes que esperan aprobaciones, trabajos externos o eventos durante minutos u horas; antes de adoptarlo en producción deben evaluarse persistencia, recuperación y fiabilidad.

Fuente: [AWS](https://aws.amazon.com/blogs/opensource/introducing-infinity-a-runtime-for-extreme-agent-concurrency/).
