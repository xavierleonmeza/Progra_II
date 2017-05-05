package fundamentos;



class Dispositivo{
	private String ip;
	public Dispositivo(){
		
	}
	public Dispositivo(String ip){
		this.ip = ip;
	}
}

public class ContructorDefecto {

	public static void main(String[] args) {
		Dispositivo dis1=new Dispositivo("192.168.1.1");
		Dispositivo dis2=new Dispositivo();
	}
}
