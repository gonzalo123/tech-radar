---
title: "Mistral Studio incorpora agentes duraderos, workflows y evaluaciones integradas"
description: "El SDK de Python permite ejecutar el mismo agente en local, self-hosted o gestionado, con reanudación tras fallos y aprobaciones humanas."
date: 2026-11-07
source: "Mistral"
source_url: "https://docs.mistral.ai/resources/release-notes"
category: "AI"
tags:
  - mistral
  - agents
  - workflows
  - observability
featured: false
priority: 8
placement: normal
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-11-07T20:38:00+01:00
---

Mistral anunció el 5 de noviembre una ampliación de Studio centrada en agentes empresariales. Managed Agents permite definir en Python el modelo, las instrucciones, las herramientas y el entorno mediante el SDK `mistralai-agents`, y ejecutar ese mismo código dentro de la aplicación, alojarlo en infraestructura propia con `agents serve` o desplegarlo en Mistral con `agents deploy`.

La ejecución gestionada es duradera: un agente puede trabajar durante horas o días, recuperarse desde el último paso completado después de un fallo y esperar una aprobación humana antes de continuar. El SDK y el despliegue gestionado están en vista previa pública.

Studio incorpora también un generador de workflows a partir de lenguaje natural, trazas de llamadas a modelos y herramientas, evaluaciones offline y online, y creación de conjuntos de prueba a partir de telemetría. Los conectores HTTP, en vista previa privada, permiten integrar APIs sin construir un servidor MCP para cada servicio.

La oferta apunta a un problema concreto de producción: ejecutar agentes no consiste solo en llamar a un modelo, sino en mantener estado, gestionar aprobaciones y detectar regresiones. Para equipos que ya utilizan Strands u otro framework, la portabilidad y el coste de migración serán factores importantes al comparar plataformas.

Fuente: [Mistral](https://docs.mistral.ai/resources/release-notes).
