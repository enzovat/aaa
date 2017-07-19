package bss_prenotazioni;
import java.io.Serializable;

public class ManagerPrenotazione implements Serializable{


	private static final long serialVersionUID = 1L;

	public Prenotazione get_prenotazione(int ID_Prenotazione){
	/*
	 * Metodo per la selezione di una Prenotazione in base all'ID di prenotazione
	 */
		//Query al db
		//Popolazione oggetto mylocalPren
		if(ID_Prenotazione == 1)
			return new Prenotazione(1,1,1,false,"today");
		else
			return new Prenotazione(-1,-1,-1,false,"Dummy");
	}
	
	public boolean AddPrenotazione(Prenotazione mypren)
	{
	/*
	 * Metodo per l'inserimento di una Prenotazione nel DB
	 */
		//Insert nel db
		return false;
	}
	
	public boolean DelPrenotazione(Prenotazione mypren)
	{
	/*
	 * Metodo per la cancellazione di una Prenotazione in base all'ID di prenotazione
	 */
		//Delete nel db
		return false;
	}
	
	public boolean EditPrenotazione(Prenotazione mypren_toMod, Prenotazione mypren_New)
	{
	/*
	 * Metodo per la selezione di una Prenotazione in base all'ID di prenotazione
	 */
		//Update nel db
		mypren_New.setStato(true);
		if(mypren_New.getStato())
			return true;
		else
			return false;
	}
	
	public int SearchPrenotazione(int id_cliente)
	{
	/*
	 * Metodo per la ricerca delle prenotazioni effettuate da un particolare cliente
	 * Restituisce gli'id delle prenotazioni per un dato cliente 
	 */
		//Query al db per id cliente
		if(id_cliente == 1)
			return 1;
		else
			return -1;
	}

}
