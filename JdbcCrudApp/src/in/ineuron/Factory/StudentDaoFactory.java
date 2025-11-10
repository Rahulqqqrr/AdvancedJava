package in.ineuron.Factory;

import in.ineuron.Dao.IStudenDao;
import in.ineuron.Dao.StudentDaoImpl;

public class StudentDaoFactory {
	private StudentDaoFactory() {
		
	}
   private static  IStudenDao studentdao =null;
   public static IStudenDao getStudentDao() {
	   if(studentdao==null) {
		   studentdao = new StudentDaoImpl();
	   }
	   return studentdao;
	      
   }
	
	

}
