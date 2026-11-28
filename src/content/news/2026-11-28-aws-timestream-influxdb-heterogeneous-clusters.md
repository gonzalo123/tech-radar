---
title: "Timestream para InfluxDB 3 permite dimensionar cada rol del clúster por separado"
description: "AWS incorpora tamaños de instancia independientes para escritura, lectura y compactación."
date: 2026-11-28
source: "AWS"
source_url: "https://aws.amazon.com/about-aws/whats-new/2026/11/influxdb-heterogeneous-cluster/"
category: "AWS"
tags:
  - aws
  - databases
  - influxdb
  - time-series
featured: false
priority: 5
placement: normal
breaking: false
draft: false
generated_by: "ChatGPT"
---

AWS anunció el 27 de noviembre que los clústeres Enterprise de Amazon Timestream para InfluxDB 3 admiten tamaños de instancia diferentes para los nodos de escritura, lectura y compactación.

La configuración está disponible mediante consola, CLI y SDK, tanto al crear clústeres como al añadir nodos. AWS no aplica un suplemento por esta capacidad: cada nodo se factura según el tamaño elegido.

El cambio permite ajustar recursos a cargas de series temporales con necesidades desiguales de ingestión y consulta, sin dimensionar todos los roles para el mismo perfil de trabajo. Está disponible en las regiones donde opera el servicio.
