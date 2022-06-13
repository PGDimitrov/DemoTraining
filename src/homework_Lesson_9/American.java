package homework_Lesson_9;

public class American extends Person {

    public American (String name, String sex, String religion, String languageSpoken, String job, String nationality, String pin, String countryOfResidence) {
        super(name, sex, religion, "English", job, "English", pin, countryOfResidence);
    }

    public void eat () {
        System.out.printf("%s, eat McDonalds! \n", getName());
    }

    @Override
    public void sayHello() {
        System.out.format("Hello, my name is %s! \n", getName());
    }

    @Override
    public boolean isAdult() {
        if (getAge() >= 21) {
                System.out.printf("%s, is adult!\n", getName());
                return true;
        } else {
                System.out.format("%s, is not adult!\n", getName());
                return false;
        }
    }
}
