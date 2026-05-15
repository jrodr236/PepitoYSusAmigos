import java.util.ArrayList;
import java.util.Scanner;

public class UI {
    public static Scanner entrada = new Scanner(System.in);

    public static Personatge escollirOponent(Personatge atacant, ArrayList<Personatge> personatges) {
        System.out.println(atacant + ", atent!");
        mostrarPersonatges(personatges);
        System.out.println("Escull a qui vols atacar:");
        int escollit = entrada.nextInt();
        return personatges.get(escollit-1);
    }

    public static void mostrarPersonatges(ArrayList<Personatge> personatges) {
        int i = 0;
        for (Personatge p : personatges) {
            System.out.println((i+1) + ". " + p);
            i++;
        }
    }
}
