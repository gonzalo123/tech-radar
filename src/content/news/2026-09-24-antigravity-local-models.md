---
title: "Google Antigravity ejecuta agentes con modelos locales y offline"
description: "Antigravity SDK añade ejecución local con Gemma 4, LiteRT y servidores compatibles con OpenAI, además de flujos híbridos que mantienen el código en el equipo."
date: 2026-09-24

source: "Google Developers"
source_url: "https://developers.googleblog.com/introducing-support-for-local-ai-models-in-the-antigravity-sdk/"

category: "AI"

tags:
  - agents
  - local-models
  - gemma
  - antigravity

featured: true
priority: 94
placement: lead
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-09-24T06:31:21+02:00
---

Google anunció el 23 de septiembre **soporte para ejecutar agentes de Antigravity SDK con modelos locales**, inicialmente optimizado para Gemma 4 26B A4B mediante LiteRT. Los workflows pueden funcionar completamente offline, sin enviar código ni prompts a una API remota y sin coste por tokens de inferencia.

El SDK también admite servidores locales compatibles con la API de OpenAI, incluidos Ollama, LM Studio y vLLM, mediante `LocalOpenAIAgentConfig`. Esto permite cambiar el backend de inferencia manteniendo la misma orquestación, herramientas y workflows del agente.

Google plantea además una arquitectura híbrida en la que un modelo cloud actúa como planificador y delega la ejecución a modelos locales. En su demostración, Gemini 3.8 Flash descompone una auditoría de tres módulos utilizando únicamente nombres de ficheros y descripciones de tareas, mientras instancias locales de Gemma reproducen vulnerabilidades, generan correcciones y ejecutan tests. Google afirma que el 97,2 % de los tokens de esa ejecución se procesaron localmente.

La novedad es especialmente relevante para equipos con requisitos de privacidad, residencia de datos o control de costes: permite reservar modelos cloud para planificación de alto nivel y ejecutar localmente tareas intensivas que necesitan acceso al código. Google recomienda más de 24 GB de VRAM o memoria unificada para el flujo inicial con Gemma 4 26B.
