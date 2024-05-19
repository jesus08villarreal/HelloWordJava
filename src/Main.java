import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome to the java Certificate.");
        System.out.print("Quieres comenzar un recorrido for?");

        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        if (numero == 1) {
            for (int i = 0; i < 10; i++) {
                System.out.println("El valor de i es: " + i);
            }
        } else {
            System.out.println("No se ha seleccionado la opcion de comenzar el recorrido for");
        }
    }
}