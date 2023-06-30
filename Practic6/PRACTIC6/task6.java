package PRACTIC6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class task6 {
    public static void main(String[] args) {
        List<Notebook> notebooks = new ArrayList<>();
        notebooks.add(new Notebook("Acer", 4, 128, "Windows", "Black", 15));
        notebooks.add(new Notebook("Acer", 6, 128, "Linux", "Black", 16));
        notebooks.add(new Notebook("HP", 8, 256, "Windows", "White", 14));
        notebooks.add(new Notebook("HP", 16, 512, "Linux", "Black", 17));
        notebooks.add(new Notebook("Lenovo", 4, 128, "Linux", "White", 12));
        notebooks.add(new Notebook("Lenovo", 16, 256, "Windows", "Black", 14));
        notebooks.add(new Notebook("Asus", 4, 256, "Linux", "White", 15));
        notebooks.add(new Notebook("Asus", 6, 256, "Windows", "Black", 10));
        notebooks.add(new Notebook("Apple", 8, 256, "MacOs", "White", 16));
        notebooks.add(new Notebook("Apple", 16, 128, "MacOs", "Black", 12));
        notebooks.add(new Notebook("Hiper", 6, 512, "Windows", "Black", 15));
        notebooks.add(new Notebook("Hiper", 8, 128, "Linux", "White", 16));
                
        System.out.println("На складе представлены ноутбуки");
        for (Notebook notebook : notebooks) {
            System.out.println(notebook);  
        } 
        
        for (int j = 0; j < inputParametrs().length; j++) {
            System.out.println();
            System.out.print(inputParametrs()[j]);
            Scanner in = new Scanner(System.in);
            String parametr = in.nextLine();
            System.out.println();
                       
            for (int i = 0; i < notebooks.size(); i++) {
                if (notebooks.get(i).getParametrs()[j+1].equals(parametr)==true){
                    System.out.printf("найден ноутбук %s \n",notebooks.get(i));
                }
            }
            
                    
        }  
      
     
    }

    public static String[] inputParametrs() {
    String[] inputParametrs = new String[5];
    inputParametrs[0] = "Введите объем оперативной памяти в гигабайтах 4, 6, 8, 16. Объем равен =  ";
    inputParametrs[1] = "Введите объем жесткого диска в гигабайтах 128, 256, 512. Объем равен =  ";
    inputParametrs[2] = "Введите операционную систему 'Windows' 'Linux' 'MacOs' ";
    inputParametrs[3] = "Введите цвет 'White 'Black' ";
    inputParametrs[4] = "Введите размер диагонали в дюймах 12, 14, 15, 16. Диагональ = ";
    return inputParametrs;
}

}

