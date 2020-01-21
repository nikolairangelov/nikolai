import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    static Tendjera tendjera = new Tendjera();


    public static void main(String[] args) {
        while (true) {
            System.out.println("Varene na Qica");
            System.out.println("1. Dobavi qice kum djezve");
            System.out.println("2. Sgotvi qicata");
            System.out.println("3. Izvadi qicata ot djezveto");

            var input = scanner.next();

            switch (input) {
                case "1":
                    tendjera.dobaviQiceKumTendjera();
                    System.out.println("Dobavihte qica");
                    break;
                case "2":

                    System.out.println("Qicata se varqt");
                    tendjera.svari(Svari());
                    break;
                case "3":
                    System.out.println("Qicata sa izvadeni");
                    tendjera.izvadiQica();
            }
        }
    }

    public static String Svari() {
        System.out.println("Kak iskate svoite qica?");
        System.out.println("1. Rohki");
        System.out.println("2. Tvurdo svareni");
        var input = scanner.next();
        switch (input) {
            case "1":
                return "Rohki";
            case "2":
                return "Tvurdo svareni";
        }
        return "";
    }
}
