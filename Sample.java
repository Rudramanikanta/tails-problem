import java.util.*;
class Sample{
    public static void main(String[] args){
        HashMap<Character,Integer> words=new HashMap<>();
        int c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        String str[]=s.split(" ");
        for(String ss:str){
            for(int i=0;i<ss.length();i++){
                char ch=ss.charAt(i);
                 c=0;
                for(String sss:str){
                    //System.out.println(sss);
                    for( int j=0;j<sss.length();j++){
                        char chh=sss.charAt(j);
                        if(ch==chh){
                            c++;
                        }

                    }
                }
                words.put(ch,c);
            }
        }
        System.out.println(words);
    }
}