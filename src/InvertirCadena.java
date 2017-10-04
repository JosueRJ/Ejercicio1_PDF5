
import java.util.Scanner;

public class InvertirCadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int posicion;
        char caracter;
        String original, invertida = new String();
        
        //Ingresar cadena
        System.out.println("Ingrese una cadena :");
        original = scan.nextLine();
        posicion = original.length() - 1;
        while (posicion >= 0){
                caracter = original.charAt(posicion);
                invertida = invertida + caracter;
                posicion--;
        }
        System.out.println("Cadena invertida: " + invertida);

    }
    
}
