import java.util.Scanner;

public class WashingMachine implements WashingMachineInterface {

    private LaundryType laundryType = LaundryType.MIXED;
    private Program program = Program.STANDARD;
    int washingWeight = 0;
    int maxLoad = 9;
    Scanner scanner = new Scanner(System.in);


    @Override
    public int load() {

        System.out.println("Load clothes into the washing machine max 9 kg");
        if (washingWeight > maxLoad){
            System.out.println("It is to heavy");
        }else {}


        return 0;
    }

    @Override
    public void start() {
        System.out.println("Washing machine turn on, please set a program");
        // zrób jakiś dźwięk
        // wypierz
        // zrób jakiś dźwięk

    }

    @Override
    public void empty() {
        System.out.println("Take clothes out of the washing machine ");

    }

    @Override
    public void setLaundryType(LaundryType laundryType) {
        this.laundryType = laundryType;

    }

    @Override
    public int setTemperature(){
        System.out.println("fff");
        return 0;
    }

    @Override
    public int getMinutesTillEnd() {
        switch (program) {
            case FAST:
                return 30;
            case STANDARD:
                return 120;
            case ECO:
                return 180;

        }


        return 0;
    }
    public void clearPanel(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public void setWashingWeight(int washingWeight) {
        this.washingWeight = washingWeight;
    }

//    public int Program Program (){
//        System.out.println("1. FAST");
//        System.out.println("2. STANDARD");
//        System.out.println("3. ECO");
//        scanner.nextInt();
//        switch (program){
//            case
//
//        }
//        return null;
    }

