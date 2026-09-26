---
title: "goose 1.52 integra Jev como proveedor especializado para decisiones"
description: "El agente open source goose añade un proveedor de decisiones con implementaciones para Jev y OpenRouter, además de conversaciones de voz en desktop."
date: 2026-09-26

source: "goose"
source_url: "https://github.com/aaif-goose/goose/releases/tag/v1.52.0"

category: "DevTools"

tags:
  - agents
  - models
  - developer-tools

featured: false
priority: 82
placement: normal
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-09-26T13:46:00+02:00
---

El agente open source **goose 1.52** ha añadido un proveedor específico para decisiones con implementaciones para **Jev** y OpenRouter. La versión incorpora además conversaciones de voz en tiempo real en la aplicación de escritorio y un proveedor para Z.AI Coding Plan con streaming de llamadas a herramientas.

La integración de Jev es especialmente relevante como señal de ecosistema. Jev no genera texto libre: está diseñado para devolver decisiones estructuradas y probabilidades a bajo coste, por lo que puede utilizarse para routing, selección de herramientas, clasificación o control de flujo dentro de un agente.

goose separa ahora ese tipo de decisión del proveedor generativo principal mediante un crate dedicado. Esto permite experimentar con una arquitectura en la que un modelo generalista realiza el trabajo complejo y un modelo especializado decide qué camino debe seguir el agente.

La novedad constituye una segunda señal práctica tras el rápido uso inicial de Jev en Vercel AI Gateway: un framework de agentes de propósito general ya lo está incorporando explícitamente como componente especializado de decisión.
