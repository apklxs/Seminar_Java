import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Scanner;
 
public class task4 {
 
    // Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
    // 1) Умножьте два числа и верните произведение в виде связанного списка.
    // 2) Сложите два числа и верните сумму в виде связанного списка.
    // Одно или два числа могут быть отрицательными.
    // Даны два Deque, цифры в обратном порядке.
    // [3,2,1] - пример Deque
    // [5,4,3]- пример второго Deque
    // 1) 123 * 345 = 42 435
    // Ответ всегда - связный список, в обычном порядке
    // [4,2,4,3,5] - пример ответа
 
    public static void main(String[] args) {
   
    ArrayDeque<Character> firstNumbers = new ArrayDeque<>();
    ArrayDeque<Character> secondNumbers = new ArrayDeque<>();
    firstNumbers = charInReverseStack("Введите первое число =");
    secondNumbers = charInReverseStack("Введите второе число =");
    System.out.println(firstNumbers);
    System.out.println(secondNumbers);
    int number1 = stackInInt(firstNumbers);
    System.out.println(number1);
    int number2 = stackInInt(secondNumbers);
    System.out.println(number2);
    String multiplicateNumbers = String.valueOf(number1*number2);
    System.out.printf("результат умножения %s %s \n",multiplicateNumbers,charInStack(multiplicateNumbers));
    String sumNumbers = String.valueOf(number1+number2);
    System.out.printf("результат сложения %s %s ",sumNumbers,charInStack(sumNumbers));
    
 
    }
 
    public static ArrayDeque<Character> charInReverseStack(String info) {
 
        Scanner in = new Scanner(System.in);
        ArrayDeque<Character> numbers = new ArrayDeque<>();
        System.out.print(info);
        String firstNumberInStr = in.next();
        //in.close();
        for (int i = 0; i < firstNumberInStr.length(); i++) {
            numbers.addFirst(firstNumberInStr.charAt(i));
        }
 
        return numbers;
    }
  
    public static ArrayDeque<Character> charInStack(String data) {
        ArrayDeque<Character> numbers = new ArrayDeque<>();
        for (int i = 0; i < data.length(); i++) {
            numbers.addLast(data.charAt(i));
        }
        return numbers;
    }
 
    public static int stackInInt(ArrayDeque<Character> numbers) {
        String strInStrResult = "";
        Iterator<Character> itr = numbers.descendingIterator();
        while (itr.hasNext()) {
            strInStrResult += itr.next();
        }
        return Integer.parseInt(strInStrResult);
    }
    
}    