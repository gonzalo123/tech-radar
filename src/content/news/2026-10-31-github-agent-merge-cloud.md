---
title: "GitHub Agent Merge vigila las pull requests y corrige bloqueos en la nube"
description: "Copilot puede detectar fallos de GitHub Actions y conflictos de fusión, proponer correcciones y mantener las pull requests listas para integrarse."
date: 2026-10-31
source: "GitHub"
source_url: "https://github.blog/changelog/2026-10-28-agent-merge-watches-and-fixes-pull-requests-in-the-cloud/"
category: "DevTools"
tags:
  - copilot
  - agents
  - pull-requests
  - ci
featured: false
priority: 9
placement: lead
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-10-31T11:01:00+01:00
---

GitHub anunció el 28 de octubre que Agent Merge se integra directamente en las pull requests de GitHub. La función, que ya existía en la aplicación de Copilot y en Visual Studio Code, permite encargar a Copilot que vigile una propuesta de cambio y trate de resolver los bloqueos que aparezcan antes de fusionarla.

Desde el cuadro de integración de una pull request, el desarrollador puede activar **Watch and fix** y elegir si el agente debe intervenir ante errores de GitHub Actions, conflictos de fusión o ambos. Cuando detecta uno de estos problemas, Copilot inicia una tarea en un entorno de desarrollo en la nube para preparar la corrección.

Agent Merge también puede activarse de forma predeterminada para las pull requests del usuario. Si se combina con auto-merge, Copilot trabaja para mantener la rama preparada mientras GitHub sigue aplicando los requisitos habituales de integración.

La función está disponible para usuarios con planes de pago de Copilot y está sujeta a las políticas de la organización. Para equipos que ejecutan lotes largos de cambios con agentes, reduce las interrupciones por fallos de CI y conflictos, aunque sigue siendo necesario revisar el código y mantener las protecciones de rama.

Fuente: [GitHub](https://github.blog/changelog/2026-10-28-agent-merge-watches-and-fixes-pull-requests-in-the-cloud/).
