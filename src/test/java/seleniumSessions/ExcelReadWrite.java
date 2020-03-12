package seleniumSessions;

import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class ExcelReadWrite 
{
	@Test
	public void excelReadWrite() throws FilloException
	{
		//Defining the excel sheet path
		String excelPath = "./TestDataSheet/TestData.xlsx";
		//Creating an object of Fillo Class
		Fillo fillo = new Fillo();
		//As Fillo treats excel sheet as Data base, so connecting to DB
		Connection con = fillo.getConnection(excelPath);
		
		//Read Query
//		String readQuery = "select username, password from sheet1";
//		
//		//Executing the query
//		Recordset rs = con.executeQuery(readQuery);
//		while(rs.next())
//		{
//			String un = rs.getField("username");
//			String psw = rs.getField("password");
//			System.out.println(un+"\t"+psw);
//		}
		
//		//Inserting a record
//		String insertQuery = "insert into sheet1 (username, password) values ('U9', 'P9')";
//		
//		//Execute insert query
//		con.executeUpdate(insertQuery);
		
		//Update query
		String updateQuery = "update sheet1 set status='Pass' where username='U5'";
		
		//Executing update query
		con.executeUpdate(updateQuery);
		
		
		
	}

}
