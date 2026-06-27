package ru.aston.hometask.Module3.ChainsOfResponsibility;

public class OddNumberHandler extends Handler{

    @Override
    public void handleRequest(int request) {
        if(request % 2 != 0){
            System.out.println("OddNumberHandler is active. Number is odd: " + request);
        } else if (next != null){
            next.handleRequest(request);
        }
    }
}
