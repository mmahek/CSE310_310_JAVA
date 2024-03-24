import java.util.*;
public class AC01{
    public static void main(String args[]){
        // country (key), population(int)
        HashMap<String, Integer> countryInfo = new HashMap<>();


        //Insertion Operation
        countryInfo.put("India", 120);
        countryInfo.put("China", 150);
        countryInfo.put("Equador", 45);
        // System.out.println(countryInfo);

        // countryInfo.put("China", 180);
        // // If a key is already present in HashMap, and again it is mentioned then the value gets updated else it created new pair
        // /*
        //                 >exists -> update value
        //  mapName.put() /
        //                 >doesNot exists -> new pair is inserted 
        // */
        // System.out.println(countryInfo);

        // // Search operation or Look up operation
        //  if(countryInfo.containsKey("georgia")){
        //         System.out.println("key Present in the map");
        //  } else{
        //     System.out.println("key is not present in map");
        //  }

        //  // Print - values corresponding to keys
        //  System.out.println(countryInfo.get("China"));//key exists
        //  System.out.println(countryInfo.get("Indodnesia"));//key doesn't exist - null

        //  // .containsKey() - gives true or false
        //  // .get() - fetches the key otherwise gets null

        //  //ITERATION
        //  // for(dataType i = 0; i < 5 ; i++){} /* i is iterator */  
        //  // for(dataType val : collection){} here val gets the element directly instead of index

        //  //for(Map.Entry<Integer, Integer> e:Map.entrySet())
        //  for(Map.Entry<String, Integer> e : countryInfo.entrySet()){ // e stores the pair together
            
        //     System.out.print(e.getKey() + " ");
        //     System.out.println(e.getValue());           
        //  }
        //  Set<String>keys = countryInfo.keySet();// makes set of keys only 
        //  for(String key : keys){
        //     System.out.println(key + " " + countryInfo.get(key));
        //  }
         
        //Delete pair

        System.out.println(countryInfo);
    }
}