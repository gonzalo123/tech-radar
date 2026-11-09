---
title: "Google publica Elephant-Goldfish, un plugin de revisión de especificaciones con agentes"
description: "EGM separa la redacción contextual de una especificación de su revisión por agentes con contexto fresco; funciona con Claude Code y Codex."
date: 2026-11-09
source: "Google (GitHub)"
source_url: "https://github.com/google/elephant-goldfish-model"
category: "DevTools"
tags:
  - agents
  - claude-code
  - codex
  - spec-driven-development
featured: false
priority: 10
placement: lead
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-11-09T07:05:00+01:00
---

Google ha publicado Elephant-Goldfish Model (EGM), un plugin abierto bajo Apache 2.0 para diseñar y revisar especificaciones de software con agentes. Su principio es sencillo: un agente «elefante» conserva el contexto del proyecto y redacta el diseño; revisores «peces de colores» examinan el documento y sus fuentes sin heredar toda la conversación previa.

Esta separación busca detectar supuestos implícitos, omisiones y riesgos que un agente demasiado condicionado por sus decisiones anteriores podría pasar por alto. EGM incluye flujos para brainstorming, redacción, revisión, resolución de observaciones y detección de divergencias entre documentación y código. Las revisiones necesitan subagentes con contextos nuevos; si el entorno no los soporta, el proceso se detiene.

El repositorio documenta instalación en Claude Code, Codex CLI y otros asistentes. No es un nuevo modelo fundacional, sino una metodología empaquetada como plugin. Google advierte que el proyecto no cuenta con soporte oficial y que las revisiones automáticas no sustituyen pruebas ni juicio humano.

Para equipos que ya convierten ideas en especificaciones antes de implementar, el valor está en introducir una segunda lectura independiente sin perder trazabilidad ni delegar la decisión arquitectónica final.

Fuente: [Google (GitHub)](https://github.com/google/elephant-goldfish-model).
