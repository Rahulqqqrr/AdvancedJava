package in.ineuron.service;

import in.ineuron.Dao.IStudenDao;
import in.ineuron.Factory.StudentDaoFactory;
import in.ineuron.dto.Student;

public class StudentServiceImpl implements IStudentService {
    IStudenDao studentdao;
    
	@Override
	public String save(Student student) {
		 studentdao = StudentDaoFactory.getStudentDao();
	     System.out.println("The implementation class is::"+studentdao.getClass().getName());
	     return studentdao.save(student);
	
	}
	
	@Override
	public Student findById(Integer sid) {
		 studentdao = StudentDaoFactory.getStudentDao();
		 System.out.println("The implementation class is::"+studentdao.getClass().getName());
		 return  studentdao.findById(sid);		 
	}
	
	
	
	
	@Override
	public String updateById(Student  sid) {
		 studentdao = StudentDaoFactory.getStudentDao();
		 System.out.println("The implementation class is::"+studentdao.getClass().getName());
		 return  studentdao.updateById(sid);		 
		
	}

	@Override
	public String deleteById(Integer sid) {
		studentdao = StudentDaoFactory.getStudentDao();
		return studentdao.deleteById(sid);	
		
	}

}
