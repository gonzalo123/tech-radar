---
title: "AgentCore Evaluations evalúa agentes de distintos frameworks a partir de OpenTelemetry"
description: "AWS ha documentado un modelo de evaluación común para agentes de Strands, LangGraph, OpenAI Agents SDK, Claude Agent SDK y otros frameworks que emitan telemetría compatible."
date: 2026-08-27

source: "AWS"
source_url: "https://aws.amazon.com/blogs/machine-learning/evaluate-any-agent-framework-with-amazon-bedrock-agentcore-evaluations/"

category: "AWS"

tags:
  - bedrock
  - agents
  - strands-agents
  - observability

featured: false
priority: 80
placement: secondary
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-08-27T15:47:00+02:00
---

Amazon Bedrock AgentCore Evaluations puede evaluar agentes construidos con distintos frameworks siempre que su telemetría siga convenciones compatibles de OpenTelemetry u OpenInference. AWS incluye soporte para Strands Agents, LangGraph, LlamaIndex, OpenAI Agents SDK, Google ADK y Claude Agent SDK, y ofrece una ruta genérica para otras instrumentaciones compatibles.

El servicio reconstruye las sesiones a partir de trazas y utiliza principalmente tres tipos de spans: la invocación del agente, las llamadas al modelo y las ejecuciones de herramientas. A partir de ellos puede aplicar evaluadores comunes como éxito del objetivo, corrección o utilidad, además de evaluadores personalizados basados en LLM.

AgentCore Evaluations admite evaluaciones bajo demanda, orientadas a CI/CD y regresiones con respuestas o trayectorias esperadas, y evaluaciones online sobre una muestra de tráfico real. En ambos casos la integración depende de que la telemetría incluya correctamente el identificador de sesión y el contenido necesario para evaluar las respuestas.

En la práctica, esto permite mantener una capa de evaluación común aunque un equipo mezcle frameworks o cambie de SDK. Para arquitecturas de agentes en producción, OpenTelemetry pasa a servir no solo para observabilidad, sino también como contrato de entrada para pruebas de calidad y seguimiento continuo.
