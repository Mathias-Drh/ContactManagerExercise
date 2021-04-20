package fr.cesi.ContactManager;

import java.util.regex.Pattern;

public class Client {

	private String nom;
	private String prenom;
	private String tel;
	private Pattern pattern = Pattern.compile("[0-9]+");

	public Client(String n, String p, String t) {
		this.nom = n;
		this.prenom = p;
		this.tel = t;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		if (nom != "" && nom != null && !pattern.matcher(nom).matches()) {
			this.nom = nom;
		}
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		if (prenom != "" && prenom != null && !pattern.matcher(prenom).matches()) {
			this.prenom = prenom;
		}
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		if (tel != "" && tel != null && !pattern.matcher(tel).matches()) {
			this.tel = tel;
		}
	}

}
