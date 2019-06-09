package three;

import java.io.IOException;
import java.util.LinkedList;

import org.htmlparser.util.ParserException;

public class Spider {
	//定义一个队列
	private static Queue queue;
	/**
	 * 构造函数，将url种子加入队列，进行初始化。
	 */
	public Spider() {
//		string = "https://book.douban.com/tag/web?start=20&type=T";
		LinkedList<String> lists = new LinkedList<>();
		lists.add("http://www.baidu.com");
		lists.add("https://book.douban.com/tag/web?start=20&type=T");
		lists.add("https://book.douban.com/tag/web?start=40&type=T");
		lists.add("https://book.douban.com/tag/web?start=60&type=T");
		queue = new Queue(lists);
	}
	public static void main(String[] args)  {
		Spider spider = new Spider();
		//如果队列不为空，则执行以下步骤
		while (!queue.isEmpty()) {
			//返回队头元素
			String url = queue.getUrl();
//			System.out.println("test: "+url);
			//如果未访问url集合中不包含url，则执行以下步骤
			if (queue.isVisitedUrl(url)) {
				String html=null;
				try {
					html = HttpClientTool.crawl(url);
				} catch (IOException e) {
					System.out.println("httpclient无法处理该url。");
				}
				//判断该html是否为空
				if(html!=null) {
					LinkedList<String> urls = null;
					try {
						urls = HtmlParserTool.hParser(html);
					} catch (ParserException e) {
						System.out.println("htmlparser无法解析该 "+url+" ,请求的资源。");
					}
					//如果提取出来的urls集合不为空，则将其加入未访问url集合中。
					if (urls != null) {
						queue.addVisitUrl(urls);
					}
				}
				//将访问过的url集合加入到已访问url集合中
				queue.addVisitedUrl(url);
				System.out.println("处理完成");
			}
		}
	}
}
