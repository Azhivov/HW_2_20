package org.example.spring;

public class Main {
    public static void main(String[] args) {
        Griffindor harryPotter = new Griffindor("Harry Potter", 45, 67, 14, 36, 87);
        Griffindor ronUyzli = new Griffindor("Ron Uizly", 23, 45, 56, 46, 56);
        Kogtewran joyJang = new Kogtewran("Joy Jang", 34,23,43,54, 34,23);
        Kogtewran padmaPatil = new Kogtewran("Padma  Patil", 45, 67, 45, 23, 78, 90);
        Puffenduy zahariyaSmith = new Puffenduy("Zahariya Smith", 45, 67, 23, 12, 23);
        Puffenduy sedrikDiggory = new Puffenduy("Sedrik Diggory", 33, 76, 31, 19, 32);
        Slizerin dragonMalfoy = new Slizerin("Dragon Malfoy", 34, 56, 23, 34, 56, 67, 34);
        Slizerin gregoryGoil = new Slizerin("Gregory Goil", 23, 45, 45, 56, 67, 23, 45);

        harryPotter.compareStudents(ronUyzli);
       harryPotter.compareStudents(dragonMalfoy);
        System.out.println();
       joyJang.compareStudents(padmaPatil);
      joyJang.compareStudents(gregoryGoil);
        System.out.println();
       dragonMalfoy.compareStudents(padmaPatil);
       dragonMalfoy.compareStudents(gregoryGoil);
        System.out.println();
      zahariyaSmith.compareStudents(sedrikDiggory);
      zahariyaSmith.compareStudents(harryPotter);
    }
}