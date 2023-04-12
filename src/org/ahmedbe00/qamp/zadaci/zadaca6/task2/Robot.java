package org.ahmedbe00.qamp.zadaci.zadaca6.task2;

import java.util.ArrayList;
import java.util.List;

public class Robot {
    private int x;
    private int y;
    private int numberOfMoves;
    private List<int[]> movePosition;

    public Robot() {
        this(0, 0);
        this.numberOfMoves = 0;
        this.movePosition = new ArrayList<int[]>();
        this.movePosition.add(new int[]{x, y});

    }

    public Robot(int x, int y) {
        this.x = x;
        this.y = y;
        this.numberOfMoves = 0;
        this.movePosition = new ArrayList<int[]>();
        this.movePosition.add(new int[]{x, y});
    }

    public void moveNorth() {
        this.y++;
        this.numberOfMoves++;
        this.movePosition.add(getPosition());
    }

    public void moveWest() {
        this.x--;
        this.numberOfMoves++;
        this.movePosition.add(getPosition());

    }

    public void moveSouth() {
        this.y--;
        this.numberOfMoves++;
        this.movePosition.add(getPosition());
    }

    public void moveEast() {
        this.x++;
        this.numberOfMoves++;
        this.movePosition.add(getPosition());


    }

    public int[] getPosition() {
        return new int[]{this.x, this.y};
    }

    public double getDistance() {
        int[] currentPositionOfRobot = getPosition();
        int[] initalPositionOfRobot = this.movePosition.get(0);
        return (Math.sqrt(Math.pow((initalPositionOfRobot[0] - currentPositionOfRobot[0]), 2) + Math.pow((initalPositionOfRobot[1] - currentPositionOfRobot[1]), 2)));
    }

    public void printLastPosition(int n) {
        if (n > this.numberOfMoves) {
            n = this.numberOfMoves;
            for (int i = numberOfMoves; i >= 0; i--) {
                int[] position = this.movePosition.get(i);
                System.out.println("(" + position[0] + ", " + position[1] + ")");
            }
        } else {
            for (int i = numberOfMoves; i > numberOfMoves - n; i--) {
                int[] position = this.movePosition.get(i);
                System.out.println("(" + position[0] + ", " + position[1] + ")");
            }
        }
    }
}