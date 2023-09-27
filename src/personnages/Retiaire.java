
package personnages;

public class Retiaire extends Personnage {

    private int filet = 0;

    public Retiaire(String nom, int attaqueMax, int defense, int pvs, int ini) {
        super(nom, attaqueMax, defense, pvs, ini); 
        filet = 1; 
    }
    
}

