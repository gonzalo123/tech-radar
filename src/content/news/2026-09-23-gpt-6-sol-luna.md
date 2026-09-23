---
title: "OpenAI lanza GPT-6 Sol y Luna y los lleva a Bedrock y Copilot"
description: "GPT-6 Sol y Luna amplían la familia GPT-6 con opciones de 2/10 y 0,10/0,50 dólares por millón de tokens, disponibles también en Amazon Bedrock y GitHub Copilot."
date: 2026-09-23

source: "OpenAI"
source_url: "https://developers.openai.com/api/docs/changelog"

category: "AI"

tags:
  - openai
  - models
  - coding-agents
  - bedrock

featured: true
priority: 99
placement: secondary
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-09-23T06:31:25+02:00
---

OpenAI lanzó el 22 de septiembre **GPT-6 Sol y GPT-6 Luna**, dos modelos que llevan parte de los avances de GPT-6 Astra a workloads donde importan más el coste y el volumen. Sol está orientado a coding y workflows agentic complejos; Luna a tareas enfocadas y de alta frecuencia.

En la API, para prompts de hasta 272.000 tokens, GPT-6 Sol cuesta **2 dólares por millón de tokens de entrada y 10 de salida**, mientras GPT-6 Luna baja a **0,10 dólares de entrada y 0,50 de salida**. Ambos admiten 1,05 millones de tokens de contexto, hasta 128.000 de salida, entrada de texto e imagen y niveles de razonamiento desde `none` hasta `max`.

Los dos modelos están disponibles mediante Responses API y Chat Completions. OpenAI también los ha incorporado a ChatGPT Work y Codex, mientras GitHub ha empezado su despliegue en Copilot. Sol está disponible en Copilot Pro+, Max, Business y Enterprise; Luna también llega al plan Pro.

AWS los lanzó el mismo día como generalmente disponibles en Amazon Bedrock. Allí soportan prompt caching y los controles habituales de Bedrock para IAM, CloudTrail y PrivateLink. AWS indica además que los datos de inferencia no se usan para entrenar modelos; el tráfico marcado por clasificadores puede retenerse hasta 30 días para detección automatizada de abuso y las organizaciones pueden solicitar zero data retention a través de su equipo de cuenta.

Para producción, la novedad no es solo disponer de dos modelos más: GPT-6 Luna abre un escalón de coste muy bajo para clasificación, extracción y routing, mientras Sol ofrece una alternativa intermedia para coding y agentes que no necesitan pagar el coste de Astra en cada ejecución.
