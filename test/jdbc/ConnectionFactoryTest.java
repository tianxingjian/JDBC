package jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.transaction.interceptor.TransactionProxyFactoryBean;

import spring.db.ConnectionFactory;

public class ConnectionFactoryTest {

	@Test
	public void test() throws BeansException, SQLException {
		System.out.println("Start:");
//		ConnectionFactory factory = ConnectionFactory.getInstance();
//		
//		Connection con = null;
//		for(int i = 0; i < 10; i++){
//			try {
//				con = factory.getConnection();
//			} catch (Exception e) {
//				System.err.println("错误：" + e.getMessage());
//			}finally{
//				if(con != null){
//					con = null;
//				}
//			}
//
//		}
//				
//		ConnectionFactory factory = ConnectionFactory.getInstance();
//		
//		Connection con = null;
//		con = factory.getConnection();
		
		preIndx();
		System.out.println("End!");
		while(true){

		}
	}

	private void preIndx(){
		ConnectionFactory factory = ConnectionFactory.getInstance();
		Connection con = null;
		for(int i = 0; i < 10; i++){
			try {
				if(i > 5){
					Thread.sleep(10000);
				}
				con = factory.getConnection();
				System.out.println("第"  + i + "个：" + con);
			} catch (Exception e) {
				System.err.println("错误：" + e.getMessage());
			}finally{
				if(con != null){
					try {
						con.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

		}
	}
	
}
