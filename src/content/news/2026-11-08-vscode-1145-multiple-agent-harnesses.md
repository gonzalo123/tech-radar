---
title: "VS Code 1.145 permite combinar Claude, Codex y Copilot en sesiones de agentes"
description: "La versión introduce sesiones anidadas con distintos arneses, vistas previas remotas y cron para automatizaciones locales."
date: 2026-11-08
source: "Visual Studio Code"
source_url: "https://code.visualstudio.com/updates/v1_145"
category: "DevTools"
tags:
  - vscode
  - agents
  - claude-code
  - codex
featured: false
priority: 9
placement: lead
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-11-08T12:06:00+01:00
---

Visual Studio Code 1.145, publicado el 4 de noviembre, introduce una capacidad experimental especialmente interesante para los flujos de desarrollo con varios agentes: las conversaciones anidadas pueden utilizar arneses distintos del de su sesión principal. Es posible pedir a Claude que revise un plan elaborado con Copilot o contrastar una solución con Codex sin abandonar el grupo de conversaciones.

La función se habilita mediante `chat.agentHost.multipleChatProviders.enabled`. Cada conversación mantiene su propio modelo, agente y nivel de permisos. Es importante distinguir esta funcionalidad de un sistema de orquestación automática entre agentes: el usuario sigue dirigiendo los intercambios.

La versión también permite previsualizar aplicaciones ejecutadas en hosts remotos dentro de la ventana de agentes, mediante `workbench.browser.enableRemoteProxy`, y usar lienzos interactivos remotos con `chat.canvases.enabled`. Ambas capacidades están en vista previa.

En automatizaciones locales se añaden expresiones cron de cinco campos y selección de agentes personalizados del workspace. GitHub aclara que la programación cron no está disponible para automatizaciones en la nube.

Para equipos que combinan distintos asistentes y entornos remotos, estas novedades acercan VS Code a un centro de trabajo multiagente. Antes de incorporarlas a flujos críticos conviene comprobar compatibilidad de permisos, sandbox y comportamiento de las funciones experimentales.

Fuente: [Visual Studio Code](https://code.visualstudio.com/updates/v1_145).
