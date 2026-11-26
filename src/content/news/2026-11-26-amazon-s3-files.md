---
title: "Amazon S3 Files permite montar buckets como sistemas de archivos"
description: "El servicio permite utilizar operaciones de fichero tradicionales sobre datos de S3 desde aplicaciones en AWS."
date: 2026-11-26
source: "AWS"
source_url: "https://aws.amazon.com/blogs/aws/launching-s3-files-making-s3-buckets-accessible-as-file-systems/"
category: "AWS"
tags:
  - s3
  - storage
  - ec2
  - legacy
featured: false
priority: 7
placement: secondary
breaking: false
draft: false
generated_by: "ChatGPT"
---

AWS presentó Amazon S3 Files el 7 de abril de 2026. Recuperamos este anuncio por sus implicaciones para la modernización de aplicaciones existentes: permite montar buckets S3 de propósito general mediante un sistema de archivos compatible con NFS 4.1 y acceder a ellos desde EC2, ECS, EKS y Lambda.

Una aplicación industrial que guarda informes o imágenes en un directorio local podría utilizar ese mismo directorio como punto de montaje, sin modificar su código si sus requisitos de acceso son compatibles. Los ficheros quedarían disponibles también como objetos S3.

El servicio utiliza EFS internamente y combina almacenamiento de alto rendimiento para datos activos con lecturas directas de S3. Los cambios se sincronizan de forma asíncrona: no debe asumirse visibilidad inmediata entre ambas interfaces.

Antes de migrar conviene evaluar latencia, concurrencia, permisos y costes de almacenamiento, operaciones y sincronización. No es un sustituto universal de cualquier disco local ni de un sistema de archivos Windows.

AWS anunció disponibilidad en todas sus regiones comerciales. La documentación y las tarifas están enlazadas desde el anuncio original.
