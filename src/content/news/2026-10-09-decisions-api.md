---
title: "OpenAI abre la beta pública de Decisions API para clasificación y enrutamiento"
description: "La nueva API devuelve decisiones tipadas y probabilidades a partir de texto e imágenes."
date: 2026-10-09
source: "OpenAI"
source_url: "https://developers.openai.com/api/docs/guides/decisions"
category: "AI"
tags:
  - agents
  - api
featured: false
priority: 8
placement: lead
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-10-09T08:15:00+02:00
---

OpenAI ha abierto en beta pública Decisions API, un servicio para evaluar texto e imágenes y devolver decisiones estructuradas. Permite comprobar condiciones, escoger entre opciones predefinidas o puntuar entradas mediante un criterio, con probabilidades asociadas.

El servicio utiliza el endpoint `POST /v1/decisions` y, durante esta beta, admite únicamente el modelo `gpt-6-luna`. OpenAI afirma que puede responder aproximadamente diez veces más rápido que Responses API en las tareas contempladas.

Su uso previsto incluye clasificar contenidos, enrutar solicitudes y priorizar trabajo. No sustituye a Structured Outputs cuando la aplicación necesita generar objetos JSON arbitrarios o explicaciones redactadas.

Fuente: [documentación de Decisions API](https://developers.openai.com/api/docs/guides/decisions).
