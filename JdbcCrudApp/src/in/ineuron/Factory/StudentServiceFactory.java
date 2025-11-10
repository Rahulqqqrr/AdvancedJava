package in.ineuron.Factory;

import in.ineuron.service.IStudentService;
import in.ineuron.service.StudentServiceImpl;

public class StudentServiceFactory {
	private StudentServiceFactory() {
		
	}
	private static IStudentService studentserviceImpl;
	public static IStudentService getStudentService() {
		if(studentserviceImpl==null) {
		studentserviceImpl = new StudentServiceImpl();
		}
		return studentserviceImpl;
		
	}
	
	
	
	
	

}
