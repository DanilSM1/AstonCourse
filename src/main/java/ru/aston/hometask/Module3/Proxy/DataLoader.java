package ru.aston.hometask.Module3.Proxy;

public class DataLoader implements DataLoad{

    @Override
    public String getData() {
        System.out.println("Получение данных");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "Данные получены";
    }
}
