import java.util.Scanner;

public class Riley {
    public static void main(String[] args) {
        int alegria = 0, tristeza = 0, amizades = 0, exer = 0, exern = 0;
		float a1 = 0.0f, a2 = 0.0f, a3 = 0.0f, media = 0.0f;

        Scanner scanner = new Scanner(System.in);

		//Amizades
        System.out.print("Quantas amizades foram feitas: ");
        amizades = scanner.nextInt();
        
		if (amizades < 0) amizades = 0;
        if (amizades > 0) {
            alegria = alegria + 10 * amizades;
        } else {
            tristeza = tristeza + 30;
        }
        
		//Notas
		System.out.print("\nQual a nota da a1: ");
        a1 = scanner.nextFloat();
        System.out.print("Qual a nota da a2: ");
        a2 = scanner.nextFloat();
        System.out.print("Qual a nota da a3: ");
        a3 = scanner.nextFloat();
        
		media = (a1 + a2 + a3) / 3;
        
		if (media >= 7) {
            alegria = alegria + 50;
        } else {
            tristeza = tristeza + 50;
        }
        
		//Exercicios
		System.out.print("\nQuantos exercicios feitos: ");
        exer = scanner.nextInt();
        
		if (exer < 0) exer = 0;
        if (exer > 10) exer = 10;
        exern = 10 - exer;
        
		alegria = alegria + exer * 10;
        tristeza = tristeza + exern * 10;
        
		System.out.println("\nAlegria: " + alegria);
        System.out.println("Tristeza: " + tristeza);
       
		if (alegria > tristeza) {
            System.out.println("\nA mudança para a nova cidade foi uma experiência incrível para a Riley.");
        } else {
            System.out.println("\nA mudança para a nova cidade foi uma experiência desagradável para a Riley.");
        }

        scanner.close();
    }
}
