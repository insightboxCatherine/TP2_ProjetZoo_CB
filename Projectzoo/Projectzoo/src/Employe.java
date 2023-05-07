import utilitaire.MyMethods;
import java.util.ArrayList;
import java.util.Scanner;
//Permet de définir les propriétés que nous allons utiliser dans le code.
public class Employe {

    private int noEmploye;
    private String prenomEmploye;
    private String nomEmploye;
    private String ddn;
    private int nas;
    private String dateEmbauche;
    private int anneeExperience;
    private String personneContact;

    //Le constructeur permet d'initialiser les variables.
    public Employe() {
    }
    //Le constructeur permet d'initialiser les variables.
    public Employe(int aNoEmploye, String aPrenomEmploye, String aNomEmploye, String aDdn, int aNas, String aDateEmbauche, int aAnneeExperience, String aPersonneContact) {
        noEmploye = aNoEmploye;
        prenomEmploye = aPrenomEmploye;
        nomEmploye = aNomEmploye;
        ddn = aDdn;
        nas = aNas;
        dateEmbauche = aDateEmbauche;
        anneeExperience = aAnneeExperience;
        personneContact = aPersonneContact;
    }
    //Le setter permet de demander un changement d'état.
    public Employe(int noEmploye) {
        this.noEmploye = noEmploye;
    }

    public void setNoEmploye(int aNoEmploye) {
        this.noEmploye = aNoEmploye;
    }

    public void setPrenomEmploye(String aPrenomEmploye) {
        this.prenomEmploye = aPrenomEmploye;
    }

    public void setNomEmploye(String aNomEmploye) {
        this.nomEmploye = aNomEmploye;
    }

    public void setDdn(String ddn) {
        this.ddn = ddn;
    }

    public void setNas(int nas) {
        this.nas = nas;
    }

    public void setDateEmbauche(String aDateEmbauche) {
        this.dateEmbauche = aDateEmbauche;
    }

    public void setAnneeExperience(int aAnneeExperience) {
        this.anneeExperience = aAnneeExperience;
    }

    public void setPersonneContact(String personneContact) {
        this.personneContact = personneContact;
    }

    //Le getter permet l'accès en lecture à un attribut.
    public int getNoEmploye() {
        return noEmploye;
    }

    public String getPrenomEmploye() {
        return prenomEmploye;
    }

    public String getNomEmploye() {
        return nomEmploye;
    }

    public String getDdn() {
        return ddn;
    }

    public int getNas() {
        return nas;
    }

    public String getDateEmbauche() {
        return dateEmbauche;
    }

    public int getAnneeExperience() {
        return anneeExperience;
    }

    public String getPersonneContact() {
        return personneContact;
    }

    //to String pour faire la mise en page de la liste des employés.
    @Override
    public String toString() {
        String txt;
        txt = "Numéro de l'employé " + getNoEmploye() + "\n";
        txt += "Nom de l'employé: " + getNomEmploye() + "\n";
        txt += "Prénom de l'employé:  " + getPrenomEmploye() + "\n";
        txt += "Date d'embauche: " + getDateEmbauche() + "\n";
        txt += "Année d'expérience: " + getAnneeExperience() + "\n";
        txt += "Date de naissance: " + getDdn() + "\n";
        txt += "Numéro d'assurance social: " + getNas() + "\n";
        txt += "Personne à contacter en cas d'urgence: " + getPersonneContact() + "\n";
        return txt;
    }

    //Classe "Employe" qui utilise l'héritage pour étendre les caractéristiques de la classe mère.
    //Elle devient ici la classe Nourrisseur avec un attribut de plus.
    static class Nourrisseur extends Employe{

        protected int noEmploye;
        protected String prenomEmploye;
        protected String nomEmploye;
        protected String ddn;
        protected int nas;
        protected String dateEmbauche;
        protected int anneeExperience;
        protected String personneContact;
        protected String animauxNourris;

        //Les constructeurs permettent d'initialiser les variables.
        protected Nourrisseur() {
        }
        //Les constructeurs permettent d'initialiser les variables.
        public Nourrisseur(int aNoEmploye, String aPrenomEmploye, String aNomEmploye, String aDdn, int aNas, String aDateEmbauche, int aAnneeExperience, String aPersonneContact, String aAnimauxNourris) {
            noEmploye = aNoEmploye;
            prenomEmploye = aPrenomEmploye;
            nomEmploye = aNomEmploye;
            ddn = aDdn;
            nas = aNas;
            dateEmbauche = aDateEmbauche;
            anneeExperience = aAnneeExperience;
            personneContact = aPersonneContact;
            animauxNourris = aAnimauxNourris;
        }

        //Le setter permet de demander un changement d'état.
        public void setPrenomEmploye(String aPrenomEmploye) {
            this.prenomEmploye = aPrenomEmploye;
        }
    
        public void setNomEmploye(String aNomEmploye) {
            this.nomEmploye = aNomEmploye;
        }
    
        public void setDdn(String aDdn) {
            this.ddn = aDdn;
        }
    
        public void setNas(int aNas) {
            this.nas = aNas;
        }
    
        public void setDateEmbauche(String aDateEmbauche) {
            this.dateEmbauche = aDateEmbauche;
        }
    
        public void setAnneeExperience(int aAnneeExperience) {
            this.anneeExperience = aAnneeExperience;
        }
    
        public void setPersonneContact(String aPersonneContact) {
            this.personneContact = aPersonneContact;
        }
        
        public void setAnimauxNourris(String aAnimauxNourris) {
            this.animauxNourris = aAnimauxNourris;
        }

        //Le getter permet l'accès en lecture à un attribut.
        public int getNoEmploye() {
            return noEmploye;
        }
    
        public String getPrenomEmploye() {
            return prenomEmploye;
        }
    
        public String getNomEmploye() {
            return nomEmploye;
        }
    
        public String getDdn() {
            return ddn;
        }
    
        public int getNas() {
            return nas;
        }
    
        public String getDateEmbauche() {
            return dateEmbauche;
        }
    
        public int getAnneeExperience() {
            return anneeExperience;
        }
    
        public String getAnimauxNourris() {
            return animauxNourris;
        }
    
        public String getPersonneContact() {
            return personneContact;
        }

        //to String pour faire la mise en page de la liste des employés.
        @Override
        public String toString() {
            String txt;
            txt = "Numéro de l'employé " + getNoEmploye() + "\n";
            txt += "Nom de l'employé: " + getNomEmploye() + "\n";
            txt += "Prénom de l'employé:  " + getPrenomEmploye() + "\n";
            txt += "Date d'embauche: " + getDateEmbauche() + "\n";
            txt += "Année d'expérience: " + getAnneeExperience() + "\n";
            txt += "Date de naissance: " + getDdn() + "\n";
            txt += "Numéro d'assurance social: " + getNas() + "\n";
            txt += "Personne à contacter en cas d'urgence: " + getPersonneContact() + "\n";
            txt += "Animaux nourris par l'employé: " + getAnimauxNourris() + "\n";
            return txt;
        }
    }
    //Affichage du menu pour la classe "Employe". On demande ensuite à l'utilisateur de choisir une option dans le menu.
    //Switch permet de sélectionner un ensemble d'instructions à exécuter en fonction de la valeur d'une variable.
    public static void employeMenu(ArrayList <Object> arrayOfEmploye, ArrayList <Animal> arrayOfAnimal) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu employe:");
            System.out.println("1. Ajouter un employé");
            System.out.println("2. Enlever un employé");
            System.out.println("3. Liste des employés");
            System.out.println("4. Liste des animaux nourris par un employé");
            System.out.println("5. Retour au menu principal");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    addEmploye(arrayOfEmploye);
                    break;
                case 2:
                    removeEmploye(arrayOfEmploye);
                    break;
                case 3:
                    listEmploye(arrayOfEmploye);
                    break;
                case 4:
                    listAnimal_nourris(arrayOfEmploye, arrayOfAnimal);
                case 5:
                    System.out.println("Retourner au menu précédent...");
                    break;
                default:
                    System.out.println("Mauvais choix. Recommencer.");
                    break;
            }
        } while (choice != 5);
    }
    //Méthode pour ajouter un employé dans le système.
    private static void addEmploye(ArrayList <Object> arrayOfEmploye) {
        Scanner sc = new Scanner(System.in);
        String nomEmploye, prenomEmploye, ddn, dateEmbauche, personneContact, animauxNourris;
        int nas, noEmploye, anneeExperience;
        String loop = "Yes";

        //Boucle while qui permet de poser les questions pertinentes à l'utilisateur et d'ajouter autant d'employés qu'il le désire. Il décide quand il met fin à l'ajout.
        //On affiche ensuite la liste mise à jour.
        //Ici, on lui demande s'il est un employé nourrisseur. Cette réponse ira chercher une question de plus que l'utilisateur devra entrer.
        while (loop.equalsIgnoreCase("Yes")) {
            for (Object obj : arrayOfEmploye) {
                if (obj instanceof Employe employe) {
                    System.out.println(employe.getNoEmploye() + " " + employe.getPrenomEmploye()+ " " + employe.getNomEmploye());

                }
            }
            String choixn = MyMethods.YesNO("L'employé à ajouter est-il nourrisseur (Yes ou No): ");

            if (choixn.equals("Yes")){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Entrez le ou les groupes sociaux que l'employé nourris: ");
                animauxNourris = scanner.nextLine();
                System.out.println("Entrez le numéro de l'employé : ");
                noEmploye = sc.nextInt();
                System.out.println("Entrez le prénom de l'employé: ");
                prenomEmploye = sc.next();
                System.out.println("Entrez le nom de l'employé: ");
                nomEmploye = sc.next();
                System.out.println("Entrez la date de naissance (jj/mm/aaaa): ");
                ddn = sc.next();
                System.out.println("Entrez le numéro d'assurance social: ");
                nas = sc.nextInt();
                System.out.println("Entrez la date d'embauche (jj/mm/aaaa): ");
                dateEmbauche = sc.next();
                System.out.println("Entrez les années d'expérience: ");
                anneeExperience = sc.nextInt();
                System.out.println("Entrez le nom de la personne à contacter en cas d'urgence: ");
                personneContact = scanner.nextLine();

            //Création de l'objet Employé nourrisseur avec les propriétés requises.
            Nourrisseur employeAjout = new Nourrisseur(noEmploye, nomEmploye, prenomEmploye, ddn, nas, dateEmbauche, anneeExperience, personneContact, animauxNourris);
            //Ajout d'un nouvel employé dans la liste.
            arrayOfEmploye.add(employeAjout);
            }
            if (choixn.equals("No")){
                System.out.println("Entrez le numéro de l'employé : ");
                noEmploye = sc.nextInt();
                System.out.println("Entrez le prénom de l'employé: ");
                prenomEmploye = sc.next();
                System.out.println("Entrez le nom de l'employé: ");
                nomEmploye = sc.next();
                System.out.println("Entrez la date de naissance (jj/mm/aaaa): ");
                ddn = sc.next();
                System.out.println("Entrez le numéro d'assurance social: ");
                nas = sc.nextInt();
                System.out.println("Entrez la date d'embauche: ");
                dateEmbauche = sc.next();
                System.out.println("Entrez les années d'expérience: ");
                anneeExperience = sc.nextInt();
                System.out.println("Entrez le nom de la personne à contacter en cas d'urgence: ");
                personneContact = sc.next();

                //Création de l'objet Employé avec les propriétés requises.
                Employe employeAjout = new Employe(noEmploye, nomEmploye, prenomEmploye, ddn, nas, dateEmbauche, anneeExperience, personneContact);
                //Ajout d'un nouvel employé dans la liste.
                arrayOfEmploye.add(employeAjout);

            }
            loop = MyMethods.YesNO("Voulez-vous continuer (Yes/No)? ");
        }

        System.out.println("\nListe des employés à jour\n");
        arrayOfEmploye.forEach(System.out::println);
    }

    //Méthode pour enlever un employé du système.
    //On crée également une boucle while pour que l'utilisateur puisse enlever autant d'employé qu'il le souhaite.
    //On imprime ensuite la liste des employés mise à jour.
    private static void removeEmploye(ArrayList <Object> arrayOfEmploye) {
        Scanner sc = new Scanner(System.in);
        for (Object obj : arrayOfEmploye) {
            if (obj instanceof Employe employe) {
                System.out.println(employe.getNomEmploye());
            }
        }

        System.out.println("\nEntrez le nom de l'employé que vous voulez enlever: ");
        String enl_employe = sc.nextLine();
        for (Object obj : arrayOfEmploye) {
            if (obj instanceof Employe employe) {
                if (enl_employe.equals(employe.getNomEmploye())){
                    System.out.println(employe.getNomEmploye() + " n'est plus dans la base de données.");
                    arrayOfEmploye.remove(employe);
                    break;
                }

            }
            if (obj instanceof Nourrisseur employe){
                if (enl_employe.equals(employe.getNomEmploye())){
                    System.out.println(employe.getNomEmploye() + " n'est plus dans la base de données.");
                    arrayOfEmploye.remove(employe);
                    break;
                }
            }
        }
        System.out.println("\n\n --------- Liste des employés mise à jour ----------------");
        arrayOfEmploye.forEach(System.out::println);
    }

    //Code pour afficher la liste des employés qui travaillent au zoo.
    private static void listEmploye(ArrayList <Object> arrayOfEmploye) {
        System.out.println("Liste des employés dans la base de données: \n");
        arrayOfEmploye.forEach(System.out::println);

    }

    //Code pour afficher les animaux nourris par un employé au choix de l'utilisateur.
    private static void listAnimal_nourris(ArrayList <Object> arrayOfEmploye, ArrayList <Animal> arrayOfAnimals) {
        String loop = "Yes";
        while (loop.equalsIgnoreCase("Yes")) {
            Scanner sc = new Scanner(System.in);
            for (Object obj : arrayOfEmploye) {
                if (obj instanceof Nourrisseur employe) {
                    System.out.println(employe.getPrenomEmploye() + " " + employe.getNomEmploye());
                }
            }

            System.out.println("\nEntrez le nom de famille de l'employé pour qui vous voulez voir les animaux nourris: ");
            String nour_employe = sc.nextLine();
            for (Object obj : arrayOfEmploye) {
                if (obj instanceof Nourrisseur employe){
                    if (nour_employe.equals(employe.getNomEmploye())){
                        System.out.println("Cet employé nourris les animaux suivants:");
                        for (Animal arrayOfAnimal : arrayOfAnimals) {
                            if (employe.getAnimauxNourris().contains(arrayOfAnimal.getGroupeSocial())) {
                                System.out.println(arrayOfAnimal.getNomAnimal());
                            }
                        }
                    }
                }
            }
            loop = MyMethods.YesNO("Voulez-vous continuer (Yes/No)? ");
        }
    }
}