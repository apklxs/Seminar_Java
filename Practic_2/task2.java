import java.util.Scanner;
import java.io.*;
import java.util.Date;
import java.util.Random;;
 
public class task2 {
    public static void main(String[] args) {
        System.out.print("Программа для решения задач. \n");
        System.out.print("Задача №1 создание строки запроса SQL. \n");
        /* Задача №1 Дана строка sql-запроса "select * from students WHERE ". 
        Сформируйте часть WHERE этого запроса, используя StringBuilder. 
        Данные для фильтрации приведены ниже в виде json-строки.
        Если значение null, то параметр не должен попадать в запрос.
        Пример данной строки {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
        Вывод: select * from students WHERE name=Ivanov AND country=Russia AND city=Moscow */
        System.out.print("Задача №2 Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишtn в log.txt . \n");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер задачи №:");
        int key = in.nextInt();
        switch (key) {
            case 1:
                String[] array = {
                "Введите фамилию или 'null' если нет данных","name",
                "Введите страну или 'null' если нет данных","country",
                "Введите город или 'null' если нет данных","city",
                "Введите возраст или 'null' если нет данных","age"
                };
                String strsql = "select * from students WHERE "; 
                System.out.println(inInfoInStr(strsql,array));
                break;
            case 2:
                int[] array2 = generateRandomArray(10);
                logSortBubbleArray(array2);
                break;
            default:
                System.out.print("Не введен номер задачи, выход из программы");
                break;
        }
        in.close();
    }
 
    public static String inInfoInStr(String strsql,String[] array){
        Scanner in = new Scanner(System.in);
        String info = "", tmp;
        int i = 0;
        int cutarray = 2;
        for (i = 0; i <= array.length-cutarray;i++){
            System.out.print(array[i]);
            System.out.print(" " + array[i+1] +"=");
            tmp = in.nextLine();
            if (tmp.equals("null") == false) {
                info = info + array[i+1] + "=" + '"'+ tmp + '"' + ((i < array.length-cutarray) ? " AND ": "");
               }
            i++;
        }
        in.close();
        System.out.print("Сформироован SQL запрос:");
    return strsql + info; 
    }   
 
    public static void  logSortBubbleArray(int[] array){
        int[] arr = array;
        int temp;
        for(int i=0; i < arr.length; i++){
            for(int j=1; j < (arr.length-i); j++){
               if(arr[j-1] > arr[j]){
                  temp = arr[j-1];
                  arr[j-1] = arr[j];
                  arr[j] = temp;
               }
            }
            writeArrayToFile(arr);
        }
    }
 
    public static void  writeArrayToFile(int[] array){
        int[] arr = array;
        try(FileWriter writer = new FileWriter("log.txt", true))
        {
          Date date = new Date();
          writer.write(date.toString()+"-> ");
          for (int i = 0; i < arr.length; i++){
            writer.append(Integer.toString(arr[i]));
            writer.append(' ');
          }
          writer.append('\n');
          writer.close(); 
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        } 
    }     
        
    
    public static int[]  generateRandomArray(int nlen){
        int[] arr = new int[nlen];
        Random rnd = new Random();
        for(int i=0; i < nlen; i++){
            arr[i] = rnd.nextInt(10)+1;
        }
    return arr; 
    }
      
}