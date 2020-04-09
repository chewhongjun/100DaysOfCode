import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class groupAnagrams{

    public static List<List<String>> anagrams(String[] args) {
        List<List<String>> groupedAnagrams = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String cur: args){
            char[] character = cur.toCharArray();
            Arrays.sort(character);
            String sorted = new String(character);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(cur);
        }
        
        groupedAnagrams.addAll(map.values());
        return groupedAnagrams;
    
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> ss = new ArrayList<>();
        ss = anagrams(strs);
        System.out.println(ss);
        
    }


}