import Controller.Controller;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Controller controlador = new Controller();
        Scanner scan = new Scanner(System.in);
        int index;

        System.out.println("ESCOLHA UM CURSO\n");
        controlador.imprimirCursos();

        index = scan.nextInt();

        controlador.imprimeAlunos(index);

        scan.close();

    }
}
