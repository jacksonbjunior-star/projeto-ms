package br.com.streaming.modelo;

public class Serie extends Conteudo {
    private int temporadas;
    private int episodiosporTemporada;

    public Serie(String titulo, int duracao, int classificacaoIndicativa, int temporadas, int episodiosporTemporada) {
        super(titulo, duracao, classificacaoIndicativa);
        this.temporadas = temporadas;
        this.episodiosporTemporada = episodiosporTemporada;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Detalhes da Série:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Temporadas: " + temporadas);
        System.out.println("Episódios por Temporada: " + episodiosporTemporada);
        System.out.println("Classificação Indicativa: " + getClassificacaoIndicativa() + " anos");
        System.out.println("Duração por Episódio: " + getDuracao() + " minutos");
        System.out.println("-----------------------------");
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        if (temporadas > 0) {
            this.temporadas = temporadas;
        } else {
            System.out.println("Erro: Uma série deve ter pelo menos 1 temporada.");
            this.temporadas = 1;
        }
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        if (episodiosPorTemporada > 0) {
            this.episodiosPorTemporada = episodiosPorTemporada;
        } else {
            System.out.println("Erro: O número de episódios deve ser maior que 0.");
            this.episodiosPorTemporada = 1;
        }
    }
}