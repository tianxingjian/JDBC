package spring.db;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * 利用单例模式，获取dataSource
 * @author ZhongJie
 * @创建时间:2014-05-29
 * @修改时间:2014-05-29	
 */
public class JdbcDataSource {

	private static JdbcDataSource jdbcDataSource;
	
	// 静态方法获取dataSource
	private JdbcTemplate jt;
	private static DataSource dataSource;
	
	static {
		dataSource = spring.db.ConnectionFactory.getDataSource();
	}

	public JdbcDataSource() {
		this.setJt(new JdbcTemplate(dataSource));
	}

	public static JdbcDataSource getInstance(){
		if(jdbcDataSource==null)
			jdbcDataSource = makeInstance();
		return jdbcDataSource;
	}
	
	public static synchronized JdbcDataSource makeInstance(){
		return new JdbcDataSource();
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public JdbcTemplate getJt() {
		return jt;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
}
