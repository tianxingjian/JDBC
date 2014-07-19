package spring.db.tables.classes;

/**
 * UrlPattern类定义
 * @author ZhongJie
 * @创建时间:2014-05-29
 * @修改时间:2014-05-29	
 */
public class UrlPattern {
	
	//类成员，与表对应
	private int id;
	private String urlPattern;
	private String firstDomain;
	private String secondDomain;
	private String thirdDomain;
	
	/*构造函数*/
	public UrlPattern(){
		
	}
	public UrlPattern(int id,String urlPattern,String firstDomain
			,String secondDomain,String thirdDomain){
		this.setId(id);
		this.setUrlPattern(urlPattern);
		this.setFirstDomain(firstDomain);
		this.setSecondDomain(secondDomain);
		this.setThirdDomain(thirdDomain);
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public void setFirstDomain(String firstDomain) {
		this.firstDomain = firstDomain;
	}
	public String getFirstDomain() {
		return firstDomain;
	}
	
	public void setUrlPattern(String urlPattern) {
		this.urlPattern = urlPattern;
	}
	public String getUrlPattern() {
		return urlPattern;
	}
	
	public void setSecondDomain(String secondDomain) {
		this.secondDomain = secondDomain;
	}
	public String getSecondDomain() {
		return secondDomain;
	}
	
	public void setThirdDomain(String thirdDomain) {
		this.thirdDomain = thirdDomain;
	}
	public String getThirdDomain() {
		return thirdDomain;
	}
}
