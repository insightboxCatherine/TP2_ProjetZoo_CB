public enum Typeenclos {
    HERBIVORE ("Cet enclos est pour les herbivores"),
    OMNIVORE("Cet enclos est pour les omnivores"),
    CARNIVORE("Cet enclos est pour les carnivores");
    String msg;
    Typeenclos(String typeenclos){
        this.msg = typeenclos;
    }

    public String getMsg() {
        return msg;
    }
}
