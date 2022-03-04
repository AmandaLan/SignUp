package models;

public class conseiller_models {
	private String IDconseiller;
	private String nomConseiller;
	private String prenomConseiller;
	private String numeroTel;
	private String adresse;
	private String civilite;
	private String login;
	private String passeword;
	
	protected conseiller_models(String id, String nomConseiller, String prenomConseiller, String numeroTel, String adresse, String civilite, String login, String passeword) {
		super();
		this.IDconseiller = id;
		this.nomConseiller = nomConseiller;
		this.prenomConseiller = prenomConseiller;
		this.numeroTel = numeroTel;
		this.adresse = adresse;
		this.civilite = civilite;
		this.login = login;
		this.passeword = passeword;
	}
	
	public String getId() {
		return IDconseiller;
	}
	public void setId(String id) {
		this.IDconseiller = id;
	}
	public String getNom() {
		return nomConseiller;
	}
	public void setNom(String nomConseiller) {
		this.nomConseiller = nomConseiller;
	}	
	public String getPrenom() {
		return prenomConseiller;
	}
	public void setPrenom(String prenomConseiller) {
		this.prenomConseiller = prenomConseiller;
	}	
	public String getNumeroTel() {
		return numeroTel;
	}
	public void setNumeroTel(String numeroTel) {
		this.numeroTel = numeroTel;
	}
	public String getAdress() {
		return adresse;
	}
	public void setAdress(String adresse) {
		this.adresse = adresse;
	}
	public String getCivilite() {
		return civilite;
	}
	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPasseword() {
		return passeword;
	}
	public void setPasseword(String passeword) {
		this.passeword = passeword;
	}
}
