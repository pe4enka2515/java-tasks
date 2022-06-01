public class Main {
    public static void main(String[] args) {
        GroupsFact gf = (GroupsFact) new BMWFact();
        Groups g = gf.createGroup();

        g.whichOne();
    }
}
