public class Desiciones {

    public static void main(String[] args){

        int streamingDate = 1999;
        boolean planInclude = false;
        double starPoints = 8.2;
        String planType = "Plus";

        if (streamingDate >= 2022){
            System.out.println("Pelicula mas populares");
        }else {
            System.out.println("Pelicula retro que aun vale la pena ver");
        }

        if ( planInclude && planType.equals("Plus")){
            System.out.println("Disfrute de su pelicula");
        }else {
            System.out.println("Pelicula no disponible para su plan actual");
        }
    }

}
