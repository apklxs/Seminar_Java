import java.util.Scanner;

public class task1 {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Программа для решения задач. \n");
        System.out.print("Задача №1 находит треугольное число для числа введенного пользователем. \n");
        System.out.print("Задача №2 находит произведенрие чисел от 1 до  числа N  введенного пользователем. \n");
        System.out.print("Задача №3 реализует калькулятор с операциями  '+' '-' '*' '/', пользователь вводит числа и операцию. \n \n");
        System.out.print("Введите номер задачи №:");
        
        int key = in.nextInt();
        int num;
        
        switch (key) {
            case 1:
                System.out.print("Введите целое число: ");
                num = in.nextInt();
                System.out.printf("Треугольное число для числа %d = %d \n",num, TriangleNumber(num));
                break;
            case 2:
                System.out.print("Введите целое число: ");
                num = in.nextInt();
                System.out.printf("Произведение чисел от 1 до %d = %d \n",num, MultiplicationNumber(num));
                break;
            case 3:
                System.out.print("Введите первое число: ");
                float a = in.nextFloat();
                System.out.print("Введите математическую операцию '+' '-' '*' '/': ");
                String s = in.next();
                System.out.print("Введите второе число: ");
                float b = in.nextFloat();
                Calculation(a,b,s);
                break;       
            default:
                System.out.print("Не введен номер задачи, выход из программы");
                break;
        }
        in.close();
    }
    
    public static int TriangleNumber (int n) {
        int i,k = 0 ;
        for (i = 1; i <= n; i++){
            k = k + i;
        } 
        return k;
    }
 
    public static int MultiplicationNumber (int n) {
        int i,k = 1 ;
        for (i = 1; i <= n; i++){
            k = k*i;
        } 
        return k;
     
    }
 
    public static int QuantDevisorNumber (int n) {
        int i,count = 0 ;
        for (i = 1; i <= n; i++){
             if (n % i == 0){
                count++;
             }
        } 
        return count;
     
    }
 
    public static void PrimeNumber(){
        int i;
        System.out.print("Простые числа от 1 до 1000 \n");  
        for (i = 1; i <= 1000; i++){
            if (QuantDevisorNumber(i) <= 2){
                System.out.printf("%d, ", i);   
            }
        }
        System.out.print("\n"); 
             
    }
 
    public static void Calculation (float a, float b, String s) {
        char ch = s.charAt(0);
        if (ch == '+'){
            System.out.printf("%s + %s = %s", FrmtNum(a), FrmtNum(b), FrmtNum(a+b));
        } 
        if (ch == '-'){
            System.out.printf("%s - %s = %s",  FrmtNum(a), FrmtNum(b), FrmtNum(a-b));  
        }
        if (ch == '/'){
            System.out.printf("%s / %s = %s",  FrmtNum(a), FrmtNum(b), FrmtNum(a/b)); 
        }
        if (ch == '*'){
            System.out.printf("%s * %s = %s",  FrmtNum(a), FrmtNum(b), FrmtNum(a*b)); 
        } 
        
    }
         
    public static String FrmtNum(float d){
        if(d == (long) d){
            return String.format("%d",(long)d);
        }
        else {
            return String.format("%s",d);
        }
    }    
 
}