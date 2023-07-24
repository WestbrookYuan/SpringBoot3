package com.yty;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author yty
 * @version 1.0
 * @since 1.0
 **/
public class StudentRecordTest {
    @Test
    public void test01() {
        StudentRecord studentRecord = new StudentRecord("yty", 17);
        System.out.println(studentRecord.toString());
        System.out.println(studentRecord.name());
        System.out.println(studentRecord.age());
        System.out.println(studentRecord.showName());
        System.out.println(StudentRecord.showClass());
    }
}