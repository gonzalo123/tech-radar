# Contributing to Tech Radar

Tech Radar is a curated technology newspaper.

Its goal is not to collect as many links as possible. Its goal is to identify a small number of developments worth knowing about and explain them quickly, accurately, and without clickbait.

The expected reader should be able to understand the essential facts of each story without opening the original article. The original source must always remain available for readers who want the full context.

This document defines the editorial, research, writing, and publishing process.

---

# 1. Editorial mission

Tech Radar is primarily an AI bulletin. The main objective is to help the reader stay current on the models, products, tools and practices that are changing how software is built and operated.

Tech Radar prioritizes developments related to:

* Artificial intelligence
* New foundation and reasoning models from OpenAI, Anthropic, xAI/Grok, Google, Meta, Mistral and important Chinese AI labs and vendors
* Model releases, availability, context windows, multimodality, tool use, fine-tuning, pricing and materially relevant evaluations
* AI agents
* Claude Code
* Codex
* GitHub Copilot
* OpenCode
* Amazon Bedrock
* AWS
* Strands Agents
* MCP
* Agent skills
* New tools, CLIs, SDKs, plugins and developer products for working with AI
* New skills, skill marketplaces and reusable agent capabilities
* Methodologies for prompting, planning, evaluation, context engineering, coding agents and human-in-the-loop workflows
* Planning and execution workflows
* Python
* Python backends
* React
* Tailwind CSS
* Docker
* Observability
* Production AI systems
* LLM cost control
* Enterprise AI and AWS environments
* Developer tooling

Coverage is ordered by importance. AI and model news comes first; tools, skills and methodologies come next; AWS and production infrastructure follow; general development news is included when it has clear practical value, with special attention to Python and Python backends.

The publication is deliberately curated.

Do not attempt to provide exhaustive coverage.

A good edition containing 5 important stories is better than one containing 25 marginal stories.

---

# 2. What deserves publication

Prefer developments with clear practical consequences.

Examples:

* a significant new product capability;
* a meaningful model release or capability change from OpenAI, Anthropic, xAI/Grok or another major provider;
* a relevant release from Chinese model providers or open-model projects;
* an important API or platform change;
* a new model or tool that changes existing development workflows;
* a new AI tool, skill, CLI, SDK or methodology that a developer can apply;
* meaningful changes in pricing or limits;
* important security issues;
* new capabilities for production agents;
* significant changes in Claude Code, Codex or Copilot workflows;
* new AWS or Bedrock functionality;
* meaningful developments around MCP, skills or agent orchestration;
* major Python or Python ecosystem changes, especially those affecting backends, packaging, runtimes, APIs or AI applications;
* important React, Docker or infrastructure changes;
* changes affecting observability, security, performance or cost;
* developments that enable a useful new proof of concept.

Avoid publishing:

* minor patch releases;
* routine version bumps;
* marketing announcements without concrete technical implications;
* vague corporate AI announcements;
* funding news unless technically relevant;
* rumours;
* speculative stories without reliable evidence;
* duplicated announcements;
* repetitive coverage of an already published story;
* benchmark stories without meaningful practical implications;
* introductory tutorials;
* generic opinion pieces;
* stories whose only interesting aspect is a provocative headline.

---

# 3. Research window

For a scheduled edition, primarily research developments published since the previous run.

Normally this means approximately the previous 24 hours.

When necessary, extend the search window to several days for developments that:

* were missed previously;
* became important after additional information appeared;
* received an important follow-up;
* were initially announced without sufficient details.

Publication date and event date are not necessarily the same.

Always determine when the actual event happened.

---

# 4. Research process

Research broadly before selecting stories.

Do not generate articles from search-result snippets alone.

For every candidate story:

1. Discover the development.
2. Locate the best available source.
3. Read the source.
4. Determine what actually happened.
5. Check whether Tech Radar has already covered it.
6. Assess its relevance.
7. Verify important claims when necessary.
8. Decide whether to publish it.
9. Only then write the Tech Radar summary.

Research and writing are separate steps.

---

# 5. Source hierarchy

Prefer primary sources whenever possible.

Typical high-quality primary sources include:

* official documentation;
* official release notes;
* official changelogs;
* vendor engineering blogs;
* GitHub releases;
* GitHub repositories;
* official product announcements;
* standards bodies;
* project maintainers.

Examples include sources from:

* OpenAI
* Anthropic
* GitHub
* AWS
* Python
* Docker
* React
* Tailwind CSS

Secondary sources may be useful for discovery or context, including:

* reputable technology publications;
* technical blogs;
* Hacker News discussions;
* specialist newsletters.

Whenever a secondary article reports an announcement that has an accessible primary source, prefer linking to the primary source.

Do not treat social media posts, reposts, summaries or search snippets as sufficient evidence for important claims unless they are themselves the original announcement.

---

# 6. Verification

Every published claim must be traceable to reliable source material.

Never invent:

* names;
* dates;
* prices;
* limits;
* benchmark results;
* availability;
* regions;
* product capabilities;
* technical consequences.

Distinguish carefully between:

* generally available;
* preview;
* beta;
* experimental;
* announced;
* planned;
* rumoured.

Do not turn an announcement into a stronger claim than the source supports.

For important or surprising claims, look for independent confirmation or additional primary documentation.

If reliable information is insufficient, do not publish the story.

---

# 7. Duplicate detection

Before publishing a story, inspect existing content in:

`src/content/news/`

Check for:

* the same announcement;
* the same product release;
* the same GitHub release;
* different articles reporting the same underlying event;
* follow-up reporting without meaningful new information.

Do not publish duplicates.

A new article about an existing story is justified only when there is a meaningful development.

Examples:

* a preview becomes generally available;
* pricing is announced;
* important technical details appear;
* a security problem is discovered;
* AWS regional availability changes substantially;
* a previously announced feature actually ships.

---

# 8. Editorial relevance

Evaluate candidates primarily according to:

1. relevance;
2. practical impact;
3. novelty;
4. source reliability;
5. applicability.

A useful mental model is:

| Criterion               | Score |
| ----------------------- | ----: |
| Relevance to Tech Radar |   0–5 |
| Practical impact        |   0–5 |
| Novelty                 |   0–5 |
| Source reliability      |   0–5 |
| Applicability           |   0–5 |

The score is guidance rather than a mechanical rule.

As a rough threshold:

* below 12: normally reject;
* 12–15: publish only if there is a specific reason;
* 16–20: good candidate;
* 21–25: strong candidate for prominent placement.

Do not include these scores in the published article.

---

# 9. Writing philosophy

Tech Radar follows traditional news-writing principles.

The objective is to tell the reader what happened as efficiently as possible.

The article must not imitate the structure of the source.

In particular, remove:

* clickbait;
* suspense;
* teasers;
* artificial curiosity gaps;
* filler;
* repeated information;
* promotional language;
* unnecessary background;
* inflated claims;
* calls to action;
* SEO-oriented wording.

Use the inverted pyramid:

**most important information first.**

Then add supporting details and context in decreasing order of importance.

---

# 10. Headline

Write a new headline.

Do not copy a clickbait headline merely because it is the source headline.

The Tech Radar headline should communicate the actual development.

Prefer:

> Bedrock adds native support for X

over:

> AWS just made a huge change developers need to know about

Prefer:

> Python 3.x introduces X

over:

> Python developers are going to love this new feature

Headlines should be:

* factual;
* specific;
* short;
* neutral;
* informative.

Avoid:

* questions;
* exaggerated adjectives;
* vague pronouns;
* artificial suspense;
* "you won't believe";
* "game changer";
* "everything changes";
* "finally";
* "massive";
* "revolutionary";

unless such wording is part of a factual quotation whose inclusion is genuinely necessary.

---

# 11. Lead paragraph

Start with a concise lead explaining the core news.

Whenever the source provides the information, answer the traditional journalistic questions:

* Who?
* What?
* When?
* Where?
* Why?
* How?

Not every story needs all six.

Do not force missing information into the lead.

The first paragraph should normally be enough for a reader to decide whether they need to continue reading.

---

# 12. Article body

After the lead, provide only the context necessary to understand the development.

Use short paragraphs.

Prefer concrete technical consequences over corporate messaging.

When appropriate, explain:

* what changed;
* what existed before;
* who is affected;
* availability;
* technical constraints;
* pricing implications;
* migration implications;
* operational implications.

The article should normally be significantly shorter than the source.

This is a summary, not a rewrite of every paragraph.

---

# 13. Practical relevance

When genuinely useful, explain the practical implication of the news.

Examples:

* whether it simplifies an agent architecture;
* whether it removes the need for an existing workaround;
* whether it changes deployment options;
* whether it affects cost;
* whether it improves observability;
* whether it enables an interesting POC;
* whether it changes how Claude Code, Codex or Copilot can be used;
* whether it affects Python backend architectures.

Separate facts from interpretation.

Do not present speculation as fact.

Phrases such as these are acceptable when necessary:

* "In practice, this means..."
* "For teams using..."
* "This could make it possible to..."
* "A useful experiment would be..."

Use them sparingly.

The article remains news first, analysis second.

---

# 14. Tone

Use a neutral, factual and concise tone.

Write for technically literate readers.

Do not sound like:

* marketing copy;
* a press release;
* an influencer;
* a corporate communications department;
* an SEO content farm.

Avoid unnecessary enthusiasm.

Do not praise vendors.

Do not criticise them without factual grounds.

Prefer precision over excitement.

---

# 15. Attribution and source

Every article must link to its original source.

The Tech Radar article is a summary and must never pretend to be the original reporting.

Use the `source` field for the source name and `source_url` for the canonical URL.

Whenever possible, use the primary source as `source_url`.

If the story depends substantially on reporting from a secondary publication, link to that reporting instead.

Do not remove attribution.

---

# 16. Copyright and summarisation

Do not reproduce the original article.

Summarise facts in original language.

Avoid copying:

* paragraphs;
* distinctive phrasing;
* long quotations;
* proprietary diagrams;
* tables;
* screenshots.

Use quotations only when the precise wording itself is newsworthy and keep them brief.

The Tech Radar article must remain an original factual summary pointing readers to the original source.

---

# 17. Article format

News articles live in:

`src/content/news/`

Each story is a Markdown file with Astro frontmatter.

The current content schema supports:

```yaml
---
title: "Direct factual headline"
description: "One-sentence summary of the story"
date: 2026-08-27

source: "AWS"
source_url: "https://..."

category: "AWS"

tags:
  - bedrock
  - agents

featured: false
priority: 0
placement: normal
breaking: false
draft: false

generated_by: "ChatGPT"
generated_at: 2026-08-27T08:00:00+02:00
---
```

Follow the repository schema exactly.

Do not introduce new frontmatter properties without updating the Astro content schema.

---

# 18. Categories and tags

Prefer a small, stable category taxonomy.

Suitable categories include:

* AI
* AWS
* Python
* JavaScript
* React
* Infrastructure
* DevTools
* Security

Use tags for more specific concepts:

* claude-code
* codex
* copilot
* bedrock
* strands-agents
* mcp
* skills
* agents
* observability
* docker
* tailwind

Reuse existing tags whenever possible instead of creating synonymous variants.

For example, do not alternate arbitrarily between:

* `claude`
* `claude_code`
* `claude-code`

Choose one canonical form.

---

# 19. Placement

Use editorial placement deliberately.

## `lead`

The most important story of the edition.

Normally there should be only one lead story.

## `secondary`

Important stories that deserve prominent placement.

## `normal`

Standard published stories.

## `brief`

Interesting developments that do not justify a full prominent story.

Do not mark everything as important.

Scarcity gives editorial hierarchy meaning.

---

# 20. Featured stories

Set:

```yaml
featured: true
```

only for unusually significant stories.

A story being recent does not make it featured.

---

# 21. Breaking news

Use:

```yaml
breaking: true
```

very rarely.

A scheduled technology publication normally does not need breaking-news semantics.

Reserve it for genuinely time-sensitive developments.

---

# 22. Images

Images are optional.

Do not delay publication because no suitable image exists.

If an image is used:

* prefer official assets;
* ensure its use is appropriate;
* avoid generic stock photography;
* avoid misleading illustrations;
* do not use an image simply because a story "needs a picture".

The information is more important than decoration.

---

# 23. Final editorial check

Before publishing each article, verify:

* Is this actually news?
* Is it relevant to Tech Radar?
* Has it already been published?
* Did I read the actual source?
* Is the linked source the best available source?
* Does every factual claim appear in reliable source material?
* Does the headline say what happened?
* Does the first paragraph contain the essential news?
* Did I remove clickbait and artificial suspense?
* Did I remove marketing language?
* Is the summary materially shorter than the source?
* Have I clearly separated facts from interpretation?
* Could the reader understand the core story without following the link?
* Would following the source still provide useful additional context?

If any important answer is "no", revise or reject the story.

---

# 24. Edition-level check

Before publishing an edition:

* prefer quality over quantity;
* remove duplicated stories;
* avoid having multiple articles about effectively the same announcement;
* ensure the lead really is the strongest story;
* maintain a useful mix of topics when the news cycle allows it;
* do not manufacture category diversity by publishing weak stories.

It is acceptable to publish very few stories on a quiet day.

It is also acceptable to publish nothing.

"No relevant news today" is better than filler.

---

# 25. Validation

Before committing content, run:

```bash
npm ci
npm run build
```

The build must succeed.

Do not publish Markdown that violates the Astro content schema.

---

# 26. Publishing workflow

Content is published through Git.

Recommended automated workflow:

```text
Research
    ↓
Candidate discovery
    ↓
Primary-source verification
    ↓
Duplicate detection
    ↓
Editorial selection
    ↓
Write Markdown
    ↓
Validate Astro build
    ↓
Commit
    ↓
Push to main
    ↓
GitHub Actions
    ↓
GitHub Pages
```

The repository's GitHub Actions workflow automatically builds and deploys the site when changes reach `main`.

Do not manually edit the generated `dist/` directory.

---

# 27. Commit conventions

Automated editions should use clear commit messages.

For example:

```text
news: publish 2026-08-27 edition
```

For an isolated story:

```text
news: add Bedrock agent runtime update
```

Avoid meaningless messages such as:

```text
update
changes
news
```

---

# 28. Failure policy

Automation must fail safely.

Do not publish when:

* source verification fails;
* the original article cannot be read reliably;
* important facts conflict between sources;
* the Astro build fails;
* the source URL is invalid;
* the article appears to duplicate an existing story;
* there is insufficient information to produce a reliable summary.

Publishing fewer stories is preferable to publishing uncertain information.

---

# 29. Rules for automated agents

An automated contributor must treat this file as its editorial contract.

The agent must:

1. research before writing;
2. prefer primary sources;
3. inspect existing stories before publishing;
4. verify factual claims;
5. reject weak stories;
6. rewrite clickbait headlines;
7. summarise rather than reproduce source material;
8. preserve attribution;
9. validate the generated content;
10. publish only when the repository remains buildable.

Do not optimise for article count.

Optimise for:

**signal, accuracy, clarity and practical relevance.**

---

# 30. Definition of done

A Tech Radar update is complete when:

1. relevant recent developments have been researched;
2. weak candidates have been discarded;
3. selected stories have reliable sources;
4. duplicates have been removed;
5. every article follows the editorial rules;
6. every article links to its source;
7. frontmatter validates against the Astro schema;
8. `npm run build` succeeds;
9. changes are committed;
10. changes reach `main`;
11. the GitHub Pages deployment succeeds.

The objective is not to produce content.

The objective is to produce a small amount of useful journalism.

# 31. Language and style

Write in clear, concise, and grammatically correct Spanish.
