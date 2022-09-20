package org.example.spring;

import lombok.Data;

@Data
public class Puffenduy extends Hogwards {
    private int industriousness;
    private int loyalty;
    private int honesty;


    public Puffenduy(String fullName, int magic, int teleport, int industriousness, int loyalty, int honesty) {
        this.fullName = fullName;
        this.magic = magic;
        this.teleport = teleport;
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Я " + fullName +
                ",\nfacultety=" + "Puffenduy" +
                ",\nindustriousness=" + industriousness +
                ",\nloyalty=" + loyalty +
                ",\nhonesty=" + honesty +
                ",\nfullName='" + fullName +
                ",\nmagic=" + magic +
                ",\nteleport=" + teleport;
    }

    public  void compareStudents(Puffenduy studentSecond) {
        int powerOne = this.industriousness + this.loyalty + this.honesty;
        int powerTwo = studentSecond.industriousness + studentSecond.loyalty + studentSecond.honesty;
        if (powerOne > powerTwo) {
            System.out.println(this.fullName + "Сильнее чем " + studentSecond.fullName);
        } else if (powerOne < powerTwo) {
            System.out.println(studentSecond.fullName + "Сильнее чем " + this.fullName);
        } else {
            System.out.println(this.fullName + "Сильнее чем " + studentSecond.fullName);
        }
    }
}