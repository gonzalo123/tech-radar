---
title: "Recursive publica Flint, un modelo abierto para programación local"
description: "Flint combina 40.000 millones de parámetros totales con unos 2.500 millones activos por token y ofrece pesos Apache 2.0 para ejecución en equipos locales."
date: 2026-10-28
source: "Recursive"
source_url: "https://recursive.com/updates/introducing-recursive-flint"
category: "AI"
tags:
  - models
  - coding
  - open-weights
featured: false
priority: 8
placement: secondary
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-10-28T06:54:00+01:00
---

Recursive presentó el 21 de octubre Flint, un modelo de mezcla de expertos orientado a programación con agentes y ejecución local. Cuenta con 40.000 millones de parámetros totales y activa aproximadamente 2.500 millones por token. Sus pesos se distribuyen en Hugging Face bajo licencia Apache 2.0.

El fabricante afirma que Flint supera los 125 tokens por segundo en un MacBook Pro con M4 Pro y los 150 en un equipo NVIDIA RTX Spark con 64 GB, medidos con contextos cortos y su motor optimizado. La publicación anuncia contextos de hasta 512.000 tokens, aunque recomienda trabajar por debajo de 256.000 para obtener mejores resultados.

El modelo es compatible con herramientas como llama.cpp, Ollama, LM Studio, vLLM y SGLang. Recursive también publica `rec`, un motor de inferencia optimizado para su modelo y determinados equipos Apple Silicon.

La compañía atribuye parte de su diseño a Eureka Machine, un sistema de investigación automatizada que exploró arquitecturas, cuantización y kernels. Las comparaciones de rendimiento difundidas por Recursive todavía necesitan reproducción independiente.

Flint puede resultar interesante para equipos que quieren mantener el código en sus propios dispositivos o reducir el uso de API externas. Su tamaño, la memoria necesaria y la calidad de sus respuestas deben evaluarse con cargas de trabajo reales.

Fuente: [Recursive](https://recursive.com/updates/introducing-recursive-flint).
