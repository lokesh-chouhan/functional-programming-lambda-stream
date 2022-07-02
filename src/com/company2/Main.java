package com.company2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello world !!!");
        List<Integer> list = List.of(12,9,13,4,6,2,4,12,15);
        List<String> courses = List.of("Spring", "Spring boot","API",
                "Spring cloud", "AWS", "Docker and Kubernetes", "Microservices");
        //printNumberInListStructured(list);

        //Functional
        //printNumberInListFunctional(list);
        //printAllCoursesFunctional(courses);

        //Filter
        //printEvenNumberInListFunctional(list);
        //printOddNumberInListFunctional(list);
        //printSpringCoursesFunctional(courses);
        //printBiggerCoursesFunctional(courses);

        //Filter and Map
        //printSquareNumberInListFunctional(list);
        //printSquareEvenNumberInListFunctional(list);
        //printCubeOddNumberInListFunctional(list);
        //printLengthCoursesFunctional(courses);

        //Filter, Map and Reduce
        //System.out.println(addAllNumberListFunctional(list));
        //System.out.println(addSquareNumberListFunctional(list));
        //System.out.println(addCubeNumberListFunctional(list));
        //System.out.println(addOddNumberListFunctional(list));

        //Distinct and Sorted
        //printDistinctNumberInListFunctional(list);
        //printDistinctSortedNumberInListFunctional(list);
        //printAllSortedCoursesFunctional(courses);

        //Comparator sort
        //printDistinctComparatorSortedNumberInListFunctional(list);
        //printAllComparatorSortedCoursesFunctional(courses);

        //Collector
        //System.out.println(collectAllSquareNumberListFunctional(list));
        tyyfhghggmc,nb,cnc,iheakhgaslkdgejaesldzeaapploiuytrewqas
    }

    private static void printAllCoursesFunctional(List<String> courses) {
        courses.stream()
                .forEach(System.out::println);
    }

    private static void printOddNumberInListFunctional(List<Integer> list) {
        list.stream()
                .filter(x -> x%2!=0)
                .forEach(System.out::println);
    }

    private static void printEvenNumberInListFunctional(List<Integer> list) {
        list.stream()
                .filter(x -> x%2 == 0)
                .forEach(System.out::println);
    }

    private static void printNumberInListFunctional(List<Integer> list) {
        System.out.println("Functional approach .........");
        list.stream()
                .forEach(System.out::println);

    }

    private static void printNumberInListStructured(List<Integer> integers) {

        System.out.println("Structured approach .........");
        for(int integer : integers){
            System.out.println(integer);
        }

    }
}
