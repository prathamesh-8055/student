package mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultDAO {
	Connection con;
	ResultDAO()
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}
	Result getResult(int hno)
	{
		Result r=null;
		try {
			PreparedStatement pstmt = con.prepareStatement("select * from results where hno=?");
			pstmt.setInt(1, hno);
			ResultSet rs = pstmt.executeQuery();
			r = new Result();
			if(rs.next())
			{
				r.setHno(rs.getInt(1));
				r.setName(rs.getString(2));
				r.setC(rs.getInt(3));
				r.setCpp(rs.getInt(4));
				r.setJava(rs.getInt(5));
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return r;
	}
}
