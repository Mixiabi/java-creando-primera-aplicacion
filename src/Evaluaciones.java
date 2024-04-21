import java.util.*;
public class Evaluaciones {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        double nota = 0;
        double media = 0;
        double totalEvaluaciones = 0;

//      SI ES IGUAL A -1 EL CICLO SERA INTERRUMPIDO
        while (nota != -1){
            System.out.println("Escoge la nota que le darias a la pelicula Matrix");
            nota = keyboard.nextDouble();

//          MIENTRAS SEA DIFERENTE DE -1 SE EJECUTARA
            if (nota != -1){
                media += nota;//AUMENTA LA MISMA MEDIA + NOTA
                totalEvaluaciones++;
            }
        }
        System.out.println("la media de Matrix es: " + media/totalEvaluaciones );
    }
}
