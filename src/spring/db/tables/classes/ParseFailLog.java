package spring.db.tables.classes;

import java.io.Serializable;

/**
 * ParseFailLog类定义
 * @author ZhongJie
 * @创建时间:2014-05-29
 * @修改时间:2014-05-29	
 */
public class ParseFailLog implements Serializable{

	//类成员，与表对应
	private int id;
	private String url;
	private String cssPath;
	private String fieldName;
	
	/*构造函数*/
	public ParseFailLog(){
		
	}
	public ParseFailLog(int id,String url,String cssPath,String fieldName){
		this.setId(id);
		this.setUrl(url);
		this.setCssPath(cssPath);
		this.setFieldName(fieldName);
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl() {
		return url;
	}
	
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public String getFieldName() {
		return fieldName;
	}
	
	public void setCssPath(String cssPath) {
		this.cssPath = cssPath;
	}
	public String getCssPath() {
		return cssPath;
	}
	
	public String toString(){
		return "id:" + id + "\t fieldName:" + fieldName + "\t cssPath:" + cssPath + "\t url: " + url;
	}
}
