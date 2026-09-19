---
title: "Kimi K3 llega a Amazon Bedrock con visión y un millón de tokens de contexto"
description: "AWS incorpora Kimi K3 de Moonshot AI a Bedrock con visión nativa, contexto de 1M tokens y prompt caching explícito."
date: 2026-09-19

source: "AWS"
source_url: "https://docs.aws.amazon.com/bedrock/latest/userguide/model-card-moonshot-ai-kimi-k3.html"

category: "AI"

tags:
  - bedrock
  - models
  - coding
  - multimodal

featured: false
priority: 95
placement: lead
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-09-19T06:30:42+02:00
---

AWS ha incorporado Kimi K3 de Moonshot AI a Amazon Bedrock. El modelo open-weight combina visión nativa con una ventana de contexto de un millón de tokens y está orientado a coding y trabajo de conocimiento sobre repositorios, documentos e imágenes de gran tamaño.

Bedrock ofrece Kimi K3 mediante Global y US cross-Region inference. En la tarifa Standard, Global CRIS cuesta 3 dólares por millón de tokens de entrada y 15 dólares por millón de salida; US CRIS cuesta 3,30 y 16,50 dólares respectivamente. El modelo también admite los tiers Priority y Flex.

Kimi K3 soporta prompt caching automático y explícito. Para caché explícita, el mínimo es de 1.024 tokens por checkpoint y la retención es de al menos 30 minutos; las lecturas de caché en Global CRIS cuestan 0,30 dólares por millón de tokens.

Para equipos que ya centralizan modelos en Bedrock, la incorporación añade una alternativa de contexto largo y multimodal sin introducir otro proveedor de inferencia en la arquitectura.