public enum Animauxdomestiques {

    LAPIN("Cet animal est domestique"),
    POULE("Cet animal est domestique"),
    CANARD("Cet animal est domestique"),
    COCHON("Cet animal est domestique"),
    VACHE("Cet animal est domestique"),
    CHEVAL("Cet animal est domestique"),
    ANE("Cet animal est domestique"),
    OIE("Cet animal est domestique"),
    PORCEPIC("Cet animal est domestique"),
    SERPENT("Cet animal est domestique");
    String msg;
    Animauxdomestiques(String animaux){
        this.msg = animaux;
    }

    public String getMsg() {
        return msg;
    }
}
