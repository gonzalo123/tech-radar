---
title: "GPT-6 Astra ya está disponible de forma general en Amazon Bedrock"
description: "AWS pone GPT-6 Astra en disponibilidad general en Bedrock, con acceso por API y soporte para usar el modelo desde Codex y ChatGPT Work."
date: 2026-09-09

source: "AWS"
source_url: "https://aws.amazon.com/blogs/machine-learning/take-on-your-most-ambitious-work-with-gpt-6-astra-on-amazon-bedrock/"

category: "AWS"

tags:
  - bedrock
  - openai
  - gpt-6
  - codex
  - agents

featured: false
priority: 92
placement: lead
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-09-09T06:28:30+02:00
---

AWS puso el 8 de septiembre GPT-6 Astra en disponibilidad general en Amazon Bedrock. El lanzamiento convierte en acceso efectivo la integración que OpenAI había anunciado al presentar Astra: las aplicaciones pueden invocar el modelo mediante las APIs compatibles de Bedrock y las organizaciones pueden configurar Codex y ChatGPT Work para utilizar Astra a través de AWS.

Astra mantiene en Bedrock sus capacidades orientadas a razonamiento, coding y flujos agentic de larga duración, con una ventana de hasta un millón de tokens de entrada según la documentación de AWS. La implementación soporta además prompt caching implícito y explícito, útil para agentes y análisis que reutilizan grandes cantidades de contexto entre peticiones.

Para entornos empresariales, AWS aplica controles de IAM, CloudTrail, PrivateLink y cifrado sobre las invocaciones. Los datos de inferencia no se utilizan para entrenar el modelo ni requieren compartirlos con OpenAI. AWS indica que el tráfico marcado por sus clasificadores de detección de abuso puede conservarse hasta 30 días y que los clientes pueden solicitar zero data retention a través de su equipo de cuenta.

La novedad es especialmente relevante para organizaciones que estandarizan sus modelos de IA en Bedrock: Astra pasa de ser una disponibilidad anunciada a poder utilizarse en producción dentro del mismo perímetro de gobierno que el resto de modelos de la plataforma.
