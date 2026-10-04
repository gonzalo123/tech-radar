---
title: "Claude Code añade Mods y un agente lateral que señala posibles omisiones"
description: "La versión 2.1.287 amplía lo que pueden modificar los plugins e incluye You should know, limitado a sesiones propias con telemetría activa."
date: 2026-10-04

source: "Anthropic"
source_url: "https://github.com/anthropics/claude-code/releases/tag/v2.1.287"

category: "DevTools"

tags:
  - claude-code
  - agents
  - plugins

featured: false
priority: 84
placement: secondary
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-10-04T13:00:11.496Z
---

Anthropic incorporó el 1 de octubre **Claude Mods** a Claude Code 2.1.287, permitiendo que los plugins modifiquen aspectos más profundos de su comportamiento. La versión incluye **You should know**, un mod integrado con un agente lateral que señala cosas que el usuario o Claude podrían pasar por alto.

Se activa con `/plugin enable cc-plugin-you-should-know@builtin`. Las notas de versión restringen ese mod a sesiones de primera parte con telemetría habilitada; no anuncian su disponibilidad general para sesiones a través de Bedrock u otros proveedores.

La novedad introduce una forma de asistencia paralela dentro del propio entorno de programación. El anuncio describe su función de aviso, sin aportar evaluaciones sobre cuánto mejora la calidad del trabajo ni detallar todavía todas las posibilidades de extensión de Mods.
