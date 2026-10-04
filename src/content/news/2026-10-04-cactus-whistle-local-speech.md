---
title: "Cactus publica Whistle, transcripción local en un modelo de 16,9 MB"
description: "Whistle funciona en CPU, transcribe clips de hasta 30 segundos en siete idiomas y devuelve marcas de tiempo por palabra."
date: 2026-10-04

source: "Cactus"
source_url: "https://cactuscompute.com/blog/whistle"

category: "AI"

tags:
  - models
  - voice
  - inference

featured: false
priority: 55
placement: brief
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-10-04T13:00:11.496Z
---

Cactus publicó el 2 de octubre **Whistle**, un modelo de reconocimiento de voz de 16,9 MB que funciona en CPU. Transcribe clips de hasta 30 segundos en siete idiomas, incluido español, sin enviar el audio a un servicio remoto.

Acepta audio mono de 16 kHz y devuelve transcripción, idioma, marcas de tiempo por palabra y embeddings de voz. Comparte motor C++ con Needle, por lo que ambos pueden combinarse para convertir audio en llamadas a herramientas dentro del dispositivo.

Los pesos y el código están publicados, con una interfaz Python mediante `cactus-needle`. Cactus comunica 11,1 ms hasta el primer token para diez segundos de audio en una CPU Apple M4 Pro; es una medición del fabricante sobre clips completos, no una latencia de transcripción continua.
