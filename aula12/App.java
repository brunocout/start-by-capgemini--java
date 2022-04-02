package aula12;

public class App {
    public static void main(String[] args) throws Exception {

        Invoice inv = new Invoice(1, "Mousepad", -10, 50.0f);
        System.out.println("Valor total = " + inv.getInvoiceAmount());

    }
}
