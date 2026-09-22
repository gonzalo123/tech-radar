---
title: "Jev introduce modelos de decisión tipada y logra una adopción récord en Vercel AI Gateway"
description: "TypeSafe AI lanza Jev, un modelo orientado a decisiones estructuradas para software que alcanzó casi el 13 % de los equipos de pago de Vercel AI Gateway en sus primeras 24 horas."
date: 2026-09-22

source: "TypeSafe AI"
source_url: "https://typesafe.ai/blog/introducing-system-one-models-and-jev"

category: "AI"

tags:
  - models
  - agents
  - inference
  - cost-control

featured: true
priority: 97
placement: lead
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-09-22T12:50:00+02:00
---

TypeSafe AI lanzó el 15 de septiembre **Jev**, su primer *System One Model*, una arquitectura que no genera texto libre: recibe contexto y preguntas estructuradas y devuelve decisiones tipadas —por ejemplo booleanos, elecciones o puntuaciones— acompañadas de probabilidades. Tres días después, [Vercel informó](https://vercel.com/blog/ai-gateway-jev-model-launch) de que Jev se había convertido en el modelo con adopción más rápida de la historia de AI Gateway, utilizado por casi el 13 % de sus equipos de pago durante las primeras 24 horas.

El planteamiento busca cubrir una función diferente a la de un LLM generalista. En lugar de producir una cadena de texto que una aplicación debe interpretar y validar, Jev evalúa preguntas declaradas previamente y devuelve valores que el código puede consumir directamente. Entre los casos de uso están seleccionar la siguiente herramienta o subagente, decidir si un workflow debe continuar o detenerse, puntuar riesgo o urgencia y enviar a revisión humana los casos con baja confianza.

TypeSafe publica un precio de **$0,042 por millón de tokens de entrada**, sin coste medido para la salida. En sus propias evaluaciones de workflows, la compañía afirma mejoras de hasta **193,6 veces en velocidad y 444,6 veces en coste** frente a LLMs utilizados para las mismas decisiones. Son resultados del fabricante y dependen de tareas diseñadas específicamente alrededor de decisiones estructuradas, no de generación general de lenguaje.

Jev se lanzó inicialmente en **early access** y el 16 de septiembre pasó a estar disponible también a través de [Vercel AI Gateway](https://vercel.com/changelog/typesafe-ai-jev-now-available-on-ai-gateway). La señal más relevante no es solo su precio o sus benchmarks, sino la rapidez con la que los desarrolladores empezaron a probar un modelo especializado que sacrifica generación de texto a cambio de latencia, coste y una interfaz más cercana a una función de software.

Para arquitecturas de agentes, la idea abre una alternativa interesante: reservar los modelos generativos para razonamiento y producción de contenido, y utilizar modelos de decisión baratos y rápidos para routing, guardrails, clasificación y control de flujo.
