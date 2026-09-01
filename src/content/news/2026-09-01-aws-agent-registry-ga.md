---
title: "AWS Agent Registry llega a disponibilidad general para gobernar agentes, MCP y skills"
description: "AWS lanza un catálogo gobernado para registrar, descubrir y aprobar agentes, servidores MCP, skills y otros recursos de IA en organizaciones."
date: 2026-09-01

source: "AWS"
source_url: "https://aws.amazon.com/blogs/machine-learning/manage-agents-tools-and-skills-at-scale-with-aws-agent-registry/"

category: "AWS"

tags:
  - agents
  - mcp
  - skills
  - bedrock

featured: false
priority: 90
placement: lead
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-09-01T09:00:00+02:00
---

AWS ha llevado Agent Registry a disponibilidad general como catálogo central para registrar, descubrir y gobernar agentes, servidores MCP, skills y recursos personalizados. El servicio separa un plano de gobierno, donde se mantienen inventario, metadatos y estados de aprobación, de un plano de descubrimiento que expone únicamente los recursos aprobados a desarrolladores y agentes.

El registro admite recursos MCP, agentes descritos mediante Agent2Agent (A2A), definiciones de skills y descriptores personalizados. Los equipos pueden publicar mediante consola, CLI y API, integrar el alta y actualización de recursos en pipelines CI/CD y aplicar un ciclo de vida con estados de borrador, pendiente de aprobación, aprobado, rechazado o deprecado. AWS CloudTrail registra las acciones realizadas sobre el catálogo.

Para el consumo, Agent Registry incorpora búsqueda semántica y léxica y expone cada instancia del registro como un servidor MCP. Esto permite que entornos compatibles, incluidos Claude Code y Kiro, consulten desde el propio IDE qué agentes, herramientas o skills aprobados existen y recuperen sus metadatos y datos de conexión. La autenticación puede configurarse con OAuth o IAM.

En organizaciones con muchos agentes, la novedad introduce una capa explícita de inventario, descubrimiento y gobierno que hasta ahora normalmente debía construirse alrededor de cada plataforma. También facilita reutilizar capacidades entre equipos y detectar recursos desplegados en AgentCore Runtime y AgentCore Gateway para incorporarlos al proceso de revisión del registro.
