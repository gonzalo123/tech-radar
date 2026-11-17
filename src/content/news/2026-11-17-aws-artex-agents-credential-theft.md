---
title: "AWS detecta campañas con agentes de IA que buscan claves de proveedores y credenciales cloud"
description: "Amazon MadPot recogió registros de operaciones ARTEX dirigidas contra pasarelas LLM y aplicaciones expuestas, con intentos de reutilizar claves robadas para financiar más ataques."
date: 2026-11-17
source: "AWS Security Blog"
source_url: "https://aws.amazon.com/blogs/security/amazon-threat-intelligence-observes-threat-actors-running-cybercrime-campaigns-with-artex-ai-agents/"
category: "Security"
tags:
  - aws
  - agents
  - security
  - credentials
  - llm-gateway
featured: false
priority: 9
placement: normal
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-11-17T07:14:00+01:00
---

Amazon Threat Intelligence publicó el 13 de noviembre un análisis de campañas observadas entre el 3 de octubre y el 5 de noviembre mediante su red de señuelos MadPot. Los sensores recibieron solicitudes de agentes de IA que contenían registros de operaciones ofensivas. Amazon atribuye con confianza moderada la actividad al framework abierto ARTEX y advierte de que no pudo comprobar de manera independiente todos los éxitos descritos por los propios agentes.

La campaña principal buscaba credenciales de proveedores de modelos de IA y servicios cloud. Los registros describen un ciclo en el que las claves obtenidas se incorporaban a una pasarela de inferencia para financiar nuevos intentos de búsqueda. Los objetivos incluían LiteLLM, Dify, Langflow, RAGFlow, Open WebUI y otras herramientas de aplicaciones y pasarelas LLM expuestas a Internet.

Los agentes combinaban reconocimiento, explotación de configuraciones débiles, comprobación de claves y memoria compartida entre agentes especializados. Amazon también identificó otra campaña dirigida a sistemas de verificación de identidad en plataformas de criptomonedas. La empresa comunicó a los clientes potencialmente afectados la información pertinente.

Para plataformas corporativas de IA, el caso refuerza medidas concretas: no exponer paneles de administración, eliminar credenciales por defecto, parchear componentes, evitar secretos en imágenes y código cliente, rotar claves comprometidas y limitar los permisos IAM y los destinos de red. El riesgo no depende solo de que un modelo pueda ejecutar código, sino del alcance real de las credenciales a las que accede.

Fuente: [AWS Security Blog](https://aws.amazon.com/blogs/security/amazon-threat-intelligence-observes-threat-actors-running-cybercrime-campaigns-with-artex-ai-agents/).
