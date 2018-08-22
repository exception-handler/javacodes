package q7;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import utility.Connector;

public class MainClass {
public static void main(String[] args) {
 Scanner in=new Scanner(System.in);
 int flag=0;
 MainClass obj=new MainClass();
 System.out.println("Enter the Customer name : ");
 String name=in.nextLine();
 System.out.println("Enter customer id : ");
 int id=Integer.parseInt(in.nextLine());
 int choice;
 System.out.println("Enter customer city : ");
 String city=in.nextLine();
 while(true)
 {
  System.out.println("Choose customer type \n.1Regular Customer     "
    + "2.Corporate Customer");
  choice=Integer.parseInt(in.nextLine());
  switch(choice)
  {
  case 1:
   obj.regCustomer(id,name,city);
   flag=1;
   break;
  case 2:obj.corpCustomer(id, name, city);
   flag=1;
   break;
  default :
   System.out.println("Please select valid choice");
  }
  if(flag==1)
  {
   break;
  }
 }
}
public void regCustomer(int id,String name,String city)
{
 Connection con= Connector.connection();
 PreparedStatement ps;
 try {
  System.out.println("SAd");
  ps = con.prepareStatement("insert into regular_customer values(?,?,?,?)");
  ps.setInt(1,id);
  ps.setString(2, name);
  ps.setString(3,"regular");
  ps.setString(4, city);
  ps.executeUpdate();
 } 
 catch (SQLException e) {
  
  e.printStackTrace();
 }
}
public void corpCustomer(int id,String name,String city)
{
 Connection con= Connector.connection();
 PreparedStatement ps;
 try {
  ps = con.prepareStatement("insert into corporate_customer values(?,?,?,?)");
  ps.setInt(1,id);
  ps.setString(2, name);
  ps.setString(3,"corporate");
  ps.setString(4, city);
  ps.executeUpdate();
 } 
 catch (SQLException e) {
  
  e.printStackTrace();
 }
}
}

