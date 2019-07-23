import java.util.HashMap;
import java.util.Set;

public class DuplicateCharacters {

    static void DuplicateCharactersInStrings(String inputString){

        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

        char[] strArray = inputString.toCharArray();

        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c)+1);
            } else {
                charCountMap.put(c, 1);
            }
        }
        Set<Character> characterSet = charCountMap.keySet();
        System.out.println("Duplicate Characters In " +inputString);


        for (Character ch : characterSet) {
            if (charCountMap.get(ch) > 1) {
                System.out.println(ch + " :" + charCountMap.get(ch));
            }
        }

    }

    public static void main(String[] args) {
        DuplicateCharactersInStrings("Better Butter");
    }


}
