---
title: "Strands publica un agent harness portable con gestión de contexto y memoria integrada"
description: "El nuevo Strands harness ofrece un agente generalista listo para usar en Python y TypeScript sobre Bedrock, Anthropic, OpenAI, Google, Ollama o LiteLLM."
date: 2026-09-29

source: "Strands Agents"
source_url: "https://strandsagents.com/blog/introducing-strands-harness/"

category: "DevTools"

tags:
  - strands-agents
  - agents
  - cost-control
  - developer-tools

featured: false
priority: 89
placement: secondary
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-09-29T06:28:00+02:00
---

El equipo de **Strands Agents** ha publicado bajo Apache 2.0 un agent harness generalista listo para ejecutar localmente o desplegar en infraestructura propia. Una llamada a `create_harness()` en Python —o su equivalente en TypeScript— configura el bucle del agente, herramientas, memoria, sesiones y gestión de contexto sin obligar a adoptar un runtime alojado.

El harness es independiente del proveedor del modelo: soporta Amazon Bedrock, Anthropic, OpenAI, Google, Ollama y LiteLLM. Incluye herramientas de propósito general, conserva memoria entre sesiones y permite sustituir progresivamente sus valores por defecto hasta trabajar directamente con el Strands Harness SDK.

Una parte central del diseño es el control del contexto. Los resultados grandes de herramientas se truncan o descargan a ficheros, la compactación se activa cuando la ventana supera aproximadamente el 85% y se utiliza prompt caching para evitar reenviar contexto repetido.

Strands afirma que, usando los mismos modelos Claude o GPT en seis benchmarks, su harness redujo un 28% el coste frente al conjunto de harnesses comparados manteniendo una precisión similar. Es una medición del propio proyecto realizada sobre EC2 con Harbor y todavía no una evaluación independiente, por lo que el dato debe tomarse como una referencia para probar el enfoque con cargas reales, no como una garantía general de ahorro.
