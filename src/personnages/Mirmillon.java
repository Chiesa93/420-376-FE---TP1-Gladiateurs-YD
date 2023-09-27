
package personnages;


public class Mirmillon extends Personnage {
    

    public Mirmillon(String nom, int attaqueMax, int defense, int pvs, int ini) {
        super(nom, attaqueMax, defense, pvs, ini);
        
    }
    @Override
    public void setNewInitiativeRandom() {
   
        int newIni = (int) (Math.random()*31);
        setInitiative(newIni);
    }
}
   
