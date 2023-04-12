package org.ahmedbe00.qamp.zadaci.zadaca6.task2;

public class MainRobot {
    public static void main(String[] args) {
        final Robot robot = new Robot();
        
        robot.moveEast();
        robot.moveSouth();
        robot.moveNorth();
        robot.moveWest();
        robot.moveEast();
        robot.moveNorth();
        System.out.println(robot.getPosition()[0]);
        System.out.println(robot.getDistance());
        robot.printLastPosition(8);
        System.out.println("\n");

        final Robot robot1 = new Robot(2, 3);

        robot1.moveEast();
        robot1.moveSouth();
        robot1.moveNorth();
        robot1.moveWest();
        robot1.moveEast();
        robot1.moveNorth();
        System.out.println(robot1.getPosition()[0]);
        System.out.println(robot1.getDistance());
        robot1.printLastPosition(4);

    }
}
