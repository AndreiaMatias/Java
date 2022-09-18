
package EstruturaCondicionalEscolha;

public class App {
    

    public static void main(String[] args) {
        int codigoProduto = 2;
        
        switch(codigoProduto){
            case 1:
                System.out.println("Arroz");
                break;
            case 2:
                System.out.println("Feijão");
                break;
            default:
                System.out.println("Não cadastrado");
        }
    }
}
