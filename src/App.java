public class App {
    public static void main(String[] args) throws Exception 
    {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Poderoso chefao";
        meuFilme.anoDeLancamento = 1968;
        meuFilme.duracaoEmMin = 220;

        meuFilme.nome = "Tubarao";

        meuFilme.exibirFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.pegaMedia());

    }
}


