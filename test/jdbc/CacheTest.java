package jdbc;

import java.util.Random;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.db.Inter.CacheService;
import spring.db.tables.classes.ParseFailLog;

/**
 * 测试类
 * @author tianxingjian
 *
 */
public class CacheTest {

	private static ApplicationContext context;
	private static final String CONFIG_FILE = "bean.xml";
	private static CacheService cacheService;
	
	static {
		context = new ClassPathXmlApplicationContext(CONFIG_FILE);
		cacheService = (CacheService)context.getBean("cacheService");
	}

	
	@Test
	public void test() throws Exception{
		System.out.println("Start:");
		ParseFailLog log = new ParseFailLog();
		log.setFieldName("c:\\baicai");
		log.setUrl("http://localhost:80");
		log.setCssPath("c:\\baicai\\css");
		//新增操作
		ParseFailLog saveRet = cacheService.save(log);
		System.out.println(saveRet);
		//查询操作
		int id = saveRet.getId();
		ParseFailLog queryRet = cacheService.query(id);
		System.out.println(queryRet);
		//更新操作
		queryRet.setUrl("http://127.0.0.1:80");
		cacheService.update(queryRet);
		
		//更新后查询操作
		ParseFailLog afterQuery = cacheService.query(id);
		System.out.println(afterQuery);
		//删除操作
		cacheService.delete(id);
		
		//删除后查询操作
		ParseFailLog delQuery = cacheService.query(id);
		System.out.println(delQuery);
		
		System.out.println("End!");
	}

}
