package employee_id_sort;

import java.util.TreeSet;

@SuppressWarnings("rawtypes")
public class Employee implements Comparable{
	
	String name;
	int eid;
	 
	Employee(String name,int eid){
		this.name=name;
		this.eid=eid;
	}
	
	 
	public String toString(){
		return this.name+"---"+this.eid;
	}
	
	
	public int compareTo(Object obj){
		
		int eid1=this.eid;
		Employee e=(Employee)obj;
		
		int eid2=e.eid;
		
		if(eid1<eid2){
			return -1;
		}
		else if(eid1>eid2){
			return 1;
		}
		else return 0;
	}
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Employee e1=new Employee("aaa",11);
		Employee e2=new Employee("ccc",21);
		Employee e3=new Employee("eee",10);
		Employee e4=new Employee("sss",5);
		
		//sorting on employee id
		TreeSet<Employee> t =new TreeSet<Employee>();
		
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		
		System.out.println("sorting on employee id:");
		System.out.println(t);
		
		//sorting on employee name
TreeSet<Employee> ts =new TreeSet<Employee>(new MyComparator());
		
System.out.println("\n\nsorting on employee name:");
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		
		System.out.println(ts);
		
		
		 
	}

}
