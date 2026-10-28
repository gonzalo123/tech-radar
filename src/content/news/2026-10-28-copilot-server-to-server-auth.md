---
title: "GitHub Copilot permite autenticar agentes mediante GitHub Apps sin usuarios"
description: "Copilot SDK admite tokens de instalación de GitHub Apps para ejecutar agentes como servicios de una organización, en vista previa pública."
date: 2026-10-28
source: "GitHub"
source_url: "https://github.blog/changelog/2026-10-27-github-copilot-supports-server-to-server-authentication/"
category: "DevTools"
tags:
  - copilot
  - agents
  - security
featured: false
priority: 9
placement: lead
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-10-28T06:54:00+01:00
---

GitHub anunció el 27 de octubre que Copilot SDK admite autenticación de servicio a servicio mediante GitHub Apps instaladas en una organización. La función está disponible en vista previa pública y permite que agentes y servicios hagan peticiones sin depender de las credenciales de una persona conectada.

Para utilizarla, un administrador concede a la aplicación el permiso de organización de solo lectura `Copilot Requests` y la instala en la organización. El servicio pasa al SDK un token temporal de instalación. Las solicitudes quedan asociadas a la organización, que asume la facturación y aplica sus políticas de modelos, presupuestos y gasto.

Los administradores pueden revisar las aplicaciones autorizadas y localizar su consumo en los informes CSV de uso de IA mediante el campo `app_client_id`. También pueden revocar el acceso suspendiendo o desinstalando la aplicación.

La novedad facilita ejecutar agentes desatendidos en servicios internos y automatizaciones sin utilizar cuentas personales o tokens de larga duración. Al tratarse de una vista previa, conviene comprobar los límites y el soporte del SDK antes de incorporarla a sistemas críticos.

Fuente: [GitHub](https://github.blog/changelog/2026-10-27-github-copilot-supports-server-to-server-authentication/).
