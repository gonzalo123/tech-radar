---
title: "OpenAI abre Agents API para ejecutar agentes cloud con el harness de Codex"
description: "Agents API expone en beta pública la infraestructura y el harness de Codex para ejecutar agentes de larga duración con sandboxes gestionados, infraestructura propia y subagentes."
date: 2026-09-12

source: "OpenAI"
source_url: "https://openai.com/index/introducing-the-agents-api/"

category: "AI"

tags:
  - agents
  - codex
  - api
  - developer-tools

featured: false
priority: 96
placement: lead
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-09-12T06:32:25+02:00
---

OpenAI ha lanzado Agents API en beta pública para permitir que desarrolladores ejecuten agentes cloud utilizando el mismo harness e infraestructura que sustentan Codex. La API está disponible para todos los desarrolladores y no añade una tarifa propia: el coste corresponde a los tokens y herramientas consumidos por cada ejecución.

El servicio gestiona el harness que coordina modelo, contexto, herramientas y subagentes, mientras que el desarrollador puede elegir dónde se ejecuta el trabajo: en sandboxes administrados por OpenAI, en infraestructura propia o mediante proveedores de sandbox compatibles. El objetivo es evitar que cada equipo tenga que construir y operar por separado la capa de ejecución necesaria para mantener agentes trabajando durante sesiones largas.

El harness se basa en el proyecto open source de Codex. Entre las capacidades destacadas están la gestión de contexto en sesiones prolongadas, el uso eficiente de múltiples herramientas y la posibilidad de paralelizar tareas mediante subagentes. OpenAI indica que mantendrá y evolucionará esta capa durante la beta pública antes de llevarla a disponibilidad general.

En la práctica, Agents API convierte parte de la arquitectura interna de Codex en una plataforma reutilizable para construir agentes propios, separando la lógica específica de negocio de la infraestructura de ejecución y orquestación.
