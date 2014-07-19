package spring.db.tables.classes;

/**
 * CrawlTask类定义
 * @author ZhongJie
 * @创建时间:2014-05-29
 * @修改时间:2014-05-29	
 */
public class CrawlTask {
	
	//类成员，与表对应
	private int id;
	private String taskName;
	private int processCount;
	private int threadCount;
	private int topN;
	private int fetchSuccessfulCount;
	private int fetchFailedCount;
	private String fetchFailedStateInfo;
	private int parseSuccessfulCount;
	private int parseFailedCount;
	
	/*构造函数*/
	public CrawlTask(){
		
	}
	
	public CrawlTask(int id,String taskName,int processCount,int threadCount,
			int topN,int fetchSuccessfulCount,int fetchFailedCount,String fetchFailedStateInfo,
			int parseSuccessfulCount,int parseFailedCount){
		this.setId(id);
		this.setTaskName(taskName);
		this.setProcessCount(processCount);
		this.setThreadCount(threadCount);
		this.setTopN(topN);
		this.setFetchSuccessfulCount(fetchSuccessfulCount);
		this.setFetchFailedCount(fetchFailedCount);
		this.setFetchFailedStateInfo(fetchFailedStateInfo);
		this.setParseSuccessfulCount(parseSuccessfulCount);
		this.setParseFailedCount(parseFailedCount);
		
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getTaskName() {
		return taskName;
	}
	
	public void setProcessCount(int processCount) {
		this.processCount = processCount;
	}
	public int getProcessCount() {
		return processCount;
	}
	
	public void setThreadCount(int threadCount) {
		this.threadCount = threadCount;
	}
	public int getThreadCount() {
		return threadCount;
	}
	
	public void setTopN(int topN) {
		this.topN = topN;
	}
	public int getTopN() {
		return topN;
	}
	
	public void setFetchSuccessfulCount(int fetchSuccessfulCount) {
		this.fetchSuccessfulCount = fetchSuccessfulCount;
	}
	public int getFetchSuccessfulCount() {
		return fetchSuccessfulCount;
	}
	
	public void setFetchFailedCount(int fetchFailedCount) {
		this.fetchFailedCount = fetchFailedCount;
	}
	public int getFetchFailedCount() {
		return fetchFailedCount;
	}
	
	public void setFetchFailedStateInfo(String fetchFailedStateInfo) {
		this.fetchFailedStateInfo = fetchFailedStateInfo;
	}
	public String getFetchFailedStateInfo() {
		return fetchFailedStateInfo;
	}
	
	public void setParseSuccessfulCount(int parseSuccessfulCount) {
		this.parseSuccessfulCount = parseSuccessfulCount;
	}
	public int getParseSuccessfulCount() {
		return parseSuccessfulCount;
	}
	
	public void setParseFailedCount(int parseFailedCount) {
		this.parseFailedCount = parseFailedCount;
	}
	public int getParseFailedCount() {
		return parseFailedCount;
	}
	
	
	
}
