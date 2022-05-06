package net.java;

public class ClientA implements Client{
    Service service;

    //xml based DI requires no-argument constructor
    public ClientA() {

    }

    @Override
    public void doSomething() {
        String info = service.getInfo();
        System.out.println(info);
    }

    public void setService(Service service) {
        this.service = service;
    }
}
