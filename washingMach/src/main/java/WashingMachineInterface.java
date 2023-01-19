public interface WashingMachineInterface {
    void load();
    void start();
    void empty();
    void setLaundryType(LaundryType laundryType);
    int getMinutesTillEnd();

}
enum LaundryType{

    WOOL, POLYESTER, MIXED

}


