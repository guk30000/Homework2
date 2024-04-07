public class Main {
    public static void main(String[] args) {
        var liftingCapacity = 50;
        var stuffWeight = 20;
        var capacityLeft = liftingCapacity - stuffWeight;
        System.out.println("Еще можно положить " + capacityLeft + " кг вещей");

        var applesWeight = 2;
        var orangesWeight = 3;
        var fruitsWeight = applesWeight + orangesWeight;
        System.out.println("Общий вес фруктов " + fruitsWeight);

        var meatWeight = 4;
        var waterWeight = 5;
        var tomatoesWeight = 2;
        var cucumberWeight = 2;
        var peppersWeight = 2;
        var zucchiniWeight = 2;
        var vegetablesWeight = tomatoesWeight + cucumberWeight + peppersWeight + zucchiniWeight;
        var productsWeight = vegetablesWeight + meatWeight + waterWeight +fruitsWeight;
        System.out.println("Общий вес продуктов " + productsWeight + " кг");

        var leftWeight = liftingCapacity - productsWeight - stuffWeight;
        System.out.println("Места осталось " + leftWeight + " кг!");

        productsWeight = productsWeight * 2;
        System.out.println("Теперь вес продуктов " + productsWeight);

        leftWeight = liftingCapacity - productsWeight - stuffWeight;
        System.out.println("Теперь места осталось " + leftWeight + " кг");

        var overLoad = (stuffWeight + productsWeight) % liftingCapacity;
        System.out.println("Перегруз на " + overLoad + " кг!");

        var productsInOneCar = productsWeight / 2;
        System.out.println("Продуктов в одной машине теперь " + productsInOneCar);


    }
}