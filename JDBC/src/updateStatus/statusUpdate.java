package updateStatus;
import java.sql.PreparedStatement;
import DBUtil.DButill;
import bean.Bean_class;

public class statusUpdate {
	public static int updatedata(Bean_class bcobj) {
		int i=0; 
		try {
			PreparedStatement pst  = DButill.getConnection().prepareStatement("update tasks set status = ? WHERE ID = ?");
			//pst.setInt(1,bcobj.getID());
			pst.setString(1, bcobj.getStatus());
			pst.setInt(2,bcobj.getID());
			i = pst.executeUpdate();
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception in updating Data");
		}
		if(i==1) {
			return 1;
		}
		else {
			return 0;
		}
	}

}
