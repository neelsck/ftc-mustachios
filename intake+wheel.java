package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "Gamepad2 (Blocks to Java)", group = "")
public class Gamepad2 extends LinearOpMode {

  private DcMotor motorIntake;
  private DcMotor motorleft;
  double tgtPower= 0;
  double tgtPower2= 0;
  


  /**
   * This function is executed when this Op Mode is selected from the Driver Station.
   */
  @Override
  public void runOpMode() {
    motorIntake = hardwareMap.dcMotor.get("motorIntake");
    motorleft = hardwareMap.dcMotor.get("motorleft");

    // Put initialization blocks here.
    waitForStart();

    // if (opModeIsActive()) {
      
    //     for(int i=100000; i>0 ; --i) {
    //     motorIntake.setPower(-1.0);
    //     motorleft.setPower(0);
    //     try {
    //       this.wait(1); 
    //       motorIntake.setPower(0);
    //       motorleft.setPower(0);
    //     } catch (Exception e) {
    //     }
    //     }  
    
    
      // Put run blocks here.
      while (opModeIsActive()) {
        
        // Put loop blocks here.
      //  motorleft.setPower(gamepad1.left_stick_y);
      //  telemetry.update();
        tgtPower = -this.gamepad1.left_trigger;
        tgtPower2 = -this.gamepad1.right_stick_y;
        telemetry.addData("Target Power", tgtPower);
        telemetry.addData("Motor Power", motorIntake.getPower());
        telemetry.addData("Target Power 2", tgtPower2);
        telemetry.addData("Motor Power 2", motorleft.getPower());
        motorIntake.setPower(tgtPower);
        motorleft.setPower(tgtPower2);
      }
    }
  }

