---
title: "GitHub incorpora detección de vulnerabilidades específicas de agentes de IA"
description: "Code scanning analiza pull requests en busca de inyección indirecta de prompts, filtración de datos y permisos excesivos en aplicaciones con IA."
date: 2026-10-29
source: "GitHub"
source_url: "https://github.blog/changelog/2026-10-28-code-scanning-for-ai-applications-in-public-preview/"
category: "Security"
tags:
  - security
  - agents
  - code-scanning
featured: false
priority: 8
placement: normal
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-10-29T06:53:00+01:00
---

GitHub anunció el 28 de octubre una vista previa pública de detección de vulnerabilidades específicas de aplicaciones de IA dentro de code scanning. La funcionalidad busca riesgos como inyección indirecta de instrucciones, exposición de información sensible y autonomía excesiva de agentes con acceso a herramientas.

El análisis se ejecuta en pull requests junto con las comprobaciones existentes de CodeQL. Identifica rutas en las que contenido no confiable puede alcanzar un modelo que dispone de acceso a datos, herramientas o sistemas de negocio, y muestra orientaciones de mitigación directamente durante la revisión del cambio.

La función requiere GitHub Advanced Security y debe estar habilitada en los repositorios correspondientes. Está disponible en github.com, pero todavía no en GitHub Enterprise Server.

La integración permite detectar determinados errores de diseño de agentes antes de fusionar código. No sustituye a las pruebas de seguridad de la aplicación ni garantiza que todas las formas de prompt injection queden cubiertas.

Fuente: [GitHub](https://github.blog/changelog/2026-10-28-code-scanning-for-ai-applications-in-public-preview/).
