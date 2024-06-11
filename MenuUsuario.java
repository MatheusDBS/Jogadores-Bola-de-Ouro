import java.util.Scanner;

public class MenuUsuario {
    Scanner leitor = new Scanner(System.in);
     public int exibeMenu() {
        Scanner leitor = new Scanner(System.in);
        int opcaoMenu;
        System.out.println("====== Menu Ballon D'or ====== \n" +
                "1- Listar todos os vencedores do Balon D'or\n" +
                "2- Ver qual jogador ganhou mais vezes o prêmio\n" +
                "3- Ver qual nacionalidade ganhou mais vezes o prêmio\n" +
                "4- Adicionar novo Jogador que ganhou o prêmio\n" +
                "5- Buscar Jogador por nome\n" +
                "6- ");
                
        opcaoMenu = leitor.nextInt();
        leitor.nextLine();
        return opcaoMenu;
        
    }
    public String lerNomeJogador() {
        System.out.println("Digite o nome do jogador que deseja buscar:");
        return leitor.nextLine();
    }
}
