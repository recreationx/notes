package Y1S2.SC2002.tut.tut3;

public class VendingMachineApp {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        double drinkPrice = vm.selectDrink();
        double totalAmount = vm.insertCoins(drinkPrice);
        vm.checkChange(totalAmount, drinkPrice);
    }
}
