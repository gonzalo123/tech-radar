---
title: "SageMaker permite definir listas de instancias alternativas para training y processing"
description: "SageMaker AI puede probar automáticamente hasta cinco tipos de instancia en orden de preferencia para encontrar capacidad disponible."
date: 2026-09-16

source: "AWS"
source_url: "https://aws.amazon.com/blogs/machine-learning/announcing-instance-preference-lists-for-amazon-sagemaker-ai-training-jobs/"

category: "AWS"

tags:
  - sagemaker
  - ai-infrastructure
  - cost-control

featured: false
priority: 84
placement: lead
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-09-16T06:32:27+02:00
---

AWS ha añadido listas de preferencia de instancias a los jobs de training y processing de Amazon SageMaker AI. Un job puede especificar hasta cinco tipos de instancia en orden de preferencia y SageMaker intenta lanzarlo automáticamente con la primera opción que tenga capacidad disponible.

Hasta ahora, un job estaba asociado a un único tipo de instancia. Si no había capacidad on-demand disponible, el equipo tenía que esperar o volver a lanzar el trabajo manualmente con otra configuración. Con las listas de preferencia, SageMaker recorre las alternativas indicadas sin requerir esos reintentos externos.

La selección respeta el orden configurado: SageMaker utiliza la primera instancia disponible de la lista, no necesariamente la más barata. AWS recomienda por ello ordenar las opciones según los requisitos de rendimiento y coste del workload.

En la práctica, la funcionalidad reduce la lógica operativa necesaria para entrenamientos y procesos que pueden ejecutarse sobre varias familias de CPU o GPU, y puede disminuir el tiempo perdido esperando capacidad de un tipo concreto de instancia.
