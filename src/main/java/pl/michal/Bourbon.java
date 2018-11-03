package pl.michal;

public class Bourbon {


    Bourbon(){}

    private double bottleValue;
    private static double capacity = 21;

    public Bourbon(double bottleValue){
        this.bottleValue = bottleValue;
    }

    double getBottleValue(){
        return bottleValue;
    }

    double fillTheBottle(double liters){

        this.bottleValue += liters;

        double sumAll = bottleValue;

        if(sumAll < capacity){
            return  sumAll;
        } else {
            System.out.println("not enough space");
        }
        return sumAll;
    }

    boolean pourBottle(double liters){

        if(liters < bottleValue){
            this.bottleValue -= liters;
        }else
            System.out.println("Not enough whiskey in the bootle");

        return true;
    }

    void transferBurbon(double liters, Bourbon whenFilledUp){

        if(this.pourBottle(liters)){
            whenFilledUp.fillTheBottle(liters);
        }else
            System.out.println("not enough watger");
    }


}

