public class Ticket {
    private double value;
    private int quantity;
    private boolean halfPrice;

    public double getValue() {
        return value;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean getHalfPrice() {
        return halfPrice;
    }

    public void setValue(double value) {
          this.value = value;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setHalfPrice(boolean halfPrice) {
        this.halfPrice = halfPrice;
    }

    public double getTotal(){
        if(halfPrice == false){
            return value * quantity;
        }else
            return (value * quantity) / 2;
           
    }
    
    public void show(){
        System.out.printf(
            "Price: %.2f\n"+
            "Quantity: %d\n"+
            "Half price ticket: %b\n"+
            "Total: %.2f",getValue(),getQuantity(),getHalfPrice(),getTotal()
        );
    }
}
