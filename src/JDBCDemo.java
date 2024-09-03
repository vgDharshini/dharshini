import java.sql.*;
public class JDBCDemo {

	public static void main(String[] args)throws Exception {
		String url= "jdbc:mysql://localhost:3306/jdbcdemo1";
		String username="root";
		String password=String.format("%d",12345678);
		String query = "select * from employees";
		Connection con = DriverManager.getConnection(url,username,password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next()) {
			System.out.println("Id is " + rs.getInt(1));
			System.out.println("Name is " + rs.getString(2));
			System.out.println("Salary is " + rs.getInt(3));
			
		}
		con.close();
		}
}
	


