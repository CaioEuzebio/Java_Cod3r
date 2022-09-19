package Classes;


public class ProdutoTeste {
    public static void main(String[] args) {
     
        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 4150.92;
        p1.desconto = .10;

        System.out.printf("\nO Produto é o: %s, O Preço é de: R$ %s",p1.nome , p1.preco);

        System.out.printf("\nO Preço do %s com desconto é R$ %s",p1.nome, p1.precoComDesconto());
     
    }
    
}

