package org.example.spring;

import lombok.Data;

@Data
public class Kogtewran extends Hogwards {
    private  int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public  void compareStudents(Kogtewran studentSecond) {
        int powerOne = this.mind + this.wisdom + this.wit + this.creation;
        int powerTwo = studentSecond.mind + studentSecond.wisdom + studentSecond.wit + studentSecond.creation;
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
                ",\nfacultety=" +  "Kogtewran" +
                ",\nmind=" + mind +
                ",\nwisdom=" + wisdom +
                ",\nwit=" + wit +
                ",\ncreation=" + creation +
                ",\nmagic=" + magic +
                ",\nteleport=" + teleport;
    }

    public Kogtewran(String fullName, int magic, int teleport, int mind, int wisdom, int wit, int creation) {
        this.fullName = fullName;
        this.magic = magic;
        this.teleport = teleport;
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }
}