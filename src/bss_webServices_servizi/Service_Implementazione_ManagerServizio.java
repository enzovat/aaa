package bss_webServices_servizi;

import bss_servizi.Manager_servizi;
import bss_servizi.Servizio;

public class Service_Implementazione_ManagerServizio implements Service_Interface_ManagerServizio{
	
	@Override
	public String get_Servizio(int ID_serv){
		return new Manager_servizi().get_Servizio(ID_serv).toString();
	}
	
	@Override
	public boolean add_Servizio(String my_serv){	
		return new Manager_servizi().add_Servizio(new Servizio(my_serv));
	}
	
	@Override
	public boolean remove_Servizio(String my_serv){
		return new Manager_servizi().remove_Servizio(new Servizio(my_serv));
		
	}
	
	@Override
	public boolean modifica_Servizio(String my_serv_old, String my_serv_new){
		return new Manager_servizi().modifica_Servizio(new Servizio(my_serv_old), new Servizio(my_serv_new));		
	}
	
	@Override
	public String visualizza_Servizi(String categoria){
		return new Manager_servizi().visualizza_Servizi(categoria);
		
	}

	@Override
	public int ricercaServizi(String titolo){
		return new Manager_servizi().ricercaServizi(titolo);
		
	}

}
