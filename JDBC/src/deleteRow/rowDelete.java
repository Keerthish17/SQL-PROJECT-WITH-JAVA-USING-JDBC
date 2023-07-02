package deleteRow;

import java.sql.PreparedStatement;
import DBUtil.DButill;
import bean.Bean_class;

public class rowDelete {
	public static int deleteData(Bean_class bcobj) {
		int i=0; 
		try {
			PreparedStatement pst  = DButill.getConnection().prepareStatement("delete from tasks WHERE ID = ?");
			pst.setInt(1,bcobj.getID());
			
			i = pst.executeUpdate();
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception in Deleting Data");
		}
		if(i==1) {
			return 1;
		}
		else {
			return 0;
		}
	}

}

