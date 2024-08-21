package Companies;

public class RepeatedWordsPublicis {
    public static void main(String args[]){
        String s = "ABBCCCDDAA";
        printWordsLettersAndFreq(s);

    }

    private static void printWordsLettersAndFreq(String s) {
        int n = s.length();
        int count = 1;
        for(int i = 0; i<n-1; i++){
            if(s.charAt(i) != s.charAt(i+1)){
                System.out.print(s.charAt(i));
                System.out.print(count);
                count = 1;
            }else{
                System.out.print(s.charAt(i));
                count++;
            }
        }

        System.out.println(s.charAt(n-1)+""+count);
    }

}
