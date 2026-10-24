---
title: "AWS Continuum ya analiza vulnerabilidades y propone correcciones en pull requests"
description: "El nuevo servicio de AWS combina análisis de código y contexto de infraestructura para priorizar fallos explotables y proponer parches revisables."
date: 2026-10-24
source: "AWS"
source_url: "https://aws.amazon.com/blogs/aws/aws-continuum-for-code-vulnerabilities-is-now-generally-available/"
category: "Security"
tags:
  - aws
  - security
  - agents
featured: false
priority: 9
placement: lead
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-10-24T11:55:00+02:00
---

AWS anunció el 22 de octubre la disponibilidad general de Continuum for code vulnerabilities, un servicio que analiza vulnerabilidades en repositorios, incorpora contexto de infraestructura de AWS y propone correcciones como parches o pull requests. Su objetivo es distinguir hallazgos realmente explotables de alertas que no requieren una intervención inmediata.

Continuum construye un grafo de contexto a partir del código y, opcionalmente, de recursos de AWS recopilados mediante un collector. Relaciona rutas de ataque, exposición de red, dependencias y sistemas críticos para priorizar los problemas. Cuando puede reproducir un fallo, utiliza un entorno aislado y aporta evidencias de la explotación.

Las correcciones pueden consistir en cambios de código, actualizaciones de dependencias o modificaciones de configuración. Por ahora, una persona debe revisar y aprobar cada propuesta antes de incorporarla; la remediación autónoma está prevista para el futuro.

El servicio está disponible inicialmente en las regiones de Virginia del Norte y Oregón. Los equipos que mantienen varias aplicaciones pueden utilizarlo para reducir trabajo de clasificación, pero deben validar tanto los hallazgos como los parches generados.

Fuente: [AWS](https://aws.amazon.com/blogs/aws/aws-continuum-for-code-vulnerabilities-is-now-generally-available/).
