package spring.db.tables.classes;

/**
 * CwsType类定义
 * @author ZhongJie
 * @创建时间:2014-05-29
 * @修改时间:2014-05-29	
 */
public class CwsType {

	//类成员，与表对应
	private int id;
	private int parentId;
	private String name;
	
	/*构造函数*/
	public CwsType(){
		
	}
	public CwsType(int id,int parentId,String name){
		this.setId(id);
		this.setParentId(parentId);
		this.setName(name);
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public int getParentId() {
		return parentId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
