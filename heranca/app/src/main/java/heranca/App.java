package heranca;

import java.util.Date;

public class App {
   

    public static void main(String[] args) {
        Vendedor v = new Vendedor();
        v.setNome("Marcio");
        v.setDataNascimento(new Date());
        v.setCpf("12345678999");
        v.setSalario(1000);
        v.setComissaoPorItem(10);
        v.setTotalItensVendidos(10);
        System.out.println("o salario do vendedor é " + v.calcularSalario());
        
        Motorista m = new Motorista();
    }
}
