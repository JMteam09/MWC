package com.jordi.corepacket;

/**
 * Created by reloa on 18-1-2017.
 */

public class logging {
    public static String stack_to_string(StackTraceElement[] stack){
        String s = "";
        for (int x = 0; x < stack.length; x++){
            StackTraceElement e = stack[x];
            s = "["+e.getMethodName()+"]\n"+ e.toString() +", LINE ["+stack[x].getLineNumber()+"]";
        }
        return s;
    }
    public static class LogType { // static class inplaats van enum handiger voor string only enums
        public static final String A1 = "[A1]\n";
        public static final String A2 = "[A2]\n";
        public static final String A3 = "[A3]\n";
        public static final String G1 = "[G1]\n";
        public static final String G3 = "[G3]\n";
    }
}
