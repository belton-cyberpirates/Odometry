package org.firstinspires.ftc.teamcode;


public class Odometry {
    double xPos = 0;
    double yPos = 0;
    double heading = 0;

    final double trackWidth = 1;
    final double forwardOffset = 1;

    void updatePosition(double deltaLeft, double deltaRight, double deltaBack) {
        deltaHeading = (deltaLeft - deltaRight) / trackWidth;

        double centerDisplacement = (deltaLeft + deltaRight) / 2
        double horizontalDisplacement = deltaBack - (forwardOffset * deltaHeading)

        
    }
}