
package setdemo;
import java.util.*;

public class Setdemo {

    
    public static void main(String[] args) {
        HashSet hashSet =new HashSet();
        hashSet.add("j");
        hashSet.add("k");
        hashSet.add("j");
        hashSet.add("h");
        System.out.println(hashSet);
        
    
    HashSet hashSet2 = new HashSet();
        hashSet2.add("j");
        hashSet2.add("k");
        
      
   hashSet.retainAll(hashSet2);
   System.out.println(hashSet);
       
        
}
}
