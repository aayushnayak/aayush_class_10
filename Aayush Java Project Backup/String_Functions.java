public class String_Functions {
    public static void main(String[]args){
        String word1="Rock";
        String word2="star";
        String word3="MALAYALAM";
        String u=word1.toUpperCase();
        String l=word3.toLowerCase();
        String r=word3.replace('A','*');
        int length=word1.length();
        int last=word3.lastIndexOf('A');
        char c=word1.charAt(0);
        int i= word2.indexOf("t");
        String con=word1.concat(word2);
        boolean cont=con.contains("star");
        boolean end=con.endsWith("r");
        String sub=word1.substring(2);
        System.out.println("Upper Case = "+ u);
        System.out.println("Lower Case = "+ l);
        System.out.println("Replace = " +r);
        System.out.println("Last Index of A  ="+ last);
        System.out.println("LENGTH =  "+ length);
        System.out.println("c= "+ c);
        System.out.println("i= "+ i);
        System.out.println("con= "+con);
        System.out.println("cont= "+cont);
        System.out.println("end= "+ end);
        System.out.println("sub= "+ sub);

    }
}
