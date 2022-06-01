public class MSBFact  implements GroupsFact{
    @Override
    public Groups createGroup() {
        return new MSB();
    }
}
