package day_19_LoopPractices;

public class UniqueCharacter {

    public static void main(String[] args) {
        String str = "aabccdeef";
        String result = ""; //bdf


        for (int j = 0; j < str.length(); j++) {

            char ch =str.charAt(j);
            int count = 0; // represent the frequency of the ch

            for (int i = 0; i < str.length(); i++){ // compares the character that outer loop picked
                char each = str.charAt(i); // each character of str
                if (ch == each){
                    count++;
                    
        }
            }

            if (count > 1){
                continue;

            }

            result += ch;
        }

        System.out.println(result);

    }
}
