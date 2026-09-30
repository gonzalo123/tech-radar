---
title: "OpenAI amplía su stack de agentes con computer use y despliegue gestionado en AWS"
description: "Agents API incorpora computer use y reutiliza capacidades de orquestación del harness de Codex, mientras Bedrock Managed Agents ejecuta el harness de OpenAI dentro de AWS."
date: 2026-09-30

source: "OpenAI"
source_url: "https://developers.openai.com/api/docs/guides/agents-api/bedrock-managed-agents"

category: "DevTools"

tags:
  - agents
  - computer-use
  - aws
  - bedrock

featured: false
priority: 92
placement: secondary
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-09-30T06:53:00+02:00
---

OpenAI ha ampliado su plataforma de agentes para acercar a aplicaciones externas varias capacidades que hasta ahora estaban más asociadas a Codex y a sus propios productos. **Agents API** puede ejecutar flujos persistentes con herramientas y computer use, mientras OpenAI se ocupa de la orquestación, la compactación de contexto y la recuperación de sesiones.

La integración con **Amazon Bedrock Managed Agents** lleva el mismo concepto a AWS. En este modo, el harness y la inferencia se ejecutan en Amazon Bedrock, mientras los comandos y herramientas pueden ejecutarse mediante AgentCore Runtime o infraestructura autogestionada. La autenticación se realiza con IAM y SigV4 en lugar de claves de proyecto de OpenAI.

El cambio reduce la cantidad de infraestructura que un equipo necesita construir para mantener sesiones largas, coordinar herramientas y operar agentes sobre software existente. Al mismo tiempo, la ejecución sigue dependiendo del entorno elegido: un sandbox de OpenAI, infraestructura propia o servicios gestionados de AWS.

Para arquitecturas empresariales, la novedad amplía la posibilidad de usar el mismo patrón de agente bajo distintos límites operativos y de gobierno sin tener que reproducir por completo el harness.