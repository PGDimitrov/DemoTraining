package homework_Lesson_9;

import java.security.PublicKey;

public class Bulgarian extends Person {
    public Bulgarian (String name, String sex, String religion, String languageSpoken, String job, String nationality, String pin, String countryOfResidence) {
        super(name, sex, religion, "Bulgarian", job, "Bulgarian", pin, countryOfResidence);
    }

    public void drinks () {
        if (isAdult()) {
            System.out.printf("%s, drinks rakia! \n", getName());
        } else {
            System.out.printf("%s, drinks milk! \n", getName());
        }
    }

    @Override
    public void sayHello() {
        System.out.printf("Zdravei, az se kazvam %s! \n", getName());
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
