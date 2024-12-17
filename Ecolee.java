public class Ecolee extends Institutionn{

    private String typeEcole;
    private int nombreClasse;
    private String promoteur;

    //constructor
    public Ecolee(String nomInstitution, String paysInstitution, String typeInstitution, int anneeCreation, String typeEcole, int nombreClasse, String promoteur){
        super(nomInstitution, paysInstitution, typeInstitution, anneeCreation);
        this.typeEcole = typeEcole;
        this.nombreClasse = nombreClasse;
        this.promoteur = promoteur;
        //every time you create an object of this class, the variable classname is set to the name of this class
    }

    //getters and setters
    public String getTypeEcole(){
        return typeEcole;
    }
    public void setTypeEcole(String typeEcole){
        this.typeEcole = typeEcole;
    }

    public int getNombreClasse(){
        return nombreClasse;
    }
    public void setNombreClasse(int nombreClasse){
        this.nombreClasse = nombreClasse;
    }

    public String getPromoteur(){
        return promoteur;
    }
    public void setPromoteur(String promoteur){
        this.promoteur= promoteur;
    }

    //methodes d'instance
    @Override
    public void decrireInstitution(){

        System.out.println("Description Ecole:");
        System.out.println("------------------------");
        System.out.println("Nom: "+this.nomInstitution);
        System.out.println("Pays: "+ this.paysInstitution);
        System.out.println("Type: " + this.typeInstitution);
        System.out.println("Année de création: " + this.anneeCreation);
        System.out.println("Âge: " + this.getAgeInstitution() + " ans");

        System.out.println("Type Ecole: "+this.getTypeEcole());
        System.out.println("Nombre des classes: "+this.getNombreClasse());
    }

    //seconde methode d'instance
    public void getNomPromoteurParEcole(Ecolee e1, Ecolee e2, Ecolee e3){
        System.out.println("Le nom du promoteur de l'ecole 1 nommé "+e1.getName()+ "est: "+e1.getPromoteur());
        System.out.println("Le nom du promoteur de l'ecole 2 nommé "+e2.getName()+ "est: "+e2.getPromoteur());
        System.out.println("Le nom du promoteur de l'ecole 3 nommé "+e3.getName()+ "est: "+e3.getPromoteur());
    }


}
