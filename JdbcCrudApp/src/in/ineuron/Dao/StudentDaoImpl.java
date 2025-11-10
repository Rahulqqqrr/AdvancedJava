package in.ineuron.Dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import in.ineuron.dto.Student;
import in.ineuron.util.JdbcUtil;

public class StudentDaoImpl implements IStudenDao {
     Connection connection =null; 
	@Override
	public String save(Student student) {
		String sqlquery = "insert into student values(?,?,?,?)";
		PreparedStatement pstmt =null;
		String status=null;
		try {
			connection = JdbcUtil.getJdbcConnection();
		    System.out.println("Implementation class object is Created is::"+connection.getClass().getName());
			
			if(connection !=null) {
				pstmt =connection.prepareStatement(sqlquery);
			}
			if(pstmt!=null) {
				pstmt.setInt(1, student.getSid());
				pstmt.setString(2, student.getName());
				pstmt.setString(3, student.getEmail());
				pstmt.setString(4, student.getCountry());
				
			}
			if(pstmt!=null) {
				int rowAffected = pstmt.executeUpdate();
				if(rowAffected ==1) {
					status ="success";
				}else {
					status ="failure";
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return status;
	}

	@Override
	public Student findById(Integer sid) {
		String selectQuery ="select * from  student where sid = ?";
		PreparedStatement pstmt =null;
		String status =null;
		Student student = null;
		try {
			connection =  JdbcUtil.getJdbcConnection();
			if(connection!=null) {
				pstmt =connection.prepareStatement(selectQuery);
			}
			if(pstmt!=null) {
				pstmt.setInt(1, sid);
			}
			if(pstmt!=null) {
				ResultSet resultSet = pstmt.executeQuery();
				if(resultSet.next()) {
					student =new Student();
					student.setSid(resultSet.getInt(1));
					student.setName(resultSet.getString(2));
					student.setEmail(resultSet.getString(3));
					student.setCountry(resultSet.getString(4));							
				}
			}
		}catch (IOException |SQLException e) {
			e.printStackTrace();
			status ="failure";
		} 
		 return student ;	
	}

	@Override
	public String updateById(Student student) {
		String updateByid= "update student set name =?,email=?,country=? where sid =?";
		PreparedStatement pstmt =null;
		String status=null;
		try {
		   connection = JdbcUtil.getJdbcConnection();
		   if(connection!=null) {
			   pstmt = connection.prepareStatement(updateByid);
		   }
		   if(pstmt!=null) {
			   pstmt.setInt(1,student.getSid());
			   pstmt.setString(2,student.getName());
			   pstmt.setString(3,student.getEmail());
			   pstmt.setString(4,student.getCountry());
		   }
		   if(pstmt!=null) {
			   int rowAffected = pstmt.executeUpdate();
			   if(rowAffected ==1) {
				   status ="success";
			   }else {
				   status ="failure";
			   }
		   }
		}catch(IOException |SQLException e) {
			e.printStackTrace();
			status ="failure";
		}
		return status;
	}

	@Override
	public String deleteById(Integer sid) {
		String deletequery = "delete into student where sid = ?";
		PreparedStatement pstmt =null;
		String status=null;
		try {
			Student student = findById(sid);
		    if(student!=null) {
		    	connection =  JdbcUtil.getJdbcConnection();
				if(connection!=null) {
					pstmt =connection.prepareStatement(deletequery);
				}
				if(pstmt!=null) {
					pstmt.setInt(1, sid);
				}
				if(pstmt!=null) {
					int rowAffected = pstmt.executeUpdate();
					if(rowAffected ==1) 
						status ="success";
				}
		    }
		  else {
				status = "not Available";
			}
		}catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return status;
	     
		
	}
}
