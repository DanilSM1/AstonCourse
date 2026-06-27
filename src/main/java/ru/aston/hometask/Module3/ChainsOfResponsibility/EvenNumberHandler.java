package ru.aston.hometask.Module3.ChainsOfResponsibility;

public class EvenNumberHandler extends Handler{

    @Override
    public void handleRequest(int request) {
        if(request % 2 == 0){
            System.out.println("EvenNumberHandler is active. Number is even: " + request);
        } else if (next != null){
            next.handleRequest(request);
        }
    }
}
