package by.it.sc02_morning.kurgan.lesson08;

public class Dog {

    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String toString(){
        String result = "Кличка: "+name+". Возраст: "+age;
        return result;
    }
}
