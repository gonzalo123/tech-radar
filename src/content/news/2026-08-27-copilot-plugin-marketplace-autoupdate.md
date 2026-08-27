---
title: "Copilot permite actualizar automáticamente marketplaces de plugins gestionados por empresa"
description: "GitHub ha añadido una opción para que marketplaces corporativos de plugins se actualicen automáticamente en Copilot App, Copilot CLI y VS Code."
date: 2026-08-27

source: "GitHub"
source_url: "https://github.blog/changelog/2026-08-26-enterprise-managed-settings-now-support-autoupdate-for-plugin-marketplaces/"

category: "DevTools"

tags:
  - copilot
  - skills

featured: false
priority: 40
placement: normal
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-08-27T15:47:00+02:00
---

GitHub permite ahora que los administradores de Copilot Business y Copilot Enterprise activen actualizaciones automáticas para marketplaces concretos de plugins definidos en la configuración gestionada de la empresa. La opción se controla con `autoUpdate: true` en las entradas de `extraKnownMarketplaces`.

Los clientes compatibles comprueban el marketplace y actualizan los plugins instalados desde él sin intervención manual. La actualización automática no evita las restricciones existentes: el marketplace debe seguir permitido por la lista efectiva de `strictKnownMarketplaces`.

La capacidad está disponible de forma general en GitHub Copilot App, Copilot CLI y Visual Studio Code. Para organizaciones que distribuyen skills o plugins internos, reduce el mantenimiento necesario para propagar nuevas versiones sin renunciar a una lista controlada de fuentes autorizadas.
