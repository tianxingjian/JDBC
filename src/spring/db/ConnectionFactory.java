package spring.db;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 閲囩敤鍗曚緥妯″紡
 * 鍒╃敤spring缁熶竴绠＄悊杩炴帴鏁版嵁搴撳拰鑾峰彇鏁版嵁婧� * @author ZhongJie
 * @鍒涘缓鏃堕棿:2014-05-29
 * @淇敼鏃堕棿:2014-05-29	
 */
public class ConnectionFactory {
	// 璁块棶xml,鑾峰彇涓婁笅鏂嘽ontext
	private static ApplicationContext context;
	private static final String CONFIG_FILE = "bean.xml";
	
	private static ConnectionFactory cFactory;
	
	static {
		context = new ClassPathXmlApplicationContext(CONFIG_FILE);
	}

	public static ConnectionFactory getInstance(){
		if(cFactory==null)
			cFactory = makeInstance();
		return cFactory;
	}
	
	public static synchronized ConnectionFactory makeInstance(){
		return new ConnectionFactory();
	}
	
	// 閫氳繃鍦▁ml涓寚瀹氱殑id鑾峰緱bean瀵硅薄,鐒跺悗鑾峰彇杩炴帴
	public static Connection getConnection() throws BeansException,
			SQLException {
		return ((ConnectionProvider) context
				.getBean("connectionProvider")).getConnection();
	}

	public static DataSource getDataSource() {
		// TODO Auto-generated method stub
		return ((ConnectionProvider) context
				.getBean("connectionProvider")).getDataSource();
	}

}
