package spring.db.tables.classes;

/**
 * CwsWordType类定义
 * @author ZhongJie
 * @创建时间:2014-05-29
 * @修改时间:2014-05-29	
 */
public class CwsWordType {

	//类成员，与表对应
	private int typeId;
	private int wordId;
	
	/*构造函数*/
	public CwsWordType(){
		
	}
	public CwsWordType(int typeId,int wordId){
		this.setTypeId(typeId);
		this.setWordId(wordId);
	}
	
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public int getTypeId() {
		return typeId;
	}
	
	public void setWordId(int wordId) {
		this.wordId = wordId;
	}
	public int getWordId() {
		return wordId;
	}
}
