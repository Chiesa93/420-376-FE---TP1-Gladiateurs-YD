
package jeugladiateur;

import personnages.Personnage;
import combat.CompteurDeTour;
import combat.AffichageEcran;

public class JeuGladiateurs {

    public static void main(String[] args) {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="expanded" desc="Instanciation des objets">
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
       
    Bob.frapperPersonnage(Igor);
    System.out.println("\n");
    Bob.frapperPersonnage(Igor);
    System.out.println("\n");
    Igor.frapperPersonnage(Bob);
    System.out.println("\n");
    Igor.frapperPersonnage(Bob);
    // TODO : La boucle contenant les étapes du combat
    // TODO : Après la boucle, afficher le résultat du combat
    // </editor-fold
    }

}
