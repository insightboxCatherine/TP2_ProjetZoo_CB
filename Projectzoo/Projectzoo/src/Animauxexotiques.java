public enum Animauxexotiques {
    LOUP ("Cet animal est exotique"),
    LION ("Cet animal est exotique"),
    OURSNOIR ("Cet animal est exotique"),
    OUISTITI ("Cet animal est exotique"),
    CASTOR ("Cet animal est exotique"),
    GIRAFFE ("Cet animal est exotique"),
    BISON ("Cet animal est exotique"),
    LOUTRE ("Cet animal est exotique"),
    ZEBRE ("Cet animal est exotique"),
    RHINOCEROS ("Cet animal est exotique");

    String msg;
    Animauxexotiques(String animaux){
        this.msg = animaux;
    }
    public String getMsg() {
        return msg;
    }
}
