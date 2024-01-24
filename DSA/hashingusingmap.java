import java.util.*;
public class hashingusingmap{
public static void charcount(String arr){
    HashMap<Character,Integer> hm= new HashMap<>();
    char[] strArray = arr.toCharArray();
    for(char c:strArray){
        if(hm.containsKey(c)){
            hm.put(c,hm.get(c)+1);
        }
        else {
            hm.put(c,1);
        }}
for(Map.Entry<Character,Integer> entry: hm.entrySet()){
    System.out.println("The occurency of "+entry.getKey()+" is "+entry.getValue());
}
    }
public static void main(String args[]){
    charcount("connectwithdeep");
}}