package com.company;

public class CustomerManager {
    private BaseLogger Logger;

    public CustomerManager(BaseLogger logger){
        this.Logger=logger;
    }
    public void add(){
        System.out.println("Müşteri Eklendi");
        this.Logger.log("Log Mesajı");
    }
}
