import java.util.*;
public class Loops {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        double nota = 0;
        double media = 0;
        for (int i=0 ; i<3 ; i++){

            System.out.println("Escoge la nota que le darias a la pelicula Matrix");
            nota = keyboard.nextDouble();
            media = media+nota;
        }
        System.out.println("la media de Matrix es: " + media/3);
    }
}
