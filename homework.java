import java.util.Scanner;

/*Написать консольный калькулятор принимающий два числа и операто(умножение, деление, сложение, вычитание) и завершающий 
процесс по решению пользователя. Завершающее слово должно быть не регистрочувствительным(Пример: поданные слова в разном
 регистре "Да", "да", "дА", "ДА" - должны быть однозначно трактованны, как "Да").
Пример:
Введите первое число:
5
Введите второе число:
10
Введите желаемую операцию
*
Результат: 50
Хотите продолжить?
Нет */
public class homework {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.println("Введите первое число: ");
            int num1 = sc.nextInt();
            System.out.println("Введите второе число: ");
            int num2 = sc.nextInt();
            System.out.println("Введите желаемую операцию: ");
            String operat = sc.next();
            switch(operat){
                case "+":
                System.out.printf("Результат: %d", num1 + num2);
                break;
                case "-":
                System.out.printf("Результат: %d", num1 - num2);
                break;
                case "*":
                System.out.printf("Результат: %d", num1 * num2);
                break;
                case "/":
                System.out.printf("Результат: %d", num1 / num2);
                break;
            }
            System.out.println("\nХотите продолжить ?");
            String answer = sc.next();
            switch(answer.toUpperCase()){
                case "NO":
                flag  = false;
                break;
            }
        }
        sc.close();

    }
}