import com.cj.Graphics;
import com.cj.People;
import com.cj.Point;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Point point = new Point((int)(Math.random()*9),(int)(Math.random()*9));
        Point snake = new Point((int)(Math.random()*9),(int)(Math.random()*9));
        Graphics g = new Graphics();

        System.out.println("X坐标是："+point.getX()+" Y坐标是："+point.getY());
        System.out.println("X坐标是："+snake.getX()+" Y坐标是："+snake.getY());
        Scanner scanner = new Scanner(System.in);
        g.draw(point,snake);
        while (scanner.hasNext()){
            String s = scanner.next();

            snake.move(s);
            g.draw(point,snake);
            if(snake.getX()<0 || snake.getX()>10){
                System.out.println("You dead!X");
                break;
            }else if(snake.getY()<0 || snake.getY()>10){
                System.out.println("You dead!Y");
                break;
            }else if (snake.getX()==point.getX()&&snake.getY()==point.getY()){
                System.out.println("You win!");
                point = new Point((int)(Math.random()*9),(int)(Math.random()*9));
                g.draw(point,snake);
            }else {
                System.out.println("X坐标是：" + snake.getX() + "Y坐标是：" + snake.getY());
            }
        }



    }
}

