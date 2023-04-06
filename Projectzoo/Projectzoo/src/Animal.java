import java.util.ArrayList;
import java.util.Scanner;

public class Animal {
    //Permet de définir les propriétés que nous allons utiliser dans le code.
    private String nom_animal;
    private String espece;
    private String ddn_animal;
    private String dda;
    private String lieu_naissance;
    private String genre;
    private String groupe_social;
    private int ration_jour;
    private int ration_semaine;
    private int quantite_jour;
    private boolean isExotique;

    //Le constructeur permet d'initialiser les variables
    public Animal() {
    }
    //Le constructeur permet d'initialiser les variables
    public Animal(String aNom_animal, String aEspece, String aDdn_animal, String aDda, String aLieu_naissance, String aGenre, String aGroupe_social, int aRation_jour, int aRation_semaine, int aQuantite_jour, boolean aIsExotique) {
        nom_animal = aNom_animal;
        espece = aEspece;
        ddn_animal = aDdn_animal;
        dda = aDda;
        lieu_naissance = aLieu_naissance;
        genre = aGenre;
        groupe_social = aGroupe_social;
        ration_jour = aRation_jour;
        ration_semaine = aRation_semaine;
        quantite_jour = aQuantite_jour;
        isExotique = aIsExotique;
    }
    //Le setter permet de demander un changement d'état.
    public void setNom_animal(String aNom_animal) {
        this.nom_animal = aNom_animal;
    }

    public void setEspece(String aEspece) {
        this.espece = aEspece;
    }

    public void setDdn_animal(String aDdn_animal) {
        this.ddn_animal = aDdn_animal;
    }

    public void setDda(String aDda) {this.dda = aDda;}

    public void setLieu_naissance(String aLieu_naissance) {
        this.lieu_naissance = aLieu_naissance;
    }

    public void setGenre(String aGenre) {
        this.genre = aGenre;
    }

    public void setRation_jour(int aRation_jour) {
        this.ration_jour = aRation_jour;
    }

    public void setRation_semaine(int aRation_semaine) {
        this.ration_semaine = aRation_semaine;
    }

    public void setQuantite_jour(int aQuantite_jour) {
        this.quantite_jour = aQuantite_jour;
    }

    public void setIsExotique(boolean aIsExotique) {
        this.isExotique = aIsExotique;
    }

    //Le getter permet l'accès en lecture à un attribut.
    public String getNom_animal() {
        return nom_animal;
    }

    public String getEspece() {
        return espece;
    }

    public String getDdn_animal() {
        return ddn_animal;
    }

    public String getDda() {
        return dda;
    }

    public String getLieu_naissance() {
        return lieu_naissance;
    }

    public String getGenre() {
        return genre;
    }

    public String getGroupe_social() {
        return groupe_social;
    }

    public int getRation_jour() {
        return ration_jour;
    }

    public int getRation_semaine() {
        return ration_semaine;
    }

    public int getQuantite_jour() {
        return quantite_jour;
    }

    public boolean getIsExotique() {
        return isExotique;
    }


    //Affichage du menu pour la classe "Animal". On demande ensuite à l'utilisateur de choisir une option dans le menu.
    //Switch permet de sélectionner un ensemble d'instructions à exécuter en fonction de la valeur d'une variable.
    public static void animalMenu(ArrayList<Animal> arrayOfAnimal) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu animal:");
            System.out.println("1. Ajouter un animal");
            System.out.println("2. Enlever un animal");
            System.out.println("3. Liste des animaux");
            System.out.println("4. Retour au menu principal");

            choice = input.nextInt();

            switch (choice) {
                case 1 -> addAnimal(arrayOfAnimal);
                case 2 -> removeAnimal(arrayOfAnimal);
                case 3 -> listAnimal(arrayOfAnimal);
                case 4 -> System.out.println("Retour au menu principal...");
                default -> System.out.println("Mauvais choix. Recommencer.");
            }
        } while (choice != 4);
    }
    //Méthode pour ajouter un animal dans le système.
    private static void addAnimal(ArrayList<Animal>arrayOfAnimal) {
        Scanner sc = new Scanner(System.in);
        String nom_animal, espece, lieu_naissance, genre, groupe_social, ddn_animal, dda;
        int ration_jour, ration_semaine, quantite_jour;
        boolean isExotique;
        String loop = "Yes";
        //Boucle while qui permet de poser les questions pertinentes à l'utilisateur et d'ajouter autant d'animaux qu'il le désire. Il décide quand il met fin à l'ajout.
        //On affiche ensuite la liste mise à jour.
        while (loop.equalsIgnoreCase("Yes")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Entrez l'espèce de l'animal: ");
            espece = sc.next();
            System.out.println("Entrez le nom de l'animal: ");
            nom_animal = sc.next();
            for (Animal animal : arrayOfAnimal) {
                if (espece.equals(animal.getEspece())) {
                    if (nom_animal.equals(animal.getNom_animal())) {
                        System.out.println("Le nom choisi pour cet animal est déjà pris par un autre individu de la même espèce, veuillez en choisir un autre.");
                        System.out.println("Entrez le nom de l'animal: ");
                        nom_animal = sc.next();
                    }
                }
            }
            System.out.println("Entrez la date de naissance (jj/mm/aaaa): ");
            ddn_animal = sc.next();
            System.out.println("Entrez la date d'arrivée (jj/mm/aaaa): ");
            dda = sc.next();
            System.out.println("Entrez le lieu de naissance: ");
            lieu_naissance = sc.next();
            System.out.println("Entrez le genre de l'animal: ");
            genre = sc.next();
            System.out.println("Entrez le groupe social: ");
            groupe_social = scanner.nextLine();
            System.out.println("Entrez la fréquence des rations par jour: ");
            ration_jour = sc.nextInt();
            System.out.println("Entrez la fréquence des rations par semaine: ");
            ration_semaine = sc.nextInt();
            System.out.println("Entrez la quantité par jour: ");
            quantite_jour = sc.nextInt();
            System.out.println("Est-ce un animal exotique? true/false: ");
            isExotique = sc.nextBoolean();

            //Création de l'objet Animal avec les propriétés de l'objet.
            Animal animalAjout = new Animal(nom_animal, espece, ddn_animal, dda, lieu_naissance, genre, groupe_social, ration_jour, ration_semaine, quantite_jour, isExotique);
            //Ajout du nouvel animal dans la liste.
            arrayOfAnimal.add(animalAjout);
            System.out.println("Voulez-vous continuer (Yes/No)? ");
            loop = sc.next();
        }

        System.out.println("\nListe des animaux à jour :\n");
        arrayOfAnimal.forEach(System.out::println);

    }
    //Code pour enlever un animal du système.
    //On affiche la liste des animaux. Ensuite, on demande à l'utilisateur de choisir le numéro de l'animal à enlever.
    //On affiche la liste des animaux mise à jour.
    private static void removeAnimal(ArrayList<Animal> arrayOfAnimal) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arrayOfAnimal.size(); i++){
            System.out.println(i + " " + arrayOfAnimal.get(i).getNom_animal());
        }
        System.out.println("Choississez le numéro de l'animal que vous voulez enlever: ");
        int ind_animal = sc.nextInt();
        System.out.println(arrayOfAnimal.get(ind_animal).getNom_animal() + " n'est plus dans la base de données.");
        arrayOfAnimal.remove(ind_animal);
        System.out.println("\n\n --------- Liste des animaux mise à jour ----------------");
        arrayOfAnimal.forEach(System.out::println);

    }
    //Code pour afficher la liste des animaux dans le zoo.
    private static void listAnimal(ArrayList<Animal> arrayOfAnimal) {
        System.out.println("Liste des animaux dans la base de données");
        arrayOfAnimal.forEach(System.out::println);
    }

    //to String pour faire la mise en page de la liste des animaux.
    @Override
        public String toString () {
            String txt;
            txt = "Nom de l'animal: " + getNom_animal() + "\n";
            txt += "Espèce de l'animal: " + getEspece() + "\n";
            txt += "Date de naissance:  " + getDdn_animal() + "\n";
            txt += "Date d'arrivée =  " + getDda() + "\n";
            txt += "Lieu de naissance = " + getLieu_naissance() + "\n";
            txt += "Le genre: " + getGenre() + "\n";
            txt += "Le groupe social: " + getGroupe_social() + "\n";
            txt += "La fréquence des rations par jour: " + getRation_jour() + "\n";
            txt += "La fréquence des rations par semaine: " + getRation_semaine() + "\n";
            txt += "La quantité par jour: " + getQuantite_jour() + "\n";
            txt += "Est-ce un animal exotique? " + getIsExotique() +"\n";
            return txt;
        }
    }
