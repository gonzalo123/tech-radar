---
title: "Cloudflare publica Clef, modelos abiertos de decisión para agentes"
description: "Clef y Clef-flash devuelven decisiones tipadas con probabilidades, son compatibles con Jev y están disponibles en Workers AI."
date: 2026-10-04

source: "Cloudflare"
source_url: "https://developers.cloudflare.com/changelog/post/2026-10-01-clef-workers-ai/"

category: "AI"

tags:
  - models
  - agents
  - inference
  - cost-control

featured: false
priority: 92
placement: lead
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-10-04T13:00:11.496Z
---

Cloudflare lanzó el 1 de octubre **Clef y Clef-flash**, sus primeros modelos de decisión, disponibles en Workers AI y con pesos publicados bajo Apache 2.0. Reciben un estado y preguntas tipadas y devuelven probabilidades sobre las respuestas permitidas, en lugar de generar texto libre.

Clef tiene 27.000 millones de parámetros y Clef-flash, 9.000 millones; ambos admiten 64.000 tokens de contexto y hasta 64 preguntas por petición. La interfaz sigue la API System One de Jev, con preguntas booleanas, elecciones entre opciones y puntuaciones. Clef también permite clasificación visual con hasta cuatro imágenes.

En sus pruebas, Cloudflare midió medianas de 209,3 ms para Clef y 38,8 ms para Clef-flash. Son resultados del proveedor, no una garantía de latencia para cualquier despliegue.

Estos modelos ofrecen una alternativa abierta para routing y clasificación. Las probabilidades permiten establecer umbrales de revisión humana; una salida tipada no garantiza una decisión correcta.
