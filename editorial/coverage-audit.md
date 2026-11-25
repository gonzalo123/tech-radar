# Coverage audit

This file records the weekly coverage audit required by `CONTRIBUTING.md`.

Keep entries concise. The purpose is to preserve important misses, deliberate rejections and process improvements, not to create a second newspaper.

---

## 2026-09-22

### Miss identified

**Jev / TypeSafe AI** was not detected when it launched on 2026-09-15. Its significance became clearer after Vercel reported unusually rapid adoption through AI Gateway.

### Action taken

- Published the Jev story as a recovered lead story.
- Added an explicit emerging-model discovery pass.
- Added a seven-day second-chance review.
- Added a persistent candidate backlog for promising but not-yet-publishable stories.
- Added a temporary watchlist for newly discovered vendors, models and tools.
- Added this weekly coverage audit as a recurring editorial safety net.

### Editorial lesson

Discovery must not depend only on known vendors. Cross-vendor adoption signals and retrospective coverage checks are necessary to detect important new entrants.

---

## 2026-10-01

### Coverage reviewed

Compared the previous seven days against major AI, agent, developer-tool and production-AI developments from primary sources and broad cross-vendor discovery.

### Result

No material uncovered gap remained after today's edition. Gemini 4 Argon was published as the current lead story. Recent major developments already covered include OpenAI Dots, GPT-6.1 Sol, Claude Sonnet 5.5, Grok 4.7 on Bedrock, Strands Harness, Claude Marketplace, OpenAI agent-stack changes and NVIDIA Open Agent Safety Platform.

### Conscious rejections

- **Meta Enterprise Platform**: strategically notable, but the announcement currently contains too little concrete technical or product detail to justify a standalone Tech Radar story.
- **ThinkingCap-Qwen3.8-27B**: rechecked; still lacks independent evaluation or meaningful ecosystem adoption, so it remains in the candidate backlog.
- **TypeSafe AI / Jev**: watchlist checked; no stronger signal than the already-covered goose 1.52 integration.

### Editorial lesson

The second-chance and coverage-audit passes are currently catching the main cross-vendor stories; no process change is required this week.

---

## 2026-10-08

### Cobertura revisada

Se compararon los anuncios de la última semana con las noticias existentes. Se identificaron huecos sobre la marca de agua textGrain de OpenAI (5 de octubre), la beta abierta de Cloudflare Artifacts (1 de octubre) y los anuncios del 7 de octubre: Claude Haiku 5.5, Microsoft Execution Containers y la nueva detección contextual de secretos de GitHub.

### Resultado y limitación

Las fuentes originales se verificaron y se prepararon los artículos, pero las llamadas de creación mediante GitHub Contents API devolvieron el bloqueo: "This tool call was blocked by OpenAI's safety checks. Please double check what you are sending." Ninguno de los artículos pudo confirmarse en main. No se atribuye el fallo a GitHub ni al build.

### Criterio editorial

Se priorizaron cambios con disponibilidad y consecuencias prácticas. Se descartaron anuncios de hardware, noticias financieras y tutoriales sin nuevas capacidades.

---

## 2026-11-18

### Cobertura revisada

Se contrastaron las novedades del 11 al 17 de noviembre en fuentes oficiales de OpenAI, Anthropic, AWS y GitHub, con una búsqueda transversal de modelos emergentes y revisión de las ediciones recientes. Se revisaron los candidatos antiguos ThinkingCap y Jev Router: sus ventanas de seguimiento terminaron en octubre sin nuevas pruebas suficientes en esta revisión. Las entradas temporales de la watchlist también habían caducado; no se identificó una nueva entidad con señales suficientes para añadirla.

### Resultado

Se recuperó la capacidad de búsqueda tabular de Amazon Bedrock Managed Knowledge Base, descrita por AWS el 16 de noviembre y no cubierta en las ediciones recientes. Se publicó el 18 de noviembre. Las noticias sobre Qwen4-Max, Claude Managed Agents, SGLang y Gemini Decision 1 ya estaban cubiertas.

### Descartes

- OpenAI y NATO (17 de noviembre): colaboración significativa para defensa cibernética, pero sin nueva API o capacidad técnica general para desarrolladores detallada en el anuncio.
- Tutoriales y casos de cliente de AWS sobre AgentCore, migración de mainframes y guardrails: útiles como referencias, pero sin un lanzamiento adicional suficientemente diferenciado.
- Modelos emergentes encontrados en el rastreo transversal: sin evidencia nueva de adopción o rendimiento que justifique publicar solo por su aparición.

### Lección editorial

Revisar novedades de servicios AWS publicadas entre ediciones permite detectar capacidades concretas que no aparecen en los anuncios de modelos. Mantener la distinción entre nuevas funciones y tutoriales evita inflar la edición.

---

## 2026-11-25

### Cobertura revisada

Se comparó la cobertura del 18 al 24 de noviembre con búsquedas transversales de modelos y fuentes oficiales de IA y herramientas. GPT-6.2 Astra y Sol, GLM-5.4, Inkling 2 Mini, Hy4 y Strands Decider v2 ya estaban cubiertos. Recursive Flint también tenía cobertura anterior. No hay candidatos ni entradas temporales de seguimiento vigentes.

### Resultado

Se publicaron Bonsai 2.5 27B y la ampliación de CloudFormation, anunciados el 24 de noviembre. La ficha de pesos de Bonsai confirma la disponibilidad, pero sus resultados de calidad siguen siendo evaluaciones del fabricante.

### Descartes y limitaciones

- Daybreak Red en bedrock-runtime: acceso restringido a clientes elegibles de GovCloud estadounidense.
- OpenSearch Serverless en Ciudad del Cabo: ampliación regional.
- Cambios de notificaciones de GitHub: mejora operativa menor.
- La búsqueda retrospectiva no es exhaustiva; no se identificó otro hueco suficientemente verificado.

### Lección editorial

Mantener la búsqueda transversal de modelos comprimidos y contrastar los anuncios con las fichas de pesos descargables, distinguiendo tamaño de pesos de memoria total de ejecución.
