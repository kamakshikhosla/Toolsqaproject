package testing8;

import  java.sql.Connection;		
import  java.sql.Statement;		
import  java.sql.ResultSet;		
import  java.sql.DriverManager;		
import  java.sql.SQLException;

public class data1 
{
	String dbUrl = "jdbc:mysql://localhost:3306/sakila";					

	//Database Username		
	String username = "root";	
    
	//Database Password		
	String password = "12345";	
	public void updatedata() throws SQLException, ClassNotFoundException
	{
		//Query to Execute		
		String query = "select *  from  users10;";	
        
 	    //Load mysql jdbc driver		
   	    Class.forName("com.mysql.jdbc.Driver");	
		Connection con = DriverManager.getConnection(dbUrl,username,password);
		//Create Statement Object		
		   Statement stmt = con.createStatement();					
		   System.out.println("connection is created");
	 	    int rs1=stmt.executeUpdate("update users10 set password='12345' where username='kamakshi'");
	 	   System.out.println(rs1); 
	 
	 		// While Loop to iterate through all data and print results		
			if(rs1=='1')
			{
		       System.out.println("updation has been done"); 				
	            }		
				 // closing DB Connection			
	}
	public void selectdata() throws ClassNotFoundException, SQLException
	{
		
		//Query to Execute		
				String query = "select *  from  users10;";	
		        
		 	    //Load mysql jdbc driver		
		   	    Class.forName("com.mysql.jdbc.Driver");	
				Connection con = DriverManager.getConnection(dbUrl,username,password);
				//Create Statement Object		
				   Statement stmt = con.createStatement();					
				   System.out.println("connection is created");
			 	    ResultSet rs=stmt.executeQuery(query);
	 		// While Loop to iterate through all data and print results		
			while (rs.next()){
		        		String myName = rs.getString(1);								        
	                    String mypassword = rs.getString(2);					                               
	                    System. out.println(myName+"  "+mypassword);		
	            }		
				 // closing DB Connection	
	}
	public static void  main(String[] args) throws  ClassNotFoundException, SQLException 
	{													
		data1 db1 =new data1();
		db1.updatedata();
		db1.selectdata();
					
							
	}
}