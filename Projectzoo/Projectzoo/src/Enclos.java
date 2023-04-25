import java.util.ArrayList;
import java.util.Scanner;

//Permet de définir les propriétés que nous allons utiliser dans le code.
public class Enclos {
    private String herbivoresZone;
    private String carnivoresZone;
    private String omnivoresZone;

    //Le constructeur permet d'initialiser les variables.
    public Enclos(){}

    //Le constructeur permet d'initialiser les variables.
    public Enclos(String herbivoresZone, String carnivoresZone, String omnivoresZone) {
        this.herbivoresZone = herbivoresZone;
        this.carnivoresZone = carnivoresZone;
        this.omnivoresZone = omnivoresZone;
    }
    //Le setter permet de demander un changement d'état.
    public void setHerbivoresZone(String herbivoresZone) {
        this.herbivoresZone = herbivoresZone;
    }

    public void setCarnivoresZone(String carnivoresZone) {
        this.carnivoresZone = carnivoresZone;
    }

    public void setOmnivoresZone(String omnivoresZone) {
        this.omnivoresZone = omnivoresZone;
    }

    //Le getter permet l'accès en lecture à un attribut.
    public String getHerbivoresZone() {
        return herbivoresZone;
    }

    public String getCarnivoresZone() {
        return carnivoresZone;
    }

    public String getOmnivoresZone() {
        return omnivoresZone;
    }

    //Permet de définir les propriétés que nous allons utiliser dans le code.
    public static class Zone {
        private String zoneType;
        private String zoneNumber;
        private String cageType;
        private String cageSize;
        private String grSocial;
        //Le constructeur permet d'initialiser les variables.
        public Zone(){}
        //Le constructeur permet d'initialiser les variables.
        public Zone(String zoneType, String zoneNumber, String cageType, String cageSize, String grSocial) {
            this.zoneType = zoneType;
            this.zoneNumber = zoneNumber;
            this.cageType = cageType;
            this.cageSize = cageSize;
            this.grSocial = grSocial;

        }
        //Le setter permet de demander un changement d'état.
        public void setZoneType(String zoneType) {
            this.zoneType = zoneType;
        }

        public void setZoneNumber(String zoneNumber) {
            this.zoneNumber = zoneNumber;
        }

        public void setCageType(String cageType) {
            this.cageType = cageType;
        }

        public void setCageSize(String cageSize) {
            this.cageSize = cageSize;
        }

        public void setGrSocial(String grSocial) {
            this.grSocial = grSocial;
        }

        //Le getter permet l'accès en lecture à un attribut.
        public String getZoneType() {
            return zoneType;
        }

        public String getZoneNumber() {
            return zoneNumber;
        }

        public String getCageType() {
            return cageType;
        }

        public String getCageSize() {
            return cageSize;
        }

        public String getGrSocial() {
            return grSocial;
        }

        //to String pour faire la mise en page de la liste des enclos.
        @Override
        public String toString() {
            String txt;
            txt = "La zone: " + getZoneType() + ", " + "Le numéro de la zone: " + getZoneNumber() + ", " + "Le type de cage: " + getCageType() + ", " + "La grandeur de la cage: " + getCageSize() + ", " + "Le groupe social: " + getGrSocial();
            return txt;
        }
    }
    //Affichage du menu pour la classe "Enclos". On demande ensuite à l'utilisateur de choisir une option dans le menu.
    //Switch permet de sélectionner un ensemble d'instructions à exécuter en fonction de la valeur d'une variable.
    public static void enclosMenu(ArrayList<Animal> arrayOfAnimal) {
        Scanner input = new Scanner(System.in);
            int choice;
            //Création de mes données (statiques) dans la liste des enclos.
            Zone[] listEnclos = {
                new Zone("Herbe1", "1.1", "Enclos ouverts", "Moyenne", "Les Saint-Félicien"),
                new Zone("Herbe1", "1.2", "Enclos ouverts", "Moyenne", "Les sarcastiques"),
                new Zone("Omni3", "3.1", "Confinements sans barreaux", "Petite", "Les pygmés malins"),
                new Zone("Omni3", "3.2", "Confinements sans barreaux", "Grande", "L'artiste"),
                new Zone("Carni2", "2.1", "Confinements à barreaux", "Grande", "Les protecteurs de la lune"),
                new Zone("Carni2", "2.2", "Confinements à barreaux", "Grande", "La solitaire"),
                new Zone("Carni2", "2.3", "Confinements à barreaux", "Grande", "Les frères coquins"),
                new Zone("Carni2","2.4","Confinement à barreaux", "Grande","Neuf Vies")};

            do {
                System.out.println("Menu des enclos:");
                System.out.println("1. Voir la liste des enclos");
                System.out.println("2. Voir les animaux d'un enclos");
                System.out.println("3. Retour au menu principal");

                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        listEnclos(listEnclos);
                        break;
                    case 2:
                        listAnimalEnclos(arrayOfAnimal, listEnclos);
                    case 3:
                        System.out.println("Returning to main menu...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } while (choice != 3);
    }
    //Retourne la liste des enclos dans mon zoo.
    public static void listEnclos(Zone[] listEnclos){
        System.out.printf("****************************Liste des enclos****************************%n");
        for (Zone listEnclo : listEnclos) {
            System.out.println(listEnclo);
        }
    }
    //Retourne la liste des animaux dans chaque enclos.
    //L'utilisateur choisit l'enclos pour afficher les animaux qui sont assignés à celui-ci.
    public static void listAnimalEnclos(ArrayList  <Animal> arrayOfAnimal, Zone[] listEnclos) {
        Scanner sc = new Scanner(System.in);
        String loop;
        boolean boucle = true;

        while (boucle) {
            System.out.printf("****************************Liste des enclos****************************%n");
            for (Zone listEnclo : listEnclos) {
                System.out.println(listEnclo.getZoneType() + " " + listEnclo.getZoneNumber());
            }
            System.out.print("\nPour voir les animaux d'une cage, choisissez le numéro de zone d'une cage (ex. 1.1): ");
            String num = sc.next();
            int ind_enclos = 0;
            for (int i = 0; i < listEnclos.length; i++){
                if (num.equals(listEnclos[i].getZoneNumber())){
                    ind_enclos = i;
                    break;
                }
            }
            System.out.println(listEnclos[ind_enclos].getZoneType() + " " + listEnclos[ind_enclos].getZoneNumber());
            for (Animal animal : arrayOfAnimal) {
                String groupe = listEnclos[ind_enclos].getGrSocial();
                if (animal.getGroupeSocial().equals(groupe)) {
                    System.out.println(animal.getNomAnimal() + " le " + animal.getEspece());
                }
            }
    
            System.out.print("Pour continuer, entre 'continu'.Sinon 'Stop' : ");
            loop = sc.next();
            if (loop.equalsIgnoreCase("stop")) {
                boucle = false;
            }
        }
    }
}





