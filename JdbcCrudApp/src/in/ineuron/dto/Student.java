package in.ineuron.dto;

import java.io.Serializable;

public class Student implements Serializable {
	   private static final long serialversionUID=1L;
       private  Integer sid;
       private String name;
       private  String email;
       private String country;
       static {
    	   System.out.println("Student.class is loading");
    	   
       }
       public Student() {
    	   System.out.println("Student object is Created");
       }
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", email=" + email + ", country=" + country + "]";
	}
	
            
}
