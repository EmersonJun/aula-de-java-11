import java.util.Scanner;

import model.Cidade;
import model.DiaDaSemana;
import model.Pessoa;
import view.PessoaView;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
            // Scanner in = new Scanner(System.in);

        // System.out.println("aula 11-Enum");
        // System.out.println(Cidade.CURITIBA);

        // Cidade cidade = Cidade.PONTA_GROSSA;
        // System.out.println(cidade);

        // // cidade.setDdd(55);
        // Cidade novaCidade = Cidade.PONTA_GROSSA;
        // System.out.println("\n" + cidade + "\n\n" + novaCidade);


        // System.out.println("digite o nome de uma cidade: ");
        // Cidade outraCidade = Cidade.valueOf(
        //     in.nextLine().trim().toUpperCase().replace("", "_")
        // );
        // System.out.println("cidade digitada: "+outraCidade);

        // PessoaView.main(args);

        for(DiaDaSemana dia : DiaDaSemana.values()){
            if(dia.isEhUtil()){
                System.out.println(dia);
            }
        }
    }
}
