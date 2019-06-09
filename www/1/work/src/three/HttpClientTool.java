package three;

import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class HttpClientTool {
	@SuppressWarnings("finally")
	/**
	 * 提出请求，爬取网页
	 * @param string
	 * @return 返回网页资源
	 * @throws IOException
	 */
	public static String crawl(String string) throws IOException {
		System.out.println("请求处理："+string);    //输出要处理的URL
		java.net.URLEncoder.encode(string,"utf-8");   //对URL进行字符编码处理，防止出现URL中出现中文无法进行请求
		CloseableHttpClient hClient= HttpClients.createDefault();
		HttpGet get = new HttpGet(string);
		CloseableHttpResponse cResponse = null;
		String html = null;
		try {
			//执行GET请求，并接受返回的网页资源
			cResponse = hClient.execute(get);
			StatusLine statusLine = cResponse.getStatusLine();
//			System.out.println(statusLine);
			if (statusLine.getStatusCode()==200) {
				HttpEntity httpEntity = cResponse.getEntity();
				html = EntityUtils.toString(httpEntity, "utf-8");
				EntityUtils.consume(httpEntity);
			}else {
				return null;
			}
		} catch (Exception e) {
			System.out.println("url:"+string+"  出现错误，无法请求");
			
		} finally {
//			cResponse.close();
//			System.out.println("处理完成");
			hClient.close();
			return html;
		}
	}
//	public static void main(String[] args) throws IOException {
//		HttpClientTool spider = new HttpClientTool();
//		System.out.println(spider.crawl("https://book.douban.com/tag/web?start=20&type=T"));
//	}

}
