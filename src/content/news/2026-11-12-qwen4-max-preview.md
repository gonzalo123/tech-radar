---
title: "Alibaba abre Qwen4-Max-Preview con contexto de un millón de tokens y API compatible"
description: "La nueva vista previa multimodal admite herramientas, vídeo y salida estructurada, pero solo funciona con Token Plan y se retirará el 25 de noviembre."
date: 2026-11-12
source: "Alibaba Cloud"
source_url: "https://www.alibabacloud.com/help/en/model-studio/qwen4-max-preview"
category: "AI"
tags:
  - qwen
  - models
  - agents
  - multimodal
featured: false
priority: 10
placement: lead
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-11-12T07:14:00+01:00
---

Alibaba Cloud abrió el 11 de noviembre Qwen4-Max-Preview, una versión preliminar de su próximo modelo insignia. Admite texto, imágenes y vídeo, razonamiento configurable, llamadas a herramientas, búsqueda web y salidas estructuradas mediante JSON Schema. El contexto máximo anunciado es de un millón de tokens, con hasta 393.216 tokens de salida compartidos entre razonamiento y respuesta.

La API ofrece compatibilidad con OpenAI Chat Completions y Responses, así como con Anthropic Messages. El razonamiento está activado por defecto y puede configurarse con `reasoning_effort` en los niveles `low`, `medium` y `xhigh`. Alibaba advierte de que el presupuesto de salida incluye los tokens de razonamiento, algo relevante para clientes que fijan límites bajos.

El acceso no es de pago por uso: requiere Token Plan Personal o Team y un endpoint específico de Alibaba Cloud. La vista previa estará disponible del 11 al 25 de noviembre de 2026 y se retirará después de esa fecha. No se han publicado pesos ni evaluaciones técnicas detalladas que permitan comparar con rigor su rendimiento.

Para equipos que utilizan APIs de modelos compatibles con varios proveedores, la noticia merece una prueba limitada de programación y agentes, pero no conviene basar producción en un identificador de modelo con retirada anunciada.

Fuente: [Alibaba Cloud](https://www.alibabacloud.com/help/en/model-studio/qwen4-max-preview).
