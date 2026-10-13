---
title: "Anthropic refuerza las defensas de Claude contra ataques de destilación"
description: "La empresa afirma haber reducido entre un 90 y un 99 % la extracción de tokens de razonamiento mediante nuevas medidas técnicas."
date: 2026-10-13
source: "Anthropic"
source_url: "https://www.anthropic.com/research/distillation-defenses"
category: "Security"
tags:
  - security
  - models
  - ai-governance
featured: false
priority: 7
placement: secondary
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-10-13T06:55:00+02:00
---

Anthropic publicó el 12 de octubre los resultados iniciales de nuevas medidas contra ataques de destilación, en los que terceros intentan recopilar respuestas y razonamientos de Claude para reproducir sus capacidades. Según las mediciones internas de la compañía, la cantidad de tokens de razonamiento extraídos por los atacantes ha disminuido aproximadamente entre un 90 y un 99 %.

Las defensas combinan restricciones sobre la reutilización del contexto de razonamiento, clasificadores de dos etapas para detectar intentos de extracción y medidas contra cuentas que repiten esos intentos. Anthropic afirma que sus clasificadores presentan menos de un 0,1 % de falsos positivos en las pruebas realizadas.

La compañía reconoce efectos sobre usuarios legítimos: algunos desarrolladores han tenido que adaptar sus integraciones y ciertas solicitudes bloqueadas pueden generar cargos. Los porcentajes publicados proceden de Anthropic y no garantizan que futuras técnicas de extracción resulten ineficaces. El anuncio es relevante para proveedores de modelos y plataformas de inferencia que necesitan controlar usos abusivos sin afectar al tráfico autorizado.

Fuente: [Anthropic](https://www.anthropic.com/research/distillation-defenses).
