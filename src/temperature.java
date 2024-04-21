import javax.swing.*;
public class Temperature {
    public static void main(String[] args){

        String tempCelsius = JOptionPane.showInputDialog("Ingrese la temperatura en Celcius:");
        double convertNewCelcius = Double.parseDouble(tempCelsius);

        double tempFahrenheit = (convertNewCelcius * 1.8) + 32;

        String message = String.format("La temperatura de %1.2f Celsius es equivalente a %1.2f Fahrenheit", convertNewCelcius, tempFahrenheit);

        System.out.println(message);

        int tempFahrenheitConvertInt = (int) Math.round(tempFahrenheit);

        System.out.println("La temperatura en Fahrenheit entera es: " + tempFahrenheitConvertInt);
    }

}
