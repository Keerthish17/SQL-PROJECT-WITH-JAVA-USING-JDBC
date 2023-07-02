package mainservice;
import java.sql.PreparedStatement;
import DBUtil.DButill;
import bean.Bean_class;

public class Passingdata {
	public static int enterdata(Bean_class bcobj) {
		int i=0; 
		try {
			PreparedStatement pst  = DButill.getConnection().prepareStatement("insert into tasks values(ID,?,?)");
			//pst.setInt(1,bcobj.getID());
			pst.setString(1, bcobj.getName());
			pst.setString(2,bcobj.getStatus());
			i = pst.executeUpdate();
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception in Passing Data");
		}
		if(i==1) {
			return 1;
		}
		else {
			return 0;
		}
	}

}
