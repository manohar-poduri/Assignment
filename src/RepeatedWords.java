import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class RepeatedWords {

    public static void main(String[] args) throws Exception {
        String line, word = "";
        int count = 0, maxCount = 0;
        ArrayList<String> words = new ArrayList<String>();

        FileReader fileReader = new FileReader("word.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while ((line = bufferedReader.readLine()) != null){

            String string[] = line.toLowerCase().split("");

            for (String s : string) {
                 words.add(s);
            }

        }

        for (int i = 0; i<words.size(); i++){
            count = 1;

            for (int j = 0; j<words.size();j++) {
                if (words.get(i).equals(words.get(j))){
                    count++;
                }
            }

            if (count>maxCount){
                maxCount=count;
                word=words.get(i);

            }
        }

        System.out.println("Most Repeated Word: " + word);
        bufferedReader.close();
    }
}
