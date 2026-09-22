---
title: "Bedrock amplía Grok 4.6 con Converse API, CRIS y prompt caching"
description: "Grok 4.6 ya puede usarse desde bedrock-runtime con Converse API, cross-Region inference, Guardrails, invocation logging y prompt caching."
date: 2026-09-22

source: "AWS"
source_url: "https://aws.amazon.com/blogs/machine-learning/xais-grok-4-6-is-now-available-in-amazon-bedrock/"

category: "AWS"

tags:
  - bedrock
  - grok
  - models
  - agents

featured: false
priority: 90
placement: secondary
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-09-22T06:30:59+02:00
---

AWS ha ampliado la integración de Grok 4.6 en Amazon Bedrock con acceso mediante `bedrock-runtime`, Converse API y cross-Region inference. El modelo, disponible en Bedrock desde agosto, puede ahora integrarse mediante la interfaz estándar de Bedrock además del endpoint OpenAI-compatible `bedrock-mantle`.

Grok 4.6 dispone de una ventana de contexto de 500.000 tokens y cuatro niveles de reasoning effort: `low`, `medium`, `high` y `xhigh`. En `bedrock-runtime` soporta también Amazon Bedrock Guardrails, invocation logging y prompt caching, capacidades especialmente relevantes para agentes de larga duración y entornos empresariales.

AWS ofrece perfiles de inferencia Geo y Global. Global CRIS cuesta 2 dólares por millón de tokens de entrada y 6 dólares por millón de salida; Geo CRIS cuesta 2,20 y 6,60 dólares respectivamente. Las lecturas de caché cuestan 0,50 dólares por millón de tokens en Global y 0,55 en Geo. Grok 4.6 admite además los tiers Priority y Flex, este último al 50 % de la tarifa Standard.

La diferencia práctica frente a la disponibilidad inicial es la integración con el ecosistema estándar de Bedrock: aplicaciones que ya utilizan Converse pueden incorporar Grok sin adoptar una API específica del proveedor, mientras que Guardrails y los logs de invocación permiten aplicar controles y auditoría comunes a otros modelos de la plataforma.
