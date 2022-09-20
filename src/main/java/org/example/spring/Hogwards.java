package org.example.spring;

import lombok.Data;

@Data
public abstract class Hogwards {
    String fullName;
    int magic;
    int teleport;

    public void compareStudents(Hogwards studentSecond) {
        int powerOne = this.magic + this.teleport;
        int powerTwo = studentSecond.magic + studentSecond.teleport;
        if (powerOne > powerTwo) {
            System.out.println(this.fullName + "Сильнее чем " + studentSecond.fullName);
        } else if (powerOne < powerTwo) {
            System.out.println(studentSecond.fullName + "Сильнее чем " + this.fullName);
        } else {
            System.out.println(this.fullName + "Сильнее чем " + studentSecond.fullName);
        }
    }

}
