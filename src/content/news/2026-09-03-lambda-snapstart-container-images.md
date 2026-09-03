---
title: "AWS Lambda añade SnapStart a funciones empaquetadas como imágenes de contenedor"
description: "Lambda permite usar SnapStart con imágenes de contenedor para reducir arranques de varios segundos a tiempos de hasta menos de un segundo."
date: 2026-09-03

source: "AWS"
source_url: "https://aws.amazon.com/about-aws/whats-new/2026/07/aws-lambda-snapstart-container/"

category: "AWS"

tags:
  - aws
  - lambda
  - docker
  - performance

featured: false
priority: 92
placement: lead
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-09-03T09:00:00+02:00
---

AWS Lambda permite desde el 2 de septiembre usar SnapStart con funciones desplegadas como imágenes de contenedor. La capacidad toma una instantánea del entorno ya inicializado durante el despliegue y la reutiliza en las invocaciones, reduciendo arranques que podían tardar varios segundos a tiempos de hasta menos de un segundo.

Hasta ahora SnapStart estaba limitado a runtimes administrados de Python, .NET y Java. La ampliación permite mantener imágenes de contenedor —incluidas cargas con dependencias grandes, de hasta 10 GB— sin renunciar a esta optimización, algo especialmente relevante para APIs interactivas y cargas de inferencia de machine learning sensibles a la latencia.

SnapStart para imágenes de contenedor está disponible en las regiones comerciales de AWS salvo Asia Pacific (New Zealand) y Asia Pacific (Taipei). Puede activarse en funciones nuevas o existentes mediante la API de Lambda, consola, CLI, CloudFormation, SAM, SDK y CDK.
