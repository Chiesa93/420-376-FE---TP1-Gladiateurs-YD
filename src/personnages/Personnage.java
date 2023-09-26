    package personnages;

public class Personnage {

    private String nom;
    private int pointsDeVie;
    private int valeurMaxAttaque;
    private int valeurDefense;
    private int initiative;
   
    
    public Personnage(String nom, int attaqueMax, int defense, int pvs, int ini) {
        this.nom = nom;
        this.pointsDeVie = pvs;
        this.valeurMaxAttaque = attaqueMax;
        this.valeurDefense = defense;
        this.initiative = ini;
    }
        

    public Personnage() {
        this.nom = "";
        this.pointsDeVie = 0;
        this.valeurMaxAttaque = 0;
        this.valeurDefense = 0;
        this.initiative = 0;
    }
public String getNom(){
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }
     
    public int getValeurMaxAttaque() {
        return valeurMaxAttaque;
    }

    public void setValeurMaxAttaque(int valeurMaxAttaque) {
        this.valeurMaxAttaque = valeurMaxAttaque;
    }

    public int getValeurDefense() {
        return valeurDefense;
    }

    public void setValeurDefense(int valeurDefense) {
        this.valeurDefense = valeurDefense;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }    
    
    
    public void afficherInfosPersonnage() {
        System.out.println("Nom : " + nom);
        System.out.println("Attaque : " + valeurMaxAttaque);
        System.out.println("Defense : " + valeurDefense);
        System.out.println("Points de vie : " + pointsDeVie);
        System.out.println("Initiative : " + initiative);
        if (pointsDeVie <= 0) {
        System.out.println("Statut : Mort");
    } else {
        System.out.println("Statut : Vivant");
    }
    }

    private int attaqueCalcul() {
        int random = (int) (Math.random()*valeurMaxAttaque);
        
        return random;
    }

    public void frapperPersonnage(Personnage personnageCible) {
       
        int forceDeFrappe = attaqueCalcul();
        int degats = forceDeFrappe - personnageCible.getValeurDefense();
        
        if(degats < 0){
            degats = 0;   
         }
    
         personnageCible.setPointsDeVie(personnageCible.getPointsDeVie() - degats);

            if(personnageCible.getPointsDeVie() < 0){
             
                personnageCible.setPointsDeVie(0);
             
            }
             
  }

    public void setNewInitiativeRandom() {
        // TODO : Modifier de façon aléatoire la valeur INI du personnage.
    }
    // </editor-fold
}

