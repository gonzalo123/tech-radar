---
title: "NVIDIA dona OpenShell a la CNCF y refuerza el aislamiento de agentes en Kubernetes"
description: "OpenShell pasa a la CNCF Sandbox con políticas deterministas; Agent Substrate permitirá suspender y reanudar entornos persistentes de agentes."
date: 2026-11-12
source: "NVIDIA"
source_url: "https://blogs.nvidia.com/blog/open-source-openshell-infrastructure/"
category: "DevTools"
tags:
  - agents
  - security
  - kubernetes
  - sandbox
  - open-source
featured: false
priority: 9
placement: secondary
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-11-12T07:14:00+01:00
---

NVIDIA anunció durante KubeCon su contribución de OpenShell a la Cloud Native Computing Foundation (CNCF), donde pasa a ser un proyecto Sandbox. OpenShell es un runtime abierto para gobernar agentes autónomos mediante controles deterministas sobre herramientas, acceso a servicios de inferencia, credenciales y ejecución de tareas.

La propuesta es separar las decisiones probabilísticas del modelo de los permisos que el sistema realmente concede. Las políticas pueden imponerse fuera del agente, y la arquitectura admite proveedores externos de cómputo, credenciales y observabilidad. NVIDIA afirma que cientos de organizaciones ya utilizan OpenShell; la cifra procede del fabricante.

La empresa también participa en Agent Substrate, un proyecto originado por Google y aceptado en CNCF Sandbox. Su objetivo es ejecutar agentes persistentes en Kubernetes, suspendiendo sus entornos cuando están inactivos y reanudándolos sin reservar permanentemente recursos de cómputo. NVIDIA y Google trabajan en integrar ambos proyectos.

En infraestructura de producción, la combinación es especialmente relevante para agentes que ejecutan código o navegan por sitios externos. OpenShell aporta controles de ejecución y Agent Substrate apunta a gestionar el ciclo de vida de entornos persistentes. Ninguno sustituye por sí solo una política de mínimos privilegios, aislamiento de red, auditoría y pruebas de seguridad.

Fuente: [NVIDIA](https://blogs.nvidia.com/blog/open-source-openshell-infrastructure/).
