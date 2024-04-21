import java.util.*;
public class Adivinanza {
    public static void main(String[] args){

        Scanner adivinaElNumero = new Scanner(System.in);
        boolean seguirJugando = true;

        Scanner nuevoIntento = new Scanner(System.in);
        String afirmativo = "Si";
        String intentarNuevoJuego;

        while(seguirJugando){

            int numeroAleatorio = new Random().nextInt(0,100);
            int numeroDeIntentos = 0;
            boolean adivino = false;

            System.out.println("Ingresa un numero: ");
            System.out.println("Adivina el numero secreto, tienes 5 intentos!");

//            VER NUMERO ALEATORIO?
//            System.out.println(numeroAleatorio);
            for (int i=0; i<5 && !adivino ;i++){
                int nuevoNumero;
                nuevoNumero = adivinaElNumero.nextInt();
                numeroDeIntentos++;

                if (nuevoNumero==numeroAleatorio){
                    System.out.println("Felicidades, acertaste el numero!" + " Lo hiciste en " + numeroDeIntentos + " intentos.");
                        break;
                }else {
                    if (numeroDeIntentos == 5){
                        System.out.println("Lo siento no adivinaste el numero.");
                        System.out.println("No has acertado. El número era: " + numeroAleatorio);
                    }
                }
            }
            System.out.println("¿Quieres jugar otra vez? (Si/No)");
            System.out.println();
            intentarNuevoJuego = nuevoIntento.nextLine();
            seguirJugando = intentarNuevoJuego.equalsIgnoreCase(afirmativo);

            if (!seguirJugando){
                System.out.println("Gracias por jugar!");
            }
        }
        adivinaElNumero.close();
    }
}
