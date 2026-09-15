---
title: "AgentCore añade un portal gestionado para el consentimiento OAuth de agentes"
description: "AgentCore Identity incorpora un Consent portal que gestiona autorización OAuth y session binding para herramientas usadas por agentes y clientes MCP."
date: 2026-09-15

source: "AWS"
source_url: "https://aws.amazon.com/blogs/machine-learning/manage-end-user-oauth-consent-for-ai-agents-with-amazon-bedrock-agentcore/"

category: "AWS"

tags:
  - bedrock
  - agents
  - mcp
  - security
  - oauth

featured: false
priority: 86
placement: secondary
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-09-15T06:32:20+02:00
---

Amazon Bedrock AgentCore Identity ha incorporado un Consent portal para gestionar el consentimiento OAuth de usuarios y asociar de forma segura cada autorización con la identidad que la concedió. La nueva capacidad elimina la necesidad de construir y alojar infraestructura propia de session binding para los flujos OAuth 2.0 authorization code utilizados por AgentCore Gateway.

El administrador conecta el portal con el proveedor de identidad corporativo y con los targets OAuth del Gateway. Los usuarios acceden a una URL gestionada por AWS, se autentican, revisan los servicios disponibles para el agente y autorizan individualmente proveedores como GitHub o Slack. AgentCore Identity completa los redirects y el session binding y conserva los tokens resultantes en su token vault.

La capacidad está orientada especialmente a agentes utilizados desde IDE y clientes MCP como Kiro, Claude Code, Cursor y Visual Studio Code. Una vez concedido el acceso, las siguientes llamadas a herramientas pueden reutilizar el token almacenado para ese usuario sin repetir el consentimiento mientras la autorización siga siendo válida.

Las operaciones de consentimiento quedan registradas en AWS CloudTrail. Para equipos que exponen herramientas corporativas mediante AgentCore Gateway, el cambio elimina una pieza de infraestructura de identidad que hasta ahora debía implementarse y operarse por separado.
