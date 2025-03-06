import java.util.Scanner;

public class Calculadora {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Seja bem vindo ao Sistema de Cálculo!");

        int opcao;
        do {
            menu();
            opcao = scan.nextInt();
            quebraLinha();

            switch (opcao) {
                case 1:
                    adicao();
                    break;
                case 2:
                    subtracao();
                    break;
                case 3:
                    multiplicacao();
                    break;
                case 4:
                    divisao();
                    break;
                case 9:
                    System.out.println("Até mais!");
                    scan.close();
                    break;
                default:
                    System.out.println("Digite uma opção válida!");
            }

            quebraLinha();
        } while (opcao != 9);
    }

    public static void menu() {
        System.out.print("""
                Qual operação deseja realizar:
                
                1 - Adição;
                2 - Subtracao;
                3 - Multiplicação;
                4 - Divisão;
                9 - Sair do sistema.
                
                Operação desejada:\u00A0""");
    }

    public static void quebraLinha() {
        System.out.println();
    }

    public static void adicao() {
        int opcao;
        do {
            menuAdicao();
            opcao = scan.nextInt();
            quebraLinha();

            switch (opcao) {
                case 0:
                    System.out.println("Vamos voltar ao menu principal");
                    break;
                case 1:
                    adicaoInteiros();
                    opcao = 0;
                    break;
                case 2:
                    adicaoDecimais();
                    opcao = 0;
                    break;
                default:
                    System.out.println("Digite uma opção válida!");
            }

            quebraLinha();
        } while (opcao != 0);
    }

    public static void menuAdicao() {
        System.out.print("""
                Será uma soma de:
                1 - inteiros
                2 - decimais
                
                opção: \u00A0""");
    }

    public static void adicaoInteiros() {
        int i;
        do {
            System.out.print("Digite a quantidade de números que vamos somar: ");
            i = scan.nextInt();

            if (i < 2) {
                System.out.println("Não é possível somar menos que dois números");
            }
        } while (i < 2);

        int soma = 0;
        int valor;
        for (int j = 1; j <=i; j++) {
            System.out.printf("Digite o %d número: ", j);
            valor = scan.nextInt();
            soma += valor;
        }
        System.out.println("O valor da adição é de: " + soma);
    }

    public static void adicaoDecimais() {
        int i;
        do {
            System.out.print("Digite a quantidade de números que vamos somar: ");
            i = scan.nextInt();

            if (i < 2) {
                System.out.println("Não é possível somar menos que dois números");
            }
        } while (i < 2);

        double soma = 0;
        double valor;
        for (int j = 1; j <=i; j++) {
            System.out.printf("Digite o %d número: ", j);
            valor = scan.nextDouble();
            soma += valor;
        }
        System.out.println("O valor da adição é de: " + soma);
    }

    public static void subtracao() {
        int opcao;
        do {
            menuSubtracao();
            opcao = scan.nextInt();
            quebraLinha();

            switch (opcao) {
                case 0:
                    System.out.println("Vamos voltar ao menu principal");
                    break;
                case 1:
                    subtracaoInteiros();
                    opcao = 0;
                    break;
                case 2:
                    subtracaoDecimais();
                    opcao = 0;
                    break;
                default:
                    System.out.println("Digite uma opção válida!");
            }

            quebraLinha();
        } while (opcao != 0);
    }

    public static void menuSubtracao() {
        System.out.print("""
                Será uma subtração de:
                1 - inteiros
                2 - decimais
                
                opção: \u00A0""");
    }

    public static void subtracaoInteiros() {
        int i;
        do {
            System.out.print("Digite a quantidade de números que vamos subtrair: ");
            i = scan.nextInt();

            if (i < 2) {
                System.out.println("Não é possível subtrair menos que dois números");
            }
        } while (i < 2);

        int subtracao = 0;
        int valor;
        for (int j = 1; j <=i; j++) {
            System.out.printf("Digite o %d número: ", j);
            valor = scan.nextInt();
            if (j == 1) {
               subtracao = valor;
            } else {
                subtracao -= valor;
            }
        }
        System.out.println("O valor da subtração é de: " + subtracao);
    }

    public static void subtracaoDecimais() {
        int i;
        do {
            System.out.print("Digite a quantidade de números que vamos subtrair: ");
            i = scan.nextInt();

            if (i < 2) {
                System.out.println("Não é possível subtrair menos que dois números");
            }
        } while (i < 2);

        double subtracao = 0;
        double valor;
        for (int j = 1; j <=i; j++) {
            System.out.printf("Digite o %d número: ", j);
            valor = scan.nextDouble();
            if (j == 1) {
                subtracao = valor;
            } else {
                subtracao -= valor;
            }
        }
        System.out.println("O valor da subtração é de: " + subtracao);
    }

    public static void multiplicacao() {
    int i;
        do {
        System.out.print("Digite a quantidade de números que vamos multiplicar: ");
        i = scan.nextInt();

        if (i < 2) {
            System.out.println("Não é possível multiplicar menos que dois números");
        }
    } while (i < 2);

    double multiplicacao = 0;
    double valor;
        for (int j = 1; j <=i; j++) {
        System.out.printf("Digite o %d número: ", j);
        valor = scan.nextDouble();
        if (j == 1) {
            multiplicacao = valor;
        } else {
            multiplicacao *= valor;
        }
    }
        System.out.println("O valor da multiplicação é de: " + multiplicacao);
    }

    public static void divisao() {
        int i;
        do {
            System.out.print("Digite a quantidade de números que vamos dividir: ");
            i = scan.nextInt();

            if (i < 2) {
                System.out.println("Não é possível dividir menos que dois números");
            }
        } while (i < 2);

        double divisao = 0;
        double valor;
        for (int j = 1; j <=i; j++) {
            System.out.printf("Digite o %d número: ", j);
            valor = scan.nextDouble();
            if (j == 1) {
                divisao = valor;
            } else {
                divisao /= valor;
            }
        }
        System.out.println("O valor da divisão é de: " + divisao);
    }

}