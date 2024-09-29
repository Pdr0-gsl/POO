import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criando produto 1
        System.out.print("Digite o código do produto 1: ");
        int codigo1 = sc.nextInt();
        Produto produto1 = new Produto(codigo1);
        
        System.out.print("Digite o nome do produto 1: ");
        sc.nextLine();
        String nome1 = sc.nextLine();
        System.out.print("Digite a quantidade em estoque do produto 1: ");
        int quantidade1 = sc.nextInt();
        System.out.print("Digite o tipo do produto 1: ");
        sc.nextLine();
        String tipo1 = sc.nextLine();
        System.out.print("Digite o valor do produto 1: ");
        double valor1 = sc.nextDouble();
        produto1.inserir(nome1, quantidade1, tipo1, valor1);

        // Criando produto 2
        System.out.print("\nDigite o código do produto 2: ");
        int codigo2 = sc.nextInt();
        Produto produto2 = new Produto(codigo2);
        
        System.out.print("Digite o nome do produto 2: ");
        sc.nextLine();
        String nome2 = sc.nextLine();
        System.out.print("Digite a quantidade em estoque do produto 2: ");
        int quantidade2 = sc.nextInt();
        System.out.print("Digite o tipo do produto 2: ");
        sc.nextLine();
        String tipo2 = sc.nextLine();
        System.out.print("Digite o valor do produto 2: ");
        double valor2 = sc.nextDouble();
        produto2.inserir(nome2, quantidade2, tipo2, valor2);

        // Criando produto 3
        System.out.print("\nDigite o código do produto 3: ");
        int codigo3 = sc.nextInt();
        Produto produto3 = new Produto(codigo3);
        
        System.out.print("Digite o nome do produto 3: ");
        sc.nextLine();
        String nome3 = sc.nextLine();
        System.out.print("Digite a quantidade em estoque do produto 3: ");
        int quantidade3 = sc.nextInt();
        System.out.print("Digite o tipo do produto 3: ");
        sc.nextLine();
        String tipo3 = sc.nextLine();
        System.out.print("Digite o valor do produto 3: ");
        double valor3 = sc.nextDouble();
        produto3.inserir(nome3, quantidade3, tipo3, valor3);

        // Exibir produtos
        System.out.println("\nDados dos produtos:");
        System.out.println(produto1.toString());
        System.out.println(produto2.toString());
        System.out.println(produto3.toString());

        // Vender os produtos
        System.out.print("\nDigite a quantidade a ser vendida do produto 1: ");
        int venda1 = sc.nextInt();
        double totalVenda1 = produto1.vender(venda1);
        if (totalVenda1 > 0) {
            System.out.println("Venda do produto 1 realizada! Unidades vendidas: " + venda1 + ", Valor total: R$ " + totalVenda1);
        } else {
            System.out.println("Não há estoque suficiente para vender " + venda1 + " unidades do produto 1.");
        }

        System.out.print("\nDigite a quantidade a ser vendida do produto 2: ");
        int venda2 = sc.nextInt();
        double totalVenda2 = produto2.vender(venda2);
        if (totalVenda2 > 0) {
            System.out.println("Venda do produto 2 realizada! Unidades vendidas: " + venda2 + ", Valor total: R$ " + totalVenda2);
        } else {
            System.out.println("Não há estoque suficiente para vender " + venda2 + " unidades do produto 2.");
        }

        System.out.print("\nDigite a quantidade a ser vendida do produto 3: ");
        int venda3 = sc.nextInt();
        double totalVenda3 = produto3.vender(venda3);
        if (totalVenda3 > 0) {
            System.out.println("Venda do produto 3 realizada! Unidades vendidas: " + venda3 + ", Valor total: R$ " + totalVenda3);
        } else {
            System.out.println("Não há estoque suficiente para vender " + venda3 + " unidades do produto 3.");
        }

        // Comprar produtos
        System.out.print("\nDigite a quantidade a ser comprada do produto 1 e o novo valor: ");
        int compra1 = sc.nextInt();
        double novoValor1 = sc.nextDouble();
        produto1.comprar(compra1, novoValor1); // Compra (valor novo)

        System.out.print("\nDigite a quantidade a ser comprada do produto 2 (sem alterar valor): ");
        int compra2 = sc.nextInt();
        produto2.comprar(compra2); // Compra (mesmo valor)

        System.out.print("\nDigite a quantidade a ser comprada do produto 3 e o novo valor: ");
        int compra3 = sc.nextInt();
        double novoValor3 = sc.nextDouble();
        produto3.comprar(compra3, novoValor3); // Compra (valor novo)

        // Consultar depois das alterações
        System.out.println("\nDados dos produtos após operações:");
        System.out.println(produto1.toString());
        System.out.println(produto2.toString());
        System.out.println(produto3.toString());

        // Comparar os produtos
        if (produto1.igual(produto2)) {
            System.out.println("\nProduto 1 e Produto 2 são iguais.");
        } else {
            System.out.println("\nProduto 1 e Produto 2 são diferentes.");
        }

        if (produto1.igual(produto3)) {
            System.out.println("Produto 1 e Produto 3 são iguais.");
        } else {
            System.out.println("Produto 1 e Produto 3 são diferentes.");
        }

        sc.close();
    }
}
