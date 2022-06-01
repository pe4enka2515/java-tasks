public class BMWFact implements GroupsFact {

    @Override
    public Groups createGroup() {
        return new BMW();
    }
}