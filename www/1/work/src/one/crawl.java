package one;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class crawl {
	public String learnUrl(String string) throws Exception {
		URL url = new URL(string);
		//获取该URl的协议、域名、端口
		System.out.println("Protocol:"+url.getProtocol());
		System.out.println("Host:"+url.getHost());
		System.out.println("port:"+url.getPort());
		//获取该URL的相对路径与参数
		int beginIndex = string.indexOf("/",8);//获取第一个“/”字符位置
		int lastIndex = string.indexOf("?");//获取“？”字符的位置
		if (beginIndex!=-1&&lastIndex!=-1) {
			String relativePath = string.substring(beginIndex, lastIndex);
			String params = string.substring(lastIndex+1);
			System.out.println("该URL的相对路径："+relativePath);
			System.out.println("该URL的参数："+params);
		}
		
		CloseableHttpClient hClient= HttpClients.createDefault();
		HttpGet get = new HttpGet(string);
		CloseableHttpResponse cResponse = null;
		String html = null;
		try {
			cResponse = hClient.execute(get);
			HttpEntity httpEntity = cResponse.getEntity();
			html = EntityUtils.toString(httpEntity, "utf-8");
			System.out.println("********************");
			System.out.println("网页资源：");
			System.out.println(html);
			System.out.println("********************");
			EntityUtils.consume(httpEntity);
			
			//获取连接状态码
			StatusLine statusCode = cResponse.getStatusLine();
			System.out.println(statusCode);
			//获取URL的请求报头信息
//			Header[] headers = cResponse.getAllHeaders();
//			for (Header header : headers) {
//				System.out.println(header);
//			}
		} catch (Exception e) {
			System.out.println("error!");
		} finally {
			cResponse.close();
			hClient.close();
			return html;
		}
	}
	/**
	 * 解析网页，从网页中提取URL
	 * @param html
	 */
	public void urlDetector(String html) {
		if (html!=null||html!="") {
			Document document = Jsoup.parseBodyFragment(html);
			System.out.println("提取的URL：");
			try {
				Elements elements = document.select("a[href]");
				for (Element element : elements) {
					String url = element.attr("href");
					System.out.println(url);
				}
			} catch (Exception e) {
				System.out.println("urlDetect error!");
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		crawl crawl = new crawl();
		//若URL为相对路径，则在其前拼接上相应的域名即可：比如相对路径为/tag/web，拼接完成后为：https://book.douban.com/tag/web
		//该URL为绝对路径：https://book.douban.com/tag/web?start=20&type=T
		String string = "https://book.douban.com/tag/web?start=20&type=T";
		String html = crawl.learnUrl(string);
		crawl.urlDetector(html);
	}
}
