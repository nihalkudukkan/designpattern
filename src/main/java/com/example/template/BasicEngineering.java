package com.example.template;

public abstract class BasicEngineering {
    public void math() {
        System.out.println("Math subject");
    }

    public void softSkill() {
        System.out.println("SoftSkill paper");
    }

    public abstract void specialPaper();

    public void papers() {
        math();
        softSkill();
        specialPaper();
    }
}
