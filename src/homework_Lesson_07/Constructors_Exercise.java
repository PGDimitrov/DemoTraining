package homework_Lesson_07;

public class Constructors_Exercise {

        //Create a Car class which has 5 elements: name / color / release year / horsepower / second-hand tick
        //Name and color must be from string type / release year and horsepower must be integers / second-hand is boolean.

        //Requirements
        //If name or color is not specified, set N/A as value.
        //If release year or horsepower is not specified, set -1 as value.
        //If second-hand is not specified, set false as value.

        public static class Car{

            public String name = "N/A";
            public String color = "N/A";
            public int releaseYear = -1;
            public int horsepower = -1;
            public boolean secondHandTick = false;

            public Car() {
            }

            public Car(String name, int releaseYear, int horsepower, boolean secondHandTick) {
                this.name = name;
                this.releaseYear = releaseYear;
                this.horsepower = horsepower;
                this.secondHandTick = secondHandTick;
            }

            public Car(String name, String color, int releaseYear, int horsepower) {
                this.name = name;
                this.color = color;
                this.releaseYear = releaseYear;
                this.horsepower = horsepower;
            }

            public Car(String name, String color, boolean secondHandTick) {
                this.name = name;
                this.color = color;
                this.secondHandTick = secondHandTick;
            }

            public Car(String name, String color, int releaseYear, int horsepower, boolean secondHandTick) {
                this.name = name;
                this.color = color;
                this.releaseYear = releaseYear;
                this.horsepower = horsepower;
                this.secondHandTick = secondHandTick;
            }

            @Override
            public String toString() {
                return "Car{" +
                        "name='" + name + '\'' +
                        ", color='" + color + '\'' +
                        ", releaseYear=" + releaseYear +
                        ", horsepower=" + horsepower +
                        ", secondHandTick=" + secondHandTick +
                        '}';
            }
        }


        //Create a constructors of Car class for the following cases:
        //Create a car by provided name / color / release year / horsepower / second-hand.
        //Create a car by provided name / color / second-hand.
        //Create a car by provided name / color / release year / horsepower.
        //Create a car by provided name / release year / horsepower / second-hand.
        //Create a car by provided nothing.

        //Create Car object using each constructor.

    public static void main(String[] args) {
            Car car1 = new Car("Honda", "Grey", 2020, 200,true);
            Car car2 = new Car("Peugeot", "Blue", true);
            Car car3 = new Car("Mercedes", "Black", 2015, 180);
            Car car4 = new Car("Lada",1980, 100,true);
            Car car5 = new Car();

            System.out.println(car1);
            System.out.println(car2);
            System.out.println(car3);
            System.out.println(car4);
            System.out.println(car5);
    }
}
