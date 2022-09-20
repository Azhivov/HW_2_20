package org.example.spring;

import lombok.Data;

@Data
public class Slizerin extends Hogwards {
    private int cunning;
    private int determination;
    private int ambitiont;
    private int resoursefulness;
    private int lustForPower;

    @Override
    public String toString() {
        return "Я " + fullName +
                ",\nfacultety=" + "Slizerin" +
                ",\ncunning=" + cunning +
                ",\ndetermination=" + determination +
                ",\nambitiont=" + ambitiont +
                ",\nresoursefulness=" + resoursefulness +
                ",\nlustForPower=" + lustForPower +
                ",\nfullName='" + fullName +
                ",\nmagic=" + magic +
                ",\nteleport=" + teleport;
    }

    public Slizerin(String fullName, int magic, int teleport, int cunning, int determination, int ambitiont, int resoursefulness, int lustForPower) {
        this.fullName = fullName;
        this.magic = magic;
        this.teleport = teleport;
        this.cunning = cunning;
        this.determination = determination;
        this.ambitiont = ambitiont;
        this.resoursefulness = resoursefulness;
        this.lustForPower = lustForPower;
    }

    public  void compareStudents(Slizerin studentSecond) {
        int powerOne = this.cunning + this.determination + this.ambitiont + this.resoursefulness + this.lustForPower;
        int powerTwo = studentSecond.cunning + studentSecond.determination + studentSecond.ambitiont + studentSecond.resoursefulness + studentSecond.lustForPower;
        if (powerOne > powerTwo) {
            System.out.println(this.fullName + "Сильнее чем " + studentSecond.fullName);
        } else if (powerOne < powerTwo) {
            System.out.println(studentSecond.fullName + "Сильнее чем " + this.fullName);
        } else {
            System.out.println(this.fullName + "Сильнее чем " + studentSecond.fullName);
        }
    }
}



