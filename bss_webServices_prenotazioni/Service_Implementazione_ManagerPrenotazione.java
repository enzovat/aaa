package bss_webServices_prenotazioni;

import bss_prenotazioni.ManagerPrenotazione;
import bss_prenotazioni.Prenotazione;

public class Service_Implementazione_ManagerPrenotazione implements Service_Interface_ManagerPrenotazione{
	

	@Override
	public String get_prenotazione(int ID_Prenotazione)
	{
		return new ManagerPrenotazione().get_prenotazione(ID_Prenotazione).toString();
	}
	
	
	@Override
	public boolean addPrenotazione(String mypren)
	{
		//CostruzioneOggetto Prenotazione
		
		return new ManagerPrenotazione().AddPrenotazione(new Prenotazione(mypren));
	}


	@Override
	public boolean delPrenotazione(String mypren)
	{
		return new ManagerPrenotazione().DelPrenotazione(new Prenotazione(mypren));
	}
	

	@Override
	public boolean editPrenotazione(String mypren_toMod, String mypren_New)
	{
		return new ManagerPrenotazione().EditPrenotazione(new Prenotazione(mypren_toMod), new Prenotazione(mypren_New));
	}

	@Override
	public int searchPrenotazione(int id_cliente)
	{
		return new ManagerPrenotazione().SearchPrenotazione(id_cliente);
	}

}
