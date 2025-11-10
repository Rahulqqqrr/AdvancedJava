package in.ineuron.controller;

import in.ineuron.dto.Student;

public interface IStudentController {
    String save(Student student);
    Student findById(Integer sid);
    String updateById(Student  sid);
    String deleteById(Integer sid);
	
}
