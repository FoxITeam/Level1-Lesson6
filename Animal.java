package ru.foxit.grayfox;

// Делаем абстрактный класс
// объединение характеристики нескольких классов, это задача абстрактных классов.
public abstract class Animal {
    // todo | 1. Создать классы Собака и Кот с наследованием от класса Животное.
    // todo | 2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. В качестве параметра каждому
    // todo | методу передается величина, означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).
    // todo | 3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака
    // todo | 0.5 м.; плавание: кот должен плавать медленно, собака 10 м.).
    // todo | 4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль.
    // todo | (Например, dog1.run(150); -> результат: run: true)
    // todo | 5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть
    // todo | 400 м., у другой 600 м.

    // Инициализируем переменные
    private int runMaxDistance; // Дистанция бега
    private int swimMaxDistance; // Дистанция плавания
    private float jumpMaxDistance; // Дистанция прыжка

    // Дергаем конструктор
    public Animal(int runMaxDistance, int swimMaxDistance, float jumpMaxDistance) {
        // Стучимся к самому классу Animal и его поле fullName
        this.runMaxDistance = runMaxDistance;
        this.swimMaxDistance = swimMaxDistance;
        this.jumpMaxDistance = jumpMaxDistance;
    }

    // Задаем 3 вида поведения, однако как они должны себя вести будет описано в самих классах, а не в Animal.
    public void run(int runDistance) { // Бегать
        System.out.println("run: " + (runDistance <= runMaxDistance));
    }
    public void swim(int swimDistance) { // Плыть
        System.out.println("swim: " + (swimDistance <= swimMaxDistance));
    }
    public void jump(float jumpHeight) { // Прыгать
        System.out.println("jump: " + (jumpHeight <= jumpMaxDistance));
    }

}