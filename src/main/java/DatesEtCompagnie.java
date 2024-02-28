import java.util.Scanner ;

public class DatesEtCompagnie {

     /**
     *  @param annee une année
     *  @return vrai si l'année est bissextile, faux sinon
     */
    public static boolean estBissextile(int annee) {
        return annee % 4 == 0 && annee % 100 != 0 || annee % 400 == 0 ;
    }
  
    
       /**
    *  Détermine le nombre de jours dans un mois d'une année donnée
    *  @param mois
     *      mois
    *  @param année
    *      année
    *  @return le nombre de jours dans le mois
    */
    public static int nbJours(int mois, int annee) {
       if (mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 || mois == 10 || mois == 12) {
        return 31 ;
        } 
       if (mois == 2){
         if ( estBissextile(annee) ){
            return 29 ;
            }
         return 28 ;
        }
       return 30 ;
    }
    
    
       /**
    *  Détermine si une date est valide
    *  @param jour
    *      jour de la date
    *  @param mois
    *      mois de la date
    *  @param année
    *      année de la date
    *  @return vrai si la date est valide, faux sinon
    */
    public static boolean estValide(int jour, int mois, int annee) {
       if (annee < 1582){
           return false ;
        }
       if (mois < 1 || mois > 12){
           return false ;
        }
       if (jour < 1 || jour > nbJours(mois, annee) ) {
        return false ;
        }
        
       return true ;
    }
    
    /**
     * Fonction aidant a saisir un entier.
     * A priori, pas besoin de la modifier
     * @return entier saisi par l'utilisateur
     */
    public static int saisieEntier() {
        System.out.println("Saisir un entier");
        Scanner clavier = new Scanner(System.in) ;
        int nombreSaisi = clavier.nextInt() ;
        return nombreSaisi ;
    }
    
    
    
    
    public static void saisieCalculAffichageValidite() {
    /**************/
    /* E1: Saisie */
    System.out.println("Saisir le jour puis le mois puis l'année") ;
    int jour = saisieEntier() ;
    int mois = saisieEntier() ;
    int annee = saisieEntier() ;
    /**************/
    
    
    /****************/
    /* E2: Validité */
    boolean saisieValide = estValide(jour, mois, annee) ;
    /****************/
    
    
    /*****************/
    /* E3: Affichage */
      if (saisieValide == true) {
      System.out.println("La date du " + jour + "/" + mois + "/" + annee ) ;
      System.out.println("est une date valide") ;
    }
    else {
      System.out.println("La date du " + jour + "/" + mois + "/" + annee ) ;
      System.out.println("n'est pas une date valide") ;
    }
    /*****************/
    
   }
    
    /**
     * Ce main permet d'afficher une phrase.
     * 
     * @param args (optional)
     */
    public static void main (String[] args){
      System.out.println("je suis le roi du monde !!!");

    }
    
    
}








