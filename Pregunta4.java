package fundamentos;

class Auto{
	public int velocidad;
}

public class Pregunta4 {

	public static void cambiarVelocidad(Auto auto){
		auto.velocidad = auto.velocidad + 3;
	}
	
	public static void main(String[] args) {
		Auto ferrari=new Auto();
		Auto toyota=new Auto();
		ferrari.velocidad =2;
		toyota.velocidad = -2;
		cambiarVelocidad(ferrari);
		cambiarVelocidad(ferrari);
		cambiarVelocidad(toyota);
		cambiarVelocidad(toyota);
		cambiarVelocidad(toyota);
		System.out.println("Ferrari: "+ ferrari.velocidad);
		System.out.println("Toyota: "+ toyota.velocidad);
	}

}
