package homework_Lesson_9;


public class Main {


    public static void main(String[] args) {

        Person person = new Person("Albena", "Female", "Orthodox", "Bulgarian", "QA",
                "Bulgaria", "0351283417", "Bulgaria");

        Person anotherPerson = new Person("Marius", "MALE", "Catholic", "Italian", "null",
                "Italy", "8305128347", "Italy");

        Person thirdPerson = new Person("John", "other", "Islam", "English", "Support",
                "USA", "0745178347", "USA");

        System.out.println(person);
        System.out.println(anotherPerson);
        System.out.println(thirdPerson);

        System.out.println();

        person.sayHello();
        anotherPerson.sayHello();
        thirdPerson.sayHello();

        System.out.println();

        person.celebrateEaster();
        anotherPerson.celebrateEaster();
        thirdPerson.celebrateEaster();

        System.out.println();

        person.isAdult();
        anotherPerson.isAdult();
        thirdPerson.isAdult();

        System.out.println();

        person.canTakeLoan();
        anotherPerson.canTakeLoan();
        thirdPerson.canTakeLoan();

        System.out.println();
        Child child = new Child("Tomi", "Male", "Orthodox", "Bulgarian","Test","Bulgarian",
                "1242183456", "Bulgaria");

        System.out.println(child);
        child.sayHello();
        child.play();
        child.canTakeLoan();
        child.isAdult();
        child.celebrateEaster();

        System.out.println();
        Bulgarian bulgarian = new Bulgarian("Ivan", "Male", "Catholic", "Test", "Banker",
                "Test1", "7010126734", "Greece");

        System.out.println(bulgarian);

        bulgarian.sayHello();
        bulgarian.isAdult();
        bulgarian.canTakeLoan();
        bulgarian.celebrateEaster();
        bulgarian.drinks();

        System.out.println();
        American american = new American("Amanda", "Female", "Muslim", "Turkish", "null",
                "Turkey","6703047862", "Austria");

        System.out.println(american);
        american.eat();
        american.sayHello();
        american.isAdult();
        american.canTakeLoan();
        american.celebrateEaster();

        System.out.println();
        Italian italian = new Italian("Alberto", "male", "Catholic",
                "English","Barman","","9001085368","Bulgaria");

        System.out.println(italian);
        italian.pasta();
        italian.sayHello();
        italian.isAdult();
        italian.canTakeLoan();
        italian.celebrateEaster();

    }

}
