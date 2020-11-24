package com.lwt.study.design.factory;

/**
 *  Work接口的具体实现类
 *
 */
public class TeacherWork implements Work {
    @Override
    public void doWork() {
        System.out.println("老师审批作业!");
    }
}