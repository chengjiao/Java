package com.cj;

public class Graphics {
    public Graphics(){

    }
    public void draw(Point point,Point snake){

        System.out.println(" -- -- ---- ---- ---- ---- ---- ---- ---- ---- ----");
        for(int i=0;i<10;i++){
            for(int j=0;j<11;j++){
                if(point.getX()==j && snake.getX()==j && point.getY()==i && snake.getY()==i){
                    System.out.print("| Y  ");

                }else if(point.getX()==j && point.getY()==i){
                    System.out.print("| x  ");
                }else if(snake.getX()==j && snake.getY()==i){
                    System.out.print("| Y  ");
                }
                else if(j==10){
                    System.out.print("|");

                }else{
                    System.out.print("|    ");
                }
            }
            System.out.println();
            System.out.println(" ---- ---- ---- ---- ---- ---- ---- ---- ---- ----");
        }

    }
}
