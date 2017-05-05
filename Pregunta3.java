package fundamentos;

class Persona{
	public int edad;
}

public class Pregunta3 {

	public static void main(String[] args) {
		
		Persona p1=new Persona();
		Persona p2=p1;
		Persona p3=p2;
		//p3 = new Persona();
		p3.edad = 23;
		p1.edad = 45;
		System.out.println(p1.edad);
		System.out.println(p2.edad);
		System.out.println(p3.edad);
		
		CuentaBancaria cta=new CuentaBancaria();
		Variables var=new Variables();
		var.sumarSaldo(cta);
		Variables.sumarSaldo(cta.saldo);
		


	}

}
