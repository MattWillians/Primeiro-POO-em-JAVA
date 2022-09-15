package cadastro;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner inputText = new Scanner(System.in);
        
        System.out.println("Digite seu Nome");
        String nome = inputText.next();
        

        System.out.println("Digite sua idade");
        int idade = inputText.nextInt();

        System.out.println("Digite seu registro");
        int registro =inputText.nextInt();

        cadastrar infoCadastro = new cadastrar();

        infoCadastro.nomeAluno = nome;
        infoCadastro.idadeAluno = idade;
        infoCadastro.registroAluno = registro;

        infoCadastro.cadastroFinal();

    }
}
