package tp.tpinfo1.entite;

import java.util.ArrayList;
import java.util.List;

import tp.tpinfo1.enums.TypeAnimal;
import tp.tpinfo1.exceptions.LimiteVisiteurException;

public class Zoo {

	private Integer visiteurs;
	private List<Secteur> secteursAnimaux;

	private static Integer NB_VISITEUR_PAR_SECTEUR = 15;

	public Integer getVisiteurs() {
		return visiteurs;
	}

	public void setVisiteurs(Integer visiteurs) {
		this.visiteurs = visiteurs;
	}

	public List<Secteur> getSecteurAnimaux() {
		return secteursAnimaux;
	}

	public void setSecteurAnimaux(List<Secteur> secteurAnimaux) {
		this.secteursAnimaux = secteurAnimaux;
	}

	public Zoo(Integer visiteurs, List<Secteur> secteurAnimaux) {
		super();
		this.visiteurs = visiteurs;
		this.secteursAnimaux = secteurAnimaux;
	}

	public Zoo() {
		this.visiteurs = 0;
		this.secteursAnimaux = new ArrayList<Secteur>();
	}
	
	public void ajouterSecteur(TypeAnimal typeAnimal) {
		Secteur secteur = new Secteur(typeAnimal);
		secteursAnimaux.add(secteur);
	}
	
	public void nouveauVisiteur() throws LimiteVisiteurException {
		
		int nb = this.visiteurs + 1;
		
		if(nb > secteursAnimaux.size() * NB_VISITEUR_PAR_SECTEUR) {
			throw new LimiteVisiteurException("le nombre des visiteurs atteint le maximum" );
		}
		
		this.visiteurs  = nb;
	}

}
