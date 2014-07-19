package spring.db.tables.classes;

/**
 * ParseFunction类定义
 * @author ZhongJie
 * @创建时间:2014-05-29
 * @修改时间:2014-05-29	
 */
public class ParseFunction {

	//类成员，与表对应
	private int id;
	private int cssPathId;
	private String parseExpression;
	private String tableName;
	private String fieldName;
	private String fieldDescription;
	
	/*构造函数*/
	public ParseFunction(){
		
	}
	public ParseFunction(int id,int cssPathId,String parseExpression
			,String tableName,String fieldName,String fieldDescription){
		this.setId(id);
		this.setCssPathId(cssPathId);
		this.setParseExpression(parseExpression);
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
	
	public void setCssPathId(int cssPathId) {
		this.cssPathId = cssPathId;
	}
	public int getCssPathId() {
		return cssPathId;
	}
	
	public void setParseExpression(String parseExpression) {
		this.parseExpression = parseExpression;
	}
	public String getParseExpression() {
		return parseExpression;
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
