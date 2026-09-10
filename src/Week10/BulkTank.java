package Week10;

public class BulkTank {
    private double capacity;
    private double volume;
    public BulkTank() {
        this.capacity = 2000.0;
        this.volume = 0.0;
    }
    public BulkTank(double capacity) {
        this.capacity = capacity;
        this.volume = 0.0;
    }
    public double getCapacity() {
        return capacity;
    }
    public double getVolume() {
        return volume;
    }
    public double howMuchFreeSpace() {
        return capacity - volume;
    }
    public void addToTank(double amount) {
        if (volume + amount > capacity) {
            volume = capacity;
        } else {
            volume += amount;
        }
    }

    public double getFromTank(double amount) {
        if (amount > volume) {
            double available = volume;
            volume = 0;
            return available;
        }
        volume -= amount;
        return amount;
    }

    @Override
    public String toString() {
        return this.volume + "/" + this.capacity;
    }
}