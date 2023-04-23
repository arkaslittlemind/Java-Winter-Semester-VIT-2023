public class PigLatin {
    static boolean isVowel(char ch) {
        return (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o'
                || ch == 'U' || ch == 'u');
    }

    
    static String pigLatinWord(String string) {
        
        int stringlength = string.length();
        int index = -1;
        for (int i = 0; i < stringlength; i++) {
            if (isVowel(string.charAt(i))) {
                index = i;
                break;
            }
        }
        
        if (index == -1)
            return "-1";
        
        return string.substring(index) + string.substring(0, index) + "ay";
    }

    
    public static void main(String args[]) {
        String plstring1 = pigLatinWord("butter"); 
        String plstring2 = pigLatinWord("apple"); 
        String plstring3 = pigLatinWord("me"); 
        String plstring4 = pigLatinWord("child"); 
        String plstring5 = pigLatinWord("egg"); 
        String plstring6 = pigLatinWord("store"); 
        String plstring7 = pigLatinWord("eunoia"); 
        String plstring8 = pigLatinWord("nymphly"); 
        if (plstring1 == "-1")
            System.out.println("Pig Latin is not possible, the string must have at least a vowel.");
        else
        System.out.println(plstring1);
        System.out.println(plstring2);
        System.out.println(plstring3);
        System.out.println(plstring4);
        System.out.println(plstring5);
        System.out.println(plstring6);
        System.out.println(plstring7);
        System.out.println(plstring8);
    }
}