import { defineCollection, z } from 'astro:content';

const news = defineCollection({ type: 'content', schema: z.object({
  title: z.string(), description: z.string(), date: z.coerce.date(), source: z.string(),
  source_url: z.string().url(), category: z.string(), tags: z.array(z.string()).default([]),
  image: z.string().optional(), featured: z.boolean().default(false), priority: z.number().default(0),
  placement: z.enum(['lead', 'secondary', 'brief', 'normal']).default('normal'), breaking: z.boolean().default(false), draft: z.boolean().default(false),
  generated_by: z.string().optional(), generated_at: z.coerce.date().optional()
}) });
export const collections = { news };
