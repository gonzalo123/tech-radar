---
title: "Google Agents CLI permite usar LangChain y políticas propias mediante extensiones"
description: "El sistema experimental de extensiones separa el ciclo de despliegue y evaluación del framework empleado para construir agentes."
date: 2026-10-22
source: "Google Developers"
source_url: "https://developers.googleblog.com/powering-the-agent-development-lifecycle-with-any-framework-from-adk-to-langchain-and-beyond/"
category: "DevTools"
tags:
  - agents
  - python
  - devtools
featured: false
priority: 6
placement: normal
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-10-22T07:05:00+02:00
---

Google explicó el 21 de octubre el sistema de extensiones de Agents CLI, que permite sustituir comandos o añadir otros sin mantener una bifurcación de la herramienta. La versión 1.8.0 incluye una extensión oficial para trabajar con LangChain, LangGraph y Deep Agents.

Las extensiones se definen mediante un manifiesto YAML alojado en un repositorio Git. Pueden reemplazar operaciones como ejecución, pruebas o evaluaciones y mantener intacto el resto del ciclo, incluido el despliegue en Cloud Run. También pueden incorporar controles corporativos, por ejemplo una comprobación de componentes de software antes de desplegar.

La instalación fija un commit concreto en un archivo de bloqueo para reproducir el entorno en desarrollo y CI. El sistema sigue marcado como experimental y su interfaz puede cambiar, por lo que Google recomienda fijar la versión utilizada.

La propuesta facilita aplicar un mismo proceso de despliegue, evaluación y observabilidad a agentes construidos con distintos frameworks, aunque está orientada al ecosistema de Google Cloud.

Fuente: [Google Developers](https://developers.googleblog.com/powering-the-agent-development-lifecycle-with-any-framework-from-adk-to-langchain-and-beyond/).
