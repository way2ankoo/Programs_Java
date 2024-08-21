package Companies;

public class ReverseSentence {
    public static void main(String[] args) {
        String str = "Hello how are you?";
        reverseSentence(str);
    }

    private static void reverseSentence(String str) {
        String[] str_Array = str.split(" ");
//        System.out.println(str_Array);
//        for(String s : str_Array){
//            System.out.print(s+" ");
//        }
        int l = 0;
        int r = str_Array.length-1;
//        System.out.println(r);
        while(l < r){
            String temp = str_Array[l];
            str_Array[l] = str_Array[r];
            str_Array[r] = temp;
            l++;
            r--;
        }

        String result = String.join(" ", str_Array);
        System.out.println(result);

//        for(String s : str_Array){
//            System.out.print(s+" ");
//        }

    }
}
