public class University extends Institutionn{   

    //attributs supplementaires 
    private int nombreFaculte;
    private String systeme;
    private String nomRecteur;


    //constructeur
    public University(String nomInstitution, String paysInstitution, String typeInstitution, int anneeCreation, int nombreFaculte, String systeme, String nomRecteur){
        super(nomInstitution, paysInstitution, typeInstitution, anneeCreation);
        this.nombreFaculte = nombreFaculte;
        this.systeme = systeme;
        this.nomRecteur = nomRecteur;
    }

    //getters and setters
    //herite les getters and setters pour les characteristiques communes
    public int getNombreFaculte(){
        return nombreFaculte;
    }
    public void setNombreFaculte(int nombreFaculte){
        this.nombreFaculte = nombreFaculte;
    }

    public String getSysteme(){
        return systeme;
    }
    public void setSysteme(String systeme){
        this.systeme = systeme;
    }

    public String getNomRecteur(){
        return nomRecteur;
    }
    public void setNomRecteur(String nomRecteur){
        this.nomRecteur = nomRecteur;
    }

    //METHODE POLYMPRPHE: Modification du comportement de la classe fille par rapport à la classe mère
    @Override
    public void decrireInstitution() {
        // TODO Auto-generated method stub
        System.out.println("Description Universite:");
        System.out.println("------------------------");
        System.out.println("Nom: "+this.nomInstitution);
        System.out.println("Pays: "+ this.paysInstitution);
        System.out.println("Type: " + this.typeInstitution);
        System.out.println("Année de création: " + this.anneeCreation);
        System.out.println("Âge: " + this.getAgeInstitution() + " ans");
        System.out.println("Nombre des faculté: "+this.getNombreFaculte());
        System.out.println("Systeme: "+this.getSysteme());

    }

    //methode d'instance
    // public void getNomRecteurByUniversityName(Universite u1, Universite u2){
    //     System.out.println("Le nom du recteur de l'université 1 nommé, "+u1.getName()+" est: "+u1.getNomRecteur());
    //     System.out.println("Le nom du recteur de l'université 2 nommé, "+u2.getName()+" est: "+u2.getNomRecteur());
    // }
    //methode d'instance 
    public void getNomRecteurByUniversite(University u1, University u2){
        System.out.println("Le nom du recteur de l'université 1 nommé, "+u1.getName()+" est: "+u1.getNomRecteur());
        System.out.println("Le nom du recteur de l'université 2 nommé, "+u2.getName()+" est: "+u2.getNomRecteur());
    }

}
