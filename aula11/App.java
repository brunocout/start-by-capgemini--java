package aula11;

import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {

        Vendedor v = new Vendedor();
        v.setNome("Marcio");
        v.setSalario(100.0f);
        v.setCpf("23723424");
        v.setDataNascimento(new Date());
        v.setComissãoPorItem(10.0f);
        v.setTotalItensVendidos(10);
        System.out.println("O salário do vendedor é: " + v.calcularSalario());
        
        // Motorista m = new Motorista();
    }
}
