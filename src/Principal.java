import br.com.gustavo.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Kimetsu no yaiba infinite castle part 2");
        meuFilme.setAnoDeLancamento(2026);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.setDuracaoEmMinutos(180);


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(9);
        meuFilme.avalia(10);
        meuFilme.avalia(2);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média de avaliação do filme: " +meuFilme.pegaMedia());

        


    }
}