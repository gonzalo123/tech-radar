---
title: "SageMaker Unified Studio añade una skill de agente para generar manifests de CI/CD"
description: "El toolkit de CI/CD de SageMaker Unified Studio incorpora una skill que inspecciona proyectos y genera manifests de despliegue, además de promoción nativa de notebooks entre entornos."
date: 2026-09-03

source: "AWS"
source_url: "https://aws.amazon.com/about-aws/whats-new/2026/09/sagemaker-cicd-notebook-ai-manifest/"

category: "AWS"

tags:
  - aws
  - agents
  - skills
  - devtools

featured: false
priority: 82
placement: secondary
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-09-03T09:00:00+02:00
---

AWS ha ampliado el toolkit open source de CI/CD de SageMaker Unified Studio con una skill de agente que genera manifests de despliegue y con soporte nativo para promocionar notebooks entre entornos. La nueva `generate-bundle-manifest` inspecciona conexiones, almacenamiento y workflows de un proyecto y produce un manifest preparado para despliegue con recomendaciones de mínimo privilegio, variables de entorno en lugar de identificadores hardcodeados y valores por defecto conservadores.

La skill puede importarse en agentes propios para estandarizar cómo se empaquetan y promocionan proyectos de SageMaker Unified Studio entre desarrollo, pruebas y producción. En paralelo, el toolkit permite mover notebooks junto con código, workflows y activos de catálogo, conservando el historial de ejecuciones al actualizar notebooks existentes y ofreciendo un modo dry-run para validar conectividad S3, permisos IAM y número de notebooks antes del despliegue.

Ambas capacidades están disponibles en las regiones donde se ofrece SageMaker Unified Studio y se integran con los comandos existentes del toolkit sin exigir cambios en la estructura actual del pipeline.
