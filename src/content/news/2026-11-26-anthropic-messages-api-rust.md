---
title: "Anthropic utiliza agentes para migrar su API de Python a Rust"
description: "La migración reduce aproximadamente un 70 % la CPU por petición mediante un proceso de verificación con tráfico real."
date: 2026-11-26
source: "Anthropic"
source_url: "https://www.anthropic.com/research/migrating-api-to-rust"
category: "DevTools"
tags:
  - agents
  - python
  - rust
  - testing
featured: false
priority: 6
placement: secondary
breaking: false
draft: false
generated_by: "ChatGPT"
---

Anthropic explicó el 25 de noviembre cómo migró su Messages API de Python a Rust con ayuda de Claude. Según sus mediciones, el servicio consume aproximadamente un 70 % menos de CPU por petición y reduce un 20 % la mediana del tiempo hasta el primer token, sin interrumpir el servicio.

El principal reto fue verificar la equivalencia funcional. En abril, la implementación nueva superaba el 98 % de las pruebas, pero solo coincidía con la anterior en aproximadamente una cuarta parte de las entradas de producción.

El equipo ejecutó ambas implementaciones en paralelo, reutilizando la misma salida del modelo para evitar diferencias propias de la generación no determinista. Los agentes investigaban discrepancias y proponían correcciones, mientras los ingenieros definían los criterios de aceptación y convertían errores recurrentes en pruebas y reglas.

El caso ilustra una metodología aplicable a migraciones de sistemas legacy: utilizar el comportamiento del servicio existente como referencia de verificación, en lugar de confiar exclusivamente en pruebas modificadas junto con el código.
