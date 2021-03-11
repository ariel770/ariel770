public class Invoice implements Payable {
    private String partDescription;
    private String partNumber;
    private double pricePerItem;
    private int qty;

    public Invoice(String partDescription, String partNumber, double pricePerItem, int qty) {
        if (pricePerItem <= 0.0) {
            throw new IllegalArgumentException(" The pricePerItem must to be  >= 0.0");
        }
        if (qty <= 0) {
            throw new IllegalArgumentException(" The qty must to be  >= 0");
        }
        this.pricePerItem = pricePerItem;
        this.partDescription = partDescription;
        this.qty = qty;
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public int getQty() {
        return qty;
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem <= 0.0) {
            throw new IllegalArgumentException(" The pricePerItem must to be  >= 0.0");
        }

        this.pricePerItem = pricePerItem;
    }

    public void setQty(int qty) {
        if (qty <= 0) {
            throw new IllegalArgumentException(" The qty must to be  >= 0");
        }
        this.qty = qty;
    }

    @Override
    public double getPay() {
        return getPricePerItem() * getQty();
    }

    @Override
    public String toString() {
        return String.format(" Description : %s%n Number : %s%n PricePerItem :  %s%n Qty : %s%n Sum to pay : %s%n ", getPartDescription(), getPartNumber(), getPricePerItem(), getQty(), getPay());
    }
}
