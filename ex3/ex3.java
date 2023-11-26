package ru.mirea.lab6.ex3;




    interface Nameable {
        String getName();
    }
    class Planet implements Nameable {
        private String name;

        public Planet(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return name;
        }
    }

    class Car implements Nameable {
        private String name;

        public Car(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return name;
        }
    }

    class Animal implements Nameable {
        private String name;

        public Animal(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return name;
        }
    }

        public class ex3 {
        public static void main(String[] args) {
            Nameable planet = new Planet("Венера");
            Nameable car = new Car("Жигуль");
            Nameable animal = new Animal("Тушканчик");

            System.out.println("Планета: " + planet.getName());
            System.out.println("Машина: " + car.getName());
            System.out.println("Животное: " + animal.getName());

    }
}
