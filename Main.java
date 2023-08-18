import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a tu programa para Calcular el (IMC) Indice de masa corporal ");
        System.out.println("A continuacion Ingresa tu estatura en metros");
        double estatura = sc.nextDouble();
        System.out.println("A continuacion Ingresa tu peso en kilos");
        double peso = sc.nextDouble();
        System.out.println("A continuacion Ingresa tu edad en años");
        int annos = sc.nextInt();
        double imc = peso / Math.pow(estatura, 2);
        System.out.println("Tu indice de masa corporal es " + imc);
        if (annos < 45) {
            if (imc < 22.0) {
                System.out.println("Tienes bajo riesgo de contraer enfermedades coronarias");
            } else {
                System.out.println("Tienes riesgo medio de contraer enfermedades coronarias");
            }
        } else {
            if (imc < 22.0) {
                System.out.println("Tienes riesgo medio de contraer enfermedades coronarias");
            } else {
                System.out.println("Tienes alto riesgo de contraer enfermedades coronarias");
            }
        }
    }
}