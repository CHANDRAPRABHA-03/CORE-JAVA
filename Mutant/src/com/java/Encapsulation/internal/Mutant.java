package com.java.Encapsulation.internal;

public class Mutant {
    private String name = "Logan";
    private String power = "Regeneration";
    private int age = 150;
    private boolean isXMenMember = true;
    private String origin = "Canada";

    public Mutant() {
        System.out.println("Mutant object created!");
    }

    void setName(String name) {
        this.name = name;
    }

    void setPower(String power) {
        this.power = power;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setIsXMenMember(boolean isXMenMember) {
        this.isXMenMember = isXMenMember;
    }

    void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getName() {
        return name;
    }

    public String getPower() {
        return power;
    }

    public int getAge() {
        return age;
    }

    public boolean getIsXMenMember() {
        return isXMenMember;
    }

    public String getOrigin() {
        return origin;
    }
}
