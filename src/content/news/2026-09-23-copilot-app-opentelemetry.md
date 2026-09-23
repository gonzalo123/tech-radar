---
title: "GitHub Copilot App añade exportación OpenTelemetry para agentes"
description: "Los administradores pueden exportar trazas de sesiones, modelos y herramientas de Copilot App a plataformas de observabilidad mediante configuración gestionada."
date: 2026-09-23

source: "GitHub"
source_url: "https://github.blog/changelog/2026-09-22-opentelemetry-in-the-github-copilot-app/"

category: "DevTools"

tags:
  - copilot
  - agents
  - observability
  - opentelemetry

featured: false
priority: 86
placement: secondary
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-09-23T06:31:25+02:00
---

GitHub añadió el 22 de septiembre **soporte de OpenTelemetry en GitHub Copilot App**, permitiendo que las empresas envíen la actividad de los agentes a sus herramientas de observabilidad mediante configuración administrada centralmente.

Las trazas permiten seguir una sesión de agente y observar sus llamadas a modelos y herramientas, lo que facilita investigar comportamientos inesperados paso a paso sin depender únicamente del resultado final. Los administradores configuran la exportación mediante la propiedad `telemetry` de `managed-settings.json` y pueden aplicar la política a los equipos de forma centralizada.

GitHub excluye por defecto del export los prompts y respuestas. La captura de ese contenido requiere una configuración específica, un detalle importante para organizaciones que quieran observabilidad sin enviar automáticamente el contenido de las conversaciones a su backend de monitorización.

La novedad acerca el uso de coding agents a las prácticas habituales de operación de servicios: una ejecución deja de ser una caja negra y puede correlacionarse con trazas en plataformas compatibles con OpenTelemetry. Para equipos que despliegan agentes de programación a escala, esto permite analizar rendimiento, uso de herramientas y fallos con la misma infraestructura de observabilidad que ya utilizan para sus aplicaciones.
