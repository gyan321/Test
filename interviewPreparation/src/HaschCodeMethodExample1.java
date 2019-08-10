
public class HaschCodeMethodExample1 {
	
	
		int StudentId;
		String StudentName;
		
		
		public HaschCodeMethodExample1(int studentId, String studentName) {
			super();
			StudentId = studentId;
			StudentName = studentName;
		}

		public int hashcode(){
			System.out.println("inside hashcode method");
			return StudentId;
			
		}
		
	
		public static void main(String[] args) {
			
			HaschCodeMethodExample1 objectHash=new HaschCodeMethodExample1(11,"gyanchandra");
			System.out.println(objectHash);//HaschCodeMethodExample1@7852e922

	}

}
