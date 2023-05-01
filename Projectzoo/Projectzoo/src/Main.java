import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

//Création de la classe dans le Main.
public class Main {

    public static void main(String[] args) {

        //Création de mes données (statiques) pour ma liste d'animaux.
        ArrayList<Animal> arrayOfAnimal = new ArrayList<>();
        /*Animal animal1 = new Animal("Nymeria",Animauxexotiques.LOUP,"27/11/2001","23/03/2023","Québec","Femelle","Les protecteurs de la lune",3,7,80,true);*/
        Animal animal2 = new Animal("Sabre",Animauxexotiques.LOUP,"01/08/2011","01/09/2011","Québec","Male","Les protecteurs de la lune",3,7,80,true);
        Animal animal3 = new Animal("Leia",Animauxexotiques.LOUP,"27/11/2009","27/11/2009","Québec","Femelle","La solitaire",3,7,60, true);
        Animal animal4 = new Animal("Vlad",Animauxexotiques.LION,"09/10/2018","02/05/2020","Afrique","Male","Les frères coquins",2,7,100,true);
        Animal animal5 = new Animal("Eragon",Animauxexotiques.LION,"09/10/2018","02/03/2020","Afrique","Male","Les frères coquins",2,7,100,true);
        Animal animal6 = new Animal("Griffon",Animauxexotiques.LION,"20/12/2012","05/08/2013","Afrique","Male","Neuf Vies",2,7,100,true);
        Animal animal7 = new Animal("Jade",Animauxexotiques.CASTOR,"02/12/2017","06/08/2015","Québec","Femelle","Les Saint-Félicien",1,7,30,true);
        Animal animal8 = new Animal("Tobias",Animauxexotiques.CASTOR,"05/12/2015","09/06/2015","Québec","Male","Les Saint-Félicien",1,7,50,true);
        Animal animal9 = new Animal("Pollux",Animauxexotiques.CASTOR,"08/10/2020","08/10/2020","Québec","Male","Les Saint-Félicien",1,7,20,true);
        Animal animal10 = new Animal("Cinnamon",Animauxdomestiques.PORCEPIC,"10/09/2020","02/07/2021","Mexique","Femelle","Les sarcastiques",2,7,70,false);
        Animal animal11 = new Animal("Hazel",Animauxdomestiques.PORCEPIC,"14/08/2021","14/08/2021","Québec","Femelle","Les sarcastiques",2,7,40,false);
        Animal animal12 = new Animal("Carlin",Animauxexotiques.OUISTITI,"02/10/2001","07/08/2005","Brésil","Male","Les Pygmés malins",3,7,50,true);
        Animal animal13 = new Animal("Bagel",Animauxexotiques.OUISTITI,"05/08/2004","05/08/2006","Brésil","Femelle","Les pygmés malins",3,7,35,true);
        Animal animal14 = new Animal("Peggy",Animauxexotiques.OURSNOIR,"05/07/1998","09/02/2003","Québec","Femelle","L'artiste",1,7,120,true);

        //Permet d'entreposer plusieurs variables dans une seule variable.
        /*arrayOfAnimal.add(animal1);*/
        arrayOfAnimal.add(animal2);
        arrayOfAnimal.add(animal3);
        arrayOfAnimal.add(animal4);
        arrayOfAnimal.add(animal5);
        arrayOfAnimal.add(animal6);
        arrayOfAnimal.add(animal7);
        arrayOfAnimal.add(animal8);
        arrayOfAnimal.add(animal9);
        arrayOfAnimal.add(animal10);
        arrayOfAnimal.add(animal11);
        arrayOfAnimal.add(animal12);
        arrayOfAnimal.add(animal13);
        arrayOfAnimal.add(animal14);

        //lecture dans un fichier et ajout des voitures dans le arraylist arrayOfCars
        try {
            File myFile = new File("Projectzoo/Projectzoo/listofanimals");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] splitData = data.split(",", 0);
                int rationJour = Integer.parseInt(splitData[7]);
                int rationSemaine = Integer.parseInt(splitData[8]);
                int quantiteJour = Integer.parseInt(splitData[9]);
                boolean isExotic=Boolean.parseBoolean(splitData[10]);
                if (isExotic = true) {
                    arrayOfAnimal.add(new Animal(splitData[0], Animauxexotiques.valueOf(splitData[1].toUpperCase()), splitData[2], splitData[3], splitData[4], splitData[5], splitData[6], rationJour, rationSemaine, quantiteJour, isExotic));
                }
                if(isExotic = false) {
                    arrayOfAnimal.add(new Animal(splitData[0], Animauxdomestiques.valueOf(splitData[1].toUpperCase()), splitData[2], splitData[3], splitData[4], splitData[5], splitData[6], rationJour, rationSemaine, quantiteJour, isExotic));
                }
            }
            myReader.close();

        }catch (FileNotFoundException e) {
            System.out.println("Une erreur est survenue: " + e);
            e.printStackTrace();
        }

        //Création de mes données (statiques) dans la liste d'employés et d'employés-nourrisseurs.
        ArrayList<Object> arrayOfEmploye = new ArrayList<>();
        Employe.Nourrisseur employe1 = new Employe.Nourrisseur(1,"Juliette","Dubois","24/05/1998",568987584,"24/09/2008",15,"Alain Vadeboncoeur", "Les protecteurs de la lune et Les frères coquins");
        Employe employe2 = new Employe(2,"Merlin","Trudel","06/08/2001",215465814,"05/07/2018",2,"Francine Lebel");
        Employe.Nourrisseur employe3 = new Employe.Nourrisseur(3,"Nora", "Robert","02/11/1985",845245984,"05/06/2023",6,"Félix Cardin", "La solitaire");
        Employe employe4 = new Employe(4,"Sylvain","Ferland","08/06/1965",254786852,"02/08/2023",20,"Jeanette Laurier");
        Employe.Nourrisseur employe5 = new Employe.Nourrisseur(5,"Emmma","Latraverse","06/05/1997",956358654,"06/05/2010",2,"Rose Latraverse","Les sarcastiques");
        Employe employe6 = new Employe(6,"Charlie","Gagnon","10/10/1994",532895124,"03/05/2006",10,"Mylène Lavoie");
        Employe.Nourrisseur employe7 = new Employe.Nourrisseur(7,"Thomas","Fortin","12/05/1990",284635894,"05/06/2020",2,"Carl Fortin","Les Saint-féliciens et Les pygmés malins");
        Employe employe8 = new Employe(8,"Elliot","Paquette","27/11/1980",586785457,"10/08/2012",10,"Francine Paquette");
        Employe.Nourrisseur employe9 = new Employe.Nourrisseur(9,"Jade","Cloutier","09/12/2000",514321485,"06/01/20020",4,"Francis Martel","L'artiste et Neuf vies");
        Employe employe10 = new Employe(10,"Edouard","Thibault","05/09/1968",865752123,"06/10/2000",12,"Agatha Thibault");

        //Permet d'entreposer plusieurs variables dans une seule variable.
        arrayOfEmploye.add(employe1);
        arrayOfEmploye.add(employe2);
        arrayOfEmploye.add(employe3);
        arrayOfEmploye.add(employe4);
        arrayOfEmploye.add(employe5);
        arrayOfEmploye.add(employe6);
        arrayOfEmploye.add(employe7);
        arrayOfEmploye.add(employe8);
        arrayOfEmploye.add(employe9);
        arrayOfEmploye.add(employe10);

        //Affichage du menu principal. On demande ensuite à l'utilisateur de choisir une option dans le menu.
        //Switch permet de sélectionner un ensemble d'instructions à exécuter en fonction de la valeur d'une variable.
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Sélectionner une option:");
            System.out.println("1. Animal");
            System.out.println("2. Employé");
            System.out.println("3. Aliment");
            System.out.println("4. Enclos");
            System.out.println("5. Exit");

            choice = input.nextInt();

            switch (choice) {
                case 1 -> Animal.animalMenu(arrayOfAnimal);
                case 2 -> Employe.employeMenu(arrayOfEmploye, arrayOfAnimal);
                case 3 -> Aliment.alimentMenu();
                case 4 -> Enclos.enclosMenu(arrayOfAnimal);
                case 5 -> System.out.println("Exiting program...");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        input.close();
    }
}


