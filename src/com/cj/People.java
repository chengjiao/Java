package com.cj;

public class People {
    private boolean hungry=true;
    public void toothbrath(){
        System.out.println("刷牙");
    }
    public void wash(){
        System.out.println("洗脸");
    }
    public void work(){
        System.out.println("上班");
    }
    public void eat(){
        hungry = false;
        System.out.println("吃饭"+hungry);
    }
}
