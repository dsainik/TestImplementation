package com.java.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

    public static void main(String[] args) {

        Ball b1 = new Ball("red", "round");
        Ball b2 = new Ball("green", "round");
        Ball b3 = new Ball("green", "round");
        Ball b4 = new Ball("red", "round");
        Ball b5 = new Ball("yellow", "round");
        Ball b6 = new Ball("orange", "round");

        List<Ball> allballs = new ArrayList<Ball>();
        allballs.add(b1);
        allballs.add(b2);
        allballs.add(b3);
        allballs.add(b4);
        allballs.add(b5);
        allballs.add(b6);
        BallComparator ballComparator = new BallComparator();
        Collections.sort(allballs, ballComparator);

        for (Ball ball : allballs) {
            System.out.println(ball.color + ":" + ball.shape);
        }


    }


}


class Ball {

    String color;
    String shape;

    public Ball(String color, String shape) {

        this.color = color;
        this.shape = shape;
    }

}


class BallComparator implements Comparator<Ball> {

    public int compare(Ball ori, Ball other) {

        return ori.color.compareTo(other.color);
    }

}


