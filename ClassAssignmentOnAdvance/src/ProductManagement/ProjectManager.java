package ProductManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

import oracle.sql.DATE;

public class ProjectManager {
	public void addProduct(Product p, Connection con) {

		String query = "insert into product1 values(?,?,?,?)";
		try {
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setInt(1, p.getProductId());
			stmt.setString(2, p.getProductName());
			stmt.setFloat(3, p.getProductPrice());

			stmt.setDate(4, new java.sql.Date(p.getManufacturingDate().getTime()));
			int i = stmt.executeUpdate();
			System.out.println(i + " records inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void displayProduct(java.sql.Date d3, Connection con) {
		try {
			int i = 0;
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from product1");
			while (rs.next()) {
				java.sql.Date det = rs.getDate(4);
				int a = d3.compareTo(det);// 0 if matched ,-1 and 1 if not
											// matched

				if (a == 0) {

					System.out.print(rs.getInt(1) + " ");
					System.out.print(rs.getString(2) + " ");
					System.out.print(rs.getFloat(3) + " ");
					System.out.println(rs.getDate(4) + " ");
					i++;
				}

			}
			if (i == 0) {
				{
					System.out.println("No data Found");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteProduct(int id, Connection con) {
		String query = "delete from product1 where productid=" + id;
		try {
			Statement st = con.createStatement();
			int i = st.executeUpdate(query);
			System.out.println(i + " rows affected");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void displayAllProducts(Connection con) {
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from product1");
			while (rs.next()) {
				System.out.print(rs.getInt(1) + " ");
				System.out.print(rs.getString(2) + " ");
				System.out.print(rs.getInt(3) + " ");
				System.out.println(rs.getDate(4) + " ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
