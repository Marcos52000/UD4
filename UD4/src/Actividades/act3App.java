/**
 * 
 */
package Actividades;

/**
 * @author Marcos
 *
 */
public class act3App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int X = 5;
		int Y = 3;
		double N = 5.5;
		double M = 10.5;

		System.out.println("N:" + N + " M:" + M + " X:" + X + " Y:" + Y);
		System.out.println("suma: " + (X + Y));
		System.out.println("resta: " + (X - Y));
		System.out.println("producto: " + (X * Y));
		System.out.println("cocionte: " + (X / Y));
		System.out.println("resto: " + (X % Y));

		System.out.println("suma: " + (N + M));
		System.out.println("resta: " + (N - M));
		System.out.println("producto: " + (N * M));
		System.out.println("cocionte: " + (N / M));
		System.out.println("resto: " + (N % M));

		System.out.println("doble X: " + (X*2) + "doble Y: " + (Y*2) + " doble N: " + (N*2) + " doble M: " + (M*2));

		System.out.println("suma de tosos: " + (Y + X + N + M));

		System.out.println("producto de todos: " + (Y* X* N * M));
	}

}
