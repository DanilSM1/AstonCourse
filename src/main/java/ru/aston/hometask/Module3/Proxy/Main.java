package ru.aston.hometask.Module3.Proxy;

public class Main {
    public static void main(String[] args) {
        DataLoaderProxy dataLoaderProxy = new DataLoaderProxy();

        long start = System.currentTimeMillis();
        String dataResult = dataLoaderProxy.getData();
        System.out.println(dataResult);
        long end = System.currentTimeMillis();
        long resultTime = end - start;
        System.out.println("Время выполнения: " + resultTime);
        System.out.println(dataLoaderProxy.isDataCached());

        start = System.currentTimeMillis();
        String dataResult2 = dataLoaderProxy.getData();
        System.out.println(dataResult2);
        end = System.currentTimeMillis();
        resultTime = end - start;
        System.out.println("Время выполнения: " + resultTime);
        System.out.println(dataLoaderProxy.isDataCached());
    }
}
