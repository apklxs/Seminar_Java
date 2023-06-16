import java.util.Scanner;
import java.io.*;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
 
public class task3 {
    public static void main(String[] args) {
        System.out.print("Программа для решения задач. \n");
        System.out.print("Пользователь вводит длину списка для целых чисел \n" +
        "Задача №1 Нужно удалить из него чётные числа \n" +
        "Задача №2 Найти минимальное значение \n" +
        "Задача №3 Найти максимальное значение \n" +
        "Задача №4 среднее арифметическое значение \n");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину списка, будет заполнен случайными целыми числами:");
        int lenghtList = in.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>(); 
        list1.addAll(generateRandomList(lenghtList));
        System.out.print("Получен список из целых чисел \n");
        System.out.print(list1 + "\n");
        System.out.print("Введите номер задачи №:");
        int key = in.nextInt();
        switch (key) {
            case 1:
                System.out.print("Получен список не содержащий четных чисел \n");
                System.out.print(deleteEvenNumberList(list1));
                break;
            case 2:
                System.out.printf("Минимальное число в списке %d",findElementMinList(list1));
                break;
            case 3:
                System.out.printf("Максимальное число в списке %d",findElementMaxList(list1));
                break;
            case 4:
                System.out.printf("Среднее арифметическое элементов списка %s",arithmeticMeanList(list1));
                break;
            default:
                System.out.print("Не введен номер задачи, выход из программы");
                break;
        }
        in.close();
    }
 
    public static void writeArrayToFile(int[] array) {
        int[] arr = array;
        try (FileWriter writer = new FileWriter("log.txt", true)) {
            Date date = new Date();
            writer.write(date.toString() + "-> ");
            for (int i = 0; i < arr.length; i++) {
                writer.append(Integer.toString(arr[i]));
                writer.append(' ');
            }
            writer.append('\n');
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
 
    public static List<Integer> generateRandomList(int nlen) {
        ArrayList<Integer> list1 = new ArrayList<>(nlen);
        Random rnd = new Random();
        for (int i = 0; i < nlen; i++) {
            list1.add(i,rnd.nextInt(nlen));
        }
        return list1;
    }
 
    public static int findElementMinList(List<Integer> list) {
        int min = list.get(0);
        for (int i : list) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
 
    public static int findElementMaxList(List<Integer> list) {
        int max = list.get(0);
        for (int i : list) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
 
    public static float arithmeticMeanList(List<Integer> list) {
        int arithmeticMean = 0;
        for (int i : list) {
            arithmeticMean = arithmeticMean +i;
        }
    return (float)arithmeticMean / list.size();
    }
 
    public static List<Integer> deleteEvenNumberList(List<Integer> list) {
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i : list) {
            if (i%2 != 0 && i != 0){
                list1.add(i);
            }
        }
    return list1;
    }
 
}