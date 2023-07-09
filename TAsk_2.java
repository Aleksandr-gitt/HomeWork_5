/*
 *  Реализовать программу ,которая выведет список сотрудников с кол-ом их повторений(по убыванию)
 */

package HomeWork_5;
import java.util.HashMap;
import java.util.Map;
public class TAsk_2 {
    public static void main(String[] args) {
        String listmen = "Ваня, Петя, Миша, Саша, Ирина, Ольга, Даша, Петя, Ирина, Ольга, Ваня, Петя, Миша, Саша, Ирина, Ольга";
        String[] list = listmen.split(", ");
        System.out.println(listmen);
        Map<String,Integer> countmen = new HashMap<String,Integer>();
        for(String el:list){
            
            if (countmen.containsKey(el)){
                countmen.put(el,countmen.get(el)+1);
            }else{
                countmen.put(el,1);
            }


        }

        System.out.println(countmen);
    }
    
}
