
package jeugladiateur;

import personnages.Personnage;
import combat.CompteurDeTour;
import combat.AffichageEcran;

public class JeuGladiateurs {

    public static void main(String[] args) {

    CompteurDeTour tour = new CompteurDeTour();
    AffichageEcran affichage = new AffichageEcran();
    Personnage Bob = new Personnage("Bob le malchanceux",15,15,70,15);
    Personnage Igor = new Personnage("Igor l'empaleur",25,5,100,30);
   

    
    // TODO : Afficher les infos de chaque personnage
    Bob.afficherInfosPersonnage();
        System.out.println("\n");
    Igor.afficherInfosPersonnage();
        System.out.println("\n");
    // TODO : Afficher le message du début du combat
        
    affichage.afficherDebutCombat();
        System.out.println("\n");
       
    
    // TODO : La boucle contenant les étapes du combat
    while(Igor.getPointsDeVie() > 0 && Bob.getPointsDeVie()>0){
        
        tour.afficheTour();
        
        Bob.setNewInitiativeRandom();
        Igor.setNewInitiativeRandom();
        
        for (int i = 0; i <= 100; i++) {
                if (i == Bob.getInitiative()) {
                    Bob.frapperPersonnage(Igor);
                }
                if (i == Igor.getInitiative()) {
                    Igor.frapperPersonnage(Bob);
                }
            }
        affichage.afficherSeparateurInfosPerso();
        
        Bob.afficherInfosPersonnage();
        System.out.println("\n");
        
        Igor.afficherInfosPersonnage();
        System.out.println("\n");
        
        
        
        affichage.afficherSeparateurDeTour();
        
        
        
        tour.augmenteTour();
    }
     affichage.afficheVictoire(Bob, Igor);
  
    }

}
