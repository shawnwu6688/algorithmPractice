package com.my.test.annotation;

/**
 * @author:shawn
 * @date 2020/10/19 16:29
 */
@NameScanner
public class TestNameScanner {
    @NameScanner
    private String name;
    @NameScanner
    private String age;
    @NameScanner
    public String getName() {
        return name;
    }
    @NameScanner
    public void setName(String name) {
        this.name = name;
    }
    @NameScanner
    public String getAge() {
        return age;
    }
    @NameScanner
    public void setAge(String age) {
        this.age = age;
    }
    @NameScanner
    @Override
    public String toString() {
        return "TestNameScanner{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println("---finish---");
    }
}
