package spring.db;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

/**
 * 连接数据库和获取数据源的普通类
 * @author ZhongJie
 * @创建时间:2014-05-29
 * @修改时间:2014-05-29	
 */
public class ConnectionProvider {
	private DataSource dataSource = null;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	/*这个方法用来连接数据库.*/
	public Connection getConnection() throws SQLException {
		if (dataSource == null) {
			return null;
		}
		return dataSource.getConnection();
	}
}