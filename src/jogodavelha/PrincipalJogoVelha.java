package jogodavelha;

//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Random;
import java.util.Scanner;
import metodosJogo.FuncaoJogo;

public class PrincipalJogoVelha {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		/*BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Informe sua jogada no formato (linha, coluna):");
		String dadosDigitados = leitor.readLine();
		String [] partes = dadosDigitados.split(",");
		int linhaDigitada = Integer.valueOf(partes[0].substring(1).trim());
		int colunaDigitada = Integer.valueOf(partes[1].substring(0, partes[1].length()-1).trim());
		System.out.println(linhaDigitada);
		System.out.println(colunaDigitada);
		
		Random geradorAleatorio = new Random();
		geradorAleatorio.nextInt(3);//numero aleatorio entre 0 e 2
		System.out.println(geradorAleatorio.nextInt(3));
		geradorAleatorio.nextInt(11);//numero aleatorio entre 0 e 10
		System.out.println(geradorAleatorio.nextInt(11));*/
		/*char xis = 'X';
		char bola = ' ';
		
		System.out.println("Seja bem vindo(a) ao jogo da velha");
		System.out.println(xis +" "+"| "+ bola + " | " + xis);
		System.out.println("_   _   _");
		System.out.println(xis +" "+"| "+ bola + " | " + xis);
		System.out.println("_   _   _");
		System.out.println(xis +" "+"| "+ bola + " | " + xis);
		System.out.println();*/
		int i=0;
		FuncaoJogo chama;
		chama = new FuncaoJogo();
		
		chama.iniciaTabuleiro();
		
		chama.imprimiTabuleiro();
		
		chama.populaTabuleiro();
		
		
		
		sc.close();
	}

}
