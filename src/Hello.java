import javax.swing.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import static java.util.Collections.sort;

// возраст - опциональный
// отсортировать список пользователей по убыванию возраста, null - первый
public class Hello {

    public static User readUserFromBuff(Scanner scanner) {

        var user = new User();
        user.setFirthName(scanner.nextLine());
        user.setSecondName(scanner.nextLine());
        user.setMiddleName(scanner.nextLine());
        String age = scanner.nextLine();
        if ("".equals(age)){
            user.setAge(null);
        } else {
            user.setAge(Integer.valueOf(age));
        }
        user.setPass(scanner.nextLine());
        return user;

    }

    public static void main(String[] args) {
        try {
            List<User> users = new ArrayList<>();
            Scanner scanner = new Scanner(Paths.get("users.txt")).useDelimiter("\\s");
            while (scanner.hasNext()) {
                users.add(readUserFromBuff(scanner));
            }

            Comparator<User> comparator = new Comparator<User>() {
                @Override
                public int compare(User user, User t1) {
                    if (user.getAge() == null)
                        return Integer.MIN_VALUE;
                    else if (t1.getAge() == null) {
                        return Integer.MAX_VALUE;
                    } else {
                        return t1.getAge() - user.getAge();
                    }
                }
            };

            users.sort(comparator);
            users.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
