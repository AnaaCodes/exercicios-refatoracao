public class ExtractMethod {

    public static void main(String[] args) {
        printOwing("Maria");
    }

    static void printOwing(String name) {
        printBanner();
        printDetails(name, getOutstanding());
    }

    private static void printDetails(String name, double amount) {
        System.out.printf("name: %s%namount: %.2f%n", name, amount);
    }

    private static void printBanner() {
        System.out.println("-- banner --");
    }

    private static double getOutstanding() {
        return 100.00;
    }
}
