
public class HashCodeExample2 {

	int StudentId;
	String StudentName;
	
	
	@Override
	public String toString() {
		return "HashCodeExample2 [StudentId=" + StudentId + ", StudentName=" + StudentName + "]";
	}

	public HashCodeExample2(int studentId, String studentName) {
		super();
		StudentId = studentId;
		StudentName = studentName;
	}

	public int hashcode(){
		
		return StudentId;
		
	}
	

	public static void main(String[] args) {
	 
		HashCodeExample2 objectHash=new HashCodeExample2(11,"gyanchandra");
		System.out.println(objectHash);//HaschCodeMethodExample1@7852e922

}
}
