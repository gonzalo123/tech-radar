---
title: "GitHub generaliza los controles de licencias de dependencias en pull requests"
description: "GitHub Enterprise Cloud permite aplicar políticas de licencias a dependencias nuevas o modificadas y consultar su cumplimiento desde APIs."
date: 2026-10-17
source: "GitHub"
source_url: "https://github.blog/changelog/2026-10-16-open-source-license-compliance-generally-available/"
category: "Security"
tags:
  - supply-chain-security
  - dependencies
  - github
featured: false
priority: 7
placement: secondary
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-10-17T13:29:00+02:00
---

GitHub anunció el 16 de octubre la disponibilidad general de su sistema de cumplimiento de licencias de software de código abierto. La función permite aplicar políticas centralizadas a las dependencias que se añaden o modifican en pull requests y exigir su cumplimiento antes de fusionar cambios.

La funcionalidad está disponible para clientes de GitHub Enterprise Cloud, incluidos los entornos con residencia de datos, en repositorios con GitHub Code Security habilitado. Los responsables pueden definir excepciones para paquetes y asignar el nuevo rol Enterprise Open-Source License Manager a quienes gestionan solicitudes de revisión.

Respecto a la vista previa de junio, GitHub añade eventos de auditoría para cambios de política y endpoints de API para consultar y modificar reglas o comprobar si un paquete cumple las condiciones. Esta última capacidad permite a agentes de programación evitar dependencias incompatibles antes de incorporarlas. No es un escáner universal de riesgos legales: la eficacia depende de las políticas definidas y de la calidad de los metadatos de licencia.

Fuente: [GitHub](https://github.blog/changelog/2026-10-16-open-source-license-compliance-generally-available/).
