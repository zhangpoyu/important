package three;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Queue {
	//创建未访问url的集合
	public LinkedList<String> visitUrl = new LinkedList<>();
	//创建已访问的url的集合
	public Set<String> visitedUrl = new HashSet<>();
	/**
	 * 构造函数，初始化队列
	 * @param urls
	 */
	public Queue(LinkedList<String> urls) {
		visitUrl.addAll(urls);
	}
	/**
	 * 将从网页中提取出来的url存入未访问url集合中
	 * 并在未访问集合中进行查找是否已经存在，若不存在加入，否则
	 * @param url
	 */
	public void addVisitUrl(String url) {
		if (!visitUrl.contains(url)&&!visitedUrl.contains(url)) {
			visitUrl.add(url);
		}
		
	}
	/**
	 * 将提取的url集合加入未访问url集合中
	 * @param urls
	 */
	public void addVisitUrl(LinkedList<String> urls) {
		if (!urls.isEmpty()||urls!=null) {
			for (String url : urls) {
				if (!visitUrl.contains(url)&&!visitedUrl.contains(url)) {
					visitUrl.add(url);
				}
			}
		}
		
	}
	/**
	 * 返回URL的队头URL并将其删除未访问URL队列
	 * @return
	 */
	public String getUrl() {
		if(!visitUrl.isEmpty()) {
			return visitUrl.poll();
		}
		return null;
	}
	/**
	 * 已访问url集合中是否已经将要访问的url
	 * @param url
	 * @return
	 */
	public boolean isVisitedUrl(String url) {
		if (visitedUrl.contains(url)) {
			return false;
		}
		return true;
	}
	/**
	 * 将已访问的url加入到已访问url集合中
	 * @param url
	 */
	public void addVisitedUrl(String url) {
		if (!visitedUrl.contains(url)) {
			visitedUrl.add(url);
		}
	}
	/**
	 * 返回未访问集合中是否为空
	 * @return
	 */
	public boolean isEmpty() {
		return visitUrl.isEmpty();
	}
}
