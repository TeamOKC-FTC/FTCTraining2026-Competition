package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="Teleop")
public class TeleopOpMode extends LinearOpMode {

    /* Declare OpMode members such as motor variables */

    @Override
    public void runOpMode() {
        // Initialize Motors

        // Wait for the game to start (driver presses START)
        waitForStart();

        // run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {

        }
    }
}
