package Task1;
import java.sql.*;
public class Connect
{
public Connection con;
public Connect()
{
try
{
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online_reservation","root","mysql");
}
catch(Exception e1)
{
System.out.println("Connection failed:"+e1);
}
}
}