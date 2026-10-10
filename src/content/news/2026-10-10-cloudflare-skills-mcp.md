---
title: "Cloudflare permite descubrir y leer skills desde su servidor MCP"
description: "Los clientes compatibles pueden listar skills de Cloudflare y recuperar sus archivos mediante la extensión Skills over MCP."
date: 2026-10-10
source: "Cloudflare"
source_url: "https://developers.cloudflare.com/changelog/post/2026-10-10-cloudflare-mcp-skills/"
category: "DevTools"
tags:
  - mcp
  - skills
featured: false
priority: 5
placement: normal
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-10-10T11:18:00+02:00
---

Cloudflare anunció el 10 de octubre que su servidor API MCP distribuye ahora skills mediante la extensión Skills over MCP. Los clientes compatibles pueden descubrirlas con `skills/list` y recuperar archivos utilizando direcciones `skill://`.

La funcionalidad se ofrece en `https://mcp.cloudflare.com/mcp`. Requiere un cliente que implemente la extensión, por lo que no supone que cualquier cliente MCP existente pueda utilizarla automáticamente.

El cambio permite distribuir instrucciones reutilizables para agentes desde un servidor remoto, sin depender exclusivamente de instalar las skills como archivos locales.

Fuente: [Cloudflare](https://developers.cloudflare.com/changelog/post/2026-10-10-cloudflare-mcp-skills/).
