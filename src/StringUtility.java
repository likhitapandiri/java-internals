public class StringUtility {

    //constructor
    public StringUtility() {
        System.out.println("StringUtility object created");
    }

    public String reverse(String s){
        //String does not have a reverse() method becoz of its immutability
        //Stringbuilder does
        return new StringBuilder(s).reverse().toString();
    }

    public boolean checkPalindrome(String s){
        return s.equals(reverse(s));
    }

    public int countVowels(String s){
        int count=0;
        //Java strings cannot be indexed using [].
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }

    //Remove spaces
    public String removeSpacesEnd(String s){
        return s.trim();
    }

    public String removeSpaces(String s){
        return s.replace(" ","");
    }

    public String compressCharacters(String s){
        //Use StringBuilder wherever repeated concatenation is involved.
        StringBuilder sb = new StringBuilder();
        int i=0;
        int j=i;
        int count=0;
        while(i<s.length()){
            if(s.charAt(i)==s.charAt(j)){
                count++;
                i++;
            }else{
                sb.append(s.charAt(j));
                sb.append(count);
                j=i;
                count=0;
            }
        }
        sb.append(s.charAt(j));
        sb.append(count);
        return sb.toString();
    }


}