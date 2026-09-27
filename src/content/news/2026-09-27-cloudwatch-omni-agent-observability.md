---
title: "CloudWatch Omni unifica trazas, evaluaciones y experimentos para agentes de IA"
description: "AWS lanza una experiencia de observabilidad para agentes basada en estándares abiertos, con trazas completas, evaluadores y experimentación desde IDE o web."
date: 2026-09-27

source: "AWS"
source_url: "https://aws.amazon.com/blogs/aws/introducing-amazon-cloudwatch-omni-ai-powered-observability-for-generative-ai-and-agentic-workloads/"

category: "AWS"

tags:
  - agents
  - observability
  - strands-agents

featured: true
priority: 94
placement: lead
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-09-27T06:27:55+02:00
---

AWS ha lanzado **Amazon CloudWatch Omni**, una experiencia de observabilidad, evaluación y experimentación para agentes de IA que combina trazas de ejecución, evaluadores y comparación de configuraciones. Es compatible con distintos proveedores de modelos, frameworks y runtimes y puede utilizarse desde VS Code, Kiro o una interfaz web separada de la consola de AWS.

Omni registra la secuencia completa de una ejecución —llamadas a modelos, herramientas, uso de tokens y latencia— y añade 17 evaluadores integrados para métricas como coherencia, fidelidad y corrección del routing. También permite construir datasets a partir de tráfico de producción, comparar versiones de prompts y detectar regresiones.

La instrumentación utiliza estándares abiertos como OpenInference y ADOT. AWS documenta soporte para LangChain, LangGraph, CrewAI, OpenAI SDK, **Strands**, Vercel AI SDK y agentes sobre Bedrock AgentCore, además de evaluadores externos como Braintrust, DeepEval y Ragas.

La extensión de IDE puede funcionar completamente en local y almacenar los datos localmente; conectar una cuenta AWS es opcional hasta que se quiera persistir telemetría en CloudWatch o observar producción. CloudWatch Omni está **generalmente disponible** y la extensión de IDE es gratuita.
