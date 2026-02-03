public class main {
    public static void main(String[] args) {
        System.out.println("Система расчета стоимости топлива");

        int fuelType = 95;
        int amount = 50;
        boolean hasDiscount = amount > 10;

        double fuel92Price = 60.2;
        double fuel95Price = 67.33;

        double discount = 0.1;

        String wrongFuelTypeMessage = "Указан неверный тип топлива";

        double fuelPrice = 0;

        if (fuelType == 92) {
            fuelPrice = fuel92Price;
        }
        else if (fuelType == 95) {
            fuelPrice = fuel95Price;
        } else {
            System.out.println(wrongFuelTypeMessage);
        }

        if (hasDiscount) {
            fuelPrice = fuelPrice - discount * fuelPrice;
        }

        if (amount < 1) {
            System.out.println("Указано слишком малое количество топлива");
            amount = 0;
        }

        String fuelPriceMessage = "Цена выбранного топлива: " + fuelPrice + " руб.";

        System.out.println(fuelPriceMessage);

        double totalPrice = fuelPrice * amount;

        System.out.println("Общая стоимость заправки: " + totalPrice + " руб.");

    }
}
