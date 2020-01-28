package Java_Unidad_4;
import java.util.Random;
public class E1_Ramdom {

	public static void main(String[] args) {
		Random numAleatorio = new Random();

		int a,b,c;

		a = numAleatorio.nextInt(90-65+1)+65;
		b = numAleatorio.nextInt(90-65+1)+65;
		c = numAleatorio.nextInt(90-65+1)+65;

		System.out.println("a="+a+" b="+b+" c="+c);

	}

}
