---
title: "Kiro añade workflows multiagente con sesiones aisladas, bucles y ejecución paralela"
description: "Los nuevos Workflows permiten delegar planes reutilizables en varios agentes, ejecutar cada paso con contexto independiente y mantener el trabajo en segundo plano."
date: 2026-09-30

source: "Kiro"
source_url: "https://kiro.dev/blog/introducing-workflows/"

category: "DevTools"

tags:
  - agents
  - workflows
  - coding-agents

featured: false
priority: 93
placement: secondary
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-10-06T07:10:00+02:00
---

Kiro ha incorporado **Workflows**, un mecanismo para ejecutar tareas complejas mediante varios agentes y sesiones independientes en lugar de mantener todo el proceso dentro del contexto de una única conversación. Los workflows pueden combinar pasos secuenciales, ramas paralelas, bucles y condiciones.

Cada paso se ejecuta en su propia sesión con contexto fresco y recibe únicamente la información que le entregan los pasos anteriores. Esto permite, por ejemplo, separar implementación y revisión para que el agente revisor no herede el razonamiento del agente que escribió el código.

Los workflows se ejecutan en segundo plano y pueden pausarse, reanudarse o dirigirse mientras están activos. Kiro puede generar el workflow a partir de una petición en lenguaje natural, y las recetas resultantes pueden guardarse en JSON o YAML para reutilizarlas.

El enfoque convierte explícitamente la orquestación multiagente en un artefacto versionable y separa planificación, ejecución y revisión, a cambio de un mayor consumo de tokens que una sesión convencional.