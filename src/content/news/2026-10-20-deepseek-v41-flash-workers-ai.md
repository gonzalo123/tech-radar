---
title: "Cloudflare incorpora DeepSeek V4.1 Flash 1017 a Workers AI"
description: "El modelo multimodal ofrece un millón de tokens de contexto, llamadas a herramientas y control del esfuerzo de razonamiento."
date: 2026-10-20
source: "Cloudflare"
source_url: "https://developers.cloudflare.com/changelog/post/2026-10-19-deepseek-v4.1-flash-workers-ai/"
category: "AI"
tags:
  - deepseek
  - agents
  - cloudflare
featured: false
priority: 6
placement: normal
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-10-20T06:54:00+02:00
---

Cloudflare anunció el 19 de octubre la disponibilidad de DeepSeek V4.1 Flash 1017 en Workers AI. La actualización del modelo multimodal incorpora mejoras anunciadas en razonamiento, programación, tareas con agentes y procesamiento de imágenes.

El modelo admite una ventana de contexto de 1.048.576 tokens y llamadas a funciones. El razonamiento está activado por defecto con esfuerzo alto, pero puede ajustarse a niveles bajo o máximo, o desactivarse. Según Cloudflare, su arquitectura de mezcla de expertos utiliza 552.000 millones de parámetros totales y activa una fracción de ellos durante la inferencia.

Se puede acceder mediante el binding de Workers AI, API REST, un endpoint compatible con OpenAI o AI Gateway. Requiere el plan Workers Paid o créditos prepago de AI Gateway, con límites predeterminados de 20 y 50 solicitudes por minuto respectivamente.

La integración permite probar un modelo de contexto largo en aplicaciones de agentes desplegadas sobre Cloudflare sin gestionar directamente la infraestructura de inferencia.

Fuente: [Cloudflare](https://developers.cloudflare.com/changelog/post/2026-10-19-deepseek-v4.1-flash-workers-ai/).
