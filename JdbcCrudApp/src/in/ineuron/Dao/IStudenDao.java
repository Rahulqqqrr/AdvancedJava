package in.ineuron.Dao;

import in.ineuron.dto.Student;

public interface IStudenDao {
	    String save(Student student);
	    Student findById(Integer sid);
	    String updateById(Student sid);
	    String deleteById(Integer sid);
}
