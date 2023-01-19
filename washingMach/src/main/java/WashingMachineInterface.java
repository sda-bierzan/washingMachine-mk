public interface WashingMachineInterface {
    int load();
    void start();
    void empty();
    void setLaundryType(LaundryType laundryType);
    int getMinutesTillEnd();
    int setTemperature();
    default void makeSound(){
        System.out.println("Beeep");
    }

}
enum LaundryType{

    WOOL, POLYESTER, MIXED


}
enum Program{
    FAST, STANDARD, ECO;
}


