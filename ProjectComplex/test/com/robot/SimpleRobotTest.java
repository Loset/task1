package com.robot;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by student7 on 10.03.2017.
 */
public class SimpleRobotTest {
    @Test
    public void rotating() throws Exception {
        SimpleRobot robot = new SimpleRobot();
        robot.rotating(90);
        assertEquals(90, robot.getCourse(), 0.1);
    }

}