package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "Gamepad (Blocks to Java)", group = "")
public class Gamepad extends LinearOpMode {
  private DcMotor motor1;

  /**
   * This function is executed when this Op Mode is selected from the Driver Station.
   */
  @Override
  public void runOpMode() {
    motor1 = hardwareMap.dcMotor.get("motor1");
//    motor2 = hardwareMap.dcMotor.get("motor2");

    // Put initialization blocks here.
    waitForStart();
    if (opModeIsActive()) {
      // Put run blocks here.
      while (opModeIsActive()) {
        // Put loop blocks here.
        motor1.setPower(1);
  //      motor2.setPower(0.1);
        telemetry.update();
      }
    }
  }
}
