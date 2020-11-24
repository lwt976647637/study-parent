package com.lwt.study.design.factory;

/**
 * IWorkFactory工厂的实现类
 *
 */
public class StudentWorkFactory implements IWorkFactory {
	@Override
    public Work getWork() {
        return new StudentWork();
    }
}