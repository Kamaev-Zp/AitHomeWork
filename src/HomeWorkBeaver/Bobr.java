package HomeWorkBeaver;

import collection2.Cup;

public class Bobr implements Comparable<Bobr> {
    public String getKey;
    //    public String getKey;
    private String name;

    @Override
    public String toString() {
        return "Bobr{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", relativesCount=" + relativesCount +
                '}';
    }

    private int age;
    private int relativesCount;

    public Bobr(String name, int age, int relativesCount) {
        this.name = name;
        this.age = age;
        this.relativesCount = relativesCount;
    }

    // Геттеры и сеттеры для полей

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRelativesCount() {
        return relativesCount;
    }

    public void setRelativesCount(int relativesCount) {
        this.relativesCount = relativesCount;
    }


    @Override
    public int compareTo(Bobr o) {
            if (this.age< o.age){
                return -1;
            }
            else if (this.age > o.age){
                return 1;
            }
            return 0;

        }
    }

