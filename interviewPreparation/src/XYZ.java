public class XYZ extends ABC{

   public void myMethod(){
	System.out.println("Overriding Method2");
   }
   public static void main(String args[]){
	ABC obj = new XYZ();
	obj.myMethod();
   }
}