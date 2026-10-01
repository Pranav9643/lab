
class employee{
    String emp_name;
    int emp_id;
    float sal;
    employee(String name,int id,float sal){
        this.emp_name = name;
        this.emp_id = id;
        this.sal = sal;
    }
    public void display_emp(){
        System.out.println("Employee name:"+emp_name);
        System.out.println("Employee id:"+emp_id);
        System.out.println("Employee salary:"+sal);
    }
	
}
class student{
    String stud_name;
    int stud_id;
    String stream;
    student(String name,int id,String stream){
        this.stud_name = name;
        this.stud_id = id;
        this.stream = stream;
    }
    public void display_std(){
        System.out.println("Student name:"+stud_name);
        System.out.println("Student id:"+stud_id);
        System.out.println("Student salary:"+stream );
    }

}

public class details{
	public static void main(String args[]){
        	employee E1 = new employee("Kabir Singh",9643,5000000);
            	student S1 = new student("Rajma Singh",12345,"Science");
            	E1.display_emp();
		System.out.println("\n\n\n");
            	S1.display_std();
		
	}
}