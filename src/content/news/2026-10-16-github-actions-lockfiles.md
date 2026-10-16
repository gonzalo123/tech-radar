---
title: "GitHub Actions estrena lockfiles para fijar las dependencias de los workflows"
description: "La vista previa permite ejecutar commits concretos de acciones y workflows reutilizables aunque cambien sus etiquetas o ramas."
date: 2026-10-16
source: "GitHub"
source_url: "https://github.blog/changelog/2026-10-14-github-actions-workflow-lockfiles-in-public-preview/"
category: "DevTools"
tags:
  - github-actions
  - supply-chain-security
  - ci-cd
featured: false
priority: 7
placement: secondary
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-10-16T08:12:00+02:00
---

GitHub abrió el 14 de octubre una vista previa pública de los lockfiles de dependencias de GitHub Actions. La función permite mantener referencias legibles a etiquetas y ramas en los workflows, pero ejecutar los commits concretos registrados en un archivo de bloqueo. Está disponible para los planes Free, Team y Enterprise Cloud, incluida la variante con residencia de datos.

La extensión `gh actions-lock` para GitHub CLI genera el archivo `.github/workflows/actions.lock` con las revisiones de las acciones, sus dependencias transitivas y los workflows reutilizables. Los equipos pueden adoptar el bloqueo progresivamente, por workflow. Una vez incorporado, las dependencias de ese workflow deben aparecer en el lockfile; Dependabot puede actualizar las referencias bloqueadas al proponer nuevas versiones.

El objetivo es reducir el riesgo de que una etiqueta o rama modificada cambie silenciosamente el código ejecutado en CI. El bloqueo no certifica que una dependencia sea segura: hay que revisarla antes de fijarla. La novedad aporta una medida práctica de seguridad de la cadena de suministro sin obligar a sustituir todas las referencias del YAML por hashes de commit.

Fuente: [GitHub](https://github.blog/changelog/2026-10-14-github-actions-workflow-lockfiles-in-public-preview/).
