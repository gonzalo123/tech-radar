---
title: "Anthropic ofrece Claude API gestionada por su plataforma a través de Google Cloud"
description: "La nueva modalidad usa IAM y facturación de Google Cloud mientras Anthropic opera la API de Claude, con una organización separada por proyecto."
date: 2026-10-24
source: "Anthropic"
source_url: "https://platform.claude.com/docs/en/build-with-claude/claude-models-on-google-cloud/anthropic-managed"
category: "AI"
tags:
  - claude
  - api
  - cloud
featured: false
priority: 6
placement: normal
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-10-24T11:55:00+02:00
---

Anthropic anunció el 22 de octubre Claude Models on Google Cloud (Anthropic managed), una modalidad que permite acceder a la API de Claude desde un proyecto de Google Cloud. A diferencia de la oferta gestionada por Google, Anthropic opera la API mientras Google Cloud controla el acceso mediante IAM y gestiona la facturación en Marketplace.

La configuración crea una organización de Anthropic separada para el proyecto y utiliza credenciales OAuth de Google, no claves API de Anthropic. Los SDK incorporan el cliente `AnthropicGoogleCloud`, que resuelve las credenciales y construye la URL del servicio. La API conserva los cuerpos de petición y las respuestas habituales de Claude.

Los equipos deben activar los servicios correspondientes, asignar roles IAM y proporcionar un identificador de workspace. La documentación advierte que una organización existente de Anthropic no se reutiliza automáticamente y que la residencia de inferencia se configura de forma específica.

La opción amplía las formas de integrar Claude en entornos empresariales que ya administran identidad y gasto desde Google Cloud, aunque exige revisar las diferencias operativas respecto a Vertex AI y a la API directa.

Fuente: [Anthropic](https://platform.claude.com/docs/en/build-with-claude/claude-models-on-google-cloud/anthropic-managed).
