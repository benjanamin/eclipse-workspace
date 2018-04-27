package objetos;



public class Pila {


	public  void Push(int[] lista,int b,int largo) {
		for(int i=0;i<largo;i++) {
			if(lista[i]==0) {
				lista[i]=b;
				i=largo+2;
			}
		}
	}
	
	public  void Pop(int[] lista,int largo) {
		if(Empty(lista)) {
			System.out.println("Esta vacia");
		}
		else {
			for(int i=largo-1;i>=0;i--) {
				if(lista[i]!=0) {
					lista[i]=0;
					break;
				}
			}
		}
	}
	
	public  boolean Empty(int[] lista) {
		boolean empty=false;
			if(lista[1]!=0){
				empty=false;
			}
			else {
				empty=true;
			}
		
		return empty;
	}
	

}