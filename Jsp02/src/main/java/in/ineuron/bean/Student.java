package in.ineuron.bean;

public class Student {
	private Integer id;
	private String name ;
	private Integer age ;
	private String address;
	
	
	static {
		System.out.println(".class is loading");
	}
	public Integer getId() {
		System.out.println(id);	
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAge() {
		System.out.println(age);
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		System.out.println(name);	
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		System.out.println(address);	
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
