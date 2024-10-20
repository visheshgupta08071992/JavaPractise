package ArraysAndStrings;

//import com.sun.javafx.collections.MappingChange;
import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;

public class AAPractise {

    @Test
    public void test() {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //Expected 1 5 9 2 6 3
    }

    @Test
    public void test2() {
        // nput:abcdeig
        // Output:aeibcdg

        String s = "abcdeig";

        char [] sArray= s.toCharArray();

        int i=0;
        int j=s.length() - 1;

        while(i<=j){
            //Both are vowel
            if(isVowel(sArray[i]) && isVowel(sArray[j])){
                i++;
            }

            //Both are consonent
            else if(!isVowel(sArray[i]) && !isVowel(sArray[j])){
                j--;
            }

            //First is vowel and last is consonent
            else if(isVowel(sArray[i]) && !isVowel(sArray[j])){
                i++;
                j--;
            }

            //First is consonent and last is vowel
            else if(!isVowel(sArray[i]) && isVowel(sArray[j])){
                char c = sArray[i];
                sArray[i]=sArray[j];
                sArray[j]=c;
                i++;
                j--;
            }
        }
        String result = new String(sArray);
        System.out.println(result);
    }

    @Test
    public void test3(){
        String s = "abcdeig";
        String vowel="";
        String consonent="";

        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                vowel = vowel + s.charAt(i);
            }
            else{
                consonent = consonent + s.charAt(i);
            }
        }
        String result = vowel + consonent;
        System.out.println(result);
    }

    @Test
    public void sumOfTwoArrays(){
        int [] arr1={9,9,9};
        int [] arr2={0,0,1};
        int [] arr3= new int[arr1.length > arr2.length ? arr1.length:arr2.length];

        int i= arr1.length -1;
        int j= arr2.length -1;
        int k= arr3.length -1;
        int carry=0;

        while(k>=0){
            int val1 = i>=0?arr1[i]:0;
            int val2 = j>=0?arr2[j]:0;
            i--;
            j--;
            int sum = val1 + val2 + carry;
            arr3[k] = sum%10;
            k--;
            carry= sum/10;
        }
        List<Integer> result = new ArrayList<>();
        if(carry>0){
            result.add(carry);
        }
        for(int var:arr3){
            result.add(var);
        }
        System.out.println(result);
    }

    @Test
    public void diffOfTwoArrays() {
        int[] arr1 = {1,0, 0, 0};
        int[] arr2 = {0, 0, 1};
        int[] arr3= new int[arr1.length > arr2.length ? arr1.length:arr2.length];
        int i= arr1.length -1;
        int j= arr2.length -1;
        int k= arr3.length -1;
        int carry=0;
        while(k>=0){
            int val1 = i>=0?arr1[i]:0;
            int val2 = j>=0?arr2[j]:0;
            i--;
            j--;
            int diff;
            if(val1 + carry >=val2){
                diff = (val1 + carry) - val2;
            }
            else{
                diff= (val1 + carry + 10) - val2;
                carry=-1;
            }
            arr3[k]=diff;
            k--;
        }
        System.out.println(Arrays.toString(arr3));
    }
    public Boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        }
        return false;

    }

    @Test
    public void nextSmallerOnLeft(){
        int[] arr = {2, 5, 9, 3, 1, 12, 6, 8, 7};
        // Expected - -1 2 5 2 -1 1 1 6 6

        int [] result = new int[arr.length];

        for(int i=arr.length -1;i>0;i--){
            for(int j = i-1;j>=0;j--){
                if(arr[j]<arr[i]){
                    result[i]=arr[j];
                    break;
                }
                if(j==0){
                    result[i]=-1;
                }
            }
        }
        result[0] = -1;
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void nextSmallerOnLeftUsingStack() {
        int[] arr = {2, 5, 9, 3, 1, 12, 6, 8, 7};
        // Expected - -1 2 5 2 -1 1 1 6 6
        int [] result = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<arr.length;i++){
            if(st.isEmpty()){
                result[i]=-1;
                st.push(arr[i]);
            }
            else{
                while(!st.isEmpty() && arr[i] < st.peek()){
                    st.pop();
                }
                if(st.isEmpty()){
                    result[i]=-1;
                    st.push(arr[i]);
                }
                else{
                    result[i]=st.peek();
                    st.push(arr[i]);
                }
            }
        }
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void stockSpan(){
        //  int[] arr = {100, 80, 60, 70, 60, 75, 85};
        // Expected - 1 1 1 2 1 4 6
        int[] arr = {100,130,100,90,120,120,110,130,140};
        // [1, 2, 1, 1, 3, 4, 1, 8, 9]

        Stack<Integer> st = new Stack<>();
        int [] result= new int[arr.length];

        for(int i=0;i<arr.length;i++){
            if(st.isEmpty()){
                result[i]=1;
                st.push(i);
            }
            else{
                while(!st.isEmpty() && arr[i] >=arr[st.peek()]){
                    st.pop();
                }
                if(st.isEmpty()){
                    result[i] = i+1;
                    st.push(i);
                }
                else{
                    result[i] = i - st.peek();
                    st.push(i);
                }
            }
        }
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void differenceOfTwoArray() {
        int[] arr1 = {1,8,2};
        int[] arr2 = {3,0,4};
        int [] result = new int[arr1.length > arr2.length ? arr1.length:arr2.length];
        int i = arr1.length -1;
        int j= arr2.length -1;
        int k=result.length -1;
        int carry=0;

        while(i>=0 || j>=0){
            int val1= i>=0? arr1[i]:0;
            int val2= j>=0? arr2[j]:0;
            i--;
            j--;

            if(val2+carry >= val1){
                result[k] = val2 + carry -val1;
                k--;
            }
            else{
                result[k] = val2 + carry + 10 -val1;
                k--;
                carry=-1;
            }
        }
        System.out.println(Arrays.toString(result));

    }

    @Test
    public void findFirstOccuranceOfRequiredElement() {
        int arr[] = {3, 4, 5, 7, 10, 10, 10, 14};
        //We need to find the first occurance of element 10 i.e 4th index
        int requiredNo = 10;
    }

    @Test
    public void findDistinct(){
        List<Integer> list1 = Arrays.asList(1,1,2,2,3,3,4,4,4,5,5,6,6);
        List<Integer> list2 = list1.stream().distinct().collect(Collectors.toList());
        System.out.println(list2);
        Set<Integer> set = list1.stream().collect(Collectors.toSet());
        System.out.println(set);
    }

    @Test
    public void calc(){
       String s = "32+5/2";
       Stack<Integer> st = new Stack<>();
       char sign = '+';
       int result=0;

       for(int i=0;i<s.length();i++){
           if(Character.isDigit(s.charAt(i))){
               int value=0;
               while(i<s.length() && Character.isDigit(s.charAt(i))){

                   value= value*10 + s.charAt(i) - '0';
                   i++;
               }
               i--;
               if(sign=='+'){
                   st.push(value);
               }
               else if(sign=='-'){
                   st.push(-value);
               }
               else if(sign=='*'){
                   st.push(st.pop()*value);
               }
               else if(sign=='/'){
                   st.push(st.pop()/value);
               }

           }

           else{
               sign = s.charAt(i);
           }
       }
       while(!st.isEmpty()){
           result = result + st.pop();
       }
        System.out.println(result);
    }

    @Test
    public void decode(){
        String s="3[a2[c]]";

        Stack<Integer> numst = new Stack<>();
        Stack<String> st = new Stack<>();
        StringBuilder result = new StringBuilder();

        int val=0;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                while(i< s.length() && Character.isDigit(s.charAt(i))){
                    val = val*10 + (s.charAt(i) - '0');
                    i++;
                }
                i--;
                numst.push(val);
            }
            else if(s.charAt(i)==']'){
                StringBuilder sb = new StringBuilder();
                while(!st.peek().equals("[")){
                    sb.insert(0,st.pop());
                }
                st.pop();
                int no=numst.pop();
                StringBuilder sb1 = new StringBuilder();
                for(int m=1;m<=no;m++){
                    sb1.insert(0,sb);
                }
               st.push(sb1.toString());
            }
            else{
                val=0;
                st.push(String.valueOf(s.charAt(i)));
            }

        }
        while(!st.isEmpty()){
            result.insert(0,st.pop());
        }
        System.out.println(result.toString());

    }

    @Test
    public void FaultyKeyBoardWithHashMap(){
        String name="alex";
        String typed = "aaleex";

        Map<Character,Integer> mapName = new HashMap<>();
        Map<Character,Integer> mapTyped = new HashMap<>();

        for(char c:name.toCharArray()){
            if(mapName.containsKey(c)){
                mapName.put(c,mapName.get(c) + 1);
            }
            else{
                mapName.put(c,1);
            }
        }

        for(char c:typed.toCharArray()){
            if(mapTyped.containsKey(c)){
                mapTyped.put(c,mapTyped.get(c) + 1);
            }
            else{
                mapTyped.put(c,1);
            }
        }

        if(mapName.keySet().size() != mapTyped.keySet().size()){
            System.out.println("false");
            return;
        }
        else{
            for(int key:mapName.keySet()){
                if(!mapTyped.containsKey(key)){
                    System.out.println("false");
                    return;
                }
                else{
                    if(mapTyped.get(key) < mapName.get(key)){
                        System.out.println("false");
                        return;
                    }
                }

            }
        }
        System.out.println("true");
    }

    @Test
    public void test124(){
        char c='4';
        System.out.println(Integer.valueOf('0'));
        System.out.println(Integer.valueOf(c));
    }

    @Test
    public void test134(){
        int [] nums={5,0,3,8,6};
        int [] rightMin = new int[nums.length+1];
        rightMin[nums.length-1] = Integer.MAX_VALUE;

        for(int i=rightMin.length-2;i>=0;i--){
            rightMin[i] = Math.min(nums[i],rightMin[i+1]);
        }
        int leftMax= Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            leftMax=Math.max(nums[i],leftMax);
            if(leftMax<=rightMin[i+1]){
                int leftPartitionLength=i+1;
                System.out.println(leftPartitionLength);
                return;
            }
        }
        System.out.println("0");;
    }

    @Test
    public void broken(){
        int [] arr={5,10,15,22,33,40,42,55};

        int target=25;
        List<Integer> list = new ArrayList<>();

        int i=0;
        int j=arr.length-1;
        int mid;
        while(i<=j){
            mid = (i+j)/2;
            if(arr[mid]==target){
                list.add(target);
                return;
            }
            else if(arr[mid]<target){
                i=mid+1;
            }
            else if(arr[mid]>target){
                j=mid-1;
            }
        }
        list.add(arr[i]);
        list.add(arr[j]);
        System.out.println(list);

    }

    @Test
    public void intersection(){
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums1){
            if(map.containsKey(i)){
                map.put(i,map.get(i) + 1);
            }
            else{
                map.put(i,1);
            }
        }

        List<Integer> result = new ArrayList<>();

        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i])){
                if(map.get(nums2[i]) > 0){
                    result.add(nums2[i]);
                    map.put(nums2[i],map.get(nums2[i]) - 1);
                }

            }
        }
        System.out.println(result);
    }

    @Test
    public void matrixMultiply(){
        int [][] matrix1 = {{1,2},{3,4}}; // 2*2
        int [][] matrix2 = {{1,3,5},{2,4,6}}; // 2*3
        //Expected {{5,11,17},{11,25,31}}
        int [][] result = new int[matrix1.length][matrix2[0].length];

        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[0].length;j++){
                for(int k=0;k<matrix1[0].length;k++){
                    result[i][j]= result[i][j] + (matrix1[i][k] * matrix2[k][j]);
                }
            }

        }
        System.out.println(Arrays.deepToString(result));
    }

    @Test
    public void test6(){
        int [] nums1 ={1,2,2,1};
        int [] nums2={2,2};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums2){
            if(map.containsKey(i)){
                map.put(i,map.get(i) + 1);
            }
            else{
                map.put(i,1);
            }
        }
       List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                if(map.get(nums1[i])>0){
                    list.add(nums1[i]);
                    map.put(nums1[i],map.get(nums1[i]) - 1);
                }
            }
        }
        System.out.println(list);
    }

    @Test
    public void checkArm(){
        int inputNumber=408;
        int inputNumberCopy=inputNumber;
        int len = String.valueOf(inputNumber).length();
        int sum=0;

        while(inputNumber>0){
            int no = inputNumber%10;
            int prodNo=1;
            for(int i=1;i<=len;i++){
                prodNo = prodNo * no;
            }
            sum = sum + prodNo;
            inputNumber= inputNumber/10;
        }

        if(inputNumberCopy==sum){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("No Armstrong");
        }
    }
}

