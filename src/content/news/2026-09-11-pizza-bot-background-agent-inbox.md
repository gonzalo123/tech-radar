---
title: "AWS libera Pizza Bot, un inbox open source para agentes que trabajan en segundo plano"
description: "Pizza Bot ejecuta agentes asíncronos con tareas programadas, webhooks, aprobaciones humanas, MCP y skills, y presenta los resultados en una bandeja de entrada persistente."
date: 2026-09-11

source: "AWS"
source_url: "https://aws.amazon.com/blogs/opensource/introducing-pizza-bot-an-open-source-inbox-for-ai-agents-that-work-in-the-background/"

category: "AI"

tags:
  - agents
  - mcp
  - skills
  - automation
  - open-source

featured: false
priority: 94
placement: lead
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-09-11T06:32:03+02:00
---

AWS ha publicado Pizza Bot, una aplicación open source para ejecutar agentes de IA en segundo plano y recoger su trabajo en una bandeja de entrada persistente. Las tareas pueden iniciarse manualmente, mediante cron o por webhook; cuando terminan aparecen como trabajo no leído y, si necesitan una decisión humana, quedan pausadas en una cola de acciones pendientes.

La aplicación es self-hosted, no incluye telemetría y permite elegir proveedor de modelo, con soporte para Anthropic, Amazon Bedrock, Google Gemini, OpenAI, OpenRouter y modelos locales mediante Ollama. El estado de los hilos, checkpoints, memorias, adjuntos y logs permanece en el sistema del usuario, mientras que las credenciales se guardan en el almacén de secretos del sistema operativo.

Pizza Bot reutiliza MCP para conectar herramientas y Agent Skills para definir especialistas a los que el agente principal puede delegar trabajo. Cada skill puede limitar las herramientas disponibles y exigir aprobación antes de operaciones concretas. La aplicación también conserva ejecuciones y aprobaciones aunque el usuario cierre el hilo o cambie de cliente.

El proyecto nació de una herramienta interna utilizada por más de 2.000 personas en Amazon, pero la versión publicada es un proyecto comunitario y no un servicio de AWS, por lo que no cuenta con soporte ni SLA de AWS. Está disponible para macOS, Windows y Linux bajo licencia Apache 2.0.
