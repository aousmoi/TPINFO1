package tp.tpinfo1;

import tp.tpinfo1.entite.Animal;
import tp.tpinfo1.entite.Chien;
import tp.tpinfo1.entite.Zoo;
import tp.tpinfo1.enums.TypeAnimal;
import tp.tpinfo1.exceptions.LimiteVisiteurException;
import tp.tpinfo1.service.IZooService;
import tp.tpinfo1.service.ZooService;

public class Application {

	public static void main(String[] args) throws LimiteVisiteurException {
		// TODO Auto-generated method stub
		
		IZooService zooService = new ZooService();

		Zoo monZoo = new Zoo();
		monZoo.ajouterSecteur(TypeAnimal.CARNIVORE);
		
		
		
		for(int i = 0 ; i < 100 ; i++) {
			System.out.println(i);
			monZoo.nouveauVisiteur();
			
		}
		
		Animal chien = new Chien("Snoopy", TypeAnimal.CARNIVORE);
		
		zooService.AjouterAnimalDansSecteur(monZoo, chien);
		
		
		System.out.println(monZoo.getSecteurAnimaux().size());
		System.out.println(monZoo.getSecteurAnimaux().get(0).getListAnimal().size());
	}

}
