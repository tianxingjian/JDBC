package spring.db;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: ZhongJie 
 * @create time: 2014-05-24
 * @last update time : 2014-05-24
 * @describe:完成ResultSet的转换
 * 暂未使用
 */
public class ProcessorUtils {
	
	/**
	 * 结果集转换成数组
	 * @param rs
	 * @return
	 * @throws SQLException
	 */
	static public Object[] toArray(ResultSet rs) throws SQLException {
		ResultSetMetaData meta = rs.getMetaData();
		int cols = meta.getColumnCount();
		Object[] result = new Object[cols];

		for (int i = 0; i < cols; i++) {
			result[i] = rs.getObject(i + 1);
		}
		return result;
	}
	/**
	 * 结果集转换成List
	 * @param rs
	 * @return list
	 * @throws SQLException
	 */
	static public List<Map<String, Object>> toList(ResultSet rs)throws SQLException {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		ResultSetMetaData md = rs.getMetaData();
		int columnCount = md.getColumnCount();
		while (rs.next()) {
			Map<String, Object> rowData = new HashMap<String, Object>();
			for (int i = 1; i <= columnCount; i++) {
				rowData.put(md.getColumnName(i), rs.getObject(i));
			}
			list.add(rowData);
		}
		return list;
	}
}
