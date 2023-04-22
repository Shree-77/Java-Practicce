package OopsQuestions.question9;

public class Car {
    double fuel_efficiency;
    double amount_of_fuel =0;

    public Car(int fuel_efficiency) {
        this.amount_of_fuel=0;
        this.fuel_efficiency = fuel_efficiency;
    }

    public double getFuel_efficiency() {
        return fuel_efficiency;
    }

    @Override
    public String toString() {
        return "Car{" +
                "fuel_efficiency=" + fuel_efficiency +
                ", amount_of_fuel=" + amount_of_fuel +
                '}';
    }

    public void setFuel_efficiency(int fuel_efficiency) {
        this.fuel_efficiency = fuel_efficiency;
    }

    public double getAmount_of_fuel() {
        return amount_of_fuel;
    }

    public void setAmount_of_fuel(int amount_of_fuel) {
        this.amount_of_fuel = amount_of_fuel;
    }

    public double Drive(int distance){
        amount_of_fuel-=distance/fuel_efficiency;
        return amount_of_fuel;
    }
    public double getgasinTank(){
        return amount_of_fuel;
    }
    public double addgas(double volume){
        amount_of_fuel+=volume;
        return amount_of_fuel;
    }

}


