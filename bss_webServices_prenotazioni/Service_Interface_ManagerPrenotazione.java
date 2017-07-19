package bss_webServices_prenotazioni;

public interface Service_Interface_ManagerPrenotazione {
	
	public String get_prenotazione(int ID_Prenotazione);
	public boolean addPrenotazione(String mypren);
	public boolean delPrenotazione(String mypren);
	public boolean editPrenotazione(String mypren_toMod, String mypren_New);
	public int searchPrenotazione(int id_cliente);
}