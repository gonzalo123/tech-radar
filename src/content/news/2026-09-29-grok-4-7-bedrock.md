---
title: "Amazon Bedrock incorpora Grok 4.7 con 500K de contexto y cuatro niveles de razonamiento"
description: "AWS añade el último modelo de xAI a Bedrock con Responses, Chat Completions y Converse, perfiles Global y US y distintos niveles de servicio."
date: 2026-09-29

source: "AWS"
source_url: "https://aws.amazon.com/blogs/machine-learning/grok-4-7-is-now-available-on-amazon-bedrock/"

category: "AWS"

tags:
  - bedrock
  - models
  - agents
  - cost-control

featured: false
priority: 92
placement: secondary
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-09-29T06:28:00+02:00
---

AWS ha incorporado **Grok 4.7** de xAI a Amazon Bedrock. El modelo ofrece una ventana de contexto de 500.000 tokens, entrada de texto e imágenes y cuatro niveles configurables de razonamiento —`low`, `medium`, `high` y `xhigh`— para ajustar el gasto de cómputo a cada tarea.

Bedrock lo expone mediante Responses, Chat Completions, InvokeModel y Converse. Las aplicaciones compatibles con la API de OpenAI pueden utilizar el endpoint de Bedrock, mientras que Converse permite mantener una interfaz común con otros modelos y aprovechar credenciales y controles nativos de AWS.

La integración incluye prompt caching implícito, structured outputs, Bedrock Guardrails e invocation logging en CloudWatch con conteo de tokens de razonamiento. AWS ofrece además los niveles Standard, Priority y Flex, de modo que el coste y la latencia pueden ajustarse independientemente del esfuerzo de razonamiento.

Grok 4.7 se sirve mediante perfiles de inferencia cross-Region: un perfil Global que prioriza capacidad y coste y otro geográfico US para cargas con requisitos de residencia de datos.
