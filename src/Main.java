/**
 * Created by Артём on 25.09.2014.
 */
import java.util.Scanner; //для считывания данных из консоли

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in); //для считывания данных из консоли
        boolean dead = false; //флаг выхода из цикла
        String answer, question;
        String str1 = "Лео голоден?",
                str2 = "Познакомился с кем-то?",
                str3 = "Нужно работать?",
                str4 = "Вспотел?",
                str5 = "Еще работать?",
                str6 = "Устал?",
                str7 = "Нужно на премию Оскар?",
                str8 = "Получил Оскар?",
                str9 = "Это был Титаник?";

        System.out.println("Обычный день Леонардо Ди Каприо.");
        question = str1;
        while (!dead) {
            System.out.println(question);
            answer = in.next();
            if (question.equals(str1)) {
                if (answer.equals("нет"))
                    question = str3;
                else if (answer.equals("да")) {
                    System.out.println("Пошел в кафе...");
                    question = str2;
                } else break;
            } else if (question.equals(str2)) {
                if (answer.equals("да")) {
                    System.out.println("Сходил на свидание");
                    question = str3;
                } else if (answer.equals("нет"))
                    question = str3;
                else break;
            } else if (question.equals(str3)) {
                if (answer.equals("нет")) {
                    System.out.println("Пошел в спортзал...");
                    question = str4;
                } else if (answer.equals("да")) {
                    System.out.println("Пошел на съемки...");
                    question = str5;
                } else break;
            } else if (question.equals(str4)) {
                while (answer.equals("нет")) {
                    System.out.println("Пошел в спортзал... \n" + str4);
                    answer = in.next();
                }
                if (answer.equals("да")) {
                    System.out.println("Сходил в душ");
                    question = str6;
                } else break;
            } else if (question.equals(str5)) {
                while (answer.equals("да")) {
                    System.out.println("Пошел на съемки... \n" + str5);
                    answer = in.next();
                }
                if (answer.equals("нет"))
                    question = str1;
                else break;
            } else if (question.equals(str6)) {
                if (answer.equals("нет"))
                    question = str7;
                else if (answer.equals("да")) {
                    System.out.println("Лег спать... \nПроснулся");
                    question = str1;
                } else break;
            } else if (question.equals(str7)) {
                if (answer.equals("нет")) {
                    System.out.println("Пошел покататься на корабле...");
                    question = str9;
                } else if (answer.equals("да"))
                    question = str8;
                else break;
            } else if (question.equals(str8)) {
                if (answer.equals("нет")) {
                    System.out.println("Пошел покататься на корабле...");
                    question = str9;
                } else if (answer.equals("да")) {
                    System.out.println("Проснулся");
                    question = str1;
                } else break;
            } else if (question.equals(str9)) {
                if (answer.equals("нет")) {
                    System.out.println("Пошел домой спать... \nПроснулся");
                    question = str1;
                } else if (answer.equals("да")) {
                    System.out.println("Утонул :( \nGAME OVER");
                    dead = true;
                } else break;
            }
        }
        if (!dead) System.out.println("Упс, некорректный ответ! Выход...");
    }
}
