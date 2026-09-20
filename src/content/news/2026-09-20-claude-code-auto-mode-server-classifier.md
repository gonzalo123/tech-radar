---
title: "Claude Code mueve el clasificador de Auto mode al servidor"
description: "Claude Code 2.1.278 usa por defecto un clasificador server-side para Auto mode en API, Enterprise y proveedores cloud, eliminando el coste del clasificador cuando se utiliza esa ruta."
date: 2026-09-20

source: "Anthropic"
source_url: "https://github.com/anthropics/claude-code/releases/tag/v2.1.278"

category: "DevTools"

tags:
  - claude-code
  - developer-tools
  - cost-control

featured: false
priority: 84
placement: lead
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-09-20T06:32:39+02:00
---

Anthropic ha cambiado en Claude Code 2.1.278 el funcionamiento por defecto de Auto mode para usuarios de Claude API y Enterprise, así como para despliegues mediante Amazon Bedrock, Google Vertex AI, Microsoft Foundry y gateways. La selección pasa a utilizar un clasificador ejecutado en el servidor, cuyo overhead no se factura al usuario.

Auto mode utiliza un clasificador para decidir cómo enrutar cada solicitud. Con esta versión, los entornos afectados dejan de asumir por defecto el coste asociado a ejecutar ese clasificador en la ruta anterior. Claude Code avisa además cuando debe recurrir a un fallback que sí genera consumo facturable.

En Bedrock, Vertex, Foundry y gateways se puede recuperar el comportamiento anterior configurando `CLAUDE_CODE_AUTO_MODE_SERVER=0`.

Para equipos que usan Claude Code de forma intensiva a través de proveedores cloud o gateways empresariales, el cambio reduce un coste auxiliar del routing automático sin exigir cambios de configuración.