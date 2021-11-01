import jdk.internal.icu.impl.CharacterIteratorWrapper;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;
public class UsaPessoa {
    // construtor default para objetos da classe
    // UsaPessoa este construtor existe mesmo se não
    // for explicitamente declarado

    public static void main(String[] args) {
        //Declara objeto pessoa1
        Scanner input = new Scanner(System.in);
        Pessoa pessoa1;


        //Cria o objeto pessoa1 que é instância da classe Pessoa
        pessoa1 = new Pessoa();

        //Define os valores para os atributos de pessoa1
        System.out.println("Nome: ");
        pessoa1.nome = input.nextLine();

        System.out.println("Genero: ");
        pessoa1.genero = input.next().charAt(0);

        System.out.println("Idade: ");
        pessoa1.idade = input.nextInt();

        //pessoa1.setNome("Camila");
        //pessoa1.setGenero('F');
        //pessoa1.setIdade(12);

        System.out.println("\n" + pessoa1.getNome());
        System.out.println(pessoa1.getGenero());
        System.out.println(pessoa1.getIdade());

    // System.out.println("O objeto pessoa1 chama-se " + pessoa1.nome + ", é do sexo " + pessoa1.genero + ", tem " + pessoa1.idade + " anos e diz: " + pessoa1.falar);
    }
}
