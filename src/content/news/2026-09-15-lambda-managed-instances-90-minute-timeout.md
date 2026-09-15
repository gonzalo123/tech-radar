---
title: "Lambda Managed Instances amplía a 90 minutos el timeout de ejecuciones asíncronas"
description: "AWS eleva de 15 a 90 minutos el tiempo máximo de ejecución para invocaciones asíncronas y event source mappings en Lambda Managed Instances."
date: 2026-09-15

source: "AWS"
source_url: "https://aws.amazon.com/blogs/compute/announcing-90-minute-function-timeout-on-aws-lambda-managed-instances/"

category: "AWS"

tags:
  - aws
  - lambda
  - infrastructure
  - ai-inference

featured: false
priority: 78
placement: secondary
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-09-15T10:25:00+02:00
---

AWS Lambda permite ahora configurar hasta 90 minutos de ejecución continua para invocaciones asíncronas y event source mappings en funciones que usan Lambda Managed Instances. El nuevo límite multiplica por seis los 15 minutos anteriores y está orientado a cargas como procesamiento de datos, transcodificación, cálculos financieros, inferencia de IA y trabajos batch que antes obligaban a dividir el procesamiento o moverlo a otro servicio.

El cambio no afecta a las invocaciones síncronas, que mantienen un máximo de 15 minutos. Tampoco amplía el límite para event source mappings de Amazon MQ y Amazon DocumentDB, que continúan limitados a 15 minutos. Para el resto de fuentes compatibles, el timeout puede configurarse hasta 5.400 segundos sin modificar el código de la función.

La ampliación también se aplica a invocaciones de Lambda durable functions sobre Managed Instances. Una invocación individual puede permanecer activa hasta 90 minutos, mientras que una ejecución durable asíncrona completa puede extenderse hasta un año utilizando checkpoints para recuperar el trabajo ya completado.

En la práctica, Lambda Managed Instances cubre ahora una franja de trabajos de larga duración que antes quedaban fuera del modelo habitual de Lambda, incluyendo inferencias o procesos batch de decenas de minutos, sin añadir un coste específico por el timeout ampliado más allá de la tarificación normal de Managed Instances.
