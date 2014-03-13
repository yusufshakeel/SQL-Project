import mypackage.mydbcon;
import java.sql.*;

public class SelectRow {
	
	/**
	 * This method will print all the rows from the customer table.
	 */
	public static void all(){
		//variables
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try{
			//register jdbc
			Class.forName(mydbcon.jdbcDriver);
			
			//get connection
			con = DriverManager.getConnection(mydbcon.dburl, mydbcon.username, mydbcon.password);
			
			//create and execute query
			String sqlquery = "select id, firstName, lastName, dob, gender from customer";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sqlquery);
			
			//display result
			while(rs.next()){
				int id = rs.getInt("id");
				String fname = rs.getString("firstName");
				String lname = rs.getString("lastName");
				String dob = rs.getString("dob");
				String gender = rs.getString("gender");
				
				System.out.println("ID: "+id);
				System.out.println("First name: "+fname);
				System.out.println("Last name: "+lname);
				System.out.println("DOB: "+dob);
				System.out.println("Gender: "+gender);
			}
			
			//close resources
			rs.close();
			stmt.close();
			con.close();
		}catch(Exception e){
			System.out.println("Error: "+e);
		}finally{
			try{
				if(stmt!=null){
					stmt.close();
				}
				if(con!=null){
					con.close();
				}
				if(rs!=null){
					rs.close();
				}
			}catch(Exception e){}
		}
	}//all() method ends here
	
	/**
	 * This method will print the row from the customer table as per ID.
	 */
	public static void byID(int CustomerId){
		//variables
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try{
			//register jdbc
			Class.forName(mydbcon.jdbcDriver);
			
			//get connection
			con = DriverManager.getConnection(mydbcon.dburl, mydbcon.username, mydbcon.password);
			
			//create and execute query
			String sqlquery = "select id, firstName, lastName, dob, gender from customer where id = " + CustomerId;
			stmt = con.createStatement();
			rs = stmt.executeQuery(sqlquery);
			
			//display result
			while(rs.next()){
				int id = rs.getInt("id");
				String fname = rs.getString("firstName");
				String lname = rs.getString("lastName");
				String dob = rs.getString("dob");
				String gender = rs.getString("gender");
				
				System.out.println("ID: "+id);
				System.out.println("First name: "+fname);
				System.out.println("Last name: "+lname);
				System.out.println("DOB: "+dob);
				System.out.println("Gender: "+gender);
			}
			
			//close resources
			rs.close();
			stmt.close();
			con.close();
		}catch(Exception e){
			System.out.println("Error: "+e);
		}finally{
			try{
				if(stmt!=null){
					stmt.close();
				}
				if(con!=null){
					con.close();
				}
				if(rs!=null){
					rs.close();
				}
			}catch(Exception e){}
		}
	}//byID() method ends here
}//SelectRow class ends here
