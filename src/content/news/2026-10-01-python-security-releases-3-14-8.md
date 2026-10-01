---
title: "Python publica una ronda acelerada de seguridad para 3.14, 3.13 y 3.12"
description: "Python 3.14.8, 3.13.16 y 3.12.15 corrigen vulnerabilidades en tarfile, zipfile, SSL y urllib, incluidos bypasses de filtros de extracción."
date: 2026-10-01

source: "Python.org"
source_url: "https://www.python.org/downloads/release/python-3148/"

category: "Python"

tags:
  - python
  - security

featured: false
priority: 91
placement: secondary
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-10-01T06:59:00+02:00
---

El proyecto Python publicó el 30 de septiembre **Python 3.14.8**, **3.13.16** y **3.12.15** como una ronda de actualizaciones con correcciones de seguridad. La release 3.14.8 se publicó de forma acelerada e incluye, además de cientos de bugfixes, varios CVE que afectan a librerías estándar utilizadas habitualmente en backends y tooling.

Entre las correcciones destacan dos problemas en los filtros de extracción de `tarfile`, incluido un bypass que podía permitir crear directorios fuera del destino previsto; un problema de agotamiento de memoria en `zipfile` al descomprimir determinados formatos; y fallos relacionados con `SSLContext` y validación de `server_hostname`.

La actualización también corrige un problema en `urllib.request.HTTPPasswordMgr` que podía enviar credenciales asociadas a una URL usando otro esquema. En las builds distribuidas por Python.org se actualizan además componentes empaquetados como OpenSSL y Expat.

Para servicios Python expuestos a archivos, descargas, TLS o autenticación HTTP, estas releases son más relevantes que una actualización de mantenimiento ordinaria. Python 3.13.16 es además la última release de mantenimiento completo de la serie 3.13; las siguientes serán únicamente de seguridad.
