---
title: "Claude Security añade análisis continuo de repositorios y seguimiento de correcciones"
description: "La herramienta de Anthropic incorpora exploración incremental, modelos de amenazas, API y conector MCP para equipos Enterprise."
date: 2026-10-22
source: "Anthropic"
source_url: "https://claude.com/resources/articles/claude-security-now-scans-continuously-and-tracks-fixes"
category: "Security"
tags:
  - claude
  - security
  - mcp
featured: false
priority: 8
placement: secondary
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-10-22T07:05:00+02:00
---

Anthropic anunció el 21 de octubre una actualización de Claude Security que analiza periódicamente cambios en los repositorios, sigue la resolución de vulnerabilidades e integra los hallazgos con herramientas externas. La función está disponible en beta pública para clientes Claude Enterprise.

Los equipos conectan repositorios de GitHub, incluido GitHub Enterprise Server, o proveedores compatibles mediante token. Tras un análisis inicial, el servicio vuelve a examinar los cambios según su riesgo y complejidad. Los hallazgos se marcan como corregidos cuando la modificación llega al código y pueden reabrirse si reaparecen.

Cada proyecto puede incluir varios repositorios y una base de conocimiento sobre despliegue y controles internos. El servicio genera modelos de amenazas editables, ofrece una API, webhooks y un conector MCP para consultar hallazgos desde Claude Code o Claude.ai. También añade controles de acceso por roles.

Anthropic afirma que miles de organizaciones han detectado más de un millón de vulnerabilidades desde la beta inicial; la cifra es de la empresa y no demuestra por sí sola precisión o impacto. La integración puede facilitar el seguimiento de seguridad en equipos con varios servicios, pero los resultados requieren verificación y priorización humana.

Fuente: [Anthropic](https://claude.com/resources/articles/claude-security-now-scans-continuously-and-tracks-fixes).
