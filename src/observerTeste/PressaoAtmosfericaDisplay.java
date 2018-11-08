package observerTeste;

public class PressaoAtmosfericaDisplay implements Observer{
	 private Subject subject;
	private float temperatura;
    private float pressao;

    public PressaoAtmosfericaDisplay(Subject subject) {
    	   this.subject = subject;
           this.subject.addObserver(this);
	}

	public void display(){
        System.out.println( "Pressão atmosférica: "+calcPressaoAtmosferica() );
    }

	public void update(float temperatura, float umidade, float pressao) {
		// TODO Auto-generated method stub
		
	}

}
