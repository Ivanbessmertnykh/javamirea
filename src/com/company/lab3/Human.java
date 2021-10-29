package com.company.lab3;

public class Human {

    private String name; // имя
    private int age; // возраст
    private int weight; // вес
    private int tall; // рост

    private Head head = new Head();
    private Hand leftHand = new Hand(5);
    private Hand rightHand = new Hand(5);
    private Leg leftLeg = new Leg();
    private Leg rightLeg = new Leg();

    public Human(String name, int age, int weight, int tall) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.tall = tall;
    }

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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getTall() {
        return tall;
    }

    public void setTall(int tall) {
        this.tall = tall;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Hand getLeftHand() {
        return leftHand;
    }

    public void setLeftHand(Hand leftHand) {
        this.leftHand = leftHand;
    }

    public Hand getRightHand() {
        return rightHand;
    }

    public void setRightHand(Hand rightHand) {
        this.rightHand = rightHand;
    }

    public Leg getLeftLeg() {
        return leftLeg;
    }

    public void setLeftLeg(Leg leftLeg) {
        this.leftLeg = leftLeg;
    }

    public Leg getRightLeg() {
        return rightLeg;
    }

    public void setRightLeg(Leg rightLeg) {
        this.rightLeg = rightLeg;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", tall=" + tall +
                ", head=" + head +
                ", leftHand=" + leftHand +
                ", rightHand=" + rightHand +
                ", leftLeg=" + leftLeg +
                ", rightLeg=" + rightLeg +
                '}';
    }
}
