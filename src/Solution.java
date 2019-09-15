import java.util.*;

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        String[] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> output = new HashSet<>();
        for(String s: words){
            String word = "";
            for(int i=0; i<s.length(); i++){
                int index = alphabets.indexOf(s.substring(i, i+1));
                word = word+codes[index];
            }
            output.add(word);
        }
        return output.size();
        
    }
}