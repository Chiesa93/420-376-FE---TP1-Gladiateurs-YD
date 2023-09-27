
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
    @Override
     public void frapperPersonnage(Personnage personnageCible) {
       
        int forceDeFrappe = attaqueCalcul();
        int degats = forceDeFrappe - personnageCible.getValeurDefense();
        
        if(degats < 0){
            degats = 0;   
         }
    
          System.out.println(getNom() + " attaque avec " + forceDeFrappe + " points de dégâts à " + personnageCible.getNom() + ".");
        personnageCible.setPointsDeVie(personnageCible.getPointsDeVie() - forceDeFrappe);

       
        if (personnageCible.getPointsDeVie() <= 0) {
            System.out.println(getNom() + " décapite " + personnageCible.getNom() + " !");
        } else {
         
            forceDeFrappe = attaqueCalcul();
            System.out.println(getNom() + " attaque de nouveau avec " + forceDeFrappe + " points de dégâts à " + personnageCible.getNom() + ".");
            personnageCible.setPointsDeVie(personnageCible.getPointsDeVie() - forceDeFrappe);
        }
            
         

          
            
     }
}
