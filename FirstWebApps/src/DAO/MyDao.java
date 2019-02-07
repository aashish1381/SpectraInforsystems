package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import beans.EmployeeBean;

public class MyDao {

	public int loginCheck(String uid, String pass) {
		
		int x=0;
		
		Connect c=new Connect();
		try(Connection con=c.start()){
			PreparedStatement ps=con.prepareStatement("Select * from login where uid=? and pass=?");
			ps.setString(1, uid);
			ps.setString(2, pass);
			
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				x=1;
			}
		}
			catch(SQLException e) {
				System.out.println(e);
			}
		

		
		return x;
	}

	public int insertEmp(EmployeeBean e)
	{
	int x=0;
	Connect c=new Connect();
	try(Connection con= c.start()){
PreparedStatement ps=con.prepareStatement("insert into emp(ename,salary,address,city,gender) values(?,?,?,?,?)");
	ps.setString(1,e.getName());
	ps.setDouble(2,e.getSalary());
	ps.setString(3,e.getAddress());
	ps.setString(4,e.getCity());
	ps.setString(5,e.getGender());
      x=ps.executeUpdate();
			}catch(SQLException ex)
			{
				System.out.println(ex);
			}
	
		return x;
	}

	public ArrayList<EmployeeBean> viewAllEmployee() {
		 ArrayList<EmployeeBean> list=new  ArrayList<>();
		 Connect c=new Connect();
			try(Connection con= c.start()){
	 PreparedStatement ps=con.prepareStatement("select * from Emp");
				   ResultSet rs=ps.executeQuery();
					while(rs.next())
					{
					EmployeeBean e=new EmployeeBean();
					e.setEid(rs.getInt("eid"));
					e.setName(rs.getString("ename"));
					e.setSalary(rs.getDouble("salary"));
			        e.setAddress(rs.getString("address"));
			        e.setCity(rs.getString("city"));
			        e.setGender(rs.getString("gender"));
			         list.add(e);
					}
			}
			catch(SQLException e)
					{
						System.out.println(e);
					}
		return list;
	}

	public int deleteEmp(int eid) {
		int x=0;
		Connect c=new Connect();
		try(Connection con= c.start()){
	PreparedStatement ps=con.prepareStatement("delete from emp where eid=?");
		ps.setInt(1,eid);
	      x=ps.executeUpdate();
				}catch(SQLException ex)
				{
					System.out.println(ex);
				}
			return x;
	}

	

	public EmployeeBean getEmpByEid(int eid) {
		
		EmployeeBean e=new EmployeeBean();
		 Connect c=new Connect();
			try(Connection con= c.start()){
	 PreparedStatement ps=con.prepareStatement("select * from Emp where eid=?");
	 ps.setInt(1, eid);
				   ResultSet rs=ps.executeQuery();
					if(rs.next())
					{
				
					e.setEid(rs.getInt("eid"));
					e.setName(rs.getString("ename"));
					e.setSalary(rs.getDouble("salary"));
			        e.setAddress(rs.getString("address"));
			        e.setCity(rs.getString("city"));
			        e.setGender(rs.getString("gender"));
			    	}
			}
			catch(SQLException ex)
					{
						System.out.println(ex);
					}
		
		return e;
		
	
	}

	public int updateEmp(EmployeeBean e) {
		int x=0;
		Connect c=new Connect();
		try(Connection con= c.start()){
	PreparedStatement ps=con.prepareStatement("update Emp set ename=?,salary=?,address=?,city=?,gender=? where eid=?");
		ps.setString(1,e.getName());
		ps.setDouble(2,e.getSalary());
		ps.setString(3,e.getAddress());
		ps.setString(4,e.getCity());
		ps.setString(5,e.getGender());
		ps.setInt(6,e.getEid());
	      x=ps.executeUpdate();
				}catch(SQLException ex)
				{
					System.out.println(ex);
				}
		
			return x;
	}

	public int checkEname(String en) {
		int x=0;
		Connect c=new Connect();
		try(Connection con=c.start()){
			PreparedStatement ps=con.prepareStatement("select * from emp where ename=?");
			ps.setString(1,en);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				x=1;
			}
		}catch(SQLException e) {
			System.out.println(e);
		}
		
		return x;
	}
	}


