package in.ineuron.Factory;

import in.ineuron.controller.IStudentController;
import in.ineuron.controller.StudentControllerImpl;

public class StudentControllerFactory {
	private StudentControllerFactory() {
		
	}
	private static IStudentController studentcontroller =null;
	
	public static  IStudentController getStudentcontroller() {
		if(studentcontroller==null) {
		studentcontroller  = new  StudentControllerImpl();
		}
		return studentcontroller;
	}
	
	
	

}
