package spring.db.tables.classes;


/**
 * CrawlConfig类定义
 * @author ZhongJie
 * @创建时间:2014-05-29
 * @修改时间:2014-05-29	
 */
public class CrawlConfig{
	
	//类成员，与表对应
	private int id;
	private int taskId;
	private String configKey;
	private String configValue;
	
	/*构造函数*/
	public CrawlConfig(){
		
	}
	public CrawlConfig(int id,int taskId,String configKey,String configValue){
		this.setId(id);
		this.setTaskId(taskId);
		this.setConfigKey(configKey);
		this.setConfigValue(configValue);
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
	
	public void setConfigKey(String configKey) {
		this.configKey = configKey;
	}
	public String getConfigKey() {
		return configKey;
	}
	
	public void setConfigValue(String configValue) {
		this.configValue = configValue;
	}
	public String getConfigValue() {
		return configValue;
	}
	
	
	
}
