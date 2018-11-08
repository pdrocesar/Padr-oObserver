package observerTeste;

import java.util.ArrayList;
import java.util.List;

public class EstacaoMetereologica implements Subject {

	private List<Observer> observers;
	private float temperatura;
	private float umidade;
	private float pressao;
	
	  public EstacaoMetereologica(){
	        observers = new ArrayList<Observer>();
	    }
	
	public void setMedicoes(float temperatura, float umidade , float pressao) {
		this.temperatura = temperatura;
		this.umidade = umidade;
		this.pressao = pressao;
		 notifyObservers();
		
	}

	public void addObserver(Observer observer) {
		 observers.add( observer );		
	}

	public void removeObserver(Observer observer) {
		int index = observers.indexOf( observer );
        if( index > -1 ){
            observers.remove( observer );
        }		
	}

	public void notifyObservers() {
		 for( Observer o :observers ){
	            o.update( temperatura, umidade, pressao );
	        }		
	}
	
	
}
