import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        KasaProcessor kasaProcessor = new KasaProcessor();
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Zlevněné itemy");
        System.out.println("2. Serazene itemy");
        System.out.println("3. Prvních 50 nejlevnějších itemů");
        System.out.println("4. ");
        System.out.println("5. ");
        System.out.println("6. ");

        String SCANNER = scanner.nextLine();

        if (SCANNER.equals("1")) {
            kasaProcessor.printOnlyDiscountedProducts();
        } else if (SCANNER.equals("2")) {
            kasaProcessor.sortProductByPrice();
        } else if (SCANNER.equals("3")) {
            kasaProcessor.printFirstSortedProducts();
        }
    }
}
