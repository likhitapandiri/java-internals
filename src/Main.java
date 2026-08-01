public class Main{

    public static void main(String[] args){

        System.out.println("Hello World ");

        StringUtility s = new StringUtility();
        String st="Hello abcdddeefff";
        System.out.println(s.reverse(st));
        System.out.println(s.checkPalindrome(st));
        System.out.println(s.countVowels(st));
        System.out.println(s.countVowels(st));
        System.out.println(s.removeSpacesEnd(st));
        System.out.println(s.removeSpaces(st));
        System.out.println(s.compressCharacters(st));

    }


}