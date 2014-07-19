package jdbc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.db.Inter.BaseService;

/**
 * 测试类
 * @author tianxingjian
 *
 */
public class TransTest {

	private static ApplicationContext context;
	private static final String CONFIG_FILE = "bean.xml";
	private static BaseService baseService;
	
	static {
		context = new ClassPathXmlApplicationContext(CONFIG_FILE);
		baseService = (BaseService)context.getBean("baseService");
	}

	
	@Test
	public void test() throws Exception{
		System.out.println("Start:");
		this.testDelete();
//		this.testQuery();
		this.testInsert();
//		this.testInsert();
//		this.testDelete();
		System.out.println("End!");
	}

	private void testQuery() throws Exception{
			baseService.query();

	}
	
	private void testInsert() throws Exception{

			baseService.insert();
	
	}
	
	private void testDelete() throws Exception{

			baseService.delete();

	}
}
