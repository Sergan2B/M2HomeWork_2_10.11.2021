package com.company;

import java.util.Scanner;

public class Main {

    //Дедлайн 3 дня
    //
    //a) Доделать все пункты практического задания из презентации.
    //Сделано

    //b) Создать 2х уровневую иерархию из 4х классов (1й - родитель --> 2й, 3й, 4й - дочерние, с отличающимися полями).
    //Сделано

    //c) Создать Интерфейс Printable с методом void print();
    //Сделано

    //d) Реализовать интерфейс Printable классами 2й, 3й и 4й, переопределить метод интерфейса так чтобы он распечатывал всю информацию о свойствах объекта.
    //Сделано

    //e) В классе Main создать возвращаемый метод createObject(String className), который умеет создавать объекты класса 2й, 3й и 4й и после
    // создания и задания свойств объекту метод возвращает ссылку на объект (пульт). Можно использовать switch для того чтоб определить
    // какого типа нужно создать экземпляр объекта. Например если в параметре передается “2й” метод должен создать объект именно этого типа.
    //Сделано

    //f) В главном классе Main создать 3 различных объекта классов 2й, 3й и 4й с помощью метода createObject, и распечатать по ним информацию
    // методом print();
    //Сделано
    public static void main(String[] args) {
        Circle c1 = new Circle("Круг ", 23);
        Triangle t1 = new Triangle("Треугольник ", 4, 3, 4);
        Square s1 = new Square("Квадрат ", 6);
        Dog d1 = new Dog("Rex");
        Cat cat1 = new Cat("Shin");
        Horse h1 = new Horse("Ris");

        //Figure[] figures = {c1, t1, s1}; //полиморфизм
        Drawable[] figures = {c1, t1, s1, d1, cat1, h1}; //Через интерфейс (полиморфизм)

        for (Drawable figure : figures) { //Foreach используем когда не используем значение [i], в отсальных случах for
            if (figure instanceof Figure) {
                System.out.println(((Figure) figure).getName() + "Периметр -> " + ((Figure) figure).calculatePerimeter());
            }
            if (figure instanceof Animal) { //instanceof это проверка
                System.out.println(((Animal) figure).getName());
                ((Animal)figure).callSound();
                ((Animal)figure).print();
            }
            figure.draw();
        }
        //d1.draw();
        //cat1.draw();
        System.out.println();
        Animal object1A = createObject();
        System.out.println("________");
        Animal object1B = createObject();
        System.out.println("________");
        Animal object1C = createObject();
        System.out.println("________");
        System.out.println(object1A.print());
        System.out.println(object1B.print());
        System.out.println(object1C.print());
    }
    public static Animal createObject() {
        Scanner enterName, enterNumber;
        String name = null;
        Dog dog_1;
        Cat cat_1;
        Horse horse_1;
        enterName =  new Scanner(System.in);
        enterNumber = new Scanner(System.in);
        System.out.println("Выбери число от 1 до 3. \nЧисло 1 создать собаку. \nЧисло 2 создать кота. \nЧисло 3 создать лошадь.");
        int number = enterNumber.nextInt();
        switch (number) {
            case 1:
                System.out.println("Введите имя объекта");
                name = enterName.next();
                dog_1 = new Dog(name);
                dog_1.print();
                return dog_1;
            case 2:
                System.out.println("Введите имя объекта");
                name = enterName.next();
                cat_1 = new Cat(name);
                cat_1.print();
                return cat_1;
            case 3:
                System.out.println("Введите имя объекта");
                name = enterName.next();
                horse_1 = new Horse(name);
                horse_1.print();
                return horse_1;
        }
        return createObject();
    }
}

