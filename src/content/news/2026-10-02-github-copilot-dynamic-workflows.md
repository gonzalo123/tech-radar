---
title: "GitHub Copilot incorpora workflows programables para orquestar varios agentes"
description: "Los dynamic workflows combinan código determinista, herramientas y agentes con ejecución paralela, resultados estructurados y checkpoints humanos."
date: 2026-10-02

source: "GitHub"
source_url: "https://github.blog/changelog/2026-10-01-dynamic-workflows-in-copilot-cli-and-the-copilot-app/"

category: "DevTools"

tags:
  - copilot
  - agents
  - orchestration

featured: false
priority: 93
placement: secondary
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-10-02T07:17:00+02:00
---

GitHub ha lanzado en public preview los **dynamic workflows** para Copilot CLI, la aplicación de GitHub Copilot y el Copilot SDK. La nueva capacidad permite definir en código cómo se ejecuta un proceso y combinar pasos deterministas con el trabajo de uno o varios agentes.

Los workflows pueden ejecutar comandos y herramientas, dividir objetivos en tareas paralelas, pasar resultados estructurados entre etapas, hacer que subagentes verifiquen conclusiones de otros agentes y detenerse en checkpoints para solicitar revisión humana antes de continuar. El programa vive dentro de una extensión de Copilot y puede usar sus APIs de extensibilidad.

A diferencia de `/fleet`, donde Copilot decide cómo delegar y coordinar trabajo entre subagentes, un dynamic workflow ejecuta una orquestación definida explícitamente en código. Esto permite reutilizar procesos con etapas, comprobaciones y límites predecibles, por ejemplo para investigar incidentes, revisar muchos archivos en paralelo o encadenar investigación, planificación e implementación.

Los dynamic workflows están disponibles en todos los planes de Copilot. En la aplicación de escritorio no requieren configuración adicional; en Copilot CLI es necesario activar las funciones experimentales.