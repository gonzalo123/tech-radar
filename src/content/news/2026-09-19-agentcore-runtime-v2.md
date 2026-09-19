---
title: "AgentCore Runtime V2 reduce memoria y estabiliza los cold starts"
description: "AWS renueva AgentCore Runtime con memoria bajo demanda y snapshots para acelerar y abaratar agentes de larga duración."
date: 2026-09-19

source: "AWS"
source_url: "https://aws.amazon.com/blogs/machine-learning/the-new-agentcore-runtime-elastic-optimized-and-consistently-fast-starts/"

category: "AWS"

tags:
  - bedrock
  - agents
  - agentcore
  - infrastructure
  - cost-control

featured: false
priority: 93
placement: secondary
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-09-19T06:30:42+02:00
---

AWS ha lanzado una nueva versión de Amazon Bedrock AgentCore Runtime que cambia cómo se asigna memoria y cómo arrancan las sesiones. Runtime V2 pagina memoria bajo demanda, recupera la que deja de utilizarse y restaura nuevas instancias desde snapshots ya inicializados, en lugar de repetir todo el arranque del contenedor.

El objetivo es reducir el coste de agentes largos o con carga irregular. La versión anterior retenía la memoria máxima asignada hasta terminar la sesión; V2 puede devolver memoria cuando deja de usarse, por lo que la facturación sigue más de cerca el consumo real.

AWS también afirma que los cold starts dejan de crecer con el tamaño de la imagen. En una prueba de 5.000 invocaciones frías por configuración, su agente vacío obtuvo alrededor de dos segundos de latencia P75 con imágenes entre 200 MB y 2 GB; el runtime anterior pasó aproximadamente de 5,4 a casi 30 segundos en ese rango. Son medidas de AWS y no incluyen el tiempo de ejecución del modelo o las tools del agente.

La nueva versión se activa indicando `platformVersion: V2` al crear o actualizar el runtime. Para agentes persistentes o lanzados en ráfagas, el cambio ataca directamente dos costes operativos habituales: memoria retenida durante sesiones largas y latencia impredecible al escalar desde cero.