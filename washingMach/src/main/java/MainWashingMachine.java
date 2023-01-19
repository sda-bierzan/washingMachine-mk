public class MainWashingMachine {
    public static void main(String[] args) {


        WashingMachine washingMachine = new WashingMachine();
        washingMachine.start();
//        washingMachine.setProgram(Program.STANDARD);
        washingMachine.load();
        washingMachine.setWashingWeight(5);
        washingMachine.clearPanel();
    }
}
