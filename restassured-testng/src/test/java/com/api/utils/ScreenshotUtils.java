package com.api.utils;

import org.apache.commons.io.FileUtils;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ScreenshotUtils {
    public static String captureScreenshot(String testName) {
        String screenshotPath = System.getProperty("user.dir") + "/test-output/screenshots/" + testName + ".png";

        try {
            // Capture full screen
            Robot robot = new Robot();
            Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage screenFullImage = robot.createScreenCapture(screenRect);

            File screenshotFile = new File(screenshotPath);
            FileUtils.forceMkdirParent(screenshotFile);
            ImageIO.write(screenFullImage, "png", screenshotFile);
        } catch (AWTException | IOException e) {
            e.printStackTrace();
        }

        return screenshotPath;
    }
}
