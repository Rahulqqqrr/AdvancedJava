package in.ineuron.Main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import in.ineuron.Factory.StudentControllerFactory;
import in.ineuron.controller.IStudentController;
import in.ineuron.dto.Student;

public class TestApp {

	public static void main(String[] args) throws NumberFormatException, IOException {
          IStudentController studentcontroller=null;
          String status =null,name =null,country =null,email=null;
          Integer sid = null;
          Student studentRecord = null;
          
         
   try {
		 while(true) {
			 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 System.out.println("1. CREATE");
			 System.out.println("2. READ");
			 System.out.println("3. UPDATE");
			 System.out.println("4. DELETE");
			 System.out.println("5. EXIT");
			 System.out.println("Your option are ::[1,2,3,4,5]");
			 Integer option = Integer.parseInt(br.readLine());
			 switch(option) {
			 case 1:
				   System.out.println("Enter the id ::");
    			        sid = Integer.parseInt(br.readLine());
    			   
				   System.out.println("Enter the name::");
				       name = br.readLine();
				   
				   System.out.println("Enter the email::");
				        email= br.readLine();
				   System.out.println("Enter the country::");
				        country = br.readLine();
				   
				   studentcontroller = StudentControllerFactory.getStudentcontroller();
				   Student student = new Student();
				   student.setSid(sid);
				   student.setName(name);
				   student.setEmail(email);
				   student.setCountry(country);
				   
				   status = studentcontroller.save(student);
				   if(status.equalsIgnoreCase("success")) {
					   System.out.println("Record inserted Succcsesfully");
				   }else if(status.equalsIgnoreCase("failure")){
					   System.out.println("Record Insertion failed");
				   }else {
					   System.out.println("Some problem Occured");
				   }
			      // System.out.println("Implementation class  name is ::"+studentcontroller.getClass().getName());
			       
				 break;
			 
			 case 2:
				 studentcontroller = StudentControllerFactory.getStudentcontroller();
				 System.out.print("Enter the id::");
				 sid =Integer.parseInt(br.readLine());
				 studentRecord  = studentcontroller.findById(sid);
				 System.out.println(studentRecord);
				 if(studentRecord!=null) {
					 System.out.print(studentRecord);
				 }else {
					 System.out.print("The student record is not available::"+sid);
				 }
				 
				 break;
		    
			 case 3:
				 System.out.print("Enter the id to be updated");
				 sid = Integer.parseInt(br.readLine());
				 studentRecord =  studentcontroller.findById(sid);
				 if(studentRecord!=null) {
					Student newstudent = new Student ();
					newstudent.setSid(sid);
					System.out.println("Old name ::[OLd name is ::"+ studentRecord.getName()+"]:");
					String newName = br.readLine();
					if(newName==null||newName.equals("")) {
						newstudent.setName(studentRecord.getName());
					}else {
						newstudent.setName(newName);
					}
					System.out.println("Old name ::[OLd email is ::"+ studentRecord.getEmail()+"]:");
					String newEmail = br.readLine();
					if(newEmail==null||newEmail.equals("")) {
						newstudent.setEmail(studentRecord.getEmail());
					}else {
						newstudent.setEmail(newEmail);
					}
					System.out.println("Old name ::[OLd country  is ::"+ studentRecord.getCountry()+"]:");
					String newCountry = br.readLine();
					if(newCountry==null||newCountry.equals("")) {
						newstudent.setCountry(studentRecord.getCountry());
					}else {
						newstudent.setCountry(newCountry);
					}
					status = studentcontroller.updateById(newstudent);
					
				 }
				
				 
				 
				 
				 
				 break;
				 
			 case 4:
				 System.out.print("Enter the id::");
				 sid =Integer.parseInt(br.readLine());
				 status = studentcontroller.deleteById(sid);
				   if(status.equalsIgnoreCase("success")) {
					   System.out.println("Record deleted Succcsesfully");
				   }else if(status.equalsIgnoreCase("failure")){
					   System.out.println("Record deletion failed");
				   }else {
					   System.out.println("	Id not available for deletion.....");
				   }		 
				 break;
			 case 5:
				 System.out.println("Thanks for using the  application ");
				 System.exit(0);
				 
			default:
				System.out.println("plz eneter the option like 1,2,3,4,5,6 for opertion");
				break;
			 }		 		 
		 } 
	}
	catch(Exception e) {
		e.printStackTrace();
	}

}
}
