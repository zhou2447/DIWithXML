package net.java;

//ServiceB is not used based on applicationContext
public class ServiceB implements Service{
    @Override
    public String getInfo() {
        return "ServiceB's info";
    }
}
