package in.ineuron.controller;
import in.ineuron.Factory.StudentServiceFactory;
import in.ineuron.dto.Student;
import in.ineuron.service.IStudentService;

public class StudentControllerImpl implements IStudentController {
	IStudentService stdservice;

	@Override
	public String save(Student student) {
		stdservice = StudentServiceFactory.getStudentService();
		System.out.println("Implementation classs is::"+stdservice.getClass().getName());
		
		return stdservice.save(student);
	}

	@Override
	public Student findById(Integer sid) {
		 stdservice = StudentServiceFactory.getStudentService();
		 System.out.println("The implementation class is::"+stdservice.getClass().getName());
		 return stdservice.findById(sid);
	}

	@Override
	public String updateById(Student  sid) {
		stdservice = StudentServiceFactory.getStudentService();
		 System.out.println("The implementation class is::"+stdservice.getClass().getName());
		 return stdservice.updateById(sid);
		
	}

	@Override
	public String deleteById(Integer sid) {
		stdservice = StudentServiceFactory.getStudentService();
		return stdservice.deleteById(sid);	
		
	}	
}
