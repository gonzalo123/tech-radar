import { getCollection, type CollectionEntry } from 'astro:content';
export type NewsEntry = CollectionEntry<'news'>;
export const published = async () => (await getCollection('news', ({ data }) => !data.draft)).sort((a,b) => b.data.date.valueOf() - a.data.date.valueOf());
export const slug = (entry: NewsEntry) => entry.id.replace(/\.md$/, '');
export const categories = (items: NewsEntry[]) => [...new Set(items.map(x => x.data.category))].sort();
export const tags = (items: NewsEntry[]) => [...new Set(items.flatMap(x => x.data.tags))].sort();
export const related = (item: NewsEntry, items: NewsEntry[]) => items.filter(x => x.id !== item.id).map(x => ({ x, score: (x.data.category === item.data.category ? 3 : 0) + x.data.tags.filter(t => item.data.tags.includes(t)).length })).filter(x => x.score).sort((a,b) => b.score-a.score).slice(0,3).map(x => x.x);
export const editorialOrder = (items: NewsEntry[]) => [...items].sort((a,b) => (b.data.priority-a.data.priority) || (b.data.date.valueOf()-a.data.date.valueOf()));
