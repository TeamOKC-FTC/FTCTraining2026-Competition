package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name="Teleop")
public class TeleopOpMode extends LinearOpMode {
    private DcMotor leftMotor;
    private DcMotor rightMotor;

    /* Declare OpMode members such as motor variables */

    @Override
    public void runOpMode() {


        leftMotor = hardwareMap.get(DcMotor.class, "leftBack");
        rightMotor = hardwareMap.get(DcMotor.class, "rightBack");
        //sets motors to their name
        rightMotor.setDirection(DcMotor.Direction.REVERSE);
        leftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        //sets motor direction and brake behavior


        // Initialize Motors
double fowardSpeed =0;
double turnSpeed =0;
double leftPower=0;
double rightPower=0;
double drivemultiplier = 1;


        // Wait for the game to start (driver presses START)
        waitForStart();

        // run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {

            fowardSpeed = -gamepad1.left_stick_y;
            turnSpeed = -gamepad1.right_stick_x;
            if(gamepad1.left_bumper){
                drivemultiplier = 0.32;
            }
            else{
                drivemultiplier = 1;
            }

            //sets varible to amount gamepad moved

            rightPower = (fowardSpeed + turnSpeed) * drivemultiplier;
            leftPower=(fowardSpeed - turnSpeed)*drivemultiplier;
            //sets power of motor power varible

            leftMotor.setPower(leftPower);
            rightMotor.setPower(rightPower);
            //sets power of motor to power varible

        }
    }
}
