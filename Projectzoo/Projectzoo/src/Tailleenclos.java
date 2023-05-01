public enum Tailleenclos {
    GRANDE("Cette cage est de grande taille"),
    MOYENNE("Cette cage est de moyenne taille"),
    PETITE("Cette cage est de petite taille");
    String msgtaille;

    Tailleenclos(String tailleenclos){
        this.msgtaille = tailleenclos;
    }

    public String getMsgtaille(){
        return msgtaille;
    }
}

