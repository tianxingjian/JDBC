package spring.db.Inter;

public interface BaseService {
	Object query()throws Exception;
	Integer insert()throws Exception;
	Integer delete()throws Exception;
}
