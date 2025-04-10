package view;
import model.* ;

public class PessoaView {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("view da classe pessoa");

        Pessoa pessoa = new Pessoa("pessoa1", Cidade.SAO_JOSE_DOS_PINHAIS);

        System.out.println("digite a nova cidade: ");

        pessoa.setCidade(scanner.nextLine());
        System.out.println(pessoa);
    }
}
