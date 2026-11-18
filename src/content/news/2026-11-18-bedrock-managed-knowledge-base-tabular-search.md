---
title: "Amazon Bedrock permite consultar hojas Excel y CSV con cálculos sobre todas sus filas"
description: "La búsqueda tabular de Managed Knowledge Base ejecuta código aislado sobre archivos completos y combina los resultados con documentos recuperados."
date: 2026-11-18
source: "AWS"
source_url: "https://aws.amazon.com/blogs/machine-learning/get-answers-from-tables-with-tabular-search-in-amazon-bedrock-managed-knowledge-base/"
category: "AWS"
tags:
  - bedrock
  - agents
  - rag
featured: false
priority: 8
placement: lead
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-11-18T06:31:46+01:00
---

Amazon explicó el 16 de noviembre cómo la búsqueda tabular de Amazon Bedrock Managed Knowledge Base permite responder preguntas sobre archivos CSV, XLSX y XLS mediante cálculos sobre sus filas completas. La capacidad forma parte de la recuperación agéntica: una misma consulta puede combinar cifras de hojas de cálculo con reglas y explicaciones extraídas de documentos.

La diferencia respecto al RAG convencional es que no se calcula a partir de unos pocos fragmentos recuperados. El sistema localiza el archivo pertinente, copia el original a un sandbox aislado sin acceso a la red y ejecuta código generado por el modelo sobre la tabla completa. Después incorpora el resultado a la respuesta. Se utiliza la API `AgenticRetrieveStream`; `Retrieve` sigue devolviendo fragmentos sin ejecutar código. No hay que activar una opción adicional para la búsqueda tabular dentro de la recuperación agéntica.

AWS documenta compatibilidad con archivos CSV de hasta 500 MB y hojas Excel de hasta 200 MB para esta ejecución. La identidad que consulta necesita permisos de recuperación y `bedrock:GetDocumentContent`, porque el agente accede al archivo original. La función depende de su disponibilidad regional y añade latencia por la ejecución de código.

La trazabilidad identifica los archivos procesados, aunque las citas de la respuesta no siempre incluyen la hoja utilizada para calcular. AWS señala que no sustituye las herramientas de BI para métricas gobernadas, informes recurrentes o grandes uniones de datos. Para asistentes empresariales con hojas de cálculo y políticas documentales, evita tener que construir por separado un flujo de análisis tabular y otro de recuperación documental.

Fuente: [AWS](https://aws.amazon.com/blogs/machine-learning/get-answers-from-tables-with-tabular-search-in-amazon-bedrock-managed-knowledge-base/).
