import { getCollection, type CollectionEntry } from 'astro:content';
export type NewsEntry = CollectionEntry<'news'>;
export const published = async () => (await getCollection('news', ({ data }) => !data.draft)).sort((a,b) => b.data.date.valueOf() - a.data.date.valueOf());
export const slug = (entry: NewsEntry) => entry.id.replace(/\.md$/, '');
export const categories = (items: NewsEntry[]) => [...new Set(items.map(x => x.data.category))].sort();
export const tags = (items: NewsEntry[]) => [...new Set(items.flatMap(x => x.data.tags))].sort();
export const related = (item: NewsEntry, items: NewsEntry[]) => items.filter(x => x.id !== item.id).map(x => ({ x, score: (x.data.category === item.data.category ? 3 : 0) + x.data.tags.filter(t => item.data.tags.includes(t)).length })).filter(x => x.score).sort((a,b) => b.score-a.score).slice(0,3).map(x => x.x);
export const editorialOrder = (items: NewsEntry[]) => [...items].sort((a,b) => (b.data.priority-a.data.priority) || (b.data.date.valueOf()-a.data.date.valueOf()));
export const frontPageOrder = (items: NewsEntry[], days = 3, now = new Date()) => {
  const today = Date.UTC(now.getUTCFullYear(), now.getUTCMonth(), now.getUTCDate());
  const cutoff = today - days * 24 * 60 * 60 * 1000;
  const ordered = editorialOrder(items);
  const recent = ordered.filter(item => {
    const date = item.data.date.valueOf();
    return date >= cutoff && date <= today;
  });
  const recentIds = new Set(recent.map(item => item.id));

  return {
    recent,
    ordered: [...recent, ...ordered.filter(item => !recentIds.has(item.id))]
  };
};
// Grupo del día de publicación más reciente. La portada comprueba en cliente
// si coincide con el día actual antes de mostrarlo.
export const latestPublishDate = (items: NewsEntry[]) => new Date(Math.max(...items.map(x => x.data.date.valueOf())));
export const todayItems = (items: NewsEntry[]) => {
  const latest = latestPublishDate(items).toDateString();
  return items.filter(x => x.data.date.toDateString() === latest).sort((a,b) => b.data.priority-a.data.priority);
};
