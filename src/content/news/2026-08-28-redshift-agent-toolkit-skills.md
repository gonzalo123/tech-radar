---
title: "Redshift se integra con Agent Toolkit for AWS para operar desde Claude Code y otros agentes"
description: "AWS combina su servidor MCP con skills de Redshift para consultar, diagnosticar y migrar almacenes de datos desde asistentes de programación y agentes compatibles."
date: 2026-08-28

source: "AWS"
source_url: "https://aws.amazon.com/about-aws/whats-new/2026/08/redshift-agenttoolkit-for-ai-assisted-datawarehouse-mgmt/"

category: "AWS"

tags:
  - mcp
  - skills
  - claude-code
  - agents

featured: false
priority: 90
placement: lead
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-08-28T09:05:00+02:00
---

Amazon Redshift se ha integrado con Agent Toolkit for AWS para que agentes como Claude Code, Kiro y Cursor puedan construir, consultar, diagnosticar y migrar almacenes de datos sin abandonar su flujo de trabajo. La integración combina el servidor MCP de AWS, que ejecuta llamadas autenticadas a las API de AWS, con un conjunto de skills específicas de Redshift.

Las skills incluyen referencias de sintaxis SQL, descubrimiento de metadatos, patrones de carga de datos, recomendaciones para vistas materializadas, tipos y funciones de Redshift y extensiones como `QUALIFY`, `PIVOT` y `SUPER`. AWS también documenta un flujo de migración que cubre descubrimiento, conversión de esquema y SQL, movimiento de datos, validación y comparación de rendimiento.

El paquete funciona tanto con clústeres aprovisionados como con Redshift Serverless y no exige cambios en la infraestructura existente. AWS lo ofrece sin coste adicional en las regiones donde están disponibles Redshift y el servidor MCP de AWS.

Para equipos que ya usan agentes de programación, el cambio convierte tareas operativas de Redshift en capacidades reutilizables y gobernadas mediante MCP y skills, en lugar de depender únicamente de instrucciones ad hoc dentro del prompt. El plugin `aws-data-analytics` agrupa la configuración del servidor MCP y las skills, aunque los agentes con acceso al servidor también pueden descubrirlas y cargarlas en tiempo de ejecución.
