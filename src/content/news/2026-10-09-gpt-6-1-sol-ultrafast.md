---
title: "OpenAI documenta el modo Ultrafast para GPT-6.1 Sol"
description: "El modo de servicio prioriza la latencia y establece límites de tokens específicos según el nivel de uso."
date: 2026-10-09
source: "OpenAI"
source_url: "https://developers.openai.com/api/docs/guides/ultrafast-mode"
category: "AI"
tags:
  - api
  - inference
featured: false
priority: 4
placement: normal
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-10-09T08:15:00+02:00
---

OpenAI documenta un modo Ultrafast para solicitudes de API con GPT-6.1 Sol, diseñado para priorizar tiempos de respuesta. Se selecciona mediante el parámetro `service_tier: "ultrafast"` en Responses API.

La documentación establece límites iniciales de uno, cuatro y cuarenta millones de tokens por minuto para los niveles Build, Launch y Grow, respectivamente. El modo admite residencia de datos en Estados Unidos y la Unión Europea, además de procesamiento global.

El servicio tiene tarifas diferenciadas que conviene consultar antes de adoptarlo. Su utilidad depende de que la reducción de latencia justifique el coste adicional para cada carga de trabajo.

Fuente: [documentación de Ultrafast mode](https://developers.openai.com/api/docs/guides/ultrafast-mode).
