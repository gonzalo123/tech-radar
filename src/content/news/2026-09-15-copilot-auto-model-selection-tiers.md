---
title: "Copilot permite ajustar coste y calidad en la selección automática de modelos"
description: "GitHub añade tres niveles a Copilot Auto para priorizar eficiencia, equilibrio o calidad al elegir el modelo para cada prompt."
date: 2026-09-15

source: "GitHub"
source_url: "https://github.blog/changelog/2026-09-14-configure-cost-and-quality-in-copilot-auto-model-selection/"

category: "DevTools"

tags:
  - copilot
  - models
  - developer-tools
  - cost-control

featured: false
priority: 91
placement: lead
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-09-15T06:32:20+02:00
---

GitHub ha añadido tres niveles a la selección automática de modelos de Copilot para que el usuario pueda decidir cómo debe ponderar coste, calidad y latencia. Los modos `efficiency`, `balance` e `intelligence` se están desplegando en Visual Studio Code, Copilot CLI y la aplicación de GitHub Copilot.

Los tres niveles utilizan el mismo conjunto de modelos disponibles. Copilot evalúa cada prompt y selecciona un modelo en función del nivel elegido: `efficiency` prioriza reducir costes, `balance` combina coste, calidad y latencia, e `intelligence` da más peso a la calidad en tareas complejas. Elegir este último no obliga a utilizar siempre un modelo grande; una tarea sencilla puede seguir siendo enviada a un modelo pequeño.

La facturación depende del modelo que Auto termine seleccionando, independientemente del nivel configurado. Los suscriptores de pago mantienen el descuento del 10 % para el uso facturado mediante selección automática.

En la práctica, la actualización convierte el routing automático de modelos en un control explícito de coste y calidad. Los desarrolladores pueden delegar la elección del modelo sin renunciar a indicar si una sesión debe optimizarse para tareas rápidas y económicas o para trabajo más exigente.
