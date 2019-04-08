package metodosJogo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FuncaoJogo {
private char[][] mat = new char[3][3];
private int contador = 2;
private boolean vencedor = false;
	
	public void iniciaTabuleiro() {
		
		for(int li = 0; li < 3; li ++)
		{
			for(int col = 0; col < 3; col++)
			{
				mat[li][col] = '?';
				//System.out.println(mat[li][col]);
			}
		}
	}
	
	public void imprimiTabuleiro() {
		System.out.println(mat[0][0] +" "+"| "+ mat[0][1] + " | " + mat[0][2]);
		System.out.println("_   _   _");
		System.out.println(mat[1][0] +" "+"| "+ mat[1][1] + " | " + mat[1][2]);
		System.out.println("_   _   _");
		System.out.println(mat[2][0] +" "+"| "+ mat[2][1] + " | " + mat[2][2]);
	}


	public void populaTabuleiro() throws IOException {
	while(vencedor != true)
	{
		if(contador % 2 == 0)
		{
			BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Informe sua jogada no formato (linha, coluna):");
			String dadosDigitados = leitor.readLine();
			String [] partes = dadosDigitados.split(",");
			int linhaDigitada = Integer.valueOf(partes[0].substring(1).trim());
			int colunaDigitada = Integer.valueOf(partes[1].substring(0, partes[1].length()-1).trim());
			mat[linhaDigitada][colunaDigitada] = 'X';
			imprimiTabuleiro();
			contador++;
			verificaVencedor();
		}else
		{
			BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Informe sua jogada no formato (linha, coluna):");
			String dadosDigitados = leitor.readLine();
			String [] partes = dadosDigitados.split(",");
			int linhaDigitada = Integer.valueOf(partes[0].substring(1).trim());
			int colunaDigitada = Integer.valueOf(partes[1].substring(0, partes[1].length()-1).trim());
			mat[linhaDigitada][colunaDigitada] = 'O';
			imprimiTabuleiro();
			contador++;
			verificaVencedor();
			}
		}
	}

	public void verificaVencedor() {
		
			if(	mat[0][0] == 'X' && mat[0][1]=='X' && mat[0][2] =='X' || 
				mat[1][0] == 'X' && mat[1][1]=='X' && mat[1][2] =='X' ||
				mat[2][0] == 'X' && mat[2][1]=='X' && mat[2][2] =='X' ||
				mat[0][0] == 'X' && mat[1][0]=='X' && mat[2][0] =='X' ||
				mat[0][1] == 'X' && mat[1][1]=='X' && mat[2][1] =='X' ||
				mat[0][2] == 'X' && mat[1][2]=='X' && mat[2][2] =='X' ||
				mat[0][0] == 'X' && mat[1][1]=='X' && mat[2][2] =='X' ||
				mat[0][2] == 'X' && mat[1][1]=='X' && mat[2][0] =='X'  
	               )
	                {
	                    System.out.println("Jogador 'X' Venceu !!!");
	                    vencedor = true;
	                }
	            else if(mat[0][0] == 'O' && mat[0][1]=='O' && mat[0][2] =='O' || 
	            		mat[1][0] == 'O' && mat[1][1]=='O' && mat[1][2] =='O' ||
	            		mat[2][0] == 'O' && mat[2][1]=='O' && mat[2][2] =='O' ||
	            		mat[0][0] == 'O' && mat[1][0]=='O' && mat[2][0] =='O' ||
	            		mat[0][1] == 'O' && mat[1][1]=='O' && mat[2][1] =='O' ||
	            		mat[0][2] == 'O' && mat[1][2]=='O' && mat[2][2] =='O' ||
	            		mat[0][0] == 'O' && mat[1][1]=='O' && mat[2][2] =='O' ||
	            		mat[0][2] == 'O' && mat[1][1]=='O' && mat[2][0] =='O' )
	                {
	            		System.out.println("Jogador 'O' Venceu !!!");
	            		
	            		vencedor = true;
	                }
	        
	            if( mat[0][0] != '?' && mat[0][1] != '?' && mat[0][2] != '?' && 
	            	mat[1][0] != '?' && mat[1][1] != '?' && mat[1][2] != '?' &&
	       			mat[2][0] != '?' && mat[2][1] != '?' && mat[2][2] != '?' &&
	     			mat[0][0] != '?' && mat[1][0] != '?' && mat[2][0] != '?' &&
	            	mat[0][1] != '?' && mat[1][1] != '?' && mat[2][1] != '?' &&
	            	mat[0][2] != '?' && mat[1][2] != '?' && mat[2][2] != '?' &&
	            	mat[0][0] != '?' && mat[1][1] != '?' && mat[2][2] != '?' &&
	            	mat[0][2] != '?' && mat[1][1] != '?' && mat[2][0] != '?' 
	              )    
	                {
	            		System.out.println("Deu Velha !!!");
	            		vencedor = true;
	                }
	}
}