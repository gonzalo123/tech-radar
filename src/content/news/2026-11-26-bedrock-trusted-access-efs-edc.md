---
title: "Bedrock centraliza el acceso a programas de seguridad y retención de Claude"
description: "AWS lanza Trusted Access API y abre la preview pública de Enterprise Frontier Safeguards y Enterprise Data Controls."
date: 2026-11-26
source: "AWS"
source_url: "https://aws.amazon.com/blogs/machine-learning/introducing-the-amazon-bedrock-trusted-access-api-with-anthropics-enterprise-frontier-safeguards-and-enterprise-data-controls/"
category: "AWS"
tags:
  - bedrock
  - anthropic
  - security
featured: false
priority: 8
placement: lead
breaking: false
draft: false
generated_by: "ChatGPT"
---

AWS anunció el 23 de noviembre la disponibilidad general de Bedrock Trusted Access API, que unifica la consulta de elegibilidad, solicitud e inscripción en programas de acceso de proveedores de modelos. Las dos primeras modalidades, Enterprise Frontier Safeguards (EFS) y Enterprise Data Controls (EDC), están en preview pública para clientes elegibles de Claude.

EFS permite conservar las conversaciones sujetas a monitorización en un bucket S3 del cliente, cifrado con su clave KMS. EDC utiliza almacenamiento gestionado por Amazon. En ambos casos, el análisis automatizado de seguridad genera casos que revisa el propio cliente.

La inscripción puede gestionarse por cuenta, organización o proyecto, con permisos IAM y políticas SCP. EFS exige conservar los datos durante al menos 30 días: no equivale a ausencia de retención, sino a control por el cliente del almacenamiento. AWS también mantiene una excepción temporal de retención cero para determinados clientes y modelos hasta al menos el 30 de junio de 2027.
