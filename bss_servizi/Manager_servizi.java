package bss_servizi;
import java.io.Serializable;

public class Manager_servizi implements Serializable{

	private static final long serialVersionUID= 456L;	
	String array_serv = "Colloquio Lavoro Studio Avvocati+Parrucchiere+Visita Medica Specialistica+Estetista";

	public Servizio get_Servizio(int ID_serv)
	{
		if(ID_serv == 1)
			return new Servizio(1,"Colloquio Lavoro Studio Avvocati","colloquio conoscitivo",1,1,3,"10 luglio","17:00-20:00","10/07-20-07","giurisprudenza");
		else
			return new Servizio(-1, "Dummy Service","",-1,-1,-1,"","","","");
	}
	
	public boolean add_Servizio(Servizio my_serv)
	{
		return false;
	}
	
	public boolean remove_Servizio(Servizio my_serv)
	{
		return false;
	}
	
	public boolean modifica_Servizio(Servizio my_serv_old, Servizio my_serv_new)
	{
		return false;
	}
	
	public String visualizza_Servizi(String categoria)
	{
		return array_serv;
	}
	
	public int ricercaServizi(String titolo)
	{
	/*
	 * Metodo per la ricerca dei servizi dato un titolo
	 * Restituisce id dei servizi aventi quel titolo
	 */
		if(titolo == "Colloquio Lavoro Studio Avvocati")
			return 1; //ID del servizio
		else
			return -1;
	}
	
}
