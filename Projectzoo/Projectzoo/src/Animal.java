import java.util.ArrayList;
import java.util.Scanner;

public class Animal {
    //Permet de définir les propriétés que nous allons utiliser dans le code.
    private String nomAnimal;
    private String espece;
    private String ddnAnimal;
    private String dda;
    private String lieuNaissance;
    private String genre;
    private String groupeSocial;
    private int rationJour;
    private int rationSemaine;
    private int quantiteJour;
    private boolean isExotique;

    //Le constructeur permet d'initialiser les variables
    public Animal() {
    }
    //Le constructeur permet d'initialiser les variables
    public Animal(String aNomAnimal, String aEspece, String aDdnAnimal, String aDda, String aLieuNaissance, String aGenre, String aGroupeSocial, int aRationJour, int aRationSemaine, int aQuantiteJour, boolean aIsExotique) {
        nomAnimal = aNomAnimal;
        espece = aEspece;
        ddnAnimal = aDdnAnimal;
        dda = aDda;
        lieuNaissance = aLieuNaissance;
        genre = aGenre;
        groupeSocial = aGroupeSocial;
        rationJour = aRationJour;
        rationSemaine = aRationSemaine;
        quantiteJour = aQuantiteJour;
        isExotique = aIsExotique;
    }
    //Le setter permet de demander un changement d'état.
    public void setnomAnimal(String aNomAnimal) {
        this.nomAnimal = aNomAnimal;
    }

    public void setEspece(String aEspece) {
        this.espece = aEspece;
    }

    public void setddnAnimal(String aDdnAnimal) {
        this.ddnAnimal = aDdnAnimal;
    }

    public void setDda(String aDda) {this.dda = aDda;}

    public void setLieuNaissance(String aLieuNaissance) {
        this.lieuNaissance = aLieuNaissance;
    }

    public void setGenre(String aGenre) {
        this.genre = aGenre;
    }

    public void setRationJour(int aRationJour) {
        this.rationJour = aRationJour;
    }

    public void setRationSemaine(int aRationSemaine) {
        this.rationSemaine = aRationSemaine;
    }

    public void setQuantiteJour(int aQuantiteJour) {
        this.quantiteJour = aQuantiteJour;
    }

    public void setIsExotique(boolean aIsExotique) {
        this.isExotique = aIsExotique;
    }

    //Le getter permet l'accès en lecture à un attribut.
    public String getNomAnimal() {
        return nomAnimal;
    }

    public String getEspece() {
        return espece;
    }

    public String getDdnAnimal() {
        return ddnAnimal;
    }

    public String getDda() {
        return dda;
    }

    public String getLieuNaissance() {
        return lieuNaissance;
    }

    public String getGenre() {
        return genre;
    }

    public String getGroupeSocial() {
        return groupeSocial;
    }

    public int getRationJour() {
        return rationJour;
    }

    public int getRationSemaine() {
        return rationSemaine;
    }

    public int getQuantiteJour() {
        return quantiteJour;
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
        String nomAnimal, espece, lieuNaissance, genre, groupeSocial, ddnAnimal, dda;
        int rationJour, rationSemaine, quantiteJour;
        boolean isExotique;
        String loop = "Yes";
        //Boucle while qui permet de poser les questions pertinentes à l'utilisateur et d'ajouter autant d'animaux qu'il le désire. Il décide quand il met fin à l'ajout.
        //On affiche ensuite la liste mise à jour.
        while (loop.equalsIgnoreCase("Yes")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Entrez l'espèce de l'animal: ");
            espece = sc.next();
            System.out.println("Entrez le nom de l'animal: ");
            nomAnimal = sc.next();
            for (Animal animal : arrayOfAnimal) {
                if (espece.equals(animal.getEspece())) {
                    if (nomAnimal.equals(animal.getNomAnimal())) {
                        System.out.println("Le nom choisi pour cet animal est déjà pris par un autre individu de la même espèce, veuillez en choisir un autre.");
                        System.out.println("Entrez le nom de l'animal: ");
                        nomAnimal = sc.next();
                    }
                }
            }
            System.out.println("Entrez la date de naissance (jj/mm/aaaa): ");
            ddnAnimal = sc.next();
            System.out.println("Entrez la date d'arrivée (jj/mm/aaaa): ");
            dda = sc.next();
            System.out.println("Entrez le lieu de naissance: ");
            lieuNaissance = sc.next();
            System.out.println("Entrez le genre de l'animal: ");
            genre = sc.next();
            System.out.println("Entrez le groupe social: ");
            groupeSocial = scanner.nextLine();
            System.out.println("Entrez la fréquence des rations par jour: ");
            rationJour = sc.nextInt();
            System.out.println("Entrez la fréquence des rations par semaine: ");
            rationSemaine = sc.nextInt();
            System.out.println("Entrez la quantité par jour: ");
            quantiteJour = sc.nextInt();
            System.out.println("Est-ce un animal exotique? true/false: ");
            isExotique = sc.nextBoolean();

            //Création de l'objet Animal avec les propriétés de l'objet.
            Animal animalAjout = new Animal(nomAnimal, espece, ddnAnimal, dda, lieuNaissance, genre, groupeSocial, rationJour, rationSemaine, quantiteJour, isExotique);
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
            System.out.println(i + " " + arrayOfAnimal.get(i).getNomAnimal());
        }
        System.out.println("Choississez le numéro de l'animal que vous voulez enlever: ");
        int ind_animal = sc.nextInt();
        System.out.println(arrayOfAnimal.get(ind_animal).getNomAnimal() + " n'est plus dans la base de données.");
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
            txt = "Nom de l'animal: " + getNomAnimal() + "\n";
            txt += "Espèce de l'animal: " + getEspece() + "\n";
            txt += "Date de naissance:  " + getDdnAnimal() + "\n";
            txt += "Date d'arrivée =  " + getDda() + "\n";
            txt += "Lieu de naissance = " + getLieuNaissance() + "\n";
            txt += "Le genre: " + getGenre() + "\n";
            txt += "Le groupe social: " + getGroupeSocial() + "\n";
            txt += "La fréquence des rations par jour: " + getRationJour() + "\n";
            txt += "La fréquence des rations par semaine: " + getRationSemaine() + "\n";
            txt += "La quantité par jour: " + getQuantiteJour() + "\n";
            txt += "Est-ce un animal exotique? " + getIsExotique() +"\n";
            return txt;
        }
    }
