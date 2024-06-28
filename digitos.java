import java.util.Scanner;

public class pruebas {
 public static void main(String[] args) {
  
  Scanner cap_teclado = new Scanner(System.in);

  System.out.print("Dame un numero para calcular sus digitos: ");
  int num = cap_teclado.nextInt();
  
  calcular(num);
  cap_teclado.close();
  
 }  
 public static void calcular(int num){
    int digitos = 1;
    while (num > 9){
      digitos = digitos + 1 ;
      num = num / 10;
    }

  System.out.print("El numero es de " + digitos + " digitos");

  } 
  
}
