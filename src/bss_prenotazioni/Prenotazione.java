package bss_prenotazioni;
import java.io.Serializable;

public class Prenotazione implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int ID_Prenotazione;
	private int ID_Servizio;
	private int ID_Cliente;
	private	boolean stato;
	private	String data;
	
	public Prenotazione(String myhardcodedString)
	{
		String[] tmp = myhardcodedString.split("::");
		this.ID_Prenotazione = Integer.parseInt(tmp[1]);
		this.ID_Servizio = Integer.parseInt(tmp[2]);
		this.ID_Cliente = Integer.parseInt(tmp[3]);
		this.stato = Boolean.getBoolean(tmp[4]);
		this.data = tmp[5];
		
	}
	
	public Prenotazione(int ID_pren, int ID_Serv, int ID_Client, boolean stato, String data){
		this.ID_Prenotazione = ID_pren;
		this.ID_Servizio = ID_Serv;
		this.ID_Cliente = ID_Client;
		this.stato = stato;
		this.data = data;
	}
	
	public int getID_Prenotazione() {
		return ID_Prenotazione;
	}
	public void setID_Prenotazione(int iD_Prenotazione) {
		ID_Prenotazione = iD_Prenotazione;
	}
	public int getID_Servizio() {
		return ID_Servizio;
	}
	public void setID_Servizio(int iD_Servizio) {
		ID_Servizio = iD_Servizio;
	}
	public int getID_Cliente() {
		return ID_Cliente;
	}
	public void setID_Cliente(int iD_Cliente) {
		ID_Cliente = iD_Cliente;
	}
	public boolean getStato() {
		return stato;
	}
	public void setStato(boolean stato) {
		this.stato = stato;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String toString(){
		return  ID_Prenotazione + "::" + ID_Servizio + "::" + ID_Cliente + "::"+ stato + "::" + data;				
	}
}
