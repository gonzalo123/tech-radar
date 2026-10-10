---
title: "Bedrock incorpora resúmenes de razonamiento para modelos OpenAI"
description: "Responses API admite reasoning.summary en los modelos OpenAI disponibles en Amazon Bedrock."
date: 2026-10-10
source: "AWS"
source_url: "https://aws.amazon.com/about-aws/whats-new/2026/10/amazon-bedrock-reasoning-summaries-openai/"
category: "AWS"
tags:
  - bedrock
  - observability
featured: false
priority: 7
placement: secondary
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-10-10T11:18:00+02:00
---

AWS anunció el 9 de octubre que Amazon Bedrock admite el parámetro `reasoning.summary` para modelos OpenAI mediante Responses API. La función devuelve un resumen legible del razonamiento junto a la respuesta del modelo.

El contenido se entrega en el array `summary` del elemento de salida de razonamiento. Puede ayudar a examinar respuestas en tareas de programación, análisis y procesos de varios pasos, aunque no debe confundirse con una traza completa de ejecución.

AWS indica que está disponible para todos los modelos OpenAI de Bedrock en las regiones donde se ofrecen, incluidas las modalidades de inferencia regional, geográfica y global. Para sistemas con agentes, puede aportar contexto adicional durante evaluación y depuración.

Fuente: [AWS](https://aws.amazon.com/about-aws/whats-new/2026/10/amazon-bedrock-reasoning-summaries-openai/).
