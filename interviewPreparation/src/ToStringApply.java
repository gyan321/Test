
public class ToStringApply {
	
	
	String studentId;
	String studentName;
	
	
	
	
	
	

	public ToStringApply(String studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}
	 

	@Override
	public String toString() {
		return "ToStringApply [studentId=" + studentId + ", studentName=" + studentName + "]";
	}


 

	public static void main(String[] args) {
		
		ToStringApply stringObjec=new  ToStringApply("gyan123","gyanchandra");
		System.out.println(stringObjec);

	}

}
