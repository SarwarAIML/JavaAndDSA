package exercises;

import beans.Car;
import lectures.Student;
import org.junit.Test;
import beans.Person;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import mockdata.MockData;
import org.assertj.core.util.Lists;
import org.junit.Test;
public class MoreExercises {
  // TODO: Coming soon

    //
    // filter and limit example
    @org.junit.jupiter.api.Test
    public void lintExample() throws Exception {
        ImmutableList<Person> people = MockData.getPeople();
        people.stream().filter(person -> person.getAge() <=18)
                .limit(10)
                .collect(Collectors.toList()).forEach(System.out::println);

    }

    //range example
    @Test
    public void range() throws Exception
    {
        System.out.println("Exclusive");
        IntStream.range(0,10).forEach(System.out::println);
        System.out.println("Inclusive");
        IntStream.rangeClosed(0,10).forEach(System.out::println);

    }

    @Test
    public void rangeIteratingLIst() throws Exception{
        List<String> list = List.of("foo", "bar", "baz");

        IntStream.range(0, list.size())
                .forEach(index ->{
                    String str = list.get(index);
                    System.out.print(str+" ");
                });
    }

    @Test
    public void min() throws Exception{
        List<Integer> numbers = ImmutableList.of(1, 2, 3, 100, 23, 93, 99);
        Integer integer = numbers.stream()
                .min(Comparator.naturalOrder())
                .get();
        System.out.println(integer);

    }

    @Test
    public void max() throws Exception{
        List<Integer> numbers = ImmutableList.of(1, 2, 3, 100, 23, 93, 99);

        Integer integer = numbers.stream().max(Comparator.naturalOrder()).get();
        System.out.println(integer);

    }
    @Test
    public void distinct() throws Exception{
        final List<Integer> numbers = ImmutableList.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 9, 9, 9);
        numbers.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
    }

    @Test
    public void distinctWithSet() throws Exception{
        final List<Integer> numbers = ImmutableList.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 9, 9, 9);
        numbers.stream().collect(Collectors.toSet()).forEach(System.out::println);
    }

    @Test
    public void average() throws Exception{
        final List<Integer> numbers = ImmutableList.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 9, 9, 9);
        IntStream numbers1 = IntStream.of(2, 3, 4, 5, 6, 7, 8);
        double average1 = numbers1.asDoubleStream().average().orElse(0);
        System.out.println(average1);
        double avg2 = numbers.stream().mapToDouble(Integer::doubleValue).average().orElse(0);
        System.out.println(avg2);
    }

    @Test
    public void filterTest() throws Exception {

        final List<Integer> numbers = ImmutableList.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 9, 9, 9);
        Predicate<Integer> integerPredicate = number -> number < 6;
        numbers.stream().filter(integerPredicate).distinct().collect(Collectors.toList()).forEach(System.out::println);
    }

    @Test
    public void firstMapTest() throws Exception {

        final List<Integer> numbers = ImmutableList.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 9, 9, 9);
        Predicate<Integer> integerPredicate = number -> number < 6;
        numbers.stream().filter(integerPredicate).distinct().map(number -> number*2)
                .collect(Collectors.toList()).forEach(System.out::println);
    }

    @Test
    public void findAny() throws Exception {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Predicate<Integer> numberLessThan10 = number -> (number < 10 && number >5);
        Integer integer = Arrays.stream(numbers).filter(numberLessThan10).findAny().get();
        System.out.println(integer);
    }
    @Test
    public void findFirst() throws Exception {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Predicate<Integer> numberLessThan10 = number -> (number < 10 && number >5);
        Integer integer = Arrays.stream(numbers).filter(numberLessThan10).findFirst().get();
        System.out.println(integer);
    }

    @Test
    public void count() throws Exception{
        long femaleCont = MockData.getPeople()
                .stream().filter(person -> person.getGender().equalsIgnoreCase("female"))
                .count();
        System.out.println(femaleCont);
    }

    @Test
    public void sum() throws Exception{
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double sum = Arrays.stream(numbers).mapToDouble(Integer::doubleValue).sum();
        System.out.println(sum);

    }

    @Test
    public void statistics() throws Exception {
      List<Car> cars = MockData.getCars();
        DoubleSummaryStatistics doubleSummaryStatistics = cars.stream()
                .mapToDouble(Car::getPrice)
                .summaryStatistics();
        System.out.println(doubleSummaryStatistics);
        System.out.println(doubleSummaryStatistics.getMax());
        System.out.println(doubleSummaryStatistics.getMin());
        System.out.println(doubleSummaryStatistics.getAverage());
        System.out.println(doubleSummaryStatistics.getCount());
        System.out.println(doubleSummaryStatistics.getSum());
    }

    @Test
    public void simpleGrouping() throws Exception {
        Map<String,List<Car>> groupings = MockData.getCars()
                .stream()
                .collect(Collectors.groupingBy(Car::getMake));
        System.out.println(groupings);
        System.out.println("==================================");
        groupings.forEach((make,cars) ->
        {
            System.out.println(make);
            cars.forEach(System.out::println);
        });
    }

    @Test
    public void groupingAndCounting() throws Exception {
        ArrayList<String> names = Lists
                .newArrayList(
                        "John",
                        "John",
                        "Mariam",
                        "Alex",
                        "Mohammado",
                        "Mohammado",
                        "Vincent",
                        "Alex",
                        "Alex"
                );
        Map<String, Long> counting = names.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        counting.forEach((name,count) -> System.out.println(name +"--->" +count));

    }

    @Test
    public void groupingAndCount() throws Exception {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Ram1", "CSE"));
        studentList.add(new Student(2, "Ram2", "CSE"));
        studentList.add(new Student(3, "Raj1", "IT"));
        studentList.add(new Student(4, "Raj2", "IT"));
        studentList.add(new Student(5, "Sarwar1", "AIML"));
        studentList.add(new Student(6, "Sarwar2", "AIML"));

        Map<String, Long> stringLongMap = studentList.stream()
                .collect(Collectors.groupingBy(Student::getDept, Collectors.counting()));
        stringLongMap.forEach((dept,count) -> System.out.println(dept +"---->::"+count));
    }
    @Test
    public void reduce() throws Exception {
        Integer[] integers = {1, 2, 3, 4, 99, 100, 121, 1302, 199};
        int sum = Arrays.stream(integers).reduce(0,(a,b) ->a+b);
        System.out.println(sum);
        System.out.println("===========================================");

        Integer sumIngers = Arrays.stream(integers).reduce(0, Integer::sum);

        System.out.println("sumIngers:::"+sumIngers);


    }

    private static final List<ArrayList<String>> arrayListOfNames = com.google.common.collect.Lists.newArrayList(
            com.google.common.collect.Lists.newArrayList("Mariam", "Alex", "Ismail"),
            com.google.common.collect.Lists.newArrayList("John", "Alesha", "Andre"),
            com.google.common.collect.Lists.newArrayList("Susy", "Ali")
    );

    @Test

    public void flapMap() throws Exception{
        System.out.println(arrayListOfNames);
        System.out.println("=========================================");
        List<String> stringList = arrayListOfNames.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(stringList);
    }

    @Test
    public void joinStringWithStream() throws Exception {
        List<String> names = ImmutableList.of("anna", "john", "marcos", "helena", "yasmin");

        String joinString = names.stream().map(String::toUpperCase).collect(Collectors.joining("|"));
        System.out.println(joinString);
    }

    @Test
    public void understandingCollect() throws Exception {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Ram1", "CSE"));
        studentList.add(new Student(2, "Ram2", "CSE"));
        studentList.add(new Student(3, "Raj1", "IT"));
        studentList.add(new Student(4, "Raj2", "IT"));
        studentList.add(new Student(5, "Sarwar1", "AIML"));
        studentList.add(new Student(6, "Sarwar2", "AIML"));

        ArrayList<String> names = studentList.stream().map(Student::getDept).collect(
                ArrayList::new,
                ArrayList::add,
                (list1, list2) -> list1.addAll(list2)
        );

        System.out.println(names);


    }

    @Test
    public void printEvenNumbers() throws Exception{
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        myList.stream().sorted().filter(number -> number % 2 == 0 ).forEach(System.out::println);
    }

    @Test
    public void printNumbersStartsWithOne() throws Exception{
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        myList.stream().sorted()
                .map(s -> s +"").filter(number -> number.startsWith("1")).forEach(System.out::println);
    }

    @Test
    public void firstNonRepeatedCharacterInString() throws Exception{
        String input = "Java Hungry Blog Alive is Awesome";

        Character nonRepChar = input.chars()
                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        System.out.println(nonRepChar);
    }

    @Test
    public void firstRepeatedCharacterInString() throws Exception{
        String input = "Java Hungry Blog Alive is Awesome";

        Character nonRepChar = input.chars()
                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        System.out.println(nonRepChar);
    }

    @Test
    public void firstRepeatedCharacterInStringPra() throws Exception{
        String input = "Java Hungry Blog Alive is Awesome";

        Character character = input.chars().mapToObj(ch -> Character.toLowerCase(Character.valueOf((char) ch)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        System.out.println(character);
    }



    @Test
    public void checkAllcharsofAlphabets() throws Exception {

        String str = "abcdefghijklmnopqrtsuvwxyz";
        long count = str.chars().filter(i -> i >= 'a' && i <= 'z').distinct().count();
        if (count == 26)
            System.out.println("Conatins all latters of alphabets");
    }

    @Test
    public void charCount() throws Exception{
        String str = "Java";
      str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((key,value)-> System.out.println(key+" "+value));

    }


}
