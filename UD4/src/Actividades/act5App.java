package Actividades;

public class act5App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 5;
		int B = 10;
		int C = 2;
		int D = 7;
		
		B = C;
		C = A;
		A = D;
		D = B;
		
		System.out.println("Valor A: "+A+" Valor B: "+B+" Valor C: "+C+" Valor D: "+D);
	}

}
