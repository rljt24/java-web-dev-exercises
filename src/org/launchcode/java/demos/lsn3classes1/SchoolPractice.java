package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student me = new Student();
        me.setName("Ricky");
        me.setStudentId(666);
        me.setGpa(4.2);
        me.setNumberOfCredits(16);
        System.out.println(me.getStudentId());
    }
}
