import java.util.ArrayList;
import java.util.Scanner;
//Permet de définir les propriétés que nous allons utiliser dans le code.
public class Employe {

    private int no_employe;
    private String prenom_employe;
    private String nom_employe;
    private String ddn;
    private int nas;
    private String date_embauche;
    private int annee_experience;
    private String personne_contact;

    //Le constructeur permet d'initialiser les variables.
    public Employe() {
    }
    //Le constructeur permet d'initialiser les variables.
    public Employe(int aNo_employe, String aPrenom_employe, String aNom_employe, String aDdn, int aNas, String aDate_embauche, int aAnnee_experience, String aPersonne_contact) {
        no_employe = aNo_employe;
        prenom_employe = aPrenom_employe;
        nom_employe = aNom_employe;
        ddn = aDdn;
        nas = aNas;
        date_embauche = aDate_embauche;
        annee_experience = aAnnee_experience;
        personne_contact = aPersonne_contact;
    }
    //Le setter permet de demander un changement d'état.
    public Employe(int no_employe) {
        this.no_employe = no_employe;
    }

    public void setNo_employe(int aNo_employe) {
        this.no_employe = aNo_employe;
    }

    public void setPrenom_employe(String aPrenom_employe) {
        this.prenom_employe = aPrenom_employe;
    }

    public void setNom_employe(String aNom_employe) {
        this.nom_employe = aNom_employe;
    }

    public void setDdn(String ddn) {
        this.ddn = ddn;
    }

    public void setNas(int nas) {
        this.nas = nas;
    }

    public void setDate_embauche(String aDate_embauche) {
        this.date_embauche = aDate_embauche;
    }

    public void setAnnee_experience(int aAnnee_experience) {
        this.annee_experience = aAnnee_experience;
    }

    public void setPersonne_contact(String personne_contact) {
        this.personne_contact = personne_contact;
    }

    //Le getter permet l'accès en lecture à un attribut.
    public int getNo_employe() {
        return no_employe;
    }

    public String getPrenom_employe() {
        return prenom_employe;
    }

    public String getNom_employe() {
        return nom_employe;
    }

    public String getDdn() {
        return ddn;
    }

    public int getNas() {
        return nas;
    }

    public String getDate_embauche() {
        return date_embauche;
    }

    public int getAnnee_experience() {
        return annee_experience;
    }

    public String getPersonne_contact() {
        return personne_contact;
    }

    //to String pour faire la mise en page de la liste des employés.
    @Override
    public String toString() {
        String txt;
        txt = "Numéro de l'employé " + getNo_employe() + "\n";
        txt += "Nom de l'employé: " + getNom_employe() + "\n";
        txt += "Prénom de l'employé:  " + getPrenom_employe() + "\n";
        txt += "Date d'embauche: " + getDate_embauche() + "\n";
        txt += "Année d'expérience: " + getAnnee_experience() + "\n";
        txt += "Date de naissance: " + getDdn() + "\n";
        txt += "Numéro d'assurance social: " + getNas() + "\n";
        txt += "Personne à contacter en cas d'urgence: " + getPersonne_contact() + "\n";
        return txt;
    }

    //Classe "Employe" qui utilise l'héritage pour étendre les caractéristiques de la classe mère.
    //Elle devient ici la classe Nourrisseur avec un attribut de plus.
    static class Nourrisseur extends Employe{

        protected int no_employe;
        protected String prenom_employe;
        protected String nom_employe;
        protected String ddn;
        protected int nas;
        protected String date_embauche;
        protected int annee_experience;
        protected String personne_contact;
        protected String animaux_nourris;

        //Les constructeurs permettent d'initialiser les variables.
        protected Nourrisseur() {
        }
        //Les constructeurs permettent d'initialiser les variables.
        public Nourrisseur(int aNo_employe, String aPrenom_employe, String aNom_employe, String aDdn, int aNas, String aDate_embauche, int aAnnee_experience, String aPersonne_contact, String aAnimaux_nourris) {
            no_employe = aNo_employe;
            prenom_employe = aPrenom_employe;
            nom_employe = aNom_employe;
            ddn = aDdn;
            nas = aNas;
            date_embauche = aDate_embauche;
            annee_experience = aAnnee_experience;
            personne_contact = aPersonne_contact;
            animaux_nourris = aAnimaux_nourris;
        }

        //Le setter permet de demander un changement d'état.
        public void setPrenom_employe(String aPrenom_employe) {
            this.prenom_employe = aPrenom_employe;
        }
    
        public void setNom_employe(String aNom_employe) {
            this.nom_employe = aNom_employe;
        }
    
        public void setDdn(String aDdn) {
            this.ddn = aDdn;
        }
    
        public void setNas(int aNas) {
            this.nas = aNas;
        }
    
        public void setDate_embauche(String aDate_embauche) {
            this.date_embauche = aDate_embauche;
        }
    
        public void setAnnee_experience(int aAnnee_experience) {
            this.annee_experience = aAnnee_experience;
        }
    
        public void setPersonne_contact(String aPersonne_contact) {
            this.personne_contact = aPersonne_contact;
        }
        
        public void setAnimaux_nourris(String aAnimaux_nourris) {
            this.animaux_nourris = aAnimaux_nourris;
        }

        //Le getter permet l'accès en lecture à un attribut.
        public int getNo_employe() {
            return no_employe;
        }
    
        public String getPrenom_employe() {
            return prenom_employe;
        }
    
        public String getNom_employe() {
            return nom_employe;
        }
    
        public String getDdn() {
            return ddn;
        }
    
        public int getNas() {
            return nas;
        }
    
        public String getDate_embauche() {
            return date_embauche;
        }
    
        public int getAnnee_experience() {
            return annee_experience;
        }
    
        public String getAnimaux_nourris() {
            return animaux_nourris;
        }
    
        public String getPersonne_contact() {
            return personne_contact;
        }

        //to String pour faire la mise en page de la liste des employés.
        @Override
        public String toString() {
            String txt;
            txt = "Numéro de l'employé " + getNo_employe() + "\n";
            txt += "Nom de l'employé: " + getNom_employe() + "\n";
            txt += "Prénom de l'employé:  " + getPrenom_employe() + "\n";
            txt += "Date d'embauche: " + getDate_embauche() + "\n";
            txt += "Année d'expérience: " + getAnnee_experience() + "\n";
            txt += "Date de naissance: " + getDdn() + "\n";
            txt += "Numéro d'assurance social: " + getNas() + "\n";
            txt += "Personne à contacter en cas d'urgence: " + getPersonne_contact() + "\n";
            txt += "Animaux nourris par l'employé: " + getAnimaux_nourris() + "\n";
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
        String nom_employe, prenom_employe, ddn, date_embauche, personne_contact, animaux_nourris;
        int nas, no_employe, annee_experience;
        String loop = "Yes";

        //Boucle while qui permet de poser les questions pertinentes à l'utilisateur et d'ajouter autant d'employés qu'il le désire. Il décide quand il met fin à l'ajout.
        //On affiche ensuite la liste mise à jour.
        //Ici, on lui demande s'il est un employé nourrisseur. Cette réponse ira chercher une question de plus que l'utilisateur devra entrer.
        while (loop.equalsIgnoreCase("Yes")) {
            for (Object obj : arrayOfEmploye) {
                if (obj instanceof Employe employe) {
                    System.out.println(employe.getNo_employe() + " " + employe.getPrenom_employe()+ " " + employe.getNom_employe());

                }
            }
            System.out.println("L'employé à ajouter est-il nourrisseur (oui ou non): ");
            String choixn = sc.next();

            if (choixn.equals("oui")){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Entrez le ou les groupes sociaux que l'employé nourris: ");
                animaux_nourris = scanner.nextLine();
                System.out.println("Entrez le numéro de l'employé : ");
                no_employe = sc.nextInt();
                System.out.println("Entrez le prénom de l'employé: ");
                prenom_employe = sc.next();
                System.out.println("Entrez le nom de l'employé: ");
                nom_employe = sc.next();
                System.out.println("Entrez la date de naissance (jj/mm/aaaa): ");
                ddn = sc.next();
                System.out.println("Entrez le numéro d'assurance social: ");
                nas = sc.nextInt();
                System.out.println("Entrez la date d'embauche (jj/mm/aaaa): ");
                date_embauche = sc.next();
                System.out.println("Entrez les années d'expérience: ");
                annee_experience = sc.nextInt();
                System.out.println("Entrez le nom de la personne à contacter en cas d'urgence: ");
                personne_contact = scanner.nextLine();

            //Création de l'objet Employé nourrisseur avec les propriétés requises.
            Nourrisseur employeAjout = new Nourrisseur(no_employe, nom_employe, prenom_employe, ddn, nas, date_embauche, annee_experience, personne_contact, animaux_nourris);
            //Ajout d'un nouvel employé dans la liste.
            arrayOfEmploye.add(employeAjout);
            }
            if (choixn.equals("non")){
                System.out.println("Entrez le numéro de l'employé : ");
                no_employe = sc.nextInt();
                System.out.println("Entrez le prénom de l'employé: ");
                prenom_employe = sc.next();
                System.out.println("Entrez le nom de l'employé: ");
                nom_employe = sc.next();
                System.out.println("Entrez la date de naissance (jj/mm/aaaa): ");
                ddn = sc.next();
                System.out.println("Entrez le numéro d'assurance social: ");
                nas = sc.nextInt();
                System.out.println("Entrez la date d'embauche: ");
                date_embauche = sc.next();
                System.out.println("Entrez les années d'expérience: ");
                annee_experience = sc.nextInt();
                System.out.println("Entrez le nom de la personne à contacter en cas d'urgence: ");
                personne_contact = sc.next();

                //Création de l'objet Employé avec les propriétés requises.
                Employe employeAjout = new Employe(no_employe, nom_employe, prenom_employe, ddn, nas, date_embauche, annee_experience, personne_contact);
                //Ajout d'un nouvel employé dans la liste.
                arrayOfEmploye.add(employeAjout);

            }
            System.out.println("Voulez-vous continuer (Yes/No)? ");
            loop = sc.next();
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
                System.out.println(employe.getNom_employe());
            }
        }

        System.out.println("\nEntrez le nom de l'employé que vous voulez enlever: ");
        String enl_employe = sc.nextLine();
        for (Object obj : arrayOfEmploye) {
            if (obj instanceof Employe employe) {
                if (enl_employe.equals(employe.getNom_employe())){
                    System.out.println(employe.getNom_employe() + " n'est plus dans la base de données.");
                    arrayOfEmploye.remove(employe);
                    break;
                }

            }
            if (obj instanceof Nourrisseur employe){
                if (enl_employe.equals(employe.getNom_employe())){
                    System.out.println(employe.getNom_employe() + " n'est plus dans la base de données.");
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
                    System.out.println(employe.getPrenom_employe() + " " + employe.getNom_employe());
                }
            }

            System.out.println("\nEntrez le nom de famille de l'employé pour qui vous voulez voir les animaux nourris: ");
            String nour_employe = sc.nextLine();
            for (Object obj : arrayOfEmploye) {
                if (obj instanceof Nourrisseur employe){
                    if (nour_employe.equals(employe.getNom_employe())){
                        System.out.println("Cet employé nourris les animaux suivants:");
                        for (Animal arrayOfAnimal : arrayOfAnimals) {
                            if (employe.getAnimaux_nourris().contains(arrayOfAnimal.getGroupe_social())) {
                                System.out.println(arrayOfAnimal.getNom_animal());
                            }
                        }
                    }
                }
            }
            System.out.println("Voulez-vous continuer (Yes/No)? ");
            loop = sc.next();
        }
    }
}