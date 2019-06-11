package com.test.joins;

import java.util.Date;
import java.util.Map;

public class Student {

    public int rollNo;
    public String Name;
    public Map<Date, String> attendance;

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", Name='" + Name + '\'' +
                ", attendance=" + attendance +
                '}';
    }
}
