package org.example.spring;

import lombok.Data;

@Data
public class Griffindor extends Hogwards {
    private int honor;
    private int hobility;
    private int bravery;

    public  void compareStudents(Griffindor studentSecond) {
        int powerOne = this.honor + this.hobility + this.bravery;
        int powerTwo = studentSecond.honor + studentSecond.hobility + studentSecond.bravery;
        if (powerOne > powerTwo) {
            System.out.println(this.fullName + "Сильнее чем " + studentSecond.fullName);
        } else if (powerOne < powerTwo) {
            System.out.println(studentSecond.fullName + "Сильнее чем " + this.fullName);
        } else {
            System.out.println(this.fullName + "Сильнее чем " + studentSecond.fullName);
        }
    }

    @Override
    public String toString() {
        return "Я " + fullName +
                ",\nfacultety=" + "Griffindor" +
                ",\nhonor=" + honor +
                ",\nhobility=" + hobility +
                ",\nbravery=" + bravery +
                ",\nmagic=" + magic +
                ",\nteleport=" + teleport;
    }

    public Griffindor(String fullName, int magic, int teleport, int honor, int hobility, int bravery) {
        this.fullName = fullName;
        this.magic = magic;
        this.teleport = teleport;
        this.honor = honor;
        this.hobility = hobility;
        this.bravery = bravery;


    }
}
