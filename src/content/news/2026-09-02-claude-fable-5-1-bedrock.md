---
title: "Claude Fable 5.1 llega a Amazon Bedrock con nuevas opciones de protección de datos"
description: "Anthropic lanza Claude Fable 5.1 y AWS lo incorpora a Bedrock, con acceso mediante perfiles de inferencia globales y estadounidenses y opciones adicionales de retención para clientes elegibles."
date: 2026-09-02

source: "AWS"
source_url: "https://aws.amazon.com/blogs/machine-learning/introducing-claude-fable-5-1-on-aws/"

category: "AI"

tags:
  - bedrock
  - agents

featured: false
priority: 95
placement: lead
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-09-02T09:00:00+02:00
---

Anthropic ha lanzado Claude Fable 5.1 y AWS lo ha incorporado a Amazon Bedrock. El modelo está disponible mediante los perfiles de inferencia US Geo CRIS y Global CRIS; en AWS GovCloud (US) también puede utilizarse desde los endpoints `bedrock-runtime` y `bedrock-mantle`.

Fable 5.1 está orientado a tareas complejas de programación, investigación y flujos empresariales de larga duración. Anthropic lo clasifica como *Covered Model*, por lo que su uso está sujeto a políticas adicionales de acceso, revisión de seguridad y retención de datos que dependen del canal de distribución.

AWS y Anthropic han anunciado además Enterprise Frontier Safeguards (EFS) para organizaciones elegibles. Durante la fase actual, esos clientes pueden utilizar Fable 5 y Fable 5.1 con zero data retention en Bedrock y Claude Platform on AWS para uso interno hasta el 31 de diciembre de 2026. AWS indica que más adelante añadirá una modalidad en la que prompts y respuestas permanecerán en la cuenta AWS del cliente, bajo sus propias claves de cifrado, políticas de acceso y registros de auditoría, con revisión de seguridad automatizada y sin revisión humana.

Para equipos que ejecutan agentes sobre Bedrock, la novedad combina el acceso al nuevo modelo con una vía específica para cargas sensibles que requieren mayor control sobre la retención y el perímetro de datos. La disponibilidad concreta depende de la región, el perfil de inferencia y, en el caso de EFS, de la elegibilidad del cliente.
