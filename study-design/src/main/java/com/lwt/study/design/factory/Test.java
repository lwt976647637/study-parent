package com.lwt.study.design.factory;

import java.util.Calendar;

/**
 * 测试类
 *
 */
public class Test {
    public static void main(String[] args) {
        IWorkFactory studentWorkFactory = new StudentWorkFactory();
        studentWorkFactory.getWork().doWork();
        IWorkFactory teacherWorkFactory = new TeacherWorkFactory();
        teacherWorkFactory.getWork().doWork();

        Calendar calendar = Calendar.getInstance();
    }
}