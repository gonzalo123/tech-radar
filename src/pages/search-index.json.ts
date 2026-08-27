import { published, slug } from '../lib/news';
export async function GET() { const items=await published(); return new Response(JSON.stringify(items.map(({data,id})=>({title:data.title,description:data.description,date:data.date.toISOString(),category:data.category,tags:data.tags,source:data.source,url:`news/${slug({id,data} as any)}/`}))),{headers:{'Content-Type':'application/json'}}); }
