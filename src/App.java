import java.util.Scanner;

import model.Cidade;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
            Scanner scanner = new Scanner(System.in);

        System.out.println("aula 11-Enum");
        System.out.println(Cidade.CURITIBA);

        Cidade cidade = Cidade.PONTA_GROSSA;
        System.out.println(cidade);

        // cidade.setDdd(55);
        Cidade novaCidade = Cidade.PONTA_GROSSA;
        System.out.println("\n" + cidade + "\n\n" + novaCidade);


        System.out.println("digite o nome de uma cidade: ");
        Cidade outraCidade = Cidade.valueOf(
            scanner.nextLine().trim().toUpperCase().replace("", "_")
        );
        System.out.println("cidade digitada: "+outraCidade);
    }
}
