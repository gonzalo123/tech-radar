---
title: "Claude incorpora exportación OpenTelemetry para observar llamadas y sesiones de agentes"
description: "La plataforma de Anthropic añade en beta trazas de Messages API y Claude Managed Agents con soporte SDK para siete lenguajes."
date: 2026-10-17
source: "Anthropic"
source_url: "https://platform.claude.com/docs/en/release-notes/overview"
category: "DevTools"
tags:
  - observability
  - opentelemetry
  - agents
featured: false
priority: 7
placement: secondary
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-10-17T13:29:00+02:00
---

Anthropic añadió el 14 de octubre, en fase beta, la exportación de telemetría OpenTelemetry para solicitudes de Messages API y sesiones de Claude Managed Agents. Los equipos pueden enviar trazas a sus herramientas habituales de observabilidad configurando un destino OpenTelemetry en Claude Console.

El SDK de Claude emite spans en Python, TypeScript, C#, Go, Java, PHP y Ruby. La novedad facilita correlacionar las operaciones de la plataforma con trazas de aplicaciones y agentes, en lugar de depender únicamente de registros aislados o métricas agregadas.

La función no debe confundirse con soporte automático en cualquier entorno que ejecute modelos Claude: el anuncio se refiere a Claude Platform y sus servicios. Para sistemas en producción, conviene comprobar qué datos incluyen los spans, aplicar controles de acceso y revisar las políticas de retención antes de exportarlos a un backend externo.

Fuente: [Anthropic](https://platform.claude.com/docs/en/release-notes/overview).
