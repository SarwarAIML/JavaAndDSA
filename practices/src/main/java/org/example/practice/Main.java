package org.example.practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");


        //Map map = new TreeMap(employee);
        System.out.println();

        printDifTimeFormate();

        //        reverArray(arr,0,d-1);
        //id name salary
        int arr[]  =  {1,2,3,4,5};
        int arr1[]  =  {1,2,3,4,5};
       for (int i = 0; i < 2; i++) {
            leftRoteteBy2(arr);
        }
      //  rotateByd(arr,2);
        System.out.println(Arrays.toString(arr));
          rotateByd(arr1,2);
        System.out.println(Arrays.toString(arr));

        int arr2[] = {1,1} ;
        findSecondHighest( arr2);

        // Java Stream: From array of integers (i.e., arr[] = {7, 10, 4, 3, 20, 15})
        //- Remove even numbers
        //- Add 5 to remaining elements
        //- Find multiplication of all the numbers.
        //Expected Output: 1920
        int arr3[] = {7, 10, 4, 3, 20, 15};

        int reduce = Arrays.stream(arr3).filter(num -> num % 2 != 0).map(num -> num + 5).reduce(1, (a, b) -> a * b);
        System.out.println(reduce);

        printName();

    }

    public static void printDifTimeFormate() throws ParseException {
        System.out.println();
        String inputDate = "2023-10-31";
        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat outputFormat = new SimpleDateFormat("dd/MM/yyyy");

        Date date = inputFormat.parse(inputDate);
        String outputDate = outputFormat.format(date);
        System.out.println("Converted Date: " + outputDate);
    }

    public static void printName () {
        Employee employee1 = new Employee(1,"sarwra1");
        Employee employee2 = new Employee(2,"sarwra2");
        Employee employee3 = new Employee(3,"sarwra3");
        Employee employee4 = new Employee(4,"sarwra4");

        List<Employee> list = new ArrayList<Employee>();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);
        List<String> nemlist = list.stream().filter(o -> o.getEmpId() > 2).map(employee -> employee.Name).collect(Collectors.toList());
        nemlist.forEach(System.out::println);

    }

    private static void findSecondHighest (int[] arr2) throws Exception{
        if (arr2.length == 0)
            throw new RuntimeException("there should be more than 1 element in array");
        if (arr2.length == 1)
            System.out.println(arr2[0]);

        int largest = 0;
        int secondHigest= -1;
        for (int i = 1; i < arr2.length ; i++) {
            if (arr2[i] > arr2[largest]){
                secondHigest = largest;
                largest = i;
            } else if (arr2[i] != arr2[largest]) {
                if (secondHigest == -1 || arr2[i] > arr2[secondHigest])
                    secondHigest = i;
            }
        }
        if (secondHigest == -1)
            System.out.println(arr2[largest]);
        else
        System.out.println(arr2[secondHigest]);
    }

    private static void leftRoteteBy2(int[] arr) {

        int tem = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = tem;
    }

    public static void rotateByd(int[] arr,int d){

        int n = arr.length-1;

        reverArray(arr,0,d-1);

        reverArray(arr,d,n);
        reverArray(arr,0,n);
    }

    private static void reverArray(int[] arr, int low, int high) {
        while (low < high){
            swap(arr,low,high);
            low++;
            high--;
        }

    }

    private static void swap(int[] arr, int i, int j) {
        int tem = arr[i];
        arr[i] = arr[j];
        arr[j] = tem;
    }







}