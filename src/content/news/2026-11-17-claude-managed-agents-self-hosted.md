---
title: "Anthropic abre una beta privada para alojar Claude Managed Agents dentro de la empresa"
description: "El servicio completo de agentes, sus sandboxes, credenciales y sesiones puede ejecutarse en cloud propio u on-premise, con modelos vía Bedrock u otros proveedores."
date: 2026-11-17
source: "Anthropic"
source_url: "https://claude.com/resources/articles/self-hosted-claude-managed-agents"
category: "DevTools"
tags:
  - anthropic
  - agents
  - sandbox
  - bedrock
  - enterprise
featured: false
priority: 9
placement: secondary
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-11-17T07:14:00+01:00
---

Anthropic anunció el 12 de noviembre una beta privada de Claude Managed Agents autohospedado. Hasta ahora se podían ejecutar sandboxes en infraestructura propia, pero el servicio de control seguía alojado por Anthropic. La nueva modalidad permite operar también el harness, la base de datos, los trabajadores, las credenciales y el historial de sesiones dentro de la infraestructura del cliente.

El servicio mantiene el estado de cada agente en un registro de eventos independiente del sandbox. Así puede iniciar un entorno solo cuando necesita ejecutar herramientas y conservar el historial aunque ese entorno termine. Las credenciales se gestionan fuera del sandbox mediante vaults y un proxy que las añade a las llamadas autorizadas. También se pueden limitar destinos de red y exportar trazas mediante OpenTelemetry.

Las peticiones al modelo pueden enviarse a Anthropic, Amazon Bedrock, Google o Microsoft Foundry, o a una pasarela propia. Esto no significa que la inferencia ocurra localmente: los datos incluidos en las peticiones siguen saliendo hacia el proveedor configurado, conforme a sus políticas y contratos.

La beta requiere solicitar acceso al equipo comercial de Anthropic. Es una propuesta relevante para empresas que quieren conservar el control del runtime, pero implica operar y asegurar los componentes del servicio y no elimina la necesidad de segmentación, auditoría y permisos mínimos.

Fuente: [Anthropic](https://claude.com/resources/articles/self-hosted-claude-managed-agents).
