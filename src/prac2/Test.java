package prac2;

import java.util.List;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        App humanApp = new App();
        Stream<Human> listHuman =  humanApp.getHumans();
        System.out.println("---------------------------------------\nInitial data:");
        humanApp.printHuman(listHuman);

        App humanApp1 = new App();
        Stream<Human> listHuman1 =  humanApp1.getHumans();
        System.out.println("---------------------------------------\nProduct of ages:");
        System.out.println(humanApp1.getProizAge(listHuman1));

        App humanApp2 = new App();
        Stream<Human> listHuman2 =  humanApp2.getHumans();
        System.out.println("---------------------------------------\nSort by weight:");
        humanApp2.sortByWeight(listHuman2);

        App humanApp3 = new App();
        Stream<Human> listHuman3 = humanApp3.getHumans();
        System.out.println("---------------------------------------\nSort by age:");
        humanApp3.sortByAge(listHuman3);

        App humanApp4 = new App();
        Stream<Human> listHuman4 = humanApp4.getHumans();
        System.out.println("---------------------------------------\nFilter by lastname:");
        humanApp4.filterByLastname(listHuman4);

    }
}
