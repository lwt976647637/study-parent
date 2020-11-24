package com.lwt.study.design.factory;

/**
 * Work接口的具体实现类
 */
public class StudentWork implements Work {
	   @Override
    public void doWork() {
        System.out.println("学生做作业!");
    }
} 