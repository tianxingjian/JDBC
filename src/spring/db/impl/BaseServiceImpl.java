package spring.db.impl;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import spring.db.Inter.BaseService;

public class BaseServiceImpl implements BaseService {

	JdbcTemplate jdbcTemplate;


	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	/**
	 * 事务声明只读，这应该插入不了数据。测试竟然插进去了
	 */
	@Override
	public Object query() throws Exception {

		String sql = "insert into sm_user (ABLE_TIME, AUTHEN_TYPE, CUSERID, DISABLE_TIME, DR, ISCA, KEYUSER, LANGCODE, LOCKED_TAG, PK_CORP, PWDLEVELCODE, PWDPARAM, PWDTYPE, TS, USER_CODE, USER_NAME, USER_NOTE, USER_PASSWORD)"
				+ "values ('2014-05-28', 'staticpwd', 'baidAA10000000000361', '', 0, 'N', '', 'simpchn', 'N', '0001', 'update', '2014-05-28', 0, '2014-05-28 17:51:26', 'a', 'a', '', 'jlehfdffcfmohiag')";

		jdbcTemplate.execute(sql);
		return null;
	}

	/**
	 * 事务方法抛异常，应该回滚，测试时未进行回滚，数据库保存了一条数据
	 */
	@Override
	public Integer insert() throws SQLException {
		String sql = "insert into sm_user (ABLE_TIME, AUTHEN_TYPE, CUSERID, DISABLE_TIME, DR, ISCA, KEYUSER, LANGCODE, LOCKED_TAG, PK_CORP, PWDLEVELCODE, PWDPARAM, PWDTYPE, TS, USER_CODE, USER_NAME, USER_NOTE, USER_PASSWORD)"
				+ "values ('2014-05-28', 'staticpwd', 'baiaAA10000000000361', '', 0, 'N', '', 'simpchn', 'N', '0001', 'update', '2014-05-28', 0, '2014-05-28 17:51:26', 'b', 'b', '', 'jlehfdffcfmohiag')";

		jdbcTemplate.execute(sql);
		if (true) {
			throw new SQLException("insert 事务测试！");
		}
		return null;
	}

	@Override
	public Integer delete() throws Exception {

		String sql = "delete from  sm_user where user_code = 'a' or user_code = 'b'";

		jdbcTemplate.execute(sql);
//		if (true) {
//			throw new Exception("delete 事务测试！");
//		}
		return null;
	}

}
