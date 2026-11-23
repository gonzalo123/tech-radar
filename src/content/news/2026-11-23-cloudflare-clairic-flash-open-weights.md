---
title: "Cloudflare libera Clairic y Clairic-flash para extracción de datos con modelos especializados"
description: "Los modelos de 27B y 9B parámetros están disponibles con pesos descargables y en Workers AI, con cobro por tokens de entrada."
date: 2026-11-23
source: "Cloudflare"
source_url: "https://blog.cloudflare.com/open-clairic/"
category: "AI"
tags:
  - modelos-abiertos
  - cloudflare
  - inferencia
featured: false
priority: 8
placement: lead
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-11-23T06:32:33+01:00
---

Cloudflare anunció el 18 de noviembre la publicación de los pesos de Clairic, su modelo de extracción de información de 27.000 millones de parámetros, y del nuevo Clairic-flash, una variante de 9.000 millones. Ambos se ofrecen también mediante Workers AI. Es una ampliación de la versión preliminar de Clairic, no un modelo generativo generalista.

La nueva versión de Clairic mejora, según Cloudflare, la extracción de información en documentos complejos y añade soporte para imágenes y PDF, con especial atención a tablas, listas y fechas. La empresa presenta Clairic-flash como alternativa de menor tamaño para tareas de extracción y predicción que requieren menos recursos.

Los endpoints son `@cf/cloudflare/clairic` y `@cf/cloudflare/clairic-flash`. Cloudflare cobra únicamente por tokens de entrada: el precio ordinario anunciado es de 0,24 dólares por millón para Clairic y 0,10 dólares para Clairic-flash. Hasta el 1 de diciembre de 2026 aplica una promoción de 0,10 dólares por millón para ambos modelos. El proveedor asume el coste de los tokens generados.

La propuesta permite separar la extracción estructurada de tareas que requieren un modelo de lenguaje generalista, con posibles ahorros en pipelines documentales. Conviene contrastar precisión, latencia y costes con documentos reales antes de sustituir una solución existente.

Fuente original: [Cloudflare](https://blog.cloudflare.com/open-clairic/).
