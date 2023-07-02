package printTable;
import java.sql.*;
import java.sql.PreparedStatement;
import DBUtil.DButill;
import bean.Bean_class;

public class tablePrint {
	public static void printData() {

		
		
		try{  
			PreparedStatement stmt=DButill.getConnection().prepareStatement("select * from tasks");  
		    ResultSet rs=stmt.executeQuery("select * from tasks");  
		    while(rs.next())  
		    System.out.println(rs.getInt(1)+"      "+rs.getString(2)+"                "+rs.getString(3));  
		    DButill.getConnection().close();  
		}catch(Exception e){
			System.out.println(e); 
		}
		
		
		
		
	}

}

