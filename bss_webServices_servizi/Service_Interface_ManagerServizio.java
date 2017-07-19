package bss_webServices_servizi;


public interface Service_Interface_ManagerServizio {
	
	public String get_Servizio(int ID_serv);
	
	public boolean add_Servizio(String my_serv);
	
	public boolean remove_Servizio(String my_serv);
	
	public boolean modifica_Servizio(String my_serv_old, String my_serv_new);
	
	public String visualizza_Servizi(String categoria);

	public int ricercaServizi(String titolo);

}
