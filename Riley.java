import java.util.Scanner;

public class Riley
{
	public static void main(String[] args) {
	    int alegria = 0;
	    int tristeza = 0;
	    int amizades = 0;
	    int exer = 0;
	    int exern = exer - 10;
	    float a1 = 0.0f;
	    float a2 = 0.0f;
	    float a3 = 0.0f;
	    float media = 0;
	    
	    Scanner scanner = new Scanner(System.in);
	    
	    //Amizades
	    System.out.print("Quantas amizades foram feitas: ");
	    amizades = scanner.nextInt();
	    
	    if (amizades > 0) {
	        alegria = alegria + 10 * amizades;
	    } else {
	        tristeza = tristeza + 30;
	    }
	    
	    //Cidade nova
	    System.out.println("Qual a nota da a1: ");
	    a1 = scanner.nextFloat();
	    System.out.println("Qual a nota da a2: ");
	    a2 = scanner.nextFloat();
	    System.out.println("Qual a nota da a3: ");
	    a3 = scanner.nextFloat();
	    
	    media = (a1 + a2 + a3) / 3;
	    
	    if (media >= 7) {
	        alegria = alegria + 50;
	        System.out.println("Riley está aprovada");
	        System.out.println(alegria);
	    } else {
	        tristeza = tristeza + 50;
	        System.out.println("Riley está reprovada");
	        System.out.println(tristeza);
	    }
	    
	    //Algoritmos
	    System.out.println("Quantos exercicios feitos: ");
	    exer = scanner.nextInt();
	    
	    alegria = alegria + exer * 10;
	    tristeza = alegria + exern * 10;
	    
	    System.out.println(alegria);
	    System.out.println(tristeza);
	}
}