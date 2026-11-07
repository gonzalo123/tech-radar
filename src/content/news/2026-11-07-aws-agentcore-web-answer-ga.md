---
title: "AWS lanza Web Answer para obtener respuestas web citadas desde Bedrock AgentCore"
description: "El servicio gestionado realiza búsquedas y devuelve respuestas fundamentadas en una llamada MCP, con controles de dominios, fechas e IAM."
date: 2026-11-07
source: "AWS"
source_url: "https://aws.amazon.com/about-aws/whats-new/2026/11/web-answer-amazon-bedrock/"
category: "AI"
tags:
  - aws
  - bedrock
  - agents
  - mcp
featured: false
priority: 9
placement: lead
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-11-07T20:38:00+01:00
---

AWS anunció el 5 de noviembre la disponibilidad general de Web Answer para Amazon Bedrock AgentCore. La herramienta recibe una pregunta en lenguaje natural y devuelve una respuesta sintetizada con citas a fuentes web actuales. A diferencia de Web Search, lanzado en junio, no se limita a recuperar documentos: planifica búsquedas, reúne evidencias y redacta una respuesta en una sola llamada.

La integración se realiza como destino de AgentCore Gateway mediante MCP y autenticación IAM. El desarrollador puede definir listas de dominios permitidos o denegados y filtros por fecha de publicación. AWS afirma que el servicio funciona sin salida de datos hacia el exterior en su arquitectura gestionada; los requisitos concretos de privacidad deben comprobarse con la documentación y la configuración.

Por ahora, Web Answer solo está disponible en la región US East (N. Virginia) y se factura por llamada a la herramienta. La limitación regional importa para aplicaciones que deben mantener toda la ejecución y el tratamiento de datos en la Unión Europea.

Para arquitecturas basadas en Strands Agents y Bedrock, reduce la necesidad de mantener un pipeline propio de búsqueda, recuperación, síntesis y citas. Conviene evaluar calidad de fuentes, latencia, costes y límites de residencia antes de incorporarlo a producción.

Fuente: [AWS](https://aws.amazon.com/about-aws/whats-new/2026/11/web-answer-amazon-bedrock/).
