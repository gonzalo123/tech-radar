---
title: "OpenAI y Cisco presentan Shirudo para proteger Linux sin reiniciar servicios"
description: "El proyecto abierto utiliza eBPF y agentes para desarrollar y verificar mitigaciones temporales mientras se despliegan parches."
date: 2026-11-27
source: "OpenAI"
source_url: "https://openai.com/index/introducing-shirudo/"
category: "Security"
tags:
  - openai
  - agents
  - codex
  - linux
  - ebpf
featured: false
priority: 8
placement: lead
breaking: false
draft: false
generated_by: "ChatGPT"
---

OpenAI y Cisco presentaron el 23 de noviembre Shirudo, un proyecto de código abierto destinado a reducir la exposición a vulnerabilidades durante el tiempo necesario para instalar sus parches definitivos.

El sistema utiliza eBPF para observar la actividad del sistema operativo y aplicar protecciones específicas sin reiniciar el servicio. Los agentes pueden preparar y probar estas mitigaciones, pero su activación requiere autorización del operador. Las protecciones se firman y verifican antes de cargarse.

En una prueba controlada, una mitigación desarrollada con Codex bloqueó un intento de explotación de Java4Shell contra Elasticsearch sin detener el servicio.

La propuesta resulta especialmente relevante para instalaciones con ventanas de mantenimiento limitadas. No sustituye la instalación de parches ni demuestra por sí sola que el proyecto esté preparado para cualquier entorno de producción.

El [código fuente](https://github.com/shirudo-dev/shirudo) está disponible bajo licencia BSD de dos cláusulas, con licencia dual BSD y GPL para los programas BPF. [Cisco también ha publicado los detalles de la iniciativa](https://newsroom.cisco.com/c/r/newsroom/en/us/a/y2026/m11/cisco-and-openai-launch-shirudo-a-new-project-to-safeguard-agentic-ai.html).
