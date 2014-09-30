/**
 * Created by Артём on 25.09.2014.
 */
import java.util.Scanner; //для считывания данных из консоли

public class Main {
    public static void main(String[] args) {

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
                str9 = "Это был Титаник?",
                strError = "Некорректный ответ! Пожалуйста, введите \"да\\yes\\y\",\"нет\\no\\n\" для ответа или \"выход\\exit\" для выхода.";

        System.out.println("Обычный день Леонардо Ди Каприо.");
        question = str1;
        while (!dead) {
            System.out.println(question);
            answer = in.next();
            if (question.equals(str1)) {
                if (isNo(answer))
                    question = str3;
                else if (isYes(answer)) {
                    System.out.println("Пошел в кафе...");
                    question = str2;
                } else if (isExit(answer)) break;
                else System.out.println(strError);
            } else if (question.equals(str2)) {
                if (isYes(answer)) {
                    System.out.println("Сходил на свидание");
                    question = str3;
                } else if (isNo(answer))
                    question = str3;
                else if (isExit(answer)) break;
                else System.out.println(strError);
            } else if (question.equals(str3)) {
                if (isNo(answer)) {
                    System.out.println("Пошел в спортзал...");
                    question = str4;
                } else if (isYes(answer)) {
                    System.out.println("Пошел на съемки...");
                    question = str5;
                } else if (isExit(answer)) break;
                else System.out.println(strError);
            } else if (question.equals(str4)) {
                while (isNo(answer)) {
                    System.out.println("Пошел в спортзал... \n" + str4);
                    answer = in.next();
                }
                if (isYes(answer)) {
                    System.out.println("Сходил в душ");
                    question = str6;
                } else if (isExit(answer)) break;
                else System.out.println(strError);
            } else if (question.equals(str5)) {
                while (isYes(answer)) {
                    System.out.println("Пошел на съемки... \n" + str5);
                    answer = in.next();
                }
                if (isNo(answer))
                    question = str1;
                else if (isExit(answer)) break;
                else System.out.println(strError);
            } else if (question.equals(str6)) {
                if (isNo(answer))
                    question = str7;
                else if (isYes(answer)) {
                    System.out.println("Лег спать... \nПроснулся");
                    question = str1;
                } else if (isExit(answer)) break;
                else System.out.println(strError);
            } else if (question.equals(str7)) {
                if (isNo(answer)) {
                    System.out.println("Пошел покататься на корабле...");
                    question = str9;
                } else if (isYes(answer))
                    question = str8;
                else if (isExit(answer)) break;
                else System.out.println(strError);
            } else if (question.equals(str8)) {
                if (isNo(answer)) {
                    System.out.println("Пошел покататься на корабле...");
                    question = str9;
                } else if (isYes(answer)) {
                    System.out.println("Проснулся");
                    question = str1;
                } else if (isExit(answer)) break;
                else System.out.println(strError);
            } else if (question.equals(str9)) {
                if (isNo(answer)) {
                    System.out.println("Пошел домой спать... \nПроснулся");
                    question = str1;
                } else if (isYes(answer)) {
                    System.out.println("Утонул :( \nGAME OVER");
                    dead = true;
                } else if (isExit(answer)) break;
                else System.out.println(strError);
            }
        }
        System.out.println("Вы вышли из жизненного цикла Лео.");
    }

    public static boolean isNo(String str) {
        return (str.equals("нет") || str.equals("no") || str.equals("n"));
    }

    public static boolean isYes(String str) {
        return (str.equals("да") || str.equals("yes") || str.equals("y"));
    }

    public static boolean isExit(String str) {
        return (str.equals("exit") || str.equals("выход"));
    }
}

