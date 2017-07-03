package com.cj;

public class Point {
    private int x;
    private int y;
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }

    public void move(String direction){
        if (direction.equals("w")){
            y--;
        }else if(direction.equals("a")){
            x--;
        }else if(direction.equals("s")){
            y++;
        }else if(direction.equals("d")){
            x++;
        }else {
            System.out.println("非法操作");
        }
    }
}
