import java.util.*;

public class Lectura {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Escribe el nombre de tu pelicula favorita");
        String movie = keyboard.nextLine();

        System.out.println("Ahora escribe la fecha de lanzamiento");
        int stream = keyboard.nextInt();

        System.out.println("Por ultimo dinos que nota le das a esta pelicula");
        double score = keyboard.nextDouble();

        System.out.println(movie);
        System.out.println(stream);
        System.out.println(score);

        keyboard.close();
    }
}
