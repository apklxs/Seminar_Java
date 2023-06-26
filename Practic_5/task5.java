import java.util.*;
import java.util.Arrays;
 
 
public class task5 {
    public static void main(String[] args) {
 
        Map<String, ArrayList<Integer>> db = inputUserInDictyonary();
        String[] userAndCountTelefonsUser = mapInArray(db);
        String[] arraySortUsersToTelefons = sortArrayToCountTelefonsUser(userAndCountTelefonsUser);
        System.out.println();
        for (int i = arraySortUsersToTelefons.length-1; i >= 0; i--) {
            String cutElementArray = arraySortUsersToTelefons[i].substring(2);
            System.out.printf(" %s  %s \n",cutElementArray,db.get(cutElementArray));
        }
 
    }
 
public static HashMap<String, ArrayList<Integer>> inputUserInDictyonary() {
    Map<String, ArrayList<Integer>> db = new HashMap<>(); 
    Scanner in = new Scanner(System.in,"Cp866");
    System.out.print("Введите кол-во контактов ");
    int countUser = in.nextInt();
 
    for (int i = 1; i <= countUser; i++) {
        ArrayList<Integer> telefons = new ArrayList<>();
        System.out.print("Введите Фамилию человека ");
        String name = in.next();
        boolean flag = true;
        System.out.println("Введите телефон содержащий только цифры или любой другой символ для завершения ввода номера");
        while (flag) {
            try {
                int telefon = Integer.parseInt(in.next());
                telefons.add(telefon);
            } catch (NumberFormatException ex) {
                flag = false;
                db.put(name, telefons);
            }
        }
        
    }
return (HashMap<String, ArrayList<Integer>>) db;
}
 
public static String[] mapInArray(Map<String, ArrayList<Integer>> db) {
 
    
    String [] userAndCountTelefonsUser = new String[db.size()];
    int i = 0;
    for (Map.Entry<String, ArrayList<Integer>> entry : db.entrySet()) {
        String name = entry.getKey();
        int countTelefonsUser = entry.getValue().size();
        userAndCountTelefonsUser[i] = countTelefonsUser + " " + name;
        i++;
    }
    return userAndCountTelefonsUser;
}
 
public static String[] sortArrayToCountTelefonsUser (String[] arrayUsersTelefons) {
   
    for (int i = 1; i < arrayUsersTelefons.length; i++) {
        int current = Integer.parseInt(arrayUsersTelefons[i].substring(0,1));
        String currentString = arrayUsersTelefons[i];
        int j = i - 1;
        while(j >= 0 && current < Integer.parseInt(arrayUsersTelefons[j].substring(0,1))) {
            arrayUsersTelefons[j+1] = arrayUsersTelefons[j];
            j--;
        }
        arrayUsersTelefons[j+1] = currentString;
    }
  
    return arrayUsersTelefons;
}
 
}