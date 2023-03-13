// Used source https://www.tutorialspoint.com/design_pattern/observer_pattern.htm

public abstract class Observer {
    protected FNCD fncd;
    public abstract void update(int days, double payed, double addedFunds);
}
