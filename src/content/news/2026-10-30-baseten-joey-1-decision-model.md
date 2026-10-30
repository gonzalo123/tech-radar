---
title: "Baseten publica joey-1, un modelo de decisión abierto de 2.000 millones de parámetros"
description: "El modelo devuelve decisiones estructuradas y probabilidades sin generar texto libre, con precio anunciado de 0,01 dólares por millón de tokens."
date: 2026-10-30
source: "Baseten"
source_url: "https://www.baseten.co/blog/decisions-for-a-penny-introducing-joey-1/"
category: "AI"
tags:
  - decision-models
  - agents
  - inference
featured: false
priority: 9
placement: secondary
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-10-30T07:24:00+01:00
---

Baseten presentó el 29 de octubre joey-1, un modelo de decisión de 2.000 millones de parámetros desarrollado por Base Labs a partir de Qwen3.5-2B. Está diseñado para devolver etiquetas, elecciones y probabilidades calibradas en una sola pasada, en lugar de generar una respuesta textual que después haya que interpretar.

El fabricante anuncia una latencia mediana de extremo a extremo de 20 milisegundos para peticiones de unos 2.000 tokens y un precio de 0,01 dólares por millón de tokens. Las cifras proceden de pruebas internas de Baseten y deben contrastarse con cargas reales. El modelo admite entradas de texto e imagen y puede responder varias preguntas estructuradas sobre el mismo contexto.

joey-1 está disponible en Baseten Model APIs mediante un endpoint compatible con System One. La API compartida ofrece hasta 16.000 tokens de contexto; los despliegues dedicados pueden llegar a 262.000. Los pesos están publicados en Hugging Face y el proveedor indica que su API aplica retención cero de datos por defecto.

Es una opción a evaluar para enrutamiento de incidencias, clasificación de solicitudes y decisiones frecuentes dentro de agentes, cuando la salida requerida es una etiqueta o puntuación y no una explicación extensa.

Fuente: [Baseten](https://www.baseten.co/blog/decisions-for-a-penny-introducing-joey-1/).
