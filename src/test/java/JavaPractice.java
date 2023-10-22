import org.example.PracImpli;

import java.util.Scanner;

public class JavaPractice  {
    public static void main(String[] args) {


        /*StringReverse();
        Fibonacci();
        PrimeNum();
        Factorial();

        Palindrome();
        StarPattern();
        NumberPattern();
        ReverseNumber();
        CopyArray();
        ReplaceChar();
        StringSplit();
        FindDuplicateString();
        FindDuplicateInterger();
        LargestNuminArray();
        SortingArrayInterger();
        //STRING
        TotalCharinString();
        CollectionTest();*/
        PracImpli interFace = new PracImpli();
        /*interFace.reverseANumber();
        interFace.convertNumber2Word();
        interFace.nextNumChar();
        staticPractice();
        interFace.staticKeywordNum = 123;
        interFace.automorphicNumber();
        interFace.reverseNumAgain();
        interFace.peterSonNumber();
        interFace.existingMathFunctions();
        interFace.sunnyNumberRange();
        interFace.sunnyNumberInput();
        interFace.stringLiteralObject();
        interFace.techNumber();
        interFace.facinatingNumber();*/
        interFace.containsValidation();









            /*String a = "Testing";
            String b = new String("Testing");
            if(b == a){
                System.out.println("true");
            }else{
                System.out.println("false");
            }

            if(a.equals(b)){
                System.out.println("true");
            }else{
                System.out.println("false");
            }*/

    }

    private static void CollectionTest() {}



    private static void  TotalCharinString() {
        String word = "green scarf";
        int i=0;
        for (i = 0; i <word.length() ; i++) {

        }System.out.println(i);
    }


    private static void SortingArrayInterger() {
        int[]num={1,2,2,4,8,453,6,33,44,44};
        int[] sortNum = new int[num.length]; int k=0;
        for (int i = 0; i <num.length-1; i++) {
            for (int j = i+1; j <num.length-1; j++) {
                if(i!=j){
                    if ((num[i]>num[j]) && (k<num.length)){
                        sortNum[k]=num[i];
                        k++;
                    }
                }

            }

        }System.out.println(sortNum);
    }

    private static void LargestNuminArray() {
        int[]num={1,2,2,4,8,453,6,33,44,44};int hightest=0;
        for(int i=0;i<= num.length-1;i++){
            for (int j = 0; j <= num.length-1 ; j++) {
                if(i!=j){
                    if (num[i]<num[j]){
                        hightest = num[j];
                    }
                }

            }
        }System.out.println(hightest);
    }

    private static void FindDuplicateInterger() {
        int[]num={1,2,2,4,8,4,6,33,44,44};
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j <num.length ; j++) {
                if(i!=j){
                    if (num[i]==num[j]){
                        System.out.println(num[j]);
                    }

                }

            }

        }
    }

    private static void FindDuplicateString() {
        String word = "Amber Heard";
        //System.out.println(word.charAt(2));
        for (int i = 0; i <word.length() ; i++) {
            for (int j = 0; j <word.length() ; j++) {
                if (i!=j) {
                    if (word.charAt(i) == word.charAt(j)) {
                        System.out.println(word.charAt(j));
                    }
                }

            }
        }
    }

    private static void StringSplit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sentence= scanner.nextLine();
        String[] splitString = sentence.split(" ");
        int i=0;
        for (String loop:splitString) {
            System.out.println(splitString[i]);
            i++;
        }
    }

    private static void ReplaceChar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        for (int i=0;i<=name.length()-1;i++){
            char c = name.charAt(i);
            if(c=='a'|| c=='A'){
                name = name.replace(c,'x');
            }
        }
       System.out.println("Replace word is "+name);
    }



    private static void CopyArray() {
        int []x = {1,2,3,4,5,6,7};
        int[]y = new int[7];
        String[]name = {"Red", "Green", "Blue"};
        String[]replace = new String[name.length];


        System.out.println(x.length);
       for(int i=0;i<=x.length-1;i++)
        {
            y[i]=x[i];
            System.out.print(y[i]);
        }
       int i=0;
       System.out.println();
       //for (String namel:name){
        for(i=0;i<= (name.length-1);i++){
           replace[i]=name[i];
           System.out.print(replace[i]+" ");

       }


    }

    private static void NumberPattern() {
        {
            int i, j,number=1, row=7;
            for(i=0; i<row; i++)
            {
                //number=1;
                for(j=0; j<=i; j++)
                {
                    System.out.print(number+ " ");
                    number++;
                }
                System.out.println();
            }
        }
    }

    private static void StarPattern() {
        int row=5;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void Factorial() {
        int fact=1,num=10,i=1;
        for (;i<=num;i++)
            fact=fact*i;
        System.out.println("Factornial of "+num+" is "+fact);
            
    }

    private static void ReverseNumber() {
        int number = 100;
        int reversedNumber = 0;

        while (number > 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number = number / 10;
        }

        System.out.println("The reversed number is: " + reversedNumber);
    }



    private static void StringReverse() {
        String st = "MoonLander";
        StringBuilder rev = new StringBuilder();
        //String rev="";
        for (int i = st.length() - 1; i >= 0; i--) {
            rev.append(st.charAt(i));
        }
        System.out.println(rev);
    }

    private static void Fibonacci() {
        int n1=0;int n2=1;int n3=0;
        int FibNum=100;
        System.out.print("Fibonacci: "+n1+", "+n2+", ");
        for (int i=0;i<=FibNum;i++){
            n3 = n1 + n2;
            System.out.print(n3+", ");
            n1 = n2;
            n2 = n2 + 1;
        }
        System.out.println("");
    }

    private static void PrimeNumber() {
        int n1,n2,i,j=0,TotalNum=100;
        System.out.print("Prime Numbers: ");
        for (i=0;i<=TotalNum;i++) {
            if (i % 2 != 0)
                if (i % 3 != 0)
                    System.out.print(i+", ");

        }
        System.out.println("");
    }

    private static void Palindrome() {
        String word = "radar", revWord = "";
        int i=(word.length())-1;
        for(;i<=word.length();i--){
                if(i>=0)
                revWord += word.charAt(i);
                else break;
        }
        word = word.toUpperCase();
        revWord=revWord.toUpperCase();
        System.out.println(word+" "+revWord);
        if (revWord==word)
            System.out.println(word+" is Palindrome");
        else
            System.out.println(word+" is not a Palindrome");

        /*String Word = "Malayalam";
        int j=Word.length()-1;
        int len = (Word.length()-1)/2;
        int i=0;

        String UpWord=Word.toUpperCase(Locale.ROOT);
        if (j%2 != 0)
            System.out.println(Word+" is not a palindrome");
        else
        {
            for(i=0; UpWord.charAt(i)==UpWord.charAt(j);i++){
                j--;
                if (len==(i-1))
                    break;
            }if(len==(i-1))
                System.out.println(Word+" is Palindrome");
            else
                System.out.println(Word+" is not a Palindrome");

        }*/
    } 
        
        

}
