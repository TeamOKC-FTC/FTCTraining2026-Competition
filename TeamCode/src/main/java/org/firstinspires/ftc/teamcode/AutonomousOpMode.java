package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous(name="Autonomous")
public class AutonomousOpMode extends LinearOpMode {
    private DcMotor leftMotor;
    private DcMotor rightMotor;




    private ElapsedTime mytime = new ElapsedTime();


    /* Declare OpMode members such as motor variables */

    @Override
    public void runOpMode() {
        // Initialize Motors
        leftMotor = hardwareMap.get(DcMotor.class, "leftBack");
        rightMotor = hardwareMap.get(DcMotor.class, "rightBack");
// sets motors to their name in control hub
        rightMotor.setDirection(DcMotor.Direction.REVERSE);
        leftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//sets direction and zero power behavior

        // Wait for the game to start (driver presses START)
        waitForStart();
        drive(1,0,.5);
        drive(0,1,5);



    }
    private void drive(double fowardSpeed, double turnSpeed ,double timer) {
       mytime.reset();
        leftMotor.setPower(fowardSpeed - turnSpeed);
        rightMotor.setPower(fowardSpeed + turnSpeed);

      while(opModeIsActive()&& mytime.seconds()<timer){
          telemetry.addLine("1 1");
          telemetry.addLine(" - ");
          telemetry.update();
      }


            leftMotor.setPower(0);
            rightMotor.setPower(0);


    }
}
