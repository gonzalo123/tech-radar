---
title: "OpenAI prepara controles de seguridad para modelos frontera compatibles con Zero Data Retention"
description: "OpenAI presenta Private Safety Processing, un sistema en preview para detectar patrones de riesgo entre interacciones sin dar a su personal acceso al contenido retenido de clientes ZDR."
date: 2026-09-04

source: "OpenAI"
source_url: "https://openai.com/index/offering-zero-data-retention-for-frontier-models/"

category: "AI"

tags:
  - openai
  - security
  - enterprise-ai
  - zero-data-retention
  - agents

featured: false
priority: 86
placement: secondary
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-09-04T09:00:00+02:00
---

OpenAI ha presentado Private Safety Processing, un mecanismo en preview diseñado para mantener Zero Data Retention en despliegues de modelos frontera mientras sus sistemas automáticos de seguridad analizan patrones que abarcan varias interacciones. La compañía afirma que, para clientes ZDR elegibles, los prompts y respuestas siguen sin quedar disponibles para revisión por parte de personal de OpenAI.

El cambio busca resolver un problema específico de los agentes de larga duración: determinados riesgos solo aparecen al relacionar varias acciones o conversaciones, mientras que los controles ZDR actuales evalúan las interacciones de forma individual. Private Safety Processing permite generar señales limitadas sobre posibles abusos sin exponer a OpenAI el contenido subyacente.

En los despliegues ZDR, el contenido puede permanecer en infraestructura controlada por el cliente. OpenAI también está desarrollando una modalidad alojada en su infraestructura donde los datos estarían cifrados con claves bajo control del cliente, de modo que el proveedor no disponga de una copia de esas claves.

La tecnología se está probando con clientes iniciales y OpenAI prevé comenzar su despliegue y publicar un documento técnico durante septiembre. Para organizaciones con requisitos estrictos de privacidad, el anuncio es relevante porque intenta evitar que el aumento de capacidades de seguridad de los modelos frontera obligue a renunciar a políticas de no retención de datos.
