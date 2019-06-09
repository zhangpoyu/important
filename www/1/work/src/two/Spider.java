package two;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Spider {
	private static Queue<String> queue= new Queue<>();
	@SuppressWarnings("finally")
	/**
	 * 提出请求，爬取网页
	 * @param string
	 * @return 返回网页资源
	 * @throws IOException
	 */
	public String crawl(String string) throws IOException {
		CloseableHttpClient hClient= HttpClients.createDefault();
		HttpGet get = new HttpGet(string);
		CloseableHttpResponse cResponse = null;
		String html = null;
		try {
			//执行GET请求，并接受返回的网页资源
			cResponse = hClient.execute(get);
			HttpEntity httpEntity = cResponse.getEntity();
			html = EntityUtils.toString(httpEntity, "utf-8");
			EntityUtils.consume(httpEntity);
		} catch (Exception e) {
			System.out.println("error!");
		} finally {
			cResponse.close();
			hClient.close();
			return html;
		}
	}
	

	/**
	 * 解析网页，从网页中提取URL,并将其存入队列中
	 * @param html
	 */
	public Queue<String> urlDetector(String html) {
		if (html!=null||html!="") {
			Document document = Jsoup.parseBodyFragment(html);
			System.out.println("提取的URL：");
			try {
				//筛选提取<a href="">元素标签
				Elements elements = document.select("a[href]");
				for (Element element : elements) {
					//提取<a href="">里href的属性内容
					String url = element.attr("href");
					//提出的url存入队列中
					queue.enQueue((url));
				}
			} catch (Exception e) {
				System.out.println("urlDetect error!");
			}
		}
		return queue;
	}
	
	public static void main(String[] args) throws IOException {
		Spider spider = new Spider();
		String string = "https://book.douban.com/tag/web?start=20&type=T";
		String html = spider.crawl(string);
		Queue<String> queues = spider.urlDetector(html);
		//若队列不为空，则删除并输出队头元素
		while (!queues.isEmpty()) {
			System.out.println(queues.deQueue());
		}
	}

}
