public abstract class Institutionn {

    //les variables d'instance
    public String nomInstitution;
    public String paysInstitution;
    public String typeInstitution;
    public int anneeCreation;

    //le constructeur
    public Institutionn(String nomInstitution, String paysInstitution, String typeInstitution, int anneeCreation){
        this.nomInstitution = nomInstitution;
        this.paysInstitution = paysInstitution;
        this.typeInstitution = typeInstitution;
        this.anneeCreation = anneeCreation;
    }

    //getters and setters
    public String getName(){
        return nomInstitution;
    }
    public void setName(String nomInstitution){
        this.nomInstitution = nomInstitution;
    }

    public String getPaysInstitution(){
        return paysInstitution;
    }
    public void setPaysInstitution(String paysInstitution){
        this.paysInstitution = paysInstitution;
    }

    public String getTypeInstitution(){
        return typeInstitution;
    }
    public void setTypeInstitution(String typeInstitution){
        this.typeInstitution = typeInstitution;
    }

    public int getAnneeCreation(){
        return anneeCreation;
    }
    public void setAnneeCreation(int anneCreation){
        this.anneeCreation = anneCreation;
    }


    //deux methodes d'instance peut modifier l'objet (et est sans static), 
    //une methode de classe est comme en procedural
    //Une méthode d'instance (ou d'objet) a pour but de manipuler les attributs de l'objet.
    //Si ce n'est pas le cas alors ta méthode doit surement être statique (de classe)
    public int getAgeInstitution(){
        return java.time.Year.now().getValue() - anneeCreation;
    }
    // public void decrireInstitution(String name, int anneCreation){
    //     System.out.println("L'instititution "+name+ " est situé dans le pays: " +this.getPays()+
    //      "a pourtype: "+this.getType()+", a pour annee de creation: "+this.getAnneeCreation()+ 
    //      "et a pour age: "+ getAgeInstitution(anneCreation));
    // }
    // Updated `decrireInstitution` method in Institution
    public abstract void decrireInstitution();


}
