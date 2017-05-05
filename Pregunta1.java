package fundamentos;

class ClaseBase{
	private void disp(){
		System.out.println("Parent class method");
	}
}
class ClaseHija extends ClaseBase{
	public void test(){
		System.out.println("Child class method");
	}
}

public class Pregunta1 {

	public static void main(String[] args) {
		ClaseBase obj=new ClaseHija();
		obj.test();
		

	}

}
