---
title: "GitHub CLI permite esperar eventos de pull requests sin consultas repetidas"
description: "gh 2.105.0 incorpora event listen para recibir cambios de revisiones, conflictos y checks mediante Event Streams, todavía en preview."
date: 2026-11-19
source: "GitHub Changelog"
source_url: "https://github.blog/changelog/2026-11-18-wait-for-pull-request-events-with-github-cli/"
category: "DevTools"
tags:
  - github
  - agents
  - cli
  - automation
featured: false
priority: 7
placement: normal
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-11-19T06:28:35+01:00
---

GitHub anunció el 18 de noviembre que su CLI, desde la versión 2.105.0, incorpora `gh event listen` para esperar cambios en una pull request sin recurrir a consultas periódicas. La función utiliza GitHub Event Streams y está orientada tanto a scripts como a agentes que necesitan continuar cuando termina una revisión o un conjunto de comprobaciones.

El comando recibe la URL de la pull request y los eventos de interés. Devuelve cada evento como JSON y, por defecto, termina tras recibir el primero. Incluye opciones para escuchar varios eventos, seguir conectado, establecer un tiempo máximo de espera y filtrar la salida con `--jq` o plantillas.

Entre los eventos admitidos están las revisiones enviadas, cambios de estado y de rama, conflictos de fusión y finalización de check suites. La CLI incorpora también comandos para crear, consultar y eliminar suscripciones.

La función no está disponible de forma general: tanto los comandos `gh event` como el acceso a Event Streams siguen en preview, y es necesario inscribirse en su lista de espera. Puede simplificar automatizaciones de agentes que crean pull requests y esperan a que las comprobaciones terminen, pero aún no debe asumirse como dependencia disponible en todos los entornos.

Fuente: [GitHub Changelog](https://github.blog/changelog/2026-11-18-wait-for-pull-request-events-with-github-cli/).
