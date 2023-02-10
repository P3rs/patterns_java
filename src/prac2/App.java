package prac2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    private Stream<Human> temp;

    //получить список людей
    public  Stream<Human> getHumans(){
        List<Human> input = new ArrayList<>();
        input.add(new Human(30,"Ryan","Gosling", LocalDate.of(1993,01,01),75));
        input.add(new Human(25,"Morgan","Freeman", LocalDate.of(1997,04,10),90));
        input.add(new Human(18,"Tom","Hardy", LocalDate.of(2004,11,06),80));
        input.add(new Human(28,"Christian","Bale", LocalDate.of(1994,05,03),70));
        input.add(new Human(31,"Matthew","McConaughey", LocalDate.of(1992,02,01),75));
        Stream<Human> stream = input.stream();
        return  stream;
    }

    //получить произведение возрастов
    public int getProizAge(Stream<Human> temp){
        int proiz = temp.mapToInt(Human::getAge).reduce(1, (d1, d2) -> d1 * d2);
        return proiz;
    }

    //сортировка по весу
    public void sortByWeight(Stream<Human> temp){
        temp.sorted((a, b) -> b.compareTo(a)).forEach(System.out::println);
    }

    //Сортировка по возрасту
    public void sortByAge(Stream<Human> temp){
        temp.sorted((a, b) -> b.getBirthDate().compareTo(a.getBirthDate())).forEach(System.out::println);
    }

    //Фильтрация по фамилии
    public void filterByLastname(Stream<Human> temp){
        temp.filter(human -> human.getLastName() != "Bale").forEach(System.out::println);
    }

    //вывод на экран
    public void printHuman(Stream<Human> temp) {
        temp.forEach(System.out::println);
    }
}
