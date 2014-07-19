package spring.db.tables.classes;

/**
 * Seeds类定义
 * @author ZhongJie
 * @创建时间:2014-05-29
 * @修改时间:2014-05-29	
 */
public class Seeds {

	//类成员，与表对应
	private int id;
	private int taskId;
	private String url;
	
	/*构造函数*/
	public Seeds(){
		
	}
	public Seeds(int id,int taskId,String url){
		this.setId(id);
		this.setTaskId(taskId);
		this.setUrl(url);
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public int getTaskId() {
		return taskId;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl() {
		return url;
	}
	
}
