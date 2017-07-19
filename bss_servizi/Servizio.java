package bss_servizi;
import java.io.Serializable;


public class Servizio implements Serializable {
	
	private static final long serialVersionUID= 123L;
	
	private int ID_servizio;
	private String titolo;
	private String descrizione;
	private int id_esercente;
	private int capacita;
	private int durata_app;
	private String data_inser;
	private String fasce_orarie;
	private String periodo_disp;
	private String categoria;
	
	public Servizio(String myhardcodedString)
	{
		String[] tmp = myhardcodedString.split("::");
		this.ID_servizio = Integer.parseInt(tmp[1]);
		this.titolo = tmp[2];
		this.descrizione = tmp[3];
		this.id_esercente = Integer.parseInt(tmp[4]);
		this.capacita = Integer.parseInt(tmp[5]);
		this.durata_app = Integer.parseInt(tmp[6]);
		this.data_inser = tmp[7];
		this.fasce_orarie= tmp[8];
		this.periodo_disp= tmp[9];
		this.categoria = tmp[10];
	}
	
	
	public Servizio(int ID_serv,String titolo, String descrizione, int id_esercente, 
					int capacita, int durata_app, String data_inser, String fasce_orarie,
					String periodo_disp, String categoria){
		
		this.ID_servizio=ID_serv;
		this.titolo=titolo;
		this.descrizione=descrizione;
		this.id_esercente=id_esercente;
		this.capacita=capacita;
		this.durata_app=durata_app;
		this.data_inser=data_inser;
		this.fasce_orarie=fasce_orarie;
		this.periodo_disp=periodo_disp;
		this.categoria=categoria;
		
	}
		
	public int getID_servizio() {
		return ID_servizio;
	}


	public void setID_servizio(int iD_servizio) {
		ID_servizio = iD_servizio;
	}
	
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public int getId_esercente() {
		return id_esercente;
	}
	public void setId_esercente(int id_esercente) {
		this.id_esercente = id_esercente;
	}
	public int getCapacita() {
		return capacita;
	}
	public void setCapacita(int capacita) {
		this.capacita = capacita;
	}
	public int getDurata_app() {
		return durata_app;
	}
	public void setDurata_app(int durata_app) {
		this.durata_app = durata_app;
	}
	public String getData_inser() {
		return data_inser;
	}
	public void setData_inser(String data_inser) {
		this.data_inser = data_inser;
	}
	public String getFasce_orarie() {
		return fasce_orarie;
	}
	public void setFasce_orarie(String fasce_orarie) {
		this.fasce_orarie = fasce_orarie;
	}
	public String getPeriodo_disp() {
		return periodo_disp;
	}
	public void setPeriodo_disp(String periodo_disp) {
		this.periodo_disp = periodo_disp;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String toString(){
		
		return	ID_servizio + "::" + titolo + "::" + descrizione + "::" + id_esercente + "::" + capacita + "::" + durata_app + "::" + data_inser + "::" + fasce_orarie + "::" + periodo_disp + "::" + categoria;
		
	}
	
}