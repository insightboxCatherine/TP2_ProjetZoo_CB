import utilitaire.MyMethods;

import java.util.Scanner;
//Permet de définir les propriétés que nous allons utiliser dans le code.
public class Aliment {
    private String type;
    private String format;
    private double inventory;

    //Le constructeur permet d'initialiser les variables.
    public Aliment (){}

    //Le constructeur permet d'initialiser les variables.
    public Aliment(String type, String format, double inventory) {
        this.type = type;
        this.format = format;
        this.inventory = inventory;
    }
    //Le setter permet de demander un changement d'état.
    public void setType(String type) {
        this.type = type;
    }
    public void setFormat(String format) {
        this.format = format;
    }
    public void setInventory(double inventory) {
        this.inventory = inventory;
    }

    //Le getter permet l'accès en lecture à un attribut.
    public String getType() {
        return type;
    }
    public String getFormat() {
        return format;
    }
    public double getInventory() {
        return inventory;
    }


    //Affichage du menu pour la classe "Aliment". On demande ensuite à l'utilisateur de choisir une option dans le menu.
    //Switch permet de sélectionner un ensemble d'instructions à exécuter en fonction de la valeur d'une variable.
    public static void alimentMenu() {
        Scanner input = new Scanner(System.in);
        int choice;

        //Création de mes données (statiques) dans la liste des aliments.
        Aliment[] listAliment = {
            new Aliment("Viande", "lbs", 100),
            new Aliment("Foin", "balles", 40),
            new Aliment("Moulée", "Boisseaux", 200)};

        do {
            System.out.println("Menu aliment:");
            System.out.println("1. Ajouter une quantité à un aliment");
            System.out.println("2. Enlever une quantité à un aliment");
            System.out.println("3. Retour au menu principal");

            choice = input.nextInt();

            switch (choice) {
                case 1 -> addInventory(listAliment);
                case 2 -> removeInventory(listAliment);
                case 3 -> System.out.println("Retour au menu principal...");
                default -> System.out.println("Choix invalide. Veuillez essayer de nouveau.");
            }
        } while (choice != 3);
    }
    //to String pour faire la mise en page de la liste des aliments.
    @Override
    public String toString() {
        String txt;
        txt = "Le type de nourriture: " + getType() + "\n";
        txt += "Le format: " + getFormat() + "\n";
        txt += "L'inventaire: " + getInventory();
        return txt;
    }
    //Méthode pour enlever un aliment dans le système.
    //On crée également une boucle while pour que l'utilisateur puisse enlever autant d'aliment qu'il le souhaite.
    private static void removeInventory(Aliment[] listAliment) {

            Scanner sc = new Scanner(System.in);
            String loop;
            int choice;
            double newAliment;
            boolean boucle=true;

            while (boucle) {

                System.out.printf("****************************Inventaire****************************%n");
                for (Aliment aliment : listAliment) {
                    System.out.println(aliment);
                }

                System.out.print("Entrez le nombre associé au type de nourriture entre viande(0), foin(1) ou moulée(2): ");
                choice = sc.nextInt();
                newAliment =  listAliment[choice].getInventory() - MyMethods.readInteger("Entrez la quantité à retirer de l'inventaire: ",0,10000);
                listAliment[choice].setInventory(newAliment);
                if (listAliment[choice].getInventory() <= 0){
                    listAliment[choice].setInventory(0);
                    System.out.println("Attention, la quantité de " + listAliment[choice].getType().toLowerCase() + " est à zéro.");
                }

                for (Aliment aliment : listAliment) {
                    System.out.println(aliment);
                }
                System.out.print("Pour continuer, entre 'continu'.Sinon 'Stop' : ");
                loop = sc.next();
                if (loop.equalsIgnoreCase("stop")) {boucle = false;}
            }

        }
    //Méthode pour ajouter un aliment dans le système.
    //On crée également une boucle while pour que l'utilisateur puisse ajouter autant d'aliment qu'il le souhaite.
    private static void addInventory(Aliment[] listAliment) {

        Scanner sc = new Scanner(System.in);
        String loop;
        int choice;
        double newAliment;
        boolean boucle=true;

        while (boucle) {
        //Boucle while qui permet de poser les questions pertinentes à l'utilisateur et d'ajouter de l'inventaire tant qu'il le désire. Il décide quand il met fin à l'ajout.
        //On affiche ensuite l'inventaire mise à jour.
            System.out.printf("****************************Inventaire****************************%n");
            for (Aliment value : listAliment) {
                System.out.println(value);
            }

            choice = MyMethods.readInteger("Entrez le nombre associé au type de nourriture entre viande(0), foin(1) ou moulée(2): ",0,2);
            newAliment = MyMethods.readInteger("Entrez la quantité à ajouter à l'inventaire: ", 0,10000) + listAliment[choice].getInventory();
            listAliment[choice].setInventory(newAliment);

            for (Aliment aliment : listAliment) {
                System.out.println(aliment);
            }
            System.out.print("Pour continuer, entre 'continu'.Sinon 'Stop' : ");
            loop = sc.next();
            if (loop.equalsIgnoreCase("stop")) {boucle = false;}
        }
    }
}
