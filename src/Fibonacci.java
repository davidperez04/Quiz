import java.util.Scanner;

public class Fibonacci 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("por favor ingrese un numero entero y positivo como límite para la secuencia de Fibonacci");
        int numPositivo = scanner.nextInt();
        scanner.close();
        int Fibonacci = 0;
        int suma = 0;
        int Resultado = 0;


        for (int i = 0 ; i <= numPositivo ; i++){
            suma = suma + i;
            Resultado = suma ;
            System.out.println(Resultado);


        }
    }
}
