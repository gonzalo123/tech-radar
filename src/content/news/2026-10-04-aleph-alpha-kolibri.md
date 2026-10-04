---
title: "Aleph Alpha libera Kolibri con un millón de tokens de contexto"
description: "El modelo abierto en inglés y alemán utiliza una arquitectura MoE de 78.000 millones de parámetros, con 3.000 millones activos."
date: 2026-10-04

source: "Aleph Alpha"
source_url: "https://aleph-alpha.com/en/blog/kolibri-has-landed-a-sovereign-open-weight-model/"

category: "AI"

tags:
  - models
  - open-weights
  - inference
  - agents

featured: false
priority: 85
placement: secondary
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-10-04T13:00:11.496Z
---

Aleph Alpha publicó el 3 de octubre **Kolibri**, un modelo en inglés y alemán cuyos pesos pueden descargarse bajo Apache 2.0. Su arquitectura Mixture-of-Experts tiene 78.000 millones de parámetros totales y activa 3.000 millones, con soporte para contextos de hasta un millón de tokens.

El proveedor lo orienta a entornos regulados, con razonamiento, programación y uso de herramientas. Sus evaluaciones son propias; no acreditan el cumplimiento de los requisitos de cada organización.

La inferencia utiliza un plugin de vLLM incluido en `aleph-alpha-inference`, disponible también como contenedor. El millón de tokens requiere configurar explícitamente la longitud máxima; para contextos superiores a 262.144 tokens, la documentación proporciona parámetros adicionales.

Los pesos abiertos permiten evaluarlo en infraestructura propia. Los 3.000 millones de parámetros activos describen el cómputo por paso, no el tamaño total de los pesos que hay que alojar.
