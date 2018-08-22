package q6;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import utility.Connector;

public class MainClass {
 public static void main(String[] args) {
  MainClass obj=new MainClass();
  Scanner in=new Scanner(System.in);
  System.out.println("Enter the percentage to increase price of all products : ");
  float per=Float.parseFloat(in.nextLine());
  obj.increasePrice(per);
 }
 public void increasePrice(float percentage)
 {
  Connection con=Connector.connection();
  PreparedStatement ps;
  try {
   ps=con.prepareStatement("update products set price=price+(((price*?)/100))");
   ps.setFloat(1, percentage);
   int rs=ps.executeUpdate();
   if(rs>0)
   {
    System.out.println("Price updated");
   }
  } catch (SQLException e) {
   e.printStackTrace();
  }
 }
}
