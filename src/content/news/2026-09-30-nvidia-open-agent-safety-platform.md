---
title: "NVIDIA lleva el control de agentes hasta el runtime y el hardware con Open Agent Safety Platform"
description: "OpenShell añade una frontera de ejecución open source y Sentry un watchdog fuera de banda sobre BlueField-4 para vigilar y aislar agentes."
date: 2026-09-30

source: "NVIDIA"
source_url: "https://developer.nvidia.com/blog/nvidia-open-agent-safety-platform-a-reference-for-continuous-in-silicon-agent-monitoring/"

category: "Security"

tags:
  - agents
  - security
  - infrastructure

featured: false
priority: 90
placement: normal
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-09-30T06:53:00+02:00
---

NVIDIA ha presentado **Open Agent Safety Platform**, una arquitectura para aplicar controles de seguridad a agentes por debajo de la capa de aplicación. La plataforma combina **OpenShell**, un runtime open source que ejecuta agentes dentro de límites aislados y aplica políticas, con **Sentry**, un sistema de vigilancia fuera de banda basado en BlueField-4.

OpenShell registra las acciones del agente y puede bloquear operaciones que incumplan la política definida. NVIDIA lo ejecuta sobre CPUs Vera, pero el proyecto está diseñado para poder extenderse también a plataformas de terceros.

Sentry añade una segunda capa independiente del proceso del agente. Se ejecuta en una DPU BlueField-4, correlaciona actividad, decisiones de política y acceso a herramientas y puede aislar un agente que intente salir de los límites establecidos.

El planteamiento es relevante para agentes autónomos de larga duración: en lugar de confiar únicamente en instrucciones del modelo o guardrails del framework, introduce una frontera de ejecución independiente y una capa de supervisión separada del mismo sistema que se está vigilando.