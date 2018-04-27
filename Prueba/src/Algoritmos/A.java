package Algoritmos;
//me base en el juego del gato ya que es un tablero simple
public class A {
	static int rows=10;
	static int cols=10;
	static int seven=7;
	public static int[][] board = new int[rows][cols];
	public static char[][] palets = new char[7][7];
	
	public static void main(String[] args) {
		inicio();
		agregar();
		mostrar();
	}
	public static void agregar(){
		while(seven!=0) {
			for (int row = 0; row < rows; ++row) {
		          for (int col = 0; col < cols; ++col) {
		        	  if(Math.random()>0.5&&seven>0) {
		        		  board[row][col]=7;
		        		  seven=seven-1;
		        	  }
		          }
			}
			
		}
	}
	public static void mostrar() {
	      for (int row = 0; row < rows; ++row) {
	          for (int col = 0; col < cols; ++col) {
	        	  tipo(board[row][col]);
	             if (col != cols - 1) {
	                System.out.print("|");   // print vertical partition
	             }
	          }
	          System.out.println();
	          if (row != rows - 1) {
	             System.out.println("-----------"); // print horizontal partition
	          }
	       }
	       System.out.println();
	}
	public static void inicio() {
		for (int row = 0; row < rows; ++row) {
	         for (int col = 0; col < cols; ++col) {
	            board[row][col] = 'x'; 
	         }
	      }
	}
	public static void tipo(int tipo) {
	      switch (tipo) {
	         case 7:  System.out.print("  X  "); break;

	         default:  System.out.print(" "); break;
	      }
	}
}

