---
title: "Bedrock Knowledge Bases añade búsqueda semántica de vídeo, audio e imágenes con Marengo 3.0"
description: "Amazon Bedrock Knowledge Bases incorpora Marengo Embed 3.0 para indexar y buscar contenido multimodal mediante lenguaje natural sin montar una canalización propia de extracción y embeddings."
date: 2026-09-11

source: "AWS"
source_url: "https://aws.amazon.com/blogs/machine-learning/video-and-image-search-in-amazon-bedrock-knowledge-base-using-marengo-3-0/"

category: "AWS"

tags:
  - bedrock
  - rag
  - multimodal
  - embeddings

featured: false
priority: 74
placement: normal
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-09-11T06:32:03+02:00
---

Amazon Bedrock Knowledge Bases incorpora de forma general TwelveLabs Marengo Embed 3.0 como modelo de embeddings para búsqueda multimodal. El servicio puede indexar vídeo, audio, imágenes y texto y recuperar fragmentos relevantes mediante consultas en lenguaje natural.

Marengo Embed 3.0 representa las distintas modalidades en un espacio vectorial común de 512 dimensiones. En una Managed Knowledge Base, AWS se encarga de segmentar vídeo y audio, extraer fotogramas, transcribir el contenido y generar los embeddings durante la ingestión, evitando tener que mantener una canalización separada para cada modalidad.

Los resultados de búsqueda incluyen metadatos como los tiempos de inicio y fin del fragmento y la URI de origen. Las aplicaciones pueden consultar la base mediante la API `Retrieve` de Bedrock o utilizarla como target de Amazon Bedrock Gateway en AgentCore.

La integración está disponible inicialmente en `us-east-1` y `us-west-1`. Para equipos que construyen RAG sobre archivos audiovisuales, la novedad reduce la cantidad de infraestructura necesaria para hacer búsquedas semánticas sobre contenido que antes requería combinar transcripción, extracción de frames, embeddings y almacenamiento vectorial.
