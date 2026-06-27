package ru.aston.hometask.Module3.ChainsOfResponsibility;

public abstract class Handler {

    protected Handler next;

    public void setNext(Handler next){
        this.next = next;
    }

    public abstract void handleRequest(int request);
}
