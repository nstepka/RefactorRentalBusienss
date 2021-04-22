package refactoring;

public class Statement {

    private Rental rental;
    private int children;
    private int regular;
    private int new_Release;
    private int amountOwned;
    private int frequentRenterPoints;



    public Statement(Rental rental) {
        this.rental = rental;
    }

    public Statement(Rental rental, int children, int regular, int new_Release, int amountOwned) {
        this.rental = rental;
        this.children = children;
        this.regular = regular;
        this.new_Release = new_Release;
        this.amountOwned = amountOwned;
    }

    public void setChildren(int children) {this.children = children;}

    public void setRegular(int regular) {this.regular = regular;}

    public void setNew_Release(int new_Release) {this.new_Release = new_Release;}

    public void setAmountOwned(int amountOwned) {this.amountOwned = amountOwned;}

    public int getChildren() {return children;}

    public int getRegular() {return regular;}

    public int getNew_Release() {return new_Release;}

    public Rental getRental() {return rental;}

    public void setRental(Rental rental) { this.rental = rental;}

    public int getAmountOwned() { return amountOwned;}

}
