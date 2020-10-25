import java.util.Scanner;
public class TestPiscina {

	public static void main(String[] args) {
		//Creamos el objeto Piscina p1.
		Piscina p1 = new Piscina();
		
		//Llamamos al teclado "t".
		Scanner t = new Scanner(System.in);
		
		//Introducimos los datos al teclado.
		System.out.println("Introduce el largo: ");
		p1.setLargo(t.nextInt());
		System.out.println("Introduce el ancho: ");
		p1.setAncho(t.nextInt());
		System.out.println("Introduce la profundidad: ");
		p1.setProfundidad(t.nextDouble()); 
		
		//Llamamos al metodo muestraPiscina y se imprimen los datos introducidos.
		p1.muestraPiscina();
		
		//Imprimimos el agua necesaria en litros para llenar la piscina.
		System.out.printf("litros necesarios %f\n", p1.calculalitrosAgua());
	

	}

}
