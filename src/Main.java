public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido(a) a Screen Match");
        System.out.println("Pelicula: Matrix");

        int streamingDate = 1999;
        boolean planInclude = true;
        double starPoints = 8.2;

        double media = (8.2 + 6.0 + 9.0) / 3;
        System.out.println(media);

        String resumeMovie = """
                Matrix es una parajoda
                La mejor pelicula del final del milenio
                Fue lanzada en:
                """ + streamingDate;
        System.out.println(resumeMovie);


        int totalStars = (int) (media/2);
        System.out.println(totalStars);

    }
}