package observerTeste;

public class TesteEstacao {

	public static void main(String[] args) {
		
		 EstacaoMetereologica estacao = new  EstacaoMetereologica();

        EstatisticasDisplay estatisticasDisplay = new EstatisticasDisplay( estacao );
        MediaDisplay mediaDisplay = new MediaDisplay( estacao );
        PressaoAtmosfericaDisplay pressaoAtmosfericaDisplay = new PressaoAtmosfericaDisplay( estacao );

        estacao.setMedicoes(87, 47, 14.4f);
        estacao.setMedicoes(91, 23, 108.2f);
        estacao.setMedicoes(65, 30, 41.2f);

	}

}
