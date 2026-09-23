---
title: "Strands y AgentCore añaden evaluaciones específicas para skills de agentes"
description: "Nuevos evaluadores separan si un agente eligió la skill correcta de si siguió correctamente sus instrucciones, tanto en tests como sobre trazas OpenTelemetry."
date: 2026-09-23

source: "AWS"
source_url: "https://aws.amazon.com/blogs/machine-learning/evaluate-skill-equipped-agents-with-strands-evals-and-amazon-bedrock-agentcore/"

category: "AWS"

tags:
  - strands-agents
  - agents
  - skills
  - bedrock
  - observability

featured: false
priority: 84
placement: normal
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-09-23T06:31:25+02:00
---

AWS incorporó evaluaciones específicas para **skills de agentes** en Strands Evals y Amazon Bedrock AgentCore Evaluations. El objetivo es detectar dos fallos distintos que una evaluación del texto final puede pasar por alto: que el agente elija una skill incorrecta o que seleccione la adecuada pero no siga todos sus pasos.

`Skill Selection Accuracy` determina si cada skill invocada era apropiada para la tarea y devuelve un resultado binario. `Skill Instruction Following` evalúa hasta qué punto se siguieron las instrucciones de la skill con una escala de cinco niveles. Strands Evals añade además `SkillInvoked`, una comprobación determinista para verificar que una skill concreta fue cargada.

La evaluación puede hacerse en dos momentos. Strands Evals trabaja con casos de prueba y trayectorias durante desarrollo y CI, y permite bloquear un build cuando falla una regresión. AgentCore Evaluations opera directamente sobre trazas OpenTelemetry y puede ejecutarse bajo demanda, por lotes o de forma continua sobre una muestra del tráfico de producción.

La extracción reconoce invocaciones procedentes de `SKILL.md` y de varios harnesses, entre ellos Strands AgentSkills, Claude Code, Claude Agent SDK, OpenAI Agents SDK, Codex, Gemini CLI, OpenHands y Google ADK. En AgentCore, los resultados incluyen los identificadores de sesión, trace y span de la invocación evaluada.

Para sistemas con catálogos crecientes de skills, separar routing de ejecución hace las regresiones más diagnosticables: una caída en selección apunta a descripciones solapadas o ambiguas, mientras una caída en seguimiento señala problemas en las instrucciones o en la capacidad del modelo. Es una pieza especialmente útil para convertir skills reutilizables en comportamiento verificable antes y después del despliegue.
