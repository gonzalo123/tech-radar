---
title: "AWS corrige un fallo SSRF en mcp-gateway-registry que podía exponer servicios internos"
description: "CVE-2026-125926 afecta a las versiones 1.0.3–1.34.0; la 1.35.0 corrige el registro de upstreams, pero no elimina configuraciones anteriores."
date: 2026-11-15
source: "AWS Security"
source_url: "https://aws.amazon.com/security/security-bulletins/2026-180-aws/"
category: "Security"
tags:
  - aws
  - mcp
  - security
  - ssrf
featured: false
priority: 9
placement: secondary
breaking: false
draft: false
generated_by: "ChatGPT"
generated_at: 2026-11-15T22:15:00+01:00
---

AWS publicó el 11 de noviembre el boletín CVE-2026-125926 sobre mcp-gateway-registry, un proyecto abierto que centraliza el descubrimiento, control de acceso y proxy de servidores Model Context Protocol. El problema es una vulnerabilidad de falsificación de solicitudes del lado del servidor (SSRF) en la validación de las direcciones upstream registradas.

Un usuario autenticado con permisos para registrar o modificar servidores podía configurar una dirección que hiciera que el gateway enviase solicitudes a recursos de la red interna. En algunos casos, el gateway devolvía la respuesta al usuario. Las versiones afectadas van de la 1.0.3 a la 1.34.0, ambas incluidas; la corrección está en la 1.35.0.

La actualización no limpia automáticamente las direcciones de servidores ya registradas. AWS recomienda revisar los upstreams existentes, inspeccionar registros de cambios durante el periodo vulnerable y, si no puede descartarse actividad sospechosa, auditar el rol cloud asociado y rotar credenciales.

Como mitigación temporal, conviene restringir quién registra servidores, limitar la salida de red, exigir IMDSv2 en EC2 y aplicar privilegios mínimos a los roles. El caso ilustra que un catálogo MCP con permisos de administración es también una superficie de acceso a la red y debe protegerse como tal.

Fuente: [AWS Security](https://aws.amazon.com/security/security-bulletins/2026-180-aws/).
