import { defineConfig } from 'astro/config';
import sitemap from '@astrojs/sitemap';

const site = process.env.SITE || 'https://gonzalo123.github.io';
const base = process.env.BASE || '/tech-radarnews/';

export default defineConfig({ site, base, integrations: [sitemap()] });
