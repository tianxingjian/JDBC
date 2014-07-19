package spring.db.tables.classes;

/**
 * CssPath类定义
 * @author ZhongJie
 * @创建时间:2014-05-29
 * @修改时间:2014-05-29	
 */
public class CssPath {
	
	//类成员，与表对应
	private int id;
	private int urlPatternId;
	private String cssPath;
	private String tableName;
	private String fieldName;
	private String fieldDescription;
	
	/*构造函数*/
	public CssPath(){
		
	}
	public CssPath(int id,int urlPatternId,String cssPath
			,String tableName,String fieldName,String fieldDescription){
		this.setId(id);
		this.setUrlPatternId(urlPatternId);
		this.setTableName(tableName);
		this.setFieldName(fieldName);
		this.setFieldDescription(fieldDescription);
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public void setUrlPatternId(int urlPatternId) {
		this.urlPatternId = urlPatternId;
	}
	public int getUrlPatternId() {
		return urlPatternId;
	}
	
	public void setCssPath(String cssPath) {
		this.cssPath = cssPath;
	}
	public String getCssPath() {
		return cssPath;
	}
	
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getTableName() {
		return tableName;
	}
	
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public String getFieldName() {
		return fieldName;
	}
	
	public void setFieldDescription(String fieldDescription) {
		this.fieldDescription = fieldDescription;
	}
	public String getFieldDescription() {
		return fieldDescription;
	}
	
	
}
