package com.yty;

/**
 * @author yty
 * @version 1.0
 * @since 1.0
 **/
public record StudentRecord(String name, Integer age) {
    public StudentRecord{
        if (age < 18){
            throw new RuntimeException("under 18");
        }
        else {
            System.out.println("ok");
        }
    }
    public String showName(){
        return this.name.toUpperCase();
    }
    public static String showClass(){
        return StudentRecord.class.toString();
    }
}
