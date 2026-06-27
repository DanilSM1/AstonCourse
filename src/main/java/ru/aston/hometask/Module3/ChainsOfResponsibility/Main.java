package ru.aston.hometask.Module3.ChainsOfResponsibility;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Handler evenNumber = new EvenNumberHandler();
        Handler oddNumber = new OddNumberHandler();

        evenNumber.setNext(oddNumber);

        int[] request = {1, 5, 2, 3, 4};

        Arrays.stream(request).forEach(evenNumber::handleRequest);
    }
}
