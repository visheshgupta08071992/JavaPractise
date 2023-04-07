package JavaConceptOfTheDay;

import org.testng.annotations.Test;

import java.util.*;

public class Practise {

    @Test
    public void problem1(){
      int no =-10101;
      while(no>0){
          int n=no%10;
          if(n!=0 && n!=1){
              System.out.println("Not a Binary");
              return;
          }
          no=no/10;
      }
        System.out.println("No is Binary");
    }

    @Test
    public void findLeaders(){
        int [] arr={14, 16, 11, 7, 2, 15, 3};
        List<Integer> list = new ArrayList<>();
        list.add(arr[arr.length-1]);
        int max= arr[arr.length -1];
        for(int i=arr.length - 2;i>=0;i--){
            if(arr[i]>max){
                list.add(arr[i]);
                max=arr[i];
            }
        }
        System.out.println(list);
    }

    @Test
    public void intersection(){
        String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};

        String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};

//        set1 1 2 3 4 5
//        set2 3 4 5 6 7
    }

    @Test
    public void reverseStringWithPreservingSpace() {
        String input = "I Am Not String";
        //g ni rtS toNmAI
        List<Integer> spaceIndex = new ArrayList<>();

        for(int i=0;i<input.length();i++){
            if(input.charAt(i)==' '){
                spaceIndex.add(i);
            }
        }
        StringBuilder reverseString = new StringBuilder(input.replace(" ","")).reverse();

        for(int i:spaceIndex){
            reverseString.insert(i,' ');
        }
        System.out.println(reverseString.toString());

    }

    @Test
    public void reverseStringWithPreservingSpace1() {
        String input = "I Am Not String";
        //g ni rtS toNmAI

        char [] reverse= new char[input.length()];

        for(int i=0;i<input.length();i++){
            if(input.charAt(i)==' '){
                reverse[i]=' ';
            }
        }

        System.out.println(Arrays.toString(reverse));
        int j=0;
        for(int i=input.length()-1;i>=0;i--){

          if(input.charAt(i)!=' '){
              if(reverse[j]!=' '){
                  reverse[j]=input.charAt(i);
                  j++;
              }

              j++;

          }

        }
        System.out.println(Arrays.toString(reverse));

    }

    @Test
    public void separate(){
        //Input:abcdeig
//Output:aeibcdg

        String s="abcdeig";
        char [] sArray=s.toCharArray();

        int i=0;
        int j=s.length() -1;
        while(i<j){
            if(isVowel(sArray[i]) && !isVowel(sArray[j])){
                i++;
                j--;
            }
            else if(!isVowel(sArray[i]) && isVowel(sArray[j])){
                char c =sArray[i];
                sArray[i]=sArray[j];
                sArray[j]=c;
                i++;
                j--;
            }
            else if(isVowel(sArray[i]) && isVowel(sArray[j])){
                i++;
            }
            else{
                j--;
            }

        }
        System.out.println(String.valueOf(sArray));
    }

    public boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            return true;
        }
        return false;
    }












    @Test
    public void print(){
        //Print String in below format
/*Selenium
Seleniu
Seleni
Selen
Sele
Sel
Se
s*/

        String s ="Selenium";
        for(int i=s.length();i>=0;i--){
            s=s.substring(0,i);
            System.out.println(s);
        }
    }

    //@Test
   /* public void reverseString(){
        String sb = "abc";
        String reverse=reverse(sb);
    }
    public String reverse(String s){
        if(s.length() ==1){
            return s;
        }
      //  return s.charAt(s.length() -1) + reverse(s.substring());
    }*/

    @Test
    public void seprateZerosAtLast() {
        int[] arr = {14, 0, 5, 2, 0, 3, 0};
        int [] result= new int[arr.length];
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                result[count]=arr[i];
                count++;
            }
        }
        while(count<arr.length){
            arr[count]=0;
            count++;
        }
        System.out.println(Arrays.toString(result));




    }

    @Test
    public void seprateZerosAtFirst1() {
        int[] arr = {14, 0, 5, 2, 0, 3, 0};

        int i=0;
        int j=arr.length -1;
        while(i<j){
            if(arr[i]!=0 && arr[j]==0){
                int temp= arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            else if(arr[i]==0 && arr[j]!=0){
                i++;
                j--;
            }
            else if(arr[i]==0 && arr[j]!=0){
                i++;
            }
            else{
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void seprateZerosAtFirst() {
        int[] arr = {14, 0, 5, 2, 0, 3, 0};
        int[] result = new int[arr.length];
        int count=arr.length-1;

        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]!=0){
                result[count]=arr[i];
                count--;
            }
        }
        while(count>=0){
            arr[count]=0;
            count--;
        }
        System.out.println(Arrays.toString(result));


    }

    @Test
    public void TestRegex(){
        String s="A man, a plan, a canal: Panam";
        s=s.toLowerCase().replaceAll("[^a-z0-9]","");
        System.out.println(s);
    }

    @Test
    public void checkOptional(){

        Optional<String> x = optionalString();
        if(x != null && x.isPresent()){
            System.out.println(optionalString().get());
        }
        else{
            System.out.println("String is null");
        }
    }

    public Optional<String> optionalString(){
        String a=null;
        Optional<String> aOptional= Optional.ofNullable(a);
        return Optional.ofNullable(a);
    }





}

