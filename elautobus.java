package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.CRServo;
import java.util.concurrent.TimeUnit;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name = "elautobus", group = "")
public class elautobus extends LinearOpMode {

  private DcMotor motorleft;
  private DcMotor motorright;
  private DcMotor carousel;
  private CRServo arm;
  private Servo cup;
  /**
   * This function is executed when this Op Mode is selected from the Driver Station.
   */
  @Override
  public void runOpMode() {
    motorleft = hardwareMap.dcMotor.get("motorleft");
    motorright = hardwareMap.dcMotor.get("motorright");
    carousel = hardwareMap.dcMotor.get("carousel");
    arm = hardwareMap.crservo.get("arm");
    cup = hardwareMap.servo.get("cup");
    // Put initialization blocks here.
    waitForStart();
    if (opModeIsActive()) {
      // Put run blocks here.
      while (opModeIsActive()) {
        motorleft.setPower(-0.5);
        motorright.setPower(0.5);
        this.sleep(1500);
        motorleft.setPower(0);
        motorright.setPower(0);
        telemetry.update();
        motorleft.setPower(-0.5);
        motorright.setPower(-0.5);
        this.sleep(1550);
        motorleft.setPower(0);
        motorright.setPower(0);
        this.sleep(500);
        motorleft.setPower(0.5);
        motorright.setPower(-0.5);
        this.sleep(350);
        motorleft.setPower(0);
        motorright.setPower(0);
        arm.setPower(-1);
        this.sleep(7000);
        arm.setPower(0);
        cup.setPosition(0.2);
        this.sleep(1000);
        arm.setPower(1);
        cup.setPosition(1);
        this.sleep(5500);
        arm.setPower(0);
        motorleft.setPower(-0.5);
        motorright.setPower(0.5);
        this.sleep(1325);
        motorleft.setPower(0);
        motorright.setPower(0);
        motorleft.setPower(0.5);
        motorright.setPower(0.5);
        this.sleep(1650);
        motorleft.setPower(0);
        motorright.setPower(0);
        this.sleep(100);
        motorleft.setPower(0.5);
        motorright.setPower(-0.5);
        this.sleep(1600);
        motorleft.setPower(0);
        motorright.setPower(0);
        carousel.setPower(0.7);
        this.sleep(5000);
        carousel.setPower(0);
        break;
      }
    }
  }
}
