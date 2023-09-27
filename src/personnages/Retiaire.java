
package personnages;

import java.util.Random;

public class Retiaire extends Personnage {

    private int filet = 0;

    public Retiaire(String nom, int attaqueMax, int defense, int pvs, int ini) {
        super(nom, attaqueMax, defense, pvs, ini); 
        filet = 1; 
    }
    @Override
    public void frapperPersonnage(Personnage personnageCible) {
       

       
        if (filet == 1) {
            System.out.println(getNom() + " lance son filet.");
            
           
            if (new Random().nextInt(10) == 0) {
                System.out.println("Le filet attrape " + personnageCible.getNom() + " !");
                System.out.println("Igor l'empaleur empale sauvagement " + personnageCible.getNom() + " avec sa lance !");
                personnageCible.setPointsDeVie(0);
            } else {
                System.out.println("Le filet n'atteint pas sa cible.");
            }
            
           
            filet = 0;
        } else {
            
            int forceDeFrappe = attaqueCalcul();
            System.out.println(getNom() + " ramasse son filet et en profite pour attaquer.");
            System.out.println(getNom() + " attaque avec " + forceDeFrappe + " points de dégâts à " + personnageCible.getNom() + ".");
            personnageCible.setPointsDeVie(personnageCible.getPointsDeVie() - forceDeFrappe);
            
         
            filet = 1;
        }
    }
}


