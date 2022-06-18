package homework_Lesson_9;

public class Italian extends Person{
    public Italian (String name, String sex, String religion, String languageSpoken, String job, String nationality, String pin, String countryOfResidence) {
        super(name, sex, religion, "Italian", job, "Italian", pin, countryOfResidence);
    }

    public void pasta () {
        System.out.printf("%s, lives in the country of the pasta!\n", getName());
    }

    @Override
    public void sayHello() {
        System.out.printf("Chao, my name is %s!\n", getName());
    }

    @Override
    public boolean isAdult() {
        if (getAge() >= 18) {
            System.out.printf("%s, is adult!\n", getName());
            return true;
        } else {
            System.out.format("%s, is not adult!\n", getName());
            return false;
        }
    }
}
