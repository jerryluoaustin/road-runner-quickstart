package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Disabled
public abstract class AutoBase extends LinearOpMode {
    public Bitmap bitmap = new Bitmap(this);
    public OpenCV openCV = new OpenCV(this);
    public AutoDrive autoDrive = new AutoDrive(this, hardwareMap);
}