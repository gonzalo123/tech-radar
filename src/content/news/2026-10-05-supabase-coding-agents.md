---
title: "Supabase lleva esquema, runtime y MCP al flujo de los coding agents"
description: "Supabase Select 2026 introduce esquema y configuración en código, desarrollo local sin Docker, Compute para servicios persistentes y un MCP autenticado para las aplicaciones."
date: 2026-10-05

source: "Supabase"
source_url: "https://supabase.com/blog/select-2026-build-anything"

category: "DevTools"

tags:
  - agents
  - mcp

featured: false
priority: 92
placement: lead
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-10-05T07:15:00+02:00
---

Supabase anunció en Select 2026 un conjunto de cambios para que los **coding agents puedan modificar y probar una mayor parte del backend desde el propio repositorio**. El esquema y la configuración del proyecto pueden vivir ahora en código, mientras que el nuevo motor `pg-delta` genera las migraciones a partir de los ficheros SQL declarativos.

El runtime local puede ejecutarse como procesos nativos **sin un daemon de Docker**, una capacidad todavía en alpha y desactivada por defecto. Supabase cita explícitamente entornos como los sandboxes de Claude Code y Codex, además de runners de CI. También permite levantar una instancia independiente por directorio, facilitando pruebas paralelas en distintos worktrees o checkouts.

La compañía presentó además **Supabase Compute**, actualmente en private alpha, para ejecutar servicios persistentes y agentes en cualquier lenguaje junto a la base de datos, con un entorno Linux completo y despliegue desde CLI o Management API.

Otra novedad permite incorporar a una aplicación su propio **servidor MCP autenticado**. Se despliega como Edge Function, utiliza el flujo de autenticación existente y mantiene las políticas RLS para limitar los datos accesibles por cada usuario. Es un servidor distinto del MCP oficial de Supabase utilizado por los agentes que desarrollan el proyecto.

En conjunto, los cambios reducen la parte del ciclo de desarrollo que obliga a un coding agent a salir del repositorio o depender del dashboard: configuración, cambios de esquema, pruebas locales y determinados servicios pasan a ser representables y operables desde código.