/**
 *
 * @author Vinicius
 */
// refinar cod e alterar possiveis pontos de falha
import java.util.Scanner;
public class GuicheAeroporto {

   public static void main(String[] args) {
        int menu;
        Scanner scanner = new Scanner(System.in);
        boolean[] assento = new boolean[10];
        boolean todosAssentosPreenchidos = false;  // Esse serve como fator do lopping while, que vai permitir a interação do usuario até preencher todos os assentos do vôo.

        while (!todosAssentosPreenchidos) {
            System.out.println("1. Por favor digite 1 para Primeira Classe");
            System.out.println("2. Por favor digite 2 para Segunda Classe");
            System.out.println("0. Para sair digite 0");
            System.out.print("Escolha uma opção: ");
            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Você escolheu a Opção 1. PRIMEIRA CLASSE");
                    boolean primeiraClasseCheia = true; // aqui é um verificador para quando a classe atingir o máximo

                    for (int i = 0; i < 5; i++) {
                        if (!assento[i]) {
                            System.out.println("Assento " + i + " está vago.");
                            // Marque o assento como ocupado
                            assento[i] = true;
                            System.out.println();
                            System.out.println("CARTÃO DE EMBARQUE> SUA POLTRONA É A NÚMERO " + i + " NA PRIMEIRA CLASSE.");
                            System.out.println();
                            primeiraClasseCheia = false;
                            break;
                        }
                    }

                    if (primeiraClasseCheia) {
                        System.out.println("Primeira classe está cheia. Gostaria de alocar-se na Segunda classe?.");
                        System.out.println("Responde com 1 para SIM e 0 para NÃO.");
                        int decisao = scanner.nextInt();
                        if (decisao == 1){
// --------------------- repetir todo o case 2 -------------------------------------------------------------------------------
                           System.out.println("Você escolheu a Opção 2. SEGUNDA CLASSE");
                           System.out.println();

                           boolean segundaClasseCheia = true;
                    
                            for (int i =5; i <10; i++ ){
                                if (!assento[i]){
                                System.out.println("Assento" + i + "está vago");
                                assento[i] = true;
                                System.out.println();
                                System.out.println("CARTÃO DE EMBARQUE> SUA POLTRONA É A NÚMERO " + i + " NA SEGUNDA CLASSE.");
                                System.out.println();
                                segundaClasseCheia = false;
                                break;
                        }
                    }
                            if (segundaClasseCheia){
                              //  System.out.println("Segunda classe está cheia. Escolha outra classe.");
                                }
                                break;    
                            }
                        }
                    break;
// ------------------------------------------------- FIM DO CASE 1 -------------------------------------------------
                case 2:
                    System.out.println("Você escolheu a Opção 2. SEGUNDA CLASSE");
                    System.out.println();

                    boolean segundaClasseCheia = true;
                    
                    for (int i =5; i <10; i++ ){
                        if (!assento[i]){
                            System.out.println("Assento" + i + "está vago");
                            assento[i] = true;
                            System.out.println();
                            System.out.println("CARTÃO DE EMBARQUE> SUA POLTRONA É A NÚMERO " + i + " NA SEGUNDA CLASSE.");
                            System.out.println();
                            segundaClasseCheia = false;
                            break;
                        }
                    }//------------------------------------------------------------ REPETIR LOGICA-----------------------
                    if (segundaClasseCheia){
                        System.out.println("Segunda classe está cheia. Gostaria de alocar-se na Primeira classe?.");
                        System.out.println("Responde com 1 para SIM e 0 para NÃO.");
                /*        int decisao = scanner.nextInt();
                        if (decisao == 1){
                    System.out.println("Você escolheu a Opção 1. PRIMEIRA CLASSE");
                           boolean primeiraClasseCheia = true;
                    
                            for (int i =0; i <5; i++ ){
                                if (!assento[i]){
                                System.out.println("Assento" + i + "está vago");
                                assento[i] = true;
                                System.out.println("CARTÃO DE EMBARQUE> SUA POLTRONA É A NÚMERO " + i + " NA SEGUNDA CLASSE.");
                                primeiraClasseCheia = false;
                                break;
                        }
                    }
                            if (primeiraClasseCheia){
                              //  System.out.println("Segunda classe está cheia. Escolha outra classe.");
                                }
                                break;    */
                            }
                    
                    break;
                case 0:
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    System.exit(0); // Termina o programa    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            // Verifique se todos os assentos estão preenchidos
            todosAssentosPreenchidos = true;
            for (boolean ocupado : assento) {
                if (!ocupado) {
                    todosAssentosPreenchidos = false;
                    break;
                }
            }
        }

        System.out.println("Todos os assentos estão preenchidos. O avião está lotado. Próximo Voo parte em 3 horas.");
    }
}
