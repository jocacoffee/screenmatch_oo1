import br.com.joao.screenmatch.calculos.CalculadoraDeTempo;
import br.com.joao.screenmatch.modelos.Filme;
import br.com.joao.screenmatch.modelos.Titulo;
import br.com.joao.screenmatch.modelos.Serie;

public class Principal {

    public static void main(String[] args) {
        Filme favorito = new Filme();

        favorito.setNome("The Matrix");
        favorito.setAnoDeLancamento(1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);
        favorito.setNome(favorito.getNome().toUpperCase());
        System.out.println("Duração do filme: " + favorito.getDuracaoEmMinutos());

        favorito.exibeFichaTecnica();
        favorito.avalia(9);
        favorito.avalia(8);
        favorito.avalia(9);

        System.out.println("Total de avaliações: " + favorito.getTotalDeAvaliacoes());
        System.out.println("Média de avaliações do filme: " +favorito.pegaMedia());

        System.out.println(" ");

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2004);
        lost.setTemporadas(6);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        lost.exibeFichaTecnica();

        Filme outroFilme = new Filme();

        outroFilme.setNome("Barbie");
        outroFilme.setAnoDeLancamento(1999);
        outroFilme.setDuracaoEmMinutos(180);
        outroFilme.setIncluidoNoPlano(true);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(favorito);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());




        //Pessoa pessoa1 = new Pessoa();
        //pessoa1.nome = "João Carlos Coelho";
        // pessoa1.idade = 33;
        //pessoa1.CPF = 001110102;

        //pessoa1.dizOi();
        //pessoa1.fazAniversario();
    }





}