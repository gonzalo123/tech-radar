import { defineConfig } from 'astro/config';
import sitemap from '@astrojs/sitemap';

const site = process.env.SITE || 'https://example.github.io';
const base = process.env.BASE || '';

export default defineConfig({ site, base, integrations: [sitemap()] });
