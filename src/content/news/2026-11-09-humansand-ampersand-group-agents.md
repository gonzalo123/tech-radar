---
title: "Ampersand permite que un agente decida cuándo hablar y cuándo callar en conversaciones de grupo"
description: "Humans& ofrece Ampersand v0.1 mediante Vercel AI Gateway con herramientas send_message y pass y acceso gratuito temporal."
date: 2026-11-09
source: "Vercel"
source_url: "https://vercel.com/changelog/humans-and-ampersand-now-available-on-ai-gateway"
category: "AI"
tags:
  - models
  - agents
  - collaboration
  - vercel
featured: false
priority: 8
placement: normal
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-11-09T07:05:00+01:00
---

Vercel anunció el 6 de noviembre la incorporación de Ampersand v0.1, de Humans&, a AI Gateway. El modelo está diseñado para participar en conversaciones con varias personas, comprender objetivos compartidos y decidir si debe intervenir o dejar que continúe la discusión.

En lugar de responder obligatoriamente a cada turno, la aplicación le proporciona dos herramientas: send_message para publicar una aportación y pass para permanecer en silencio hasta el siguiente mensaje humano. La ejecución y el registro de esas acciones corresponden a la aplicación integradora.

El identificador del modelo es humansand/ampersand-v0.1 y puede invocarse mediante AI SDK o una API de chat compatible con OpenAI. Vercel anuncia acceso gratuito hasta el 13 de noviembre de 2026.

Este patrón resulta interesante para integrar agentes en canales de colaboración sin convertirlos en participantes invasivos. Vercel recomienda persistir historial y confirmaciones de entrega, procesar secuencialmente los mensajes por conversación y comprobar permisos antes de publicar. La calidad real de las decisiones de intervención debe evaluarse en equipos y conversaciones concretos.

Fuente: [Vercel](https://vercel.com/changelog/humans-and-ampersand-now-available-on-ai-gateway).
