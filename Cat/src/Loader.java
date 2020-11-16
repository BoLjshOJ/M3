import com.skillbox.airport.Airport;

import java.util.List;

public class Loader
{
    public static void main(String[] args)
    {
        /**
         * Создать 5-7 кошек
         */
        List<Cat> catList = List.of(new Cat(), new Cat(), new Cat(), new Cat(), new Cat(), new Cat());

        /**
         * напечатайте в консоль вес созданных кошек
         */
        catList.forEach(cat -> System.out.println(cat.getWeight()));

        /**
         * покормите 2 кошки и после этого распечатать их вес (убедитесь что вес изменился)
         */
        double firstWeight = catList.get(0).getWeight();
        double secondWeight = catList.get(1).getWeight();

        catList.get(0).feed(Math.random());
        catList.get(0).drink(Math.random());

        catList.get(1).feed(Math.random());
        catList.get(0).drink(Math.random());

        System.out.printf("Вес первой кошки до кормежки %f и после %f\n", firstWeight, catList.get(0).getWeight());
        System.out.printf("Вес второй кошки до кормежки %f и после %f\n", secondWeight, catList.get(1).getWeight());

        /**
         * перекормите кошку
         */
        while (!catList.get(0).getStatus().equals("Exploded")) {
            catList.get(0).feed(Math.random());
        }

        /**
         * "замяукайте" кошку до смерти
         */

        while (!catList.get(1).getStatus().equals("Dead")) {
            catList.get(1).meow();
        }

        /**
         * Урок 2. Метод, параметры, return
         */
        Cat kitty = new Cat();
        System.out.println(kitty.getWeight());
        kitty.feed(150.00);
        System.out.println(kitty.getWeight());
        kitty.pee();
        kitty.pee();
        kitty.pee();
        System.out.println(kitty.getWeight());
        System.out.println(kitty.getSumOfFeed());

        System.out.println(Airport.getInstance().getAllAircrafts().size());
    }

    private static Cat getKitten() {
        return new Cat(1100.00);
    }
}