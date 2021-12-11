package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.CRServo;
import java.lang.annotation.Target;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "Gamepad2 (Blocks to Java)", group = "")
public class Gamepad2 extends LinearOpMode {
  private DcMotor motorIntake;
  private DcMotor motorleft;
  private DcMotor motorright;
  private DcMotor carousel;
  private CRServo arm;
  private Servo cup;
  private CRServo arm2;
  double intakePower= 0;
  double lWheelPower= 0;
  double rWheelPower= 0;
  double carouselPower= 0;
  double servopower= 0;
  double seevopower2= 0;
  double cuppower=0;
  boolean isUp= false;
  


  @Override
  public void runOpMode() {
    motorIntake = hardwareMap.dcMotor.get("motorIntake");
    motorleft = hardwareMap.dcMotor.get("motorleft");
    motorright = hardwareMap.dcMotor.get("motorright");
    carousel = hardwareMap.dcMotor.get("carousel");
    arm = hardwareMap.crservo.get("arm");
    cup = hardwareMap.servo.get("cup");
    arm2 = hardwareMap.crservo.get("arm2");
    waitForStart();

    if (opModeIsActive()) {
      while (opModeIsActive()) {
        // Intake
        if(this.gamepad1.left_bumper == true){
          motorIntake.setPower(1);
        }
        if(this.gamepad1.left_bumper == false){
          motorIntake.setPower(0);
        }
        // Forward
        if(this.gamepad1.left_trigger != 0){
          motorleft.setPower(-this.gamepad1.left_trigger);
          motorright.setPower(this.gamepad1.left_trigger);
        }
        if(this.gamepad1.left_trigger == 0){
          motorleft.setPower(0);
          motorright.setPower(0);     
        }
        // Backward
        if(this.gamepad1.right_trigger != 0){
          motorleft.setPower(this.gamepad1.right_trigger);
          motorright.setPower(-this.gamepad1.right_trigger);
        }
        if(this.gamepad1.right_trigger == 0){
          motorleft.setPower(0);
          motorright.setPower(0);
        }
        lWheelPower = this.gamepad1.left_stick_y;
        rWheelPower = -this.gamepad1.right_stick_y;

        telemetry.addData("Target Power", intakePower);
        telemetry.addData("Motor Power", motorIntake.getPower());
        telemetry.addData("Target Power 2", lWheelPower);
        telemetry.addData("Motor Power 2", motorleft.getPower());
        telemetry.addData("Motor Power 3", motorright.getPower());
        // motorIntake.setPower(intakePower);
        motorleft.setPower(lWheelPower);
        motorright.setPower(rWheelPower);
        
        // Slides
        if(gamepad1.dpad_up == true && !isUp){
          arm.setPower(-1);
          this.sleep(7000);
          arm.setPower(0);
          cup.setPosition(0.2);
          isUp = true;
        }
        if(gamepad1.dpad_down == true){
          arm.setPower(1);
          cup.setPosition(1);
          this.sleep(6000);
          arm.setPower(0);
        }
        if(gamepad1.dpad_right == true){
          arm.setPower(-0.5);
          this.sleep(1000);
          arm.setPower(0);
        }
        if(gamepad1.a){
          carousel.setPower(0.7);
          
        }
        if(gamepad1.y){
          carousel.setPower(0.7);
          this.sleep(5000);
          carousel.setPower(0);
        }
        if(gamepad1.a == false && gamepad1.y == false){
          carousel.setPower(0);
        }
        }
      }
    }
  
}
