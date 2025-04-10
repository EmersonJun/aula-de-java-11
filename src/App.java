import model.Cidade;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        System.out.println("aula 11-Enum");
        System.out.println(Cidade.CURITIBA);

        Cidade cidade = Cidade.PONTA_GROSSA;
        System.out.println(cidade);

        cidade.setDdd(55);
        Cidade novaCidade = Cidade.PONTA_GROSSA;
        System.out.println("\n" + cidade + "\n\n" + novaCidade);
    }
}
