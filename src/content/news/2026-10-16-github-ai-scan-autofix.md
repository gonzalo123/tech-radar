---
title: "GitHub generaliza el análisis y la reparación de vulnerabilidades con IA"
description: "AI Scan amplía la detección en pull requests y Agentic Autofix permite a Copilot proponer correcciones y comprobarlas con CodeQL."
date: 2026-10-16
source: "GitHub"
source_url: "https://github.blog/changelog/2026-10-15-agentic-autofix-for-code-scanning-alerts-general-availability/"
category: "Security"
tags:
  - security
  - copilot
  - devsecops
featured: false
priority: 8
placement: secondary
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-10-16T08:12:00+02:00
---

GitHub anunció el 15 de octubre la disponibilidad general de Agentic Autofix, una función que permite asignar alertas de análisis de código a Copilot para que investigue el repositorio, proponga cambios, vuelva a ejecutar CodeQL y abra una pull request de revisión. El mismo día declaró disponible de forma general AI Scan para pull requests, que amplía la detección a tecnologías con cobertura limitada de CodeQL.

AI Scan puede señalar problemas en PHP, Bash, Dockerfiles, Terraform HCL y otras tecnologías. Sus alertas son informativas: no bloquean la fusión y no se ejecutan sobre pull requests de forks ni creadas por Dependabot. Agentic Autofix, por su parte, actúa sobre alertas de la rama predeterminada y permite agrupar hasta 25 en una propuesta de corrección.

Las condiciones de acceso son diferentes. AI Scan puede utilizarse en repositorios públicos, mientras que los repositorios privados requieren licencias de seguridad de GitHub. Agentic Autofix está disponible para clientes de GitHub Code Security o Advanced Security en Enterprise Cloud y necesita habilitación administrativa y configuración de facturación. Ambas funciones consumen créditos de IA; Autofix también utiliza minutos de Actions. La revisión humana sigue siendo necesaria antes de integrar las correcciones.

Fuente: [GitHub](https://github.blog/changelog/2026-10-15-agentic-autofix-for-code-scanning-alerts-general-availability/).
