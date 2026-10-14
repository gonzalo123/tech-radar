---
title: "Anthropic sustituye Git por Scion para gestionar el desarrollo a escala de agentes"
description: "La empresa migró su monorrepositorio a un sistema cliente-servidor tras superar las 30.000 integraciones diarias."
date: 2026-10-14
source: "Anthropic"
source_url: "https://www.anthropic.com/engineering/redesigning-source-control"
category: "DevTools"
tags:
  - agents
  - developer-tools
  - source-control
featured: false
priority: 8
placement: secondary
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-10-14T06:53:00+02:00
---

Anthropic explicó el 13 de octubre que ha sustituido Git por Scion, un sistema de control de versiones desarrollado internamente, después de que el volumen de cambios integrados en su monorrepositorio pasara de unos 2.500 diarios en mayo a más de 30.000 en septiembre. La migración se completó en cinco meses.

Scion parte de que sus clientes —principalmente agentes y procesos automatizados— están siempre conectados. Centraliza operaciones como commits, fusiones y consultas históricas, admite copias de trabajo parciales y evita que cada proceso de CI necesite mantener un clon completo del repositorio. Según Anthropic, la infraestructura de control de versiones consume ahora 200 veces menos recursos de CPU y memoria que su anterior red de réplicas de Git; la empresa atribuye también una reducción del 25 % del consumo de CPU de CI a las mejoras de acceso al código.

Es un caso de arquitectura para cargas extraordinarias, no una recomendación general de abandonar Git. Anthropic reconoce que el modelo distribuido de Git sigue siendo apropiado para la mayoría de repositorios. La lección práctica es que el desarrollo intensivo con agentes puede trasladar los cuellos de botella desde la escritura de código a la integración, las revisiones y la infraestructura.

Fuente: [Anthropic](https://www.anthropic.com/engineering/redesigning-source-control).
