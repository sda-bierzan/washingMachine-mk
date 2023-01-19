public class WashingMachine implements WashingMachineInterface{

    private LaundryType laundryType = LaundryType.MIXED;

    @Override
    public void load() {
        System.out.println("Load clothes into the washing machine");

    }

    @Override
    public void start() {
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
    public int getMinutesTillEnd() {
        int i = 10;

        return i;
    }
}
