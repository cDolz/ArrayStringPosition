import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        String matriz[][] = new String[2][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = "s";
            }
        }
        do {
            try {
                System.out.println("Dime las coordenadas de la t: ");
                int fila = sc.nextInt();
                int columna = sc.nextInt();
                matriz[fila][columna] = "t";
                flag = true;
            } catch (InputMismatchException e) {
                System.out.println("El valor introducido no es correcto");
                sc.next();
                flag = false;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("El valor introducido no es correcto");
                flag = false;
            }
        } while (flag == false);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j].equals("t")) {
                    System.out.println(matriz[i][j] + " = " + i + "," + j);
                }
            }
        }
    }
}