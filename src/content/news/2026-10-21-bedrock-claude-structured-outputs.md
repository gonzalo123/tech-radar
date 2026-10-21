---
title: "Amazon Bedrock incorpora salidas estructuradas para los modelos Claude"
description: "AWS permite imponer esquemas JSON y validar los argumentos de herramientas en Claude mediante sus dos endpoints de inferencia."
date: 2026-10-21
source: "AWS"
source_url: "https://aws.amazon.com/about-aws/whats-new/2026/10/claude-structured-outputs-bedrock/"
category: "AWS"
tags:
  - bedrock
  - claude
  - agents
featured: false
priority: 9
placement: lead
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-10-21T06:55:00+02:00
---

AWS anunció el 20 de octubre que Amazon Bedrock admite salidas estructuradas para los modelos Claude disponibles en el servicio, tanto mediante bedrock-runtime como mediante bedrock-mantle. La función permite solicitar respuestas ajustadas a un esquema JSON y aplicar validación estricta a los argumentos de herramientas.

La generación restringida impide emitir tokens que incumplan las reglas de estructura compatibles. AWS ofrece el formato JSON Schema y el modo estricto para herramientas, una combinación relevante para extracción de datos y agentes que invocan funciones. El soporte incluye inferencia por lotes y, en bedrock-runtime, inferencia entre regiones.

Los esquemas deben ajustarse al subconjunto admitido de JSON Schema. La primera solicitud puede añadir latencia por la compilación de una gramática, que AWS almacena en caché durante 24 horas. También es necesario controlar respuestas truncadas o rechazadas; no todas las restricciones semánticas de JSON Schema se aplican durante la generación.

La novedad reduce la necesidad de reintentar respuestas mal formadas en integraciones con Claude, aunque las aplicaciones deben mantener las validaciones de negocio y la gestión de errores.

Fuente: [AWS](https://aws.amazon.com/about-aws/whats-new/2026/10/claude-structured-outputs-bedrock/).
