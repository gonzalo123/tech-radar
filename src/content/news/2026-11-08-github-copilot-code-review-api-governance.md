---
title: "GitHub amplía el control de Copilot Code Review por API y la trazabilidad de sus comentarios"
description: "Las APIs REST y GraphQL permiten administrar políticas de revisión y conocer el esfuerzo y las fuentes de contexto utilizadas por Copilot."
date: 2026-11-08
source: "GitHub"
source_url: "https://github.blog/changelog/2026-11-06-copilot-code-review-api-management-and-review-overview-updates/"
category: "DevTools"
tags:
  - github
  - copilot
  - code-review
  - governance
featured: false
priority: 8
placement: secondary
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-11-08T12:06:00+01:00
---

GitHub anunció el 6 de noviembre nuevas capacidades de administración de Copilot Code Review mediante REST y GraphQL. Los administradores pueden consultar y modificar ajustes a nivel de empresa, organización y repositorio, dentro de los límites establecidos por las políticas superiores.

La API permite identificar qué revisiones y comentarios ha generado Copilot, recuperar el nivel de esfuerzo utilizado cuando existe ese dato y consultar qué skills, servidores MCP e instrucciones personalizadas declaró como fuentes para un comentario. Esta atribución facilita auditorías, pero no debe confundirse con una prueba completa de todos los datos que influyeron en el modelo.

En organizaciones se puede configurar la habilitación, el esfuerzo predeterminado y el runner; en repositorios, el esfuerzo y el uso de instrucciones o herramientas MCP. Hay una limitación relevante: los endpoints de empresa y organización no admiten GitHub Apps ni tokens personales de alcance fino. Los endpoints de repositorio sí los admiten con permisos de administración adecuados.

GitHub también mejora la presentación de resultados, el registro de créditos consumidos y los reintentos ante fallos o timeouts. Las revisiones Balanced utilizan ahora tres modelos revisores y un modelo adicional que combina los hallazgos.

La novedad acerca Copilot Code Review a una gestión declarativa y auditable. Para equipos que desean imponer revisiones en las pull requests, es una pieza útil, aunque no sustituye la aprobación humana ni las pruebas automáticas.

Fuente: [GitHub](https://github.blog/changelog/2026-11-06-copilot-code-review-api-management-and-review-overview-updates/).
