package HomeWork_5;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskPhoneBook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String,String> db = new HashMap<String,String>();
        
        System.out.println("Добавить в справочник данные? Да(1)/Нет(0)");
        int choice = scan.nextInt();

        while(choice==1){
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Введите ФИО : ");
            String fio = scan2.next();
            System.out.println("Введите телефон : ");
            String tel = scan2.next();
            if (db.containsKey(fio)){
                db.put(fio,db.get(fio) + "; " + tel);
            }else{
                db.put(fio,tel);
            }
            System.out.println("Добавить в справочник данные? Да(1)/Нет(0)");
            choice = scan2.nextInt();
            
        }
        
        scan.close();
        System.out.println(db);
     
    }  
    
    
}
