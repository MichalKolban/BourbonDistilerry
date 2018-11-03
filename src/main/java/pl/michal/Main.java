package pl.michal;

public class Main{

    public static void main(String[] args) {


        Bourbon[] burbons = new Bourbon[4];

        burbons[0] = new Bourbon(12);
        burbons[1] = new Bourbon(3);
        burbons[2] = new Bourbon(4);
        burbons[3] = new Bourbon(10);

        System.out.println("=========");
        System.out.println("Initial amount of burbon in each bottle");
        System.out.println("=========");
        for(int i = 0 ; i< burbons.length ; i++){

            System.out.println(burbons[i].getBottleValue());
        }


        System.out.println("=========");
        System.out.println("Amount of burbon after");
        System.out.println("=========");

        burbons[0].fillTheBottle(8);

        System.out.println(burbons[0].getBottleValue());

        burbons[1].pourBottle(1);

        System.out.println(burbons[1].getBottleValue());

        burbons[3].transferBurbon(3.5,burbons[2]);

        System.out.println(burbons[3].getBottleValue());

        System.out.println(burbons[2].getBottleValue());



    }
}