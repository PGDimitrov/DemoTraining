package homework_Lesson_9;

public class Child extends Person{

    public Child(String name, String sex, String religion, String languageSpoken, String job, String nationality, String pin, String countryOfResidence) {
        super(name, sex, religion, languageSpoken, null, nationality, pin, countryOfResidence);
    }

    @Override
    public boolean isAdult() {
        System.out.printf("%s, is a child, not an adult!\n", getName());
        return false;
    }

    @Override
    public boolean canTakeLoan() {
        System.out.printf("%s, is a child and can`t take loan!\n", getName());
        return false;
    }

    public void play() {
        System.out.printf("%s, is playing games and have fun!\n", getName());
    }

}
