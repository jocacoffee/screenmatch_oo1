import br.com.joao.screenmatch.modelos.Filme;

public class Principal {

    public static void main(String[] args) {
        Filme favorito = new Filme();

        favorito.nome = "The Matrix";
        favorito.anoDeLancamento = 1999;
        favorito.duracaoEmMinutos = 135;
        favorito.incluidoNoPlano = true;

        favorito.exibeFichaTecnica();
        favorito.avalia(9);
        favorito.avalia(8);
        favorito.avalia(9);

        System.out.println("Total de avaliações: " + favorito.getTotalDeAvaliacoes());
        System.out.println("Média de avaliações do filme: " +favorito.pegaMedia());


        //Pessoa pessoa1 = new Pessoa();
        //pessoa1.nome = "João Carlos Coelho";
        // pessoa1.idade = 33;
        //pessoa1.CPF = 001110102;

        //pessoa1.dizOi();
        //pessoa1.fazAniversario();
    }





}