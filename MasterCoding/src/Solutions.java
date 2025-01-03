import java.lang.reflect.Array;
import java.net.Inet4Address;
import java.nio.IntBuffer;
import java.util.*;

public class Solutions {
    public static void wordInSentence(String sentence, String word) {
        String newSentence="";
        int wordJ=1;
        int wordLen=word.length();
        for(int i=0, sentLen=sentence.length(); i<sentLen; i++){
            if(wordJ<wordLen){
                char currLet=word.charAt(wordJ-1);
                char sentCurLet=sentence.charAt(i);
                if (sentCurLet == currLet) {
                    newSentence = newSentence + wordJ;
                    wordJ++;
                } else {
                    newSentence = newSentence + sentCurLet;
                }
            }else {
                newSentence=newSentence+sentence.substring(i);
            }
        }
        if(wordJ!=wordLen){
            System.out.println("Word not found in sentence but this is what I got: "+newSentence);
        }else {
            System.out.println("Word found: "+newSentence);
        }
    }

    public boolean isPalindrome(int n){
        if(n<0){
            return false;
        }
        String s=""+n;
        s=new StringBuilder(s).reverse().toString();
        int rev =0;
        return n == rev;
    }

    public int[] countVowelsAndConsonants(String inputStr) {
        String vowels = "aeiouAEIOU";
        int vowCount=0, consCount=0;
        for(int i=0, len=inputStr.length(); i<len; i++){
            if(Character.isLetter(inputStr.charAt(i))){
                if(vowels.contains(inputStr.charAt(i)+"")){
                    vowCount++;
                }else {
                    consCount++;
                }
            }else {
                return new int[]{0,0};
            }
        }
        return new int[]{vowCount,consCount};
    }

    public String subString(String s, int start, int end) {
        return s.substring(start,end);
    }

    public void rightAngleTriangle1(int n) {
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
        for(int i=0; i<n; i++){
            String str="";
            for(int j=0; j<=i; j++){
                str=str+"* ";
            }
            System.out.print(str.trim()+"\n");
        }
    }

    public void rightAngleTriangle2(int n) {
        for(int i=n-1; i>=0; i--){
            String str="";
            for(int j=0; j<n; j++){
                if(j>=i){
                    str+="* ";
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println(str.trim());
        }
    }

    public void rightAngleTriangle3(int n) {
        for(int i=n; i>0; i--){
            String str="";
            for(int j=0; j<i; j++){
                str+="* ";
            }
            System.out.println(str.trim());
        }
    }

    public void rightAngleTriangle4(int n) {
        for(int i=0; i<n; i++){
            String str="";
            for(int j=0; j<n; j++){
                if(j>=i){
                    str+="* ";
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println(str.trim());
        }
    }

    public void rightAngleTrianglewithNumbers(int n) {
//          1
//          2 6
//          3 7 10
//          4 8 11 13
//          5 9 12 14 15
        for(int i=0; i<n; i++){
            int num=i+1;
            int dec=n;
            String str="";
            for(int j=0; j<=i; j++){
                if(j==0){
                    str+=num+" ";
                }else {
                    num+=dec;
                    str+=(num)+" ";
                }
                dec--;
            }
            System.out.println(str.trim());
        }
    }

    public void rockPaperScissors(String str) {
        int dataLength=str.length();
        int gameCount=0;
        if(dataLength%2!=0){
            System.out.println("Invalid input");
        }else {
            gameCount=dataLength/2;
        }
        for(int i=0, j=0; i<gameCount; i++, j+=2){
            String game=str.substring(j,j+2);
            char a=game.charAt(0);
            char b=game.charAt(1);
            if((a=='R' && b=='P') || (a=='P' && b=='S') || (a=='S' && b=='R')){
                System.out.println("B won");
            } else if (a==b) {
                System.out.println("Draw");
            } else {
                System.out.println("A won");
            }
        }
    }

    public int recSumOfN(int sum, int i, int n){//parameter way
        if(i>n){
            System.out.println("("+sum+", "+i+", "+n+")");
            return sum;
        }
        else{
            System.out.println("f("+sum+", "+i+", "+n+")");
            return recSumOfN(sum+i, i+1, n);
        }
    }

    public int recSumOfNtwo(int n) {//functional way
        if(n==0){
            return 0;
        }else {
            return n+recSumOfNtwo(n-1);
        }

    }

    public int factorial(int n) {
        if(n==1){
            return 1;
        }else {
            return n*factorial(n-1);
        }
    }

    public int[] reverseAnArray(int[] arr, int n, int i, int[] revArr) {
        if(n==0){
            return revArr;
        }else {
            revArr[n-1]=arr[i];
            return reverseAnArray(arr,n-1,i+1,revArr);
        }
    }

    public int capacityOfWater(int n, int[] elevPoints) {
        int bound= Math.min(elevPoints[0], elevPoints[n - 1]);
        int capacity=0;
        for(int i=1; i<n-1; i++){
            capacity=capacity+(bound-elevPoints[i]);
        }
        System.out.println();
        return Math.max(capacity, 0);
    }

    public void selectionSort(int[] arr) {
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            int min=i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;

        }
    }

    public void bubbleSort(int[] arr) {
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            System.out.println("After "+i+"th loop :"+Arrays.toString(arr));
        }
    }

    public void enhancedBubbleSort(int[] arr) {
        /*No swap is made if the input array is already sorted. We use this logic to
        * break the outer loop there by reducing time complexity*/
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            boolean swapMade=false;
            for(int j=0; j<n-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapMade=true;
                }
            }
            System.out.println("After "+i+"th loop :"+Arrays.toString(arr));
            if(!swapMade){
                break;
            }
        }
    }

    public void insertionSort(int[] arr) {
        int n=arr.length;
        int k=0;
        for(int i=1; i<n; i++){
            for(int j=i; j>0; j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    k++;
                }else {
                    break;
                }
            }
            System.out.println("After "+(i-1)+"th loop :"+Arrays.toString(arr));
        }
        System.out.println("Total number of swaps: "+k);
    }

    public void mergeSort(int[] arr) {
        int n=arr.length;
        System.out.println("Before sort: "+Arrays.toString(arr));
        System.out.println("n in Merge n denotes the level of recursion tree.");
        callToRecursiveMergeSort(arr, 0,n-1, 0);
    }

    private void callToRecursiveMergeSort(int[] arr, int first, int last, int i) {
        if(first<last){
            int mid=(first+last)/2;
            callToRecursiveMergeSort(arr,first,mid, i+1);
//        System.out.println("first call: "+Arrays.toString(arr) + "first: "+ first+" last: "+ last);
            callToRecursiveMergeSort(arr,mid+1, last, i+1);
//        System.out.println("second call: "+Arrays.toString(arr) + "first: "+ first+" last: "+ last);
            merge(arr,first,mid,last, i+1);
//        System.out.println("after last statement: "+Arrays.toString(arr) + "first: "+ first+" last: "+ last);
        }
    }

    private void merge(int[] arr, int first, int mid, int last, int j) {
        List<Integer> temp=new ArrayList<>();
        int left=first;
        int right=mid+1;
        while (left<=mid && right<=last){
            if(arr[left]<arr[right]){
                temp.add(arr[left]);
                left++;
            }else {
                temp.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= last) {
            temp.add(arr[right]);
            right++;
        }
        for(int i=first; i<=last; i++){
            arr[i]=temp.get(i-first);
        }
        System.out.println("Merge "+j+":\nTemp array: "+temp+" Sorting progress: "+Arrays.toString(arr) + " first: "+ first+" last: "+ last);
    }

    public void quickSort(int[] arr) {
        int n=arr.length;
        callToRecursiveQuickSort(arr, 0, n-1);
    }

    private void callToRecursiveQuickSort(int[] arr, int first, int last) {
        if(first<last){
            int partition=partition(arr,first, last);
            callToRecursiveQuickSort(arr,first,partition-1);
            callToRecursiveQuickSort(arr,partition+1,last);
        }
    }

    private int partition(int[] arr, int first, int last) {
        int pivot=arr[0];
        int left=first;
        int right=last;
        while (left<right){
            while (arr[left]<=pivot && left<=last-1){
                left++;
            }
            while (arr[right]>pivot && right>=first+1){
                right--;
            }
            if(left<right){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
        }
        int temp=arr[0];
        arr[0]=arr[right];
        arr[right]=temp;
        return right;
    }

    public int largestElementInArray(int[] arr) {
        int n=arr.length;
        int max=arr[0];
        for (int i = 1; i < n; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public int secondLargest(int[] arr) {
        int n=arr.length;
        int[] largestTwo={arr[0], -1};
        System.out.println("Before :"+Arrays.toString(largestTwo));
        for (int i = 1; i < n; i++) {
            if (largestTwo[0] < arr[i]) {
                largestTwo[1]=largestTwo[0];
                largestTwo[0] = arr[i];
            } else if (largestTwo[1] < arr[i] && arr[i]!=largestTwo[0]) {
                largestTwo[1]=arr[i];
            }
            System.out.println("Loop "+i+" :"+Arrays.toString(largestTwo));
        }
        return largestTwo[1];
    }

    public boolean isSorted(int[] arr) {
        int n=arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public int removeDuplicates(int[] arr) {
        int n=arr.length;
        int j=0;
        for (int i = 1; i < n; i++) {
            if (arr[j] != arr[i]) {
                arr[++j]=arr[i];
            }
        }
        return j+1;
    }

    public int findEquilibrium(int[] arr) {
//        O(N^2)
//        int n=arr.length;
//        for (int mid = 1; mid < n - 1; mid++) {
//            int leftSum=0;
//            for (int i = 0; i < mid; i++) {
//                leftSum=leftSum+arr[i];
//            }
//            int rightSum=0;
//            for (int j = mid + 1; j < n; j++) {
//                rightSum=rightSum+arr[j];
//            }
//            if (leftSum == rightSum) {
//                return mid+1;
//            }
//        }
//        return -1;

//        O(N)
        int n=arr.length;
        int totSum=0;
        for (int i = 0; i < n; i++) {
            totSum+=arr[i];
        }
        int leftSum=0;
        for (int i = 0; i < n; i++) {
            totSum = totSum - arr[i];
            if(leftSum==totSum){
                return i+1;
            }
            leftSum = leftSum + arr[i];
        }
        return -1;
    }

    public void leftRotateByOnePlace(int[] arr) {
        int n=arr.length;
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n-1]=temp;
    }

    public void swapStrings(String s1, String s2) {

    }

    public void leftRotateByDPlaces(int[] arr, int d) {
        int n=arr.length;
        d=d%n;
        int index=d;
        if(d==0){
            return;
        }
        int[] temp=new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for (int i = 0, j = 0; i < n; i++) {
            if (index < n) {
                arr[i]=arr[index];
            }else {
                arr[i]=temp[j];
                j++;
            }
            index++;
        }
    }

//    public void moveZeroes(int[] arr) {
//        int[] temp=arr.clone();
//        int n=arr.length;
//        int zCount=0;
//        int count=0;
//        for (int i = 0; i < n; i++) {
//            if(arr[i]==0){
//                zCount++;
//            }
//        }
//        for(int i=0; i<zCount; i++){
//            for (int j = 0; j < n-1; j++) {
//                if(arr[j]==0 && arr[j+1]!=0){
////                    arr[j] = arr[j + 1];
////                    arr[j+1]=0;
//                    arr[j] += arr[j + 1];
//                    arr[j + 1] = arr[j] - arr[j + 1];
//                    arr[j] -= arr[j + 1];
//                }
//            }
//        }
//        System.out.println(count);
//    }

    public void moveZeroes2(int[] arr) {
        int n=arr.length;
        int count=0;
        List<Integer> zMap=new ArrayList<>();
        for(int i=0; i<n; i++){
            if(arr[i]==0){
                zMap.add(i);
            }
        }
        for (int i=0; i<zMap.size(); i++){
            for (int j = zMap.get(i)-i; j < n-1-i; j++) {
                arr[j] += arr[j + 1];
                arr[j + 1] = arr[j] - arr[j + 1];
                arr[j] -= arr[j + 1];
                count++;
            }
        }
        System.out.println(count);
    }

    public int linearSearch(int[] arr, int search) {
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == search) {
                return i+1;
            }
        }
        return -1;
    }

    public ArrayList<Integer> unionOf(int[] arr1, int[] arr2) {
        if (arr1.length < arr2.length) {
            return doOperation(arr1, arr2);
        }
        return doOperation(arr2,arr1);
    }

    private ArrayList<Integer> doOperation(int[] smallArray, int[] bigArray) {
        int n=smallArray.length;
        int m=bigArray.length;
        boolean[] visited = new boolean[Math.max(smallArray[n - 1], bigArray[m - 1]) + 1];
//        boolean[] visited = new boolean[smallArray[n-1]<bigArray[m-1]?smallArray[n-1]:bigArray[m-1] + 1];
        List<Integer> union=new ArrayList<>();
        int j=0;
        for (int i = 0; i < n; i++) {
            if (smallArray[i] == bigArray[j]) {
                j++;
            }
            if (!visited[smallArray[i]]) {
                union.add(smallArray[i]);
                visited[smallArray[i]]=true;
            }
        }
        for (; j < m; j++) {
            if (!visited[bigArray[j]]) {
                union.add(bigArray[j]);
                visited[bigArray[j]]=true;
            }
        }
        return (ArrayList<Integer>) union;

    }

    //solution with hash
    public int findMissing(int[] arr, int n) {
        int length=arr.length;
        boolean[] hash = new boolean[n+1];
        for (int i = 0; i < length; i++) {
            hash[arr[i]]=true;
        }
        for (int i = 1; i <= n; i++) {
            if (!hash[i]) {
                return i;
            }
        }
        return -1;
    }

    //solution with sum
    public int findMissing2(int[] arr, int n) {
        int sum=(n*(n+1))/2;
        int arrSum=0;
        for(int i=0; i<arr.length; i++){
            arrSum += arr[i];
        }
        return sum-arrSum;
    }

    public int maxConsecutiveOnes(int[] arr, int n) {
        int max=0;
        int count=0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;
                max = count > max ? count : max;
            } else {
                count = 0;
            }
        }
        return max;
    }

    public int findElementAppearingOnce(int[] arr) {
        int n=arr.length;
        int[] visited = new int[largestElementInArray(arr)];
        for (int i=0; i < n-1; i++) {
            visited[arr[i]]++;
        }
        for (int i = 0; i < visited.length; i++) {
            if (visited[i] == 1) {
                return i;
            }
        }
        return -1;
    }

    public int lengthOfLongestSubArray(int[] arr, int k) {
        int n=arr.length;
        int max=0;
        int index=-1;
        for (int i = 0; i < n; i++) {
            int sum=0;
            for (int j = i; j < n; j++) {
                sum = sum + arr[j];

                if (sum == k) {
                    index = max == (max = Math.max(max, j - i + 1)) ? index : i;
                    break;
                }

                else if (sum > k) {
                    break;
                }
            }
        }
        System.out.println("index: "+index);
        return max;
    }

    public void changeColorIn2DMatrix(int[][] screen, int m, int n, int k, int i, int j, int value) {
        if (i < 0 || i >= m || j < 0 ||  j >= n) {
            return;
        }
        if (screen[i][j] != value) {
            return;
        }
        if (screen[i][j] == value) {
            screen[i][j]=k;
        }
        changeColorIn2DMatrix(screen,m,n,k,i,j-1,value);
        changeColorIn2DMatrix(screen,m,n,k,i,j+1,value);
        changeColorIn2DMatrix(screen,m,n,k,i-1,j,value);
        changeColorIn2DMatrix(screen,m,n,k,i+1,j,value);
    }

    public int lengthOfLongestSubArray2(int[] arr, int k) {
        int n=arr.length;
        int i=0, j=0;
        int sum=0;
        int length=0;

        while (j < n) {
            sum += arr[j];

            if (sum == k) {
                length = Math.max(length, j - i + 1);
            }

            while (sum > k && i<=j) {
                sum -= arr[i];
                i++;
            }
            j++;
        }
        return length;
    }

    public int lengthOfSmallestSubArray(int[] arr, int k) {
        int n=arr.length;
        int i=0, j=0;
        int sum=0;
        int length=n+1;

        while (j < n) {
            sum += arr[j];

            if (sum == k) {
                length = Math.min(length, j - i + 1);
            }

            while (sum > k && i<=j) {
                sum -= arr[i];
                i++;
            }
            j++;
        }
        return length;
    }

    public boolean twoSum(int[] arr, int target) {
        int n=arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean optimizedTwoSum(int[] arr, int target) {
        int n=arr.length;
        boolean[] hash=new boolean[Math.max(largestElementInArray(arr)+1,target)];
        for (int i = 0; i < n; i++) {
            hash[arr[i]]=true;
        }
        for (int i = 0; i < n; i++) {
            int j = Math.abs(arr[i] - target);
            if (hash[j]) {
//                System.out.println("i :"+arr[i]+" j: "+j);
                return true;

            }
        }
        return false;
    }

    public int[] moreOptimizedTwoSum(int[] arr, int target) {
        HashMap<Integer, Integer> hashMap=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];
            if (hashMap.get(arr[i])!=null) {
                int[] index = new int[]{i, hashMap.get(arr[i])};
                return index;
            }
            hashMap.put(diff, i);
        }
        return new int[]{-1,-1};
    }

    public int[] sort012Array(int[] arr) {
        int n=arr.length;
        int[] temp = new int[n];
        int left=0, right=n-1;
        for (int i = 0; i < n; i++) {
            switch (arr[i]) {
                case 0:
                    temp[left] = arr[i];
                    left++;
                    break;
                case 2:
                    temp[right] = arr[i];
                    right--;
                    break;
            }
        }
        while (left <= right) {
            temp[left]=1;
            left++;
        }
        return temp;
    }


    public void optimisedSort012Array(int[] arr) {
         int l=0;
         int n=arr.length;
         int r=n-1;
         int mid=0;
        while (mid <= r) {
            switch (arr[mid]) {
                case 0:
                    swap(arr,l,mid);
                    l++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, r, mid);
                    r--;
                    break;
            }
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
    }

    public int majorityElement(int[] arr) {
        int n=arr.length;
        int cand=arr[0];
        int count=1;
        for (int i = 1; i < n; i++) {
            if (arr[i] == cand) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                cand = arr[i];
                count=1;
            }
        }
        int count2=0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == cand) {
                count2++;
            }
        }
        if (count2 > (n / 2)) {
            return cand;
        }
        return -1;
    }

    public int binarySearch(int[] arr, int k, int i, int j) {
        int mid=(i+j)/2;
        System.out.println("i: "+i+" j: "+j);
        if (arr[mid] == k) {
            return mid;
        } else if (arr[mid] < k) {
            return binarySearch(arr,k,mid+1,j);
        } else if (arr[mid] > k) {
            return binarySearch(arr,k,i,mid-1);
        }
        return -1;
    }

    public int maxSum(int[] arr) {
        int n=arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = arr[i];
            for (int j = i; j < n; j++) {
                sum = Math.max(sum, sum + arr[j]);
            }
        }
        return sum;
    }

    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        String res="";
        int j=0;
        for(int i=0; i<strs[j].length() ;i++){
            int count=1;
            for(j=0; j<n-1; j++){
                if(strs[j].charAt(i)==strs[j+1].charAt(i)){
                    count++;
                }else{
                    break;
                }
            }
            System.out.println(count);
            if(count==n){
                res=res+strs[j].charAt(i);
            }else{
                return res;
            }
        }
        return res;
    }

    public int strStr(String haystack, String needle) {
          int i=0;
          int j=0;
          int n1=haystack.length();
          int n2=needle.length();
        while (j < n2) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                j++;
                i++;
            } else {
                i = i - j + 1;
                for (; i < n1; i++) {
                    if (haystack.charAt(i) == needle.charAt(0)) {
                        break;
                    } else if (i > n1 - n2 + 1) {
                        return -1;
                    }
                }
                j=0;
            }
            if(i==n1 && j!=n2){
                return -1;
            }
        }
        return i-n2;
    }

    public int searchInsert(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        while (l <= r) {
            int mid=(l+r)/2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                l=mid+1;
            } else if (nums[mid]>target) {
                r=mid-1;
            }
        }
        return r+1;
    }

    public int lengthOfLastWord(String s) {
        int n=s.length();
        int count=0;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
            } else if (count!=0) {
                return count;
            }
        }
        return count;
    }

    public int[] plusOne(int[] nums) {
        boolean flag=true;
        int[] res;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 9) {
                flag=false;
                break;
            }
        }
        if (flag) {
            res = new int[nums.length + 1];
            res[0] = 1;
        } else {
            res = new int[nums.length];
            int rem=1;
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] + rem == 10) {
                    rem = 1;
                    res[i] = 0;
                } else {
                    res[i]=nums[i]+rem;
                    rem=0;
                }
            }
        }
        return res;
    }

    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[nums[i]] = nums[i];
        }
        return ans;
    }

    public int[] buildArray2(int[] nums) {
        int n=nums.length;
        for (int i = 0; i < n; i++) {
            nums[i]+=(nums[nums[i]]%n) * n;
        }
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < n; i++) {
            nums[i]/=n;
        }
        return nums;

    }

    public int minimumOperations(int[] nums) {
        int count=0;
        for (int num : nums) {
            if (num % 3 != 0) {
                count++;
            }
        }
        return count;
    }

    public int numIdenticalPairs(int[] nums) {
        int[] hash=new int[100];
        for (int num : nums) {
            hash[num]++;
        }
        int count=0;
        for (int hashVal : hash) {
            count = count + ((hashVal-1)*hashVal)/2;
        }
        return count;
    }

    public int numIdenticalPairs2(int[] A) {
        int ans = 0;
        int[] cnt = new int[101];
        for (int a: A) {
            ans = ans + cnt[a];
            cnt[a]++;
        }
        return ans;
    }

    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for (String word : operations) {
            switch (word.charAt(0)=='X' ? word.charAt(word.length()-1) : word.charAt(0)) {
                case '+':
                    x++;
                    break;
                case '-':
                    x--;
                    break;
            }
        }
        return x;
    }

    public int[] shuffle(int[] nums, int n) {
        int l=0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] += (nums[l++] % 1001) * 1001;
            } else {
                nums[i] += (nums[n++] % 1001) * 1001;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i]/=1001;
        }
        return nums;
    }

    public int[] optimisedShuffle(int[] nums, int n) {
        int l=0;
        for (int i = 0; i < nums.length; i=i+2) {
            nums[i] += (nums[l++] % 1001) * 1001;
            nums[i+1] += (nums[n++] % 1001) * 1001;
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i]/=1001;
        }
        return nums;
    }

    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> indexes = new ArrayList<>();
        int len=words.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (words[i].charAt(j) == x) {
                    indexes.add(i);
                    break;
                }
            }
        }
        return indexes;
    }

    public int maximumWealth(int[][] accounts) {
        int wealth=0;
        for (int[] account : accounts) {
            int total=0;
            for (int money : account) {
                total+=money;
            }
            wealth = wealth > total ? wealth : total;
        }
        return wealth;
    }

    public int[][] largestLocal(int[][] grid) {
        int n= grid.length;
        int[][] res=new int[n-2][n-2];
        for (int i = 0; i < (n - 2); i++) {
            for (int j = 0; j < (n - 2); j++) {
                int max=0;
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        max = Math.max(grid[k][l], max);
                    }
                }
                res[i][j]=max;
            }
        }
        return res;
    }


    public int[] rotateArray(int[] arr, int k) {
        int n=arr.length;
        for (int i = 0, j = n - 1; i < n / 2; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]=temp;
        }
        for (int i = 0, j = k - 1; i < k / 2; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = k, j = n - 1; i < (n + k) / 2; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

    public List<Integer> generateFibonacci(int n){
        List<Integer> res=new ArrayList<>();
        if(n==0)return res;
        if (n > 0) {
            res.add(0);
        }
        if (n > 1) {
            res.add(1);
        }
        for (int i = 0; i < n - 2; i++) {
            int c = res.get(i) + res.get(i + 1);
            res.add(c);
        }
        return res;
    }

    public boolean isPalindrome(String s){
        int n=s.length();
        if (n == 0) {
            return false;
        }
        for (int i = 0, j = n - 1; i < n / 2; i++, j--) {
            if (s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
    }

    public List<Integer> mergeSortedLists(List<Integer> list1, List<Integer> list2){
        int m=list1.size();
        int n=list2.size();
        List<Integer> res=new ArrayList<>();
        int i,j;
        for (i = 0, j = 0; i < m && j < n;) {
            if (list1.get(i) >= list2.get(j)) {
                res.add(list2.get(j));
                j++;
            }else{
                res.add(list1.get(i));
                i++;
            }
        }
        if (i == m) {
            res.addAll(list2.subList(j, n));
        } else if (j == n) {
            res.addAll(list1.subList(i, m));
        }
        return res;
    }

    public int lengthOfLongestSubstring(String s){
        Map<Character, Integer> hash=new HashMap<>();
        int n=s.length();
        int i=0, j=0;
        int max=0;
        while (i < n && j < n) {
            if (hash.containsKey((Character) s.charAt(j))) {
                i = Math.max(hash.get(s.charAt(j)) + 1, i);
            }
            hash.put((Character) s.charAt(j), j);
            j++;
            max=Math.max(j-i,max);
            System.out.println(hash);
        }
        return max;
    }

    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int k = (m + n) - 1;
        int i = m - 1;
        int j = n - 1;
        while (k >= 0) {
            if (i < 0 || j < 0) {
                while (j >= 0) {
                    nums1[k--] = nums2[j--];
                }
                break;
            }
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        System.out.println(Arrays.toString(nums1));
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = (m + n) - 1;
        int i = m - 1;
        int j = n - 1;
        while (j >= 0) {
            nums1[k--] = (i >= 0 && nums1[i] > nums2[j]) ? nums1[i--] : nums2[j--];
        }
        System.out.println(Arrays.toString(nums1));
    }

    public List<List<Integer>> generatePascal(int numRows) {
        List<List<Integer>> pascal=new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> currRow=new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (i == j || j == 0) {
                    currRow.add(1);
                } else {
                    currRow.add(pascal.get(i-1).get(j-1) + pascal.get(i-1).get(j));
                }
            }
            pascal.add(currRow);
        }
        return pascal;
    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> row=new ArrayList<>();
        row.add(1);
        int currElement=1;
        for (int i = 1; i < rowIndex; i++) {
            currElement = currElement * (rowIndex - i + 1) / i;
            row.add(currElement);
        }
        row.add(1);
        return row;
    }

    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int maxProfit=0;
        for (int i = 0; i < prices.length - 1; i++) {
            min = Math.min(min, prices[i]);
            maxProfit=Math.max(prices[i+1]-min,maxProfit);
        }
        return maxProfit;
    }

    public int majorityElement2(int[] nums) {
        int count=1;
        int maj = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                maj = nums[i];
                count++;
            }else if (nums[i] == maj) {
                count++;
            } else {
                count--;
            }
        }
        return maj;
    }

    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Boolean> hash=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hash.get(nums[i]) == null) {
                hash.put(nums[i],true);
            } else if (hash.get(nums[i])) {
                return true;
            }
        }
        return false;
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        for (int i = 0; i <= n - k; i++) {
            for (int j = i + 1; j <= i + k; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public List<String> summaryRanges(int[] nums) {
        List<String> summ=new ArrayList<>();
        String str="";
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] != nums[i] + 1) {
                str = str + nums[i];
                summ.add(str);
                str = "";
            } else if (str == "") {
                str = nums[i] + "->";
            }
        }
        str = str + nums[nums.length - 1];
        summ.add(str);
        return summ;
    }

    public int missingNumber(int[] nums) {
        int n=nums.length;
        int arraySum=0;
        for (int i = 0; i < n; i++) {
            arraySum += nums[i];
        }
        int sumOfN = (n * (n + 1))/2;
        return sumOfN-arraySum;
    }

    public boolean canBeIncreasing(int[] nums) { //Wrong
        boolean violFound=false;
        boolean fix=true;
        int n=nums.length;
        if (nums[0] >= nums[1]) {
            violFound=true;
        }
        int i=1;
        while (i < n - 1) {
            System.out.println(i +"th loop: "+ fix);
            if (nums[i] >= nums[i + 1]) {
                if (violFound) {
                    return false;
                }
                System.out.println("Inside if: "+i+""+fix);
                fix = fix && (nums[i - 1] < nums[i + 1] || nums[i] < nums[i + 2]);
            }
            i++;
        }
        System.out.println("Last return");
        return fix;
    }

    public boolean canBeIncreasing2(int[] nums) {
        boolean violFound = false;
        boolean fix = true;
        int n = nums.length;

        if (n < 3) return true;

        for (int i = 1; i < n; i++) {
            if (nums[i - 1] >= nums[i]) {
                if (violFound) {
                    return false;
                }
                violFound = true;

                if (i > 1 && nums[i - 2] >= nums[i]) {
                    if (i + 1 < n && nums[i - 1] >= nums[i + 1]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int i=0, j=1;
        while (j < n) {
            if (nums[i] == 0) {
                if (nums[j] != 0) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                } else {
                    j++;
                }
            } else {
                i++;
            }
        }
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Boolean> hash = new HashMap<Integer, Boolean>();
        for (int i : nums1) {
            hash.put(i, true);
        }
        int j=0;
        for (int value : nums2) {
            if (hash.get(value) != null && hash.get(value)) {
                hash.put(value, false);
                j++;
            }
        }
        int[] nums = new int[j];
        for (int i = 0, k=0; i < nums2.length; i++) {
            if (hash.get(nums2[i]) != null && !hash.get(nums2[i])) {
                nums[k++] = nums2[i];
                hash.put(nums2[i], true);
            }
        }
        return nums;

    }

    public int thirdMax(int[] nums) {
        Integer f=null, s=null, t=null;
        for (int num : nums) {
            if (num == f || num == s || num == t) {
                continue;
            }
            if (num > f || f == null) {
                t = s;
                s = f;
                f = num;
            } else if (num > s || s == null) {
                t = s;
                s = num;
            } else if (num > t || t == null) {
                t = num;
            }
        }
        return t == null ? f : t;
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> dissNumbers = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index=Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = nums[index] * -1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                dissNumbers.add(i+1);
            }
        }
        return dissNumbers;
    }

    public int islandPerimeter(int[][] grid) {
        int temp = 0;
        int rows=grid.length;
        int cols=grid[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    return calcPerimeter(grid, i, j, rows, cols);
                }
            }
        }
        return temp;
    }

    private int calcPerimeter(int[][] grid, int i, int j, int rows, int cols) {
        if (i < 0 || i >= rows || j < 0 || j >= cols || grid[i][j]==0) {
            return 1;
        }
        if (grid[i][j] == -1) {
            return 0;
        }

        grid[i][j]=-1;
        int perimeter=0;
        perimeter += calcPerimeter(grid, i - 1, j, rows, cols);
        perimeter += calcPerimeter(grid, i + 1, j, rows, cols);
        perimeter += calcPerimeter(grid, i, j - 1, rows, cols);
        perimeter += calcPerimeter(grid, i, j + 1, rows, cols);

        return perimeter;
    }

    public int findContentChildren(int[] g, int[] s) {
        selectionSort(g);
        selectionSort(s);
        int count=0;
        for (int i = 0, j = 0; i<g.length && j < s.length; j++) {
            if (g[i] <= s[j]) {
                count++;
                i++;
            }
        }
        return count;

    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxCount=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                maxCount = Math.max(maxCount, count);
                count=0;
            } else {
                count++;
            }
        }
        return Math.max(maxCount, count);
    }

    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int tot = duration;
        int currTime = timeSeries[0]+duration;
        for (int i=1; i<timeSeries.length; i++) {
            if (currTime - timeSeries[i] > 0) {
                tot=tot - (currTime - timeSeries[i]);
            }
            tot=tot+duration;
            currTime=currTime+duration;
        }
        return tot;
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        HashMap<Integer, Integer> indexes = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            indexes.put(nums2[i], i);
        }
        for (int i = 0; i < nums1.length; i++) {
            res[i]=-1;
            for (int j = indexes.get(nums1[i]) + 1; j < nums2.length; j++) {
                if (nums2[j] > nums1[i]) {
                    res[i] = nums2[j];
                    break;
                }
            }
        }
        return res;
    }

    public String[] findWords(String[] words) {
        String[] rows=new String[]{"qwertyuiopQWERTYUIOP", "asdfghjklASDFGHJKL", "zxcvbnmZXCVBNM"};
        String[] res = new String[words.length];
        int l=0;
        for (int i = 0; i < words.length; i++) {
            int findRow=-1;
            for (int k = 0; k < 3; k++) {
                if (rows[k].contains(words[i].charAt(0) + "")) {
                    findRow=k;
                    break;
                }
            }
            for (int j = 0; j < words[i].length(); j++) {
                if (rows[findRow].contains(words[i].charAt(j) + "")) {
                    if (j == words[i].length() - 1) {
                        res[l++] = words[i];
                    }
                }else{
                    break;
                }
            }
        }
        return Arrays.copyOf(res, l);
    }


    //indexOf() method is of O(N^2) so not good.
    public String[] findRelativeRanks(int[] score) {
        ArrayList<Integer> sortedArray = new ArrayList<>();
        for (Integer i: score) {
            sortedArray.add(i);
        }
        int first=score.length-1;
        int second=score.length-2;
        int third=score.length-3;
        String[] res = new String[score.length];
        Collections.sort(sortedArray);
        for (int i = 0; i < score.length; i++) {
            int index = sortedArray.indexOf(score[i]);
            if (index == first) {
                res[i]="Gold Medal";
            } else if (index == second) {
                res[i]="Silver Medal";
            } else if (index == third) {
                res[i] = "Bronze Medal";
            }else{
                res[i] = score.length - index + "";
            }
        }
        return res;
    }

    public String[] findRelativeRanks2(int[] score) {
        int n=score.length;
        int[] sortedArray=score.clone();
        Arrays.sort(sortedArray);
        HashMap<Integer, String> hash = new HashMap<>();

        for (int i = n-1; i >= 0; i--) {
            if (i == n - 1) {
                hash.put(sortedArray[n - 1], "Gold Medal");
            } else if (i == n - 2) {
                hash.put(sortedArray[n - 2], "Silver Medal");
            } else if (i == n - 3) {
                hash.put(sortedArray[n - 3], "Bronze Medal");
            } else {
                hash.put(sortedArray[i], n - i + "");
            }
        }

        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
            res[i] = hash.get(score[i]);
        }
        return res;
    }


    public boolean isPalindrome2(String s) {
        StringBuilder str = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c) || Character.isDigit(c)) {
                str.append(Character.toLowerCase(c));
            }
        }
        if (str.length()<2) {
            return true;
        }
        for (int i = 0, j=str.length()-1; i<str.length()/2; i++,j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }


    public String convertToTitle(int columnNumber) {
        String alph = "ZABCDEFGHIJKLMNOPQRSTUVWXY";
        String res = "";
        while (columnNumber> 26) {
            res=alph.charAt(columnNumber%26)+res;
            if (columnNumber % 26 == 0) {
                columnNumber = columnNumber - 1;
            } else {
                columnNumber = columnNumber - (columnNumber % 26);
            }
            columnNumber=columnNumber/26;
        }
        res=alph.charAt(columnNumber%26)+res;
        return res;
    }

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for (int i = 0; i < nums.length; i = i + 2) {
            sum += nums[i];
        }
        return sum;
    }

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (r * c != mat.length * mat[0].length) {
            return mat;
        }
        int[][] res = new int[r][c];
        int a=0;
        int b=0;
        for (int[] ints : mat) {
            for (int anInt : ints) {
                res[a][b++] = anInt;
                if (b >= c) {
                    a++;
                    b = 0;
                }
            }
        }
        return res;
    }

    public int distributeCandies(int[] candyType) {
        int max = candyType.length / 2;
        Set<Integer> hash=new HashSet<>();
        for (int candy : candyType) {
            hash.add(candy);
            if (hash.size() >= max) {
                return max;
            }
        }
        return hash.size();
    }

    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hash.put(nums[i], hash.getOrDefault(nums[i], 0) + 1);
        }

        int max=0;
        for (Map.Entry<Integer, Integer> entry: hash.entrySet()) {
            int reqElement=entry.getKey()+1;
            if (hash.containsKey(reqElement)) {
                max=Math.max(max,entry.getValue() + hash.get(reqElement));
            }
        }
        return max;
    }

    public int maxCount(int m, int n, int[][] ops) {
        int minRow=m;
        int minCol=n;
        for (int i = 0; i < ops.length; i++) {
            minRow = Math.min(minRow, ops[i][0]);
            minCol = Math.min(minCol, ops[i][1]);
        }
        return minRow * minCol;
    }

    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hash=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hash.containsKey(s.charAt(i))) {
                if (hash.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            } else if (hash.containsValue(t.charAt(i))) {
                return false;
            } else {
                hash.put(s.charAt(i), t.charAt(i));
            }
        }

        return true;
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int len=s.length();
        HashMap<Character, Integer> hash =new HashMap<>();
        for (int i = 0; i < len; i++) {
            hash.put(s.charAt(i), hash.getOrDefault(s.charAt(i),0)+1);
            hash.put(t.charAt(i), hash.getOrDefault(t.charAt(i),0)-1);
        }
        for (Map.Entry<Character, Integer> entry: hash.entrySet()) {
            if (entry.getValue()!=0) {
                return false;
            }
        }
        return true;
    }

    public void reverseString(char[] s) {
        int n=s.length-1;
        for (int i = 0; i < s.length / 2; i++, n--) {
            char temp = s[i];
            s[i] = s[n];
            s[n] = temp;
        }
    }

    public boolean wordPattern(String pattern, String s) {
        HashMap<String, Character> hash=new HashMap<>();
        String[] words = s.split(" ");
        for (int i = 0; i < pattern.length(); i++) {
            if (!hash.containsKey(words[i]) && !hash.containsValue(pattern.charAt(i))) {
                hash.put(words[i], pattern.charAt(i));
            }
        }
        StringBuilder verifyWord=new StringBuilder();
        for (String word : words) {
            verifyWord.append(hash.get(word));
        }
        return verifyWord.toString().equals(pattern);
    }

    public String reverseVowels(String s) {
        String vowels = "AEIOUaeiou";
        int i=0;
        int j=s.length()-1;
        while (i < j) {
            while (!vowels.contains(s.charAt(i)+"")) {
                i++;
            }
            while (!vowels.contains(s.charAt(j) + "")) {
                j--;
            }
            if (i < j) {
                s = s.substring(0, i) + s.charAt(j) + s.substring(i + 1, j) + s.charAt(i) + s.substring(j + 1);
                i++;
                j--;
            }
        }
        return s;
    }

    public String optimizedReverseVowels(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'));
        char[] sArray=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while (i < j) {
            while (i < j && !vowels.contains(s.charAt(i))) {
                i++;
            }
            while (i < j && !vowels.contains(s.charAt(j))) {
                j--;
            }
            if (i < j) {
                char temp = sArray[i];
                sArray[i] = sArray[j];
                sArray[j]=temp;
            }
        }
        return new String(sArray);
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hash=new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            hash.put(magazine.charAt(i), hash.getOrDefault(magazine.charAt(i), 0) + 1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (!hash.containsKey(ransomNote.charAt(i)) || hash.get(ransomNote.charAt(i)) == 0) {
                return false;
            } else {
                hash.put(ransomNote.charAt(i), hash.get(ransomNote.charAt(i)) - 1);
            }
        }
        return true;

    }

    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hash=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            hash.put(s.charAt(i), hash.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (hash.containsKey(s.charAt(i)) && hash.get(s.charAt(i))==1) {
                return i;
            }
        }
        return -1;
    }

    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> hash = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            hash.put(s.charAt(i), hash.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            if (!hash.containsKey(t.charAt(i)) || hash.get(t.charAt(i)) == 0) {
                return t.charAt(i);
            } else {
                hash.put(t.charAt(i), hash.get(t.charAt(i)) - 1);
            }
        }
        return ' ';
    }

    public char findTheDifference2(String s, String t) {
        int sAsciiSum = 0;
        int tAsciiSum = 0;
        for (int i = 0; i < s.length(); i++) {
            sAsciiSum += (int) s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            tAsciiSum += (int) t.charAt(i);
        }
        return (char)(tAsciiSum - sAsciiSum);
    }

    public int longestPalindrome(String s) {
        HashMap<Character, Integer> hash = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            hash.put(s.charAt(i), hash.getOrDefault(s.charAt(i), 0) + 1);
        }
        int count=0;
        boolean oddFound=false;
        for (Map.Entry entry : hash.entrySet()) {
            int currNum=(int) entry.getValue();
            if (currNum % 2 != 0) {
                count+=currNum-1;
                oddFound=true;
            } else {
                count=count+currNum;
            }
        }
        return oddFound ? count + 1 : count;
    }

    public List<String> fizzBuzz(int n) {
        List<String> fizzBuzz=new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzz.add("FizzBuzz");
            } else if (i % 3 == 0) {
                fizzBuzz.add("Fizz");
            } else if (i % 5 == 0) {
                fizzBuzz.add("Buzz");
            } else {
                fizzBuzz.add(i + "");
            }
        }
        return fizzBuzz;
    }

    //Will not work for large numbers
    public String addStrings(String num1, String num2) {
        int n1=0;
        int n2=0;
        for (int i = num1.length() - 1, factor = 1; i >= 0; i--, factor = factor * 10) {
            n1 = n1 + findNum(num1.charAt(i)) * factor;
        }
        for (int i = num2.length() - 1, factor = 1; i >= 0; i--, factor = factor * 10) {
            n2 = n2 + findNum(num2.charAt(i)) * factor;
        }
        return n1+n2+"";
    }

    private int findNum(char c) {
        switch (c) {
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6' :
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
            default:
                break;
        }
        return 0;
    }

    public boolean repeatedSubstringPattern(String s) {
        return (s + s).substring(1, (s.length() * 2) - 1).contains(s);
    }

    public int countSegments(String s) {
        int count = 0;
        boolean flag=true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' && flag) {
                count++;
                flag = false;
            } else if(s.charAt(i)==' '){
                flag=true;
            }
        }
        return count;
    }

    public String licenseKeyFormatting(String s, int k) {
        StringBuilder result=new StringBuilder();
        for (int i = s.length() - 1, j = 0; i >= 0; i--) {
            if (s.charAt(i) != '-') {
                result = new StringBuilder((s.charAt(i) + "").toUpperCase()).append(result);
                j++;
                if (j % k == 0) {
                    while (i > 0) {
                        if (s.charAt(i-1) != '-') {
                            result=new StringBuilder("-").append(result);
                            break;
                        }
                        i--;
                    }
                }
            }
        }
        return result.toString();
    }

    public String licenseKeyFormatting2(String s, int k) {
        String result = "";
        for (int i = s.length() - 1, j = 0; i >= 0; i--) {
            if (s.charAt(i) != '-') {
                result = (s.charAt(i) + "").toUpperCase() + result;
                j++;
                if (j % k == 0) {
                    result="-"+result;
                }
            }
        }
        return result.charAt(0) == '-' ? result.substring(1) : result;
    }

    public boolean detectCapitalUse(String word) {
        int len=word.length();
        if (len == 1) {
            return true;
        }
        boolean firstLetterCapital = Character.isUpperCase(word.charAt(0));

        if (!firstLetterCapital) {
            if (Character.isUpperCase(word.charAt(1))) {
                return false;
            }
        }

        for (int i = 1; i <len - 1; i++) {
            if (firstLetterCapital) {
                if ((Character.isUpperCase(word.charAt(i)) && Character.isLowerCase(word.charAt(i + 1))) ||
                        (Character.isLowerCase(word.charAt(i)) && Character.isUpperCase(word.charAt(i + 1)))) {
                    return false;
                }
            } else {
                if (Character.isUpperCase(word.charAt(i+1))) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean detectCapitalUse2(String word) {
        int capitalCount=0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                capitalCount++;
            }
        }
        if (Character.isUpperCase(word.charAt(0))) {
            return capitalCount == word.length() - 1 || capitalCount == 0;
        } else {
            return capitalCount == 0;
        }
    }

    public int scoreOfString(String s) {
        int count=0;
        for (int i = 0; i < s.length() - 1; i++) {
            count = count + Math.abs(s.charAt(i) - s.charAt(i + 1));
        }
        return count;
    }

    public String reverseStr(String s, int k) {
        if(s.length()==1) return s;
        k = Math.min(s.length(), k);
        char[] string=s.toCharArray();
        for (int i = 0; i < s.length(); i = i + 2 * k) {
            int left = i;
            int right = Math.min(s.length() - 1, i + k - 1);
            int mid = (left + right) / 2;
            while (left<right) {
                char temp = string[right];
                string[right] = string[left];
                string[left] = temp;
                left++;
                right--;
            }
        }
        return String.valueOf(string);
    }

    public String defangIPaddr(String address) {
        StringBuilder output = new StringBuilder();
        for (Character c : address.toCharArray()) {
            if (c.equals('.')) {
                output.append("[.]");
            } else {
                output.append(c);
            }
        }
        return output.toString();
    }

    public int numJewelsInStones(String jewels, String stones) {
        if (jewels.isEmpty() || stones.isEmpty()) {
            return 0;
        }
        HashMap<Character, Boolean> hash = new HashMap<>();
        for (Character c : jewels.toCharArray()) {
            hash.put(c, true);
        }
        int count=0;
        for (Character c : stones.toCharArray()) {
            if (hash.get(c)!=null && hash.get(c)) {
                count++;
            }
        }
        return count;
    }

    public int minPartitions(String n) {
        int res=0;
        for (int i = 0; i < n.length(); i++) {
            int num = Integer.parseInt(String.valueOf(n.charAt(i)));
            res = Math.max(res, num);
            if(res==9) return 9;
        }
        return res;
    }

    public boolean isPowerOfTwo(int n) {
        if(n==1) return true;
        while (n > 0) {
            int rem = n % 2;
            if (rem == 1) {
                return false;
            } else {
                if (n == 2) {
                    return true;
                }
                n=n/2;
            }
        }
        return false;
    }

    public boolean isPowerOfTwoOptimized(int n) {
        return n != 0 && (n ^ (n - 1)) == n + (n - 1);
    }

    public String restoreString(String s, int[] indices) {
        char[] res = new char[s.length()];
        for (int i = 0; i < indices.length; i++) {
            res[indices[i]] = s.charAt(i);
        }
        return new String(res);
    }

}
