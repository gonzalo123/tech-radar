---
title: "Reflection AI publica los pesos de Beam y abre su uso en agentes de programación"
description: "Beam ya puede descargarse bajo licencia Apache 2.0, con 501.000 millones de parámetros y soporte para herramientas de inferencia y agentes."
date: 2026-10-18
source: "Reflection AI"
source_url: "https://reflection.ai/blog/beam-is-available"
category: "AI"
tags:
  - open-weights
  - coding-agents
  - inference
featured: false
priority: 9
placement: lead
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-10-18T11:43:00+02:00
---

Reflection AI publicó el 16 de octubre los pesos de Beam, su modelo abierto para programación, razonamiento y agentes capaces de ejecutar tareas prolongadas. El lanzamiento convierte el anuncio inicial de principios de mes en una opción descargable y desplegable bajo licencia Apache 2.0. Los pesos se ofrecen en formatos BF16, FP8 y NVFP4, junto con documentación y herramientas de integración.

Beam utiliza una arquitectura de mezcla de expertos con 501.300 millones de parámetros totales y 23.400 millones activos por token. Admite hasta un millón de tokens de contexto y procesa texto. Reflection publica resultados de evaluaciones de programación y uso de herramientas, pero sus cifras deben interpretarse como resultados comunicados por el desarrollador, no como una garantía de rendimiento en cualquier entorno.

El modelo dispone de soporte de lanzamiento para Transformers, vLLM y SGLang, entre otras herramientas. Reflection también presenta Mirror CLI, un entorno para agentes de programación con sesiones reanudables, ejecución paralela y extensiones mediante skills y MCP. Beam puede utilizarse con otros entornos de agentes, como OpenCode, y accederse mediante proveedores de inferencia o infraestructura propia.

Para los equipos que necesitan controlar dónde se ejecutan sus modelos, la disponibilidad de los pesos permite evaluar el despliegue y la personalización sin depender exclusivamente de una API propietaria. Su tamaño, sin embargo, exige infraestructura de inferencia considerable; la licencia abierta no elimina los costes operativos ni sustituye las pruebas de calidad y seguridad.

Fuente: [Reflection AI](https://reflection.ai/blog/beam-is-available/).
