package sumarhastanumero;
import java.util.Scanner;

public class SumarHastaNumero {

        public static void main(String[] args) {
            Scanner teclado = new Scanner (System.in);
            System.out.println("inserta un número entero mayor que 1");
            int num;
            
            do{
                //Pedimos el primer número
                num=teclado.nextInt();
                
                if (num<=1){
                    System.out.println("Error. No has introducido un valor correcto. " 
                    + "Vuelve a intentarlo");
                }
            }while (! (num>=1)); //Condicion para salir
            
            int suma=0;
            
            //Realizamos la suma
                    for (int contador = 1; contador <= num; contador++){
                        suma +=contador;
                        
                    }
            System.out.println("La suma es: " + suma);
        
    }
    
}
