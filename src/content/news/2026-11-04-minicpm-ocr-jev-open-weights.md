---
title: "OpenBMB combina OCR local con un modelo que puntúa la fiabilidad de cada extracción"
description: "MiniCPM-OCR 1.0 y MiniCPM-OCR Jev ofrecen extracción documental y verificación de calidad con modelos de 1,3B y 2B parámetros bajo Apache 2.0."
date: 2026-11-04
source: "OpenBMB"
source_url: "https://github.com/OpenBMB/MiniCPM-OCR"
category: "AI"
tags:
  - models
  - ocr
  - decision-models
  - open-weights
featured: false
priority: 9
placement: secondary
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-11-04T07:13:00+01:00
---

OpenBMB publicó a finales de octubre MiniCPM-OCR 1.0 y MiniCPM-OCR Jev, dos modelos especializados con pesos y código bajo licencia Apache 2.0. La publicación pasó inadvertida en ediciones anteriores y se recupera hoy.

MiniCPM-OCR 1.0 tiene 1.300 millones de parámetros y está diseñado para extraer texto, tablas, fórmulas y otros elementos de documentos, incluidos escaneos y fotografías difíciles. El equipo anuncia un resultado de 93,68 en Real5-OmniDocBench; es una evaluación comunicada por sus autores.

MiniCPM-OCR Jev, de 2.000 millones de parámetros, no realiza la extracción: recibe una región de imagen y un resultado OCR candidato y devuelve una puntuación de consistencia entre cero y uno. Puede servir para seleccionar entre varios motores o remitir a revisión humana los resultados dudosos. Los autores comunican un AUROC de 93,6 en JevOCRBench.

La distinción importa: un AUROC elevado mide la capacidad de separar resultados correctos e incorrectos, pero no significa que el 93,6 % de las extracciones sean correctas. El umbral de aceptación debe calibrarse con documentos reales de cada aplicación.

Ambos modelos admiten despliegue local. La combinación resulta interesante para digitalización documental, extracción estructurada y sistemas RAG donde introducir datos erróneos en el índice tiene un coste elevado.

Fuente: [OpenBMB](https://github.com/OpenBMB/MiniCPM-OCR).
