package koschei.models;


public class Wood3 {


    private final Rabbit4 rabbit4;

    public Wood3(Rabbit4 rabbit4) {
        this.rabbit4 = rabbit4;
    }

    @Override
    public String toString() {
        return ", на дереве заяц " + rabbit4.toString();
    }
}
