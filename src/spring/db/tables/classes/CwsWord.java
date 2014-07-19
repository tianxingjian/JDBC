package spring.db.tables.classes;

/**
 * CwsWord类定义
 * @author ZhongJie
 * @创建时间:2014-05-29
 * @修改时间:2014-05-29	
 */
public class CwsWord {

	//类成员，与表对应
	private int id;
	private String name;
	
	/*构造函数*/
	public CwsWord(){
		
	}
	public CwsWord(int id,String name){
		this.setId(id);
		this.setName(name);
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
