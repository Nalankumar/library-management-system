package com.library;

import java.sql.*;
public class CRUD_Functions {
	private static Connection makeConnection() throws Exception{
		String url = "jdbc:mysql://localhost:3306/lbms";
		String uname = "root";
		String password = "TNK_sql_007";
		Connection con = DriverManager.getConnection(url, uname, password);
		return con;
	}

	public void addBook(String name, String author) throws Exception{
		Connection con = makeConnection();
		String query = "insert into books(bname, author) values(?,?)";
		PreparedStatement st = con.prepareStatement(query);
		st.setString(1, name);
		st.setString(2, author);
		int rs = st.executeUpdate();
		if(rs == 1) {
			System.out.println("Book successfully inserted");
		}	
	}
	
	public void removeBook(int id) throws Exception{
		Connection con = makeConnection();
		String query = "delete from books where bid = ?";
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1, id);
		int rs = st.executeUpdate();
		if(rs == 1) {
			System.out.println("Book was removed successfully!");
		}
	}
	
	public void readBooks() throws Exception{
		Connection con = makeConnection();
		String query = "select * from books";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		while(rs.next()) {
			System.out.println("\nBook ID: " + rs.getInt(1) + "\nBook name:" + rs.getString(2) + "\nAuthor name: " + rs.getString(3) + "\nBorrowed by: "+rs.getInt(4));
		}	
	}
	
	public void updateName(int bid ,String name) throws Exception{
		Connection con = makeConnection();
		String query = "update books set bname= ? where bid = ?";
		PreparedStatement st = con.prepareStatement(query);
		st.setString(1, name);
		st.setInt(2, bid);
		int rs = st.executeUpdate();
		if(rs == 0) {
			System.out.println("Book name updated!");
		}
		else
		{
			System.out.println("Book name does not updated!");
		}
		
	}
	public void updateAuthor(int bid ,String aname) throws Exception{
		Connection con = makeConnection();
		String query = "update books set author = ? where bid = ?";
		PreparedStatement st = con.prepareStatement(query);
		st.setString(1, aname);
		st.setInt(2, bid);
		int rs = st.executeUpdate();
		if(rs == 0) {
			System.out.println("Book name updated!");
		}
		else
		{
			System.out.println("Book name does not updated!");
		}
		
	}
	
	public boolean checkAvailability(int id) throws Exception{
		Connection con = makeConnection();
		String query = "select borrower_id from books where bid = ?";
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1, id);
		ResultSet rs = st.executeQuery();
		while(!rs.next()) {
			return false;
		}
		return true;
	}
	
	public void borrowBook(int bid, int sid) throws Exception{
		if(checkAvailability(bid)) {
		Connection con = makeConnection();
		String query = "update books set borrower_id = ? where bid = ?";
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1, sid);
		st.setInt(2, bid);
		st.executeUpdate();
		System.out.println("Book borrowed successfrully");
		}
		else {
			System.out.println("Book is not available now!");
		}
	}

	public void returnBook(int bid, int sid) throws Exception{
		
		Connection con = makeConnection();
		String query = "update books set borrower_id = ? where bid = ?";
		PreparedStatement st = con.prepareStatement(query);
		st.setNull(1, Types.INTEGER);
		st.setInt(2, bid);
		st.executeUpdate();
		System.out.print("Book returned successfully");
		
		
	}

	public void searchByName(String bname) {
	    try {
	        Connection con = makeConnection();
	        String query = "SELECT * FROM books WHERE bname = ?";
	        PreparedStatement st = con.prepareStatement(query);
	        st.setString(1, bname);
	        ResultSet rs = st.executeQuery();
	        if (!rs.isBeforeFirst()) {
	            System.out.println("No books found with the name: " + bname);
	        } else {
	            while (rs.next()) {
	                System.out.println("\nBook ID: " + rs.getInt(1) + "\nBook name: " + rs.getString(2) + "\nAuthor name: " + rs.getString(3) + "\nBorrowed by: " + rs.getInt(4));
	            }
	        }
	     
	        rs.close();
	        st.close();
	        con.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	public void searchById(int id) {
	    try {
	        Connection con = makeConnection();
	        String query = "SELECT * FROM books WHERE bid = ?";
	        PreparedStatement st = con.prepareStatement(query);
	        st.setInt(1, id);
	        ResultSet rs = st.executeQuery();
	        if (!rs.isBeforeFirst()) {
	            System.out.println("No books found with the name: " + id);
	        } else {
	            while (rs.next()) {
	                System.out.println("\nBook ID: " + rs.getInt(1) + "\nBook name: " + rs.getString(2) + "\nAuthor name: " + rs.getString(3) + "\nBorrowed by: " + rs.getInt(4));
	            }
	        }
	       
	        rs.close();
	        st.close();
	        con.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
		
	    public void searchByAuthor(String author) {
		    try {
		        Connection con = makeConnection();
		        String query = "SELECT * FROM books WHERE author = ?";
		        PreparedStatement st = con.prepareStatement(query);
		        st.setString(1, author);
		        ResultSet rs = st.executeQuery();
		        if (!rs.isBeforeFirst()) {
		            System.out.println("No books found with the author: " + author);
		        } else {
		            while (rs.next()) {
		                System.out.println("\nBook ID: " + rs.getInt(1) + "\nBook name: " + rs.getString(2) + "\nAuthor name: " + rs.getString(3) + "\nBorrowed by: " + rs.getInt(4));
		            }
		        }
		       
		        rs.close();
		        st.close();
		        con.close();
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		
	    }

}