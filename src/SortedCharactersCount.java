import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class SortedCharactersCount {

    //Input: prateek and output:a1e2k1p1r1t1
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
            getResult(line);
        }


    }

    public static String getResult(String input){
        String result="";
        if(input!=null) {
            if (!input.isEmpty()) {
                char ch[] = input.toCharArray();
                Map<Character, Integer> characterMap = new TreeMap<Character, Integer>();
                for (int i = 0; i < ch.length; i++) {
                    if (characterMap.containsKey(ch[i])) {
                        int c = characterMap.get(ch[i]);
                        c++;
                        characterMap.put(ch[i], c);
                    } else
                        characterMap.put(ch[i], 1);

                }

                for (char k : characterMap.keySet()) {
                    result += (k + characterMap.get(k).toString());
                }


            }
        }

        return result;
    }


}
