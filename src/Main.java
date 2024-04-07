public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = (friend + 2);
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общая масса двух бойцов " + totalWeight + " кг");
        var weightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница между массами бойцов " + weightDifference + " кг");

        var weightDivision1 = firstBoxerWeight % secondBoxerWeight;
        System.out.println(weightDivision1);
        var weightDivision2 = secondBoxerWeight % firstBoxerWeight;
        System.out.println(weightDivision2);

        var manHours = 640;
        var hoursPerWorker = 8;
        var worker = manHours / hoursPerWorker;
        System.out.println("Всего работников в компании - " + worker + " человек");
        worker = worker + 94;
        manHours = worker * hoursPerWorker;
        System.out.println("Если в компании работает " + worker + " человек, то всего " + manHours + " часов работы может быть поделено между сотрудниками");


    }
}