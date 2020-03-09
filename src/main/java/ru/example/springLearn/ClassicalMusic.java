package ru.example.springLearn;

public class ClassicalMusic implements Music{
    private ClassicalMusic(){
    }
    public static ClassicalMusic getClassicalMusic(){  //new obj from method
        return new ClassicalMusic();
    }

    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
