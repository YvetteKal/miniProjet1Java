    import java.util.Scanner;
    public class MainClass {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            //variables not used but to remember the classes variables
            String nomInstitution;
            String paysInstitution;
            String typeInstitution; //privee ou public
            int anneeCreation;

            int nombreFaculte;
            String systeme;
            String nomRecteur;

            String typeEcole;//primaire ou secondaire
            int nombreClasse;
            String promoteur;

            boolean case1Executed = false; // Flag to track if Case 1 was executed
            boolean case2Executed = false;


            MainClass.afficherMenu();
            char choix = sc.next().charAt(0);

            University u1 = new University(null, null, null, choix, choix, null, null);
            University u2 = new University(null, null, null, choix, choix, null, null);

            Ecolee e1 = new Ecolee(null, null, null, choix, null, choix, null);
            Ecolee e2 = new Ecolee(null, null, null, choix, null, choix, null);
            Ecolee e3 = new Ecolee(null, null, null, choix, null, choix, null);



            switch (choix) {
                case '1':
                    MainClass.creationUniversites(u1, u2);
                    case1Executed = true;

                    MainClass.afficherMenu();
                    
                    break;
                case '2':
                    MainClass.creationEcoles(e1, e2, e3);
                    case2Executed = true;

                    MainClass.afficherMenu();
                    
                    break; 
                case '3':
                    if (case1Executed){
                        System.out.println("3. Noms des recteurs des 2 universités crees en 1");
                        new University(null, null, null, 0, 0, null, null).getNomRecteurByUniversite(u1,u2);
                        break;
                    }else{
                        System.out.println("Choisissez 1 d'abord pour creer les deux universités");
                        MainClass.afficherMenu();
                        choix = sc.next().charAt(0);
                        

                    }   
                case '4':
                    if (case2Executed){
                        System.out.println("4. Noms des directeurs des 3 ecoles crees en 2");
                        new Ecolee(null, null, null, 0, null, 0, null).getNomPromoteurParEcole(e1, e2, e3);;
                        break;
                    }else{
                        System.out.println("Choisissez 2 d'abord pour creer les 3 ecoles");
                        MainClass.afficherMenu();
                        choix = sc.next().charAt(0);

                    } 

                default:
                    break;
            }
            

        }
        public static void afficherMenu(){
            System.out.println("---------------------------------------------------");
            System.out.println("                LES INSTITUTIONS                   ");
            System.out.println("---------------------------------------------------");
            System.out.println("1. Creation de 2 universités");
            System.out.println("2. Creation de 3 ecoles");
            System.out.println("3. Noms des recteurs des 2 universités");
            System.out.println("4. Noms des directeurs des 3 ecoles");
            System.out.println("---------------------------------------------------");

            System.out.println("Votre choix");   
        
        }
        public static void creationUniversites(University u1, University u2){
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Creation de 2 universités");
            System.out.println("PREMIERE UNIVERSITE:");
            System.out.println("Nom universite: ");
            //When you call a method like nextInt() or nextDouble() or others, the input for the integer or double is processed, 
            //but the newline character (\n) is left in the input buffer.
            //When you call nextLine() immediately afterward, it reads the leftover newline character instead of waiting for new input.
            sc.nextLine(); // Clear the buffer
            u1.setName(sc.nextLine());

            System.out.println("Pays: ");
            u1.setPaysInstitution(sc.nextLine());
            System.out.println("Type institution: ");
            u1.setTypeInstitution(sc.nextLine());
            System.out.println("Annee creation: ");
            u1.setAnneeCreation(sc.nextInt());
            System.out.println("Nombre des facultes: ");
            u1.setNombreFaculte(sc.nextInt());
            System.out.println("Systeme: ");
            sc.nextLine(); // the solution is to Clear the buffer before calling nextLine()
            u1.setSysteme(sc.nextLine());
            System.out.println("Nom de recteur: ");
            u1.setNomRecteur(sc.nextLine());

            System.out.println("Vous venez de creer la PREMIERE universite dont la description est:");
            u1.decrireInstitution();

            System.out.println("-----------------------------");
            System.out.println("DEUXIEME UNIVERSITE:");
            System.out.println("Nom universite: ");
            u2.setName(sc.nextLine());
            System.out.println("Pays: ");
            u2.setPaysInstitution(sc.nextLine());
            System.out.println("Type institution: ");
            u2.setTypeInstitution(sc.nextLine());
            System.out.println("Annee creation: ");
            u2.setAnneeCreation(sc.nextInt());
            System.out.println("Nombre des facultes: ");
            u2.setNombreFaculte(sc.nextInt());
            System.out.println("Systeme: ");
            sc.nextLine(); // Clear the buffer before calling nextLine() after nextInt()
            u2.setSysteme(sc.nextLine());
            System.out.println("Nom de recteur: ");
            u2.setNomRecteur(sc.nextLine());

            System.out.println("Vous venez de creer la DEUXIEME universite dont la description est:");
            u2.decrireInstitution();

        }
        public static void creationEcoles(Ecolee e1, Ecolee e2, Ecolee e3){
            Scanner sc = new Scanner(System.in);
            System.out.println("2. Creation de 3 ecoles");
            System.out.println("PREMIERE ECOLE:");
            System.out.println("Nom ecole: ");
            e1.setName(sc.nextLine());

            System.out.println("Pays: ");
            e1.setPaysInstitution(sc.nextLine());
            System.out.println("Type ecole (publique ou privee): ");
            e1.setTypeInstitution(sc.nextLine());
            System.out.println("Annee creation: ");
            e1.setAnneeCreation(sc.nextInt());

            System.out.println("Type d'ecole (primaire ou secomdaire): ");
            sc.nextLine();
            e1.setTypeEcole(sc.nextLine());

            System.out.println("Nombre des classes: ");
            System.out.println("Nom de directeur ecole: ");
            sc.nextLine();
            e1.setPromoteur(sc.nextLine());

            System.out.println("Vous venez de creer la PREMIERE ecole dont la description est:");
            e1.decrireInstitution();

            System.out.println("DEUXIEME ECOLE:");
            System.out.println("Nom ecole: ");
            e2.setName(sc.nextLine());

            System.out.println("Pays: ");
            e2.setPaysInstitution(sc.nextLine());
            System.out.println("Type ecole (publique ou privee): ");
            e2.setTypeInstitution(sc.nextLine());
            System.out.println("Annee creation: ");
            e2.setAnneeCreation(sc.nextInt());

            System.out.println("Type d'ecole (primaire ou secomdaire): ");
            sc.nextLine();
            e2.setTypeEcole(sc.nextLine());

            System.out.println("Nombre des classes: ");
            sc.nextLine(); // the solution is to Clear the buffer before calling nextLine()
            e2.setNombreClasse(sc.nextInt());
            System.out.println("Nom de directeur ecole: ");
            sc.nextLine();
            e2.setPromoteur(sc.nextLine());

            System.out.println("Vous venez de creer la DEUXIEME ecole dont la description est:");
            e2.decrireInstitution();

            System.out.println("TROIXIEME ECOLE:");
            System.out.println("Nom ecole: ");
            e3.setName(sc.nextLine());

            System.out.println("Pays: ");
            e3.setPaysInstitution(sc.nextLine());
            System.out.println("Type ecole (publique ou privee): ");
            e3.setTypeInstitution(sc.nextLine());
            System.out.println("Annee creation: ");
            e3.setAnneeCreation(sc.nextInt());

            System.out.println("Type d'ecole (primaire ou secomdaire): ");
            sc.nextLine();
            e3.setTypeEcole(sc.nextLine());

            System.out.println("Nombre des classes: ");
            sc.nextLine(); // the solution is to Clear the buffer before calling nextLine()
            e3.setNombreClasse(sc.nextInt());
            System.out.println("Nom de directeur ecole: ");
            sc.nextLine();
            e3.setPromoteur(sc.nextLine());

            System.out.println("Vous venez de creer la TROIXIEME ecole dont la description est:");
            e3.decrireInstitution();
            
        }
    }
