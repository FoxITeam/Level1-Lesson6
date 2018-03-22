package ru.foxit.grayfox;

public class Cat extends Animal {
    public Cat(int runDistance, int swimDistance, float jumpHeight) {
        super(runDistance, swimDistance, jumpHeight);
    }

    // todo Далее я пытался в начале работать так, но подумал, что можно все действия перенести в Main.

//    private int maxRunDistance = 200; // shift + f6 - массовое переименование переменных. // Максимальная дистанция бега.
//    private float maxJumpHeight = 2.0F; //дробное, прыжки в метрах.
//    private int maxSwimDistance = 3; // 3 метра может кошка плавать.
//
//    // Вызвали конструктор из анимал.
//    public Cat(String animalName) {
//        super(animalName);
//    }
//
//    @Override
//    public String getAnimalName() {
//        return animalName;
//    }
//
//
//    // ctrl + r - массовое перемеименование.
//    @Override
//    public void run(int distance) {
//        System.out.println(distance <= maxRunDistance ? "run: true" : "run: false");
//    }
//
//    @Override
//    public void jump(float jump) {
//        System.out.println(jump <= maxJumpHeight ? "jump: true" : "jump: false");
//    }
//
//    @Override
//    public void swim(double swim) {
//        System.out.println(swim <= maxSwimDistance ? "swim: true, но медленно." : "swim: false, кошка вообще не доплыла!");
//    }
}
