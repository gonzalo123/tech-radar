---
title: "GPT-6 mejora el prompt caching para agentes persistentes"
description: "OpenAI añade mayor reutilización automática de contexto, diagnóstico de fallos de caché, breakpoints explícitos y prewarming para reducir latencia y coste."
date: 2026-09-27

source: "OpenAI"
source_url: "https://openai.com/index/better-prompt-caching-for-gpt-6/"

category: "AI"

tags:
  - agents
  - cost-control

featured: false
priority: 91
placement: secondary
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-09-27T06:27:55+02:00
---

OpenAI ha ampliado el **prompt caching de GPT-6** para reutilizar más contexto entre llamadas de agentes persistentes y reducir coste y latencia. Los prefijos compartidos elegibles pueden reutilizarse durante una ventana de 30 minutos y los tokens de entrada servidos desde caché reciben descuentos de hasta el 90 %.

La plataforma incorpora un dashboard para medir la tasa de aciertos y una herramienta de diagnóstico que identifica qué cambios en modelo, herramientas, configuración o input provocaron un fallo de caché y cuántos tokens dejaron de reutilizarse.

Los desarrolladores pueden definir **cache breakpoints** explícitos y hacer prewarming de instrucciones, definiciones de herramientas o material de referencia antes de la primera petición. GPT-6 también permite cambiar el nivel de reasoning entre respuestas mediante `configuration_update` sin invalidar el contexto reutilizable.

Para agentes largos, el cambio convierte la caché en una parte más observable y controlable de la arquitectura de costes. OpenAI cita reducciones de coste del 20 % al 36 % en integraciones que mejoraron sus tasas de cache hit, aunque esas cifras corresponden a casos concretos y no constituyen una garantía general.
