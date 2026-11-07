---
title: "Baseten presenta sandboxes persistentes que suspenden y reanudan agentes"
description: "Los entornos aislados conservan archivos, memoria y procesos y pueden reanudarse en unos 25 ms, según el fabricante."
date: 2026-11-07
source: "Baseten"
source_url: "https://www.baseten.co/blog/building-the-agent-cloud-introducing-baseten-sandboxes"
category: "DevTools"
tags:
  - agents
  - sandbox
  - security
  - infrastructure
featured: false
priority: 9
placement: secondary
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-11-07T20:38:00+01:00
---

Baseten anunció el 5 de noviembre Sandboxes, un servicio para ejecutar comandos y manipular archivos en entornos aislados destinados a agentes. La propuesta busca resolver tres problemas habituales de tareas largas: conservar el estado, limitar el riesgo de ejecutar código no confiable y reducir la latencia entre llamadas.

Según Baseten, al quedar inactivo un sandbox se guarda una instantánea del sistema de archivos, la memoria y los procesos. El entorno puede reanudarse en aproximadamente 25 milisegundos y la computación se reduce a cero durante la suspensión. Estas cifras son del proveedor y deben medirse con cargas reales.

El servicio ofrece SDK para Python, TypeScript y Go, CLI, API de gestión y previsualización HTTPS de aplicaciones ejecutadas dentro del sandbox. Cada organización puede iniciar hasta diez entornos concurrentes sin solicitar ampliación. Baseten anunció uso gratuito hasta el 16 de noviembre.

La empresa también anticipa Agent Drive, un sistema de archivos compartido, y Agent Proxy, un proxy que aplicará restricciones de red e inyectará credenciales sin exponerlas al agente. Son componentes futuros, no capacidades que deban darse por disponibles hoy.

La novedad resulta relevante para agentes de programación multiusuario y sesiones persistentes, aunque aislamiento, permisos, red y persistencia deben verificarse antes de ejecutar código generado por modelos.

Fuente: [Baseten](https://www.baseten.co/blog/building-the-agent-cloud-introducing-baseten-sandboxes).
