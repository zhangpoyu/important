package three;

import org.htmlparser.Node;
import org.htmlparser.Parser;
import org.htmlparser.filters.TagNameFilter;
import org.htmlparser.tags.LinkTag;
import org.htmlparser.util.NodeList;
import org.htmlparser.util.ParserException;

import java.util.LinkedList;

public class HtmlParserTool {
	public static LinkedList<String> hParser(String html) throws ParserException {
		//如果html不为null则执行以下步骤，否则返回null
		if (html!=null) {
			//构建htmlParser对象
			Parser parser = new Parser(html);
			parser.setEncoding("utf-8");
			LinkedList<String> url = new LinkedList<>();
			//筛选<a>标签
			TagNameFilter linkFilter = new TagNameFilter("a");
			//将符合筛选条件的标签提取出来，并存入Nodelist对象中
			NodeList nodes = parser.extractAllNodesThatMatch(linkFilter);
			for(int i = 0;i < nodes.size(); i++) {
				Node node = (Node)nodes.elementAt(i);
				//如果节点为链接标签，提取并存入linkedList集合中
				if(node instanceof LinkTag) {
					LinkTag linkTag = (LinkTag) node;
					String link = linkTag.getLink();
					if (link.startsWith("http")) {
//						System.out.println(link.trim());
						url.add(link);
					}
				}
			}
			return url;
		}
		return null;
	}
}

//	public static void main(String[] args)  {
//		HttpClientTool spider = new HttpClientTool();
//		String html = null;
//		try {
//			html = spider.crawl("https://www.douban.com/doubanapp/redirect?channel=top-nav&direct_dl=1&download=Android");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("html:"+html);
//		if (html !=null ) {
//			HtmlParserTool hParserTool = new HtmlParserTool();
//			LinkedList<String> lists = null;
//			try {
//				lists = hParserTool.hParser(html);
//			} catch (ParserException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			int i = 0;
//			if (lists.isEmpty()) {
//				System.out.println("Empty");
//			}
//			while (!lists.isEmpty()) {
//				System.out.println(++i+","+lists.poll());
//			}
//		}
//
//	}

//}
