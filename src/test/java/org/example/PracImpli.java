package org.example;

import com.google.common.base.Supplier;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;

import static com.google.common.math.IntMath.*;

public class PracImpli implements IFPracticeJava {
public static int staticKeywordNum = 12345;
public final int finalKeywordNum = 54321;

    // from GIT

    @Override
    public void reverseANumber() {
        int req = 123456789;
        String temp="";
        String reqString = String.valueOf(req);
        System.out.println(reqString.length());

        for (int i = reqString.length()-1; i >=0; i--) {
            temp +=reqString.charAt(i);
        }
        System.out.println(temp);


    }

    @Override
    public void convertNumber2Word() {
        int a = 1234;
        String aString = String.valueOf(a);
        System.out.println(aString.charAt(2));

    }
    

    @Override
    public void nextNumChar() {
        String req1 = "354124";
        String req = "b2c1";
        int reqNum = Character.getNumericValue(req.charAt(1));
        int reqNum2 = Character.getNumericValue(req.charAt(3));
        int reqNum3 = Integer.parseInt(req1);
        System.out.println(reqNum3);
        System.out.println(reqNum);

        for (int i = 0; i < reqNum; i++) {
            System.out.println(req.charAt(0));
        }

        for (int i = 0; i < reqNum2; i++) {
            System.out.println(req.charAt(2));
        }

    }


    public static void staticPractice() {
        String a = "789";
        staticKeywordNum = Integer.parseInt((a));
        System.out.println(staticKeywordNum);
        //finalKeywordNum = Integer.parseInt(a);
        //System.out.println(finalKeywordNum);

    }


    public void automorphicNumber() {
        for (int i = 100; i < 1000; i++) {
            int mul = i*i;
            String mulString = String.valueOf(mul);
            String mulLastTwo = mulString.substring(mulString.length()-3);
            int mulLastTwoInt = Integer.parseInt(mulLastTwo);
            if (mulLastTwoInt==i){
                System.out.print(i+", ");
            }
        }

    }

    @Override
    public void reverseNumAgain() {
        String size = Integer.toString(staticKeywordNum);
        int reverseNum=0;
        for (int i = 0; i <size.length() ; i++) {
            reverseNum +=staticKeywordNum%10;
            staticKeywordNum = staticKeywordNum/10;

        }System.out.println(reverseNum);
    }

    public void peterSonNumber(){
        staticKeywordNum=111;final int num = staticKeywordNum;
        int temp=staticKeywordNum,sum=0;
        while (staticKeywordNum!=0){
        temp = staticKeywordNum%10;
        //System.out.println("temp "+temp);
        sum += factorial(temp);
        staticKeywordNum = staticKeywordNum/10;


        }System.out.println(sum);
        if (sum==num)
            System.out.println(num+" is Peterson Number");
        else
            System.out.println(num+ " is not Peterson Number");
    }

    @Override
    public void existingMathFunctions() {
        System.out.println(checkedSubtract(10,12));
        System.out.println(checkedPow(10,finalKeywordNum));
        System.out.println(finalKeywordNum);
    }

    @Override
    public void sunnyNumberRange() {
        int req = 49;
        int sqrtValue =0;

        for (int i = 1; i < 1000; i++) {
            for (int j = 1; j < 1000; j++) {
                if (i==(j*j)){
                    //System.out.println(j+" is the sqrt of "+i);
                    System.out.print(i-1+", ");
                }
            }
        }
    }
    public void sunnyNumberInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to verify if it is Sunny Number");
        int req = Integer.parseInt(scanner.nextLine());

    boolean isSunny=false;
    for (int i= 0; i < req; i++) {
            if(req==((i*i)-1)) {
                System.out.println(req+" is Sunny Number");
                isSunny = true;
                break;
            }
        }
    if(!isSunny)
        System.out.println((req+" is not Sunny Number"));


    }

    public void stringLiteralObject(){
        String s1 = "green";
        String s2 = "green";
        String s1Obj = new String("Yellow");
        String s2Obj = new String("Yellow");

        System.out.println(s1==s2);
        s1= "changedGreen";
        System.out.println(s1==s2);
        System.out.println(s1Obj==s2Obj);
        System.out.println(s1Obj.equals(s2Obj));
    }

    public void techNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number for verify it is a TechNum");
        String req = scanner.nextLine();
        if (req.length()%2!=0)
            System.out.println(req+" is not a TechNumber");

        else
        {
            int reqHalf = req.length()/2;
            int reqSubstringFirst = Integer.parseInt(req.substring(0,reqHalf));
            System.out.println(reqSubstringFirst);
            int reqSubstringLast = Integer.parseInt(req.substring(reqHalf));
            System.out.println(reqSubstringLast);
            int reqTotal = reqSubstringFirst+reqSubstringLast;
            if ((reqTotal*reqTotal)==Integer.parseInt(req))
                System.out.println(req+" is a TechNumber");
            else System.out.println(req+ " is not a TechNumber");
        }
    }

    public void facinatingNumber(){
        boolean conCatResult = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to findout if it is a Facinating Number");
        int req = Integer.parseInt(scanner.nextLine());
        String req2 = String.valueOf(req*2);
        String req3  = String.valueOf(req*3);
        int conCat = Integer.parseInt(String.valueOf(req)+req2+req3);
        String conCatString = String.valueOf(conCat);
        System.out.println(conCat+" is the Concatenated Number");

        for (int i = 0; i <conCatString.length() ; i++) {
            if (conCatString.contains(String.valueOf(i)))
                conCatResult = true;
            else
                conCatResult = false;
        }
        System.out.println(conCatResult);
    }

    public void containsValidation(){
        Boolean result;
        String sample = "Hello, World12";
        if (sample.contains("[0-9]"))
            System.out.println(true);
        else System.out.println(false);


    }

    public void copyArrayInterger(){
        int[] req = new int[]{1, 3, 4, 5, 6};
        int [] req1= {1, 3, 4, 5, 6};
        String[]req2 = {"2", "apple", "green"};

        int[] result = new int[req.length];
        int i;
        //System.out.println(req.length);

        for (i = 0; i<req.length; i++) {
            result[i]=req[i];
        }
        /*for (i = 0; i< req.length; i++) {
            System.out.print(result[i]);

        }*/
        for(int reql:req)
            System.out.print(reql);
    }

    public void IntArraySort(){
        int [] req = {435,23,798,324,7,0,34,769,2};
        for (int i = 0; i < req.length; i++) {
            for (int j = i+1; j < req.length; j++) {
                if(req[j]<req[i]){
                    int temp = req[i];
                    req[i]=req[j];
                    req[j]=temp;
                }

            }

        }
        for (int reql:req){
            System.out.print(reql+", ");
        }

    }

}





