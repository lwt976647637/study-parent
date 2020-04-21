package com.lwt.study.core.utils;

public class ExceptionUtil {
    /**
     * 获取详细的异常信息
     *
     * @param ex
     * @return
     */
    public static String getExceptionInfo(Exception ex) {
        String sOut = "";
        sOut += ex.toString();
        StackTraceElement[] trace = ex.getStackTrace();
        for (StackTraceElement s : trace) {
            sOut += "\tat " + s + "\r\n";
        }
        return sOut;
    }


}
