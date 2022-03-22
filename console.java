package list;
import java.util.*;
public class Abc {
	private int Id;
private String name;
private String designation;
private int salary;
Abc(String name,String designation,int salary,int Id){
	this.name=name;
	this.designation=designation;
	this.salary=salary;
	this.Id=Id;
}

public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getDesignation() {
	return designation;
}


public void setDesignation(String designation) {
	this.designation = designation;
}


public int getSalary() {
	return salary;
}


public void setSalary(int salary) {
	this.salary = salary;
}
public int getId() {
	return Id;
}

public void setId(int id) {
	Id = id;
}
public String toString() {
	return name+"          "+designation+"          "+salary+"       "+Id;
}
public static void main(String args[]) {
	ArrayList<Abc> c =new ArrayList<Abc>();
	int ch;
do  {
		System.out.println("*****************************************");
		System.out.println("1.show all the employee records");
		System.out.println("2.Add employee ");
		System.out.println("3.Remove employee");
		System.out.println("4.get employee details ");
		System.out.println("5.update the employee ");
		System.out.println("-1.exit the program ");
		System.out.println("*****************************************");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter choice");
		ch=sc.nextInt();
		switch(ch) {
		case 1: System.out.println("show employee records");
		        System.out.println("--------------------------------------------------");
		       System.out.println("EmployeeName    Designation     Salary       Id");
		       Iterator<Abc> i=c.iterator();
		       while(i.hasNext()) {
		    	   Abc x=i.next();
		    	   System.out.println(x);
		       }
		       System.out.println("--------------------------------------------------");
		            break;
		
		case 2:System.out.println(" add employee");
		       System.out.println(" add employee name---->");
		       String name=sc.next();
		       System.out.println(" add employee designation----->");
		       String designation=sc.next();
		       System.out.println(" add employee salary----->");
		       int salary=sc.nextInt();
		       System.out.println(" add employee Id----->");
		       int Id=sc.nextInt();
		       c.add(new Abc(name,designation,salary,Id));
                break;
		case 3:System.out.println(" remove employee");
		Boolean found=false;
		System.out.println(" enter employee Id to remove");
		Id=sc.nextInt();
	      i=c.iterator();
	       while(i.hasNext()) {
	    	   Abc x=i.next();
	    	   if(x.getId()==Id) {
	    		   i.remove();
	    		   found=true;
	    	   }
	       }
	       if(!found) {
	    	   System.out.println("Record not found"); 
	       }
	       else {
	    	   System.out.println("Record deleted"); 
	       }
		        break;
		case 4:System.out.println(" employee details are--->");
		System.out.println(" enter employee Id to get details ");
		Id=sc.nextInt();
		found=false;
		System.out.println("--------------------------------------------------");
		      i=c.iterator();
		       while(i.hasNext()) {
		    	   Abc x=i.next();
		    	   if(x.getId()==Id) {
		    	   System.out.println(x);
		    	   found=true;
		       }
		       }
		    	   if(!found) {
                    System.out.println("Record not found");
		    	   }
			       System.out.println("--------------------------------------------------");
		        
		       break;
		case 5:System.out.println(" update  employee details");
		found=false;
		System.out.println(" enter employee Id to update ");
		Id=sc.nextInt();
		
		System.out.println("--------------------------------------------------");
		      ListIterator<Abc>li=c.listIterator();
		       while(li.hasNext()) {
		    	   Abc x=li.next();
		    	   if(x.getId()==Id) {
		    	   System.out.println("enter new name");
		    	    name=sc.next();
			       System.out.println("employee new  designation----->");
			       designation=sc.next();
			       System.out.println(" add employee new salary----->");
			       salary=sc.nextInt();
			       li.set(new Abc(name,designation,salary,Id));
		    	   found=true;
		       }
		       }
		    	   if(found==false) {
                    System.out.println("Record not found");
		    	   }
		    	   else {
		    		   System.out.println("Record updated");
		    	   }
			       System.out.println("--------------------------------------------------"); break;
		       
		      
		case -1:System.out.println(" exit");
		        break;
		default:System.out.println(" Invalid selection");
		        break; 
		}
}while(ch!=-1);
}

}


