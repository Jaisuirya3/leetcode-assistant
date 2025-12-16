import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Solutions solutions=new Solutions();
//        isPalindrome
//        int n=sc.nextInt();
//        System.out.println(solutions.isPalindrome(n));

//        Counting number of vowels and consonants
//        String str=sc.nextLine();
//        int[] counts= solutions.countVowelsAndConsonants(str);
//        if(counts[0]==0 && counts[1]==0){
//            System.out.println("Given string contains numbers or special characters");
//        }else {
//            System.out.println("Vowels count: "+counts[0]+"\nConsonants count: "+counts[1]);
//        }

//        Java substring
//        String s = sc.next();
//        int start = sc.nextInt();
//        int end = sc.nextInt();
//        String subString = solutions.subString(s,start,end);
//        System.out.println(subString);

//        Substring comparison
//        String str=sc.nextLine();
//        int k=sc.nextInt();
//        String[] substrings=solutions.subStringComparison(str,k);

//        Right angle triangle pattern one
     /*   *
          * *
          * * *
          * * * *
          * * * * *
      */
//        int lines=sc.nextInt();
//        solutions.rightAngleTriangle1(lines);

//        Right angle triangle pattern two
//        int lines=sc.nextInt();
//        solutions.rightAngleTriangle2(lines);

//        Right angle triangle pattern three
//        int lines=sc.nextInt();
//        solutions.rightAngleTriangle3(lines);

//        Right angle triangle pattern four
//        int lines=sc.nextInt();
//        solutions.rightAngleTriangle4(lines);

//        Right angle triangle pattern with numbers one
         /* 1
            2 6
            3 7 10
            4 8 11 13
            5 9 12 14 15
         */
//        int lines=sc.nextInt();
//        solutions.rightAngleTrianglewithNumbers(lines);

//        Rock Paper Scissors game
//        String str=sc.nextLine();
//        solutions.rockPaperScissors(str);

//        Bicycle
/*        Bicycle bicycle1=new Bicycle();
        Bicycle bicycle2=new Bicycle();
        bicycle1.field=3;
        System.out.println(bicycle1.field);
        System.out.println(bicycle2.field);
        bicycle1.breaking();

 */

//        Play with the lamp
/*        Lamp lampOne = new Lamp(1, 2026, 2021);
        boolean userContinues=true;
        while (userContinues) {
            System.out.println("1. Current Status of Lamp\n2. Turn on\n3. Turn off\n4. Print Lamp details\n5. End");
            int num=sc.nextInt();
            switch (num){
                case 1:
                    lampOne.currentStatus();
                    break;
                case 2:
                    lampOne.turnOn();
                    break;
                case 3:
                    lampOne.turnOff();
                    break;
                case 4:
                    lampOne.printLampDetails();
                    break;
                case 5:
                    userContinues=false;
            }
        }

 */


//        String sentence=sc.nextLine();
//        String word=sc.nextLine();
//        Solutions.wordInSentence(sentence, word);

//        Recursive sum of first n natural numbers
//        int n=sc.nextInt();
//        System.out.println(solutions.recSumOfNtwo(n));

//        Factorial of a number using recursion
//        int n=sc.nextInt();
//        System.out.println(solutions.factorial(n));

//        reverse an array using recursion
//        int size=sc.nextInt();
//        int[] arr=new int[size];
//        for(int i=0; i<size; i++){
//            arr[i]=sc.nextInt();
//        }
//        int[] revArr=solutions.reverseAnArray(arr,size,0,new int[size]);
//        for(int i=0; i<size; i++){
//            System.out.println(revArr[i]);
//        }

//        Find capacity of water stored between elevated bars. Height of bars given in the array.
//        int n=sc.nextInt();
//        sc.nextLine();
//        int[] elevPoints=new int[n];
//        for(int i=0; i<n; i++){
//            elevPoints[i]=sc.nextInt();
//        }
//        System.out.println(solutions.capacityOfWater(n, elevPoints));


//        Array input
//        int[] arr=inputs.getArrayInput();
//        hashing with array
//        int[] hash={0,0,0,0,0,0,0,0,0,0,0,0};
//        for(int i=0; i<n; i++){
//            hash[arr[i]]++;
//        }
//        System.out.println(Arrays.toString(hash));

//        hashing with hashmap

//        HashMap<Integer, Integer> hashMap=new HashMap<Integer, Integer>();
//        for(int i=0; i<n; i++){
//            int freq= hashMap.getOrDefault(arr[i], 0);
//            freq++;
//            hashMap.put(arr[i], freq);
//        }
//        System.out.println(hashMap);

//        int[] arr=inputs.getArrayInput();
//        solutions.quickSort(arr);
//        System.out.println("After sort: " +Arrays.toString(arr));

//        Largest element in the array
//        System.out.println("Enter Five numbers:");
//        int[] arr=inputs.getArrayInput(5);
//        System.out.println("Largest element is "+solutions.largestElementInArray(arr));

//        Second largest in the array
//        int[] arr=inputs.getArrayInput();
//        System.out.println("Second largest is "+solutions.secondLargest(arr));

//        check if array is sorted
//        int[] arr=inputs.getArrayInput();
//        System.out.println("isSorted: "+ solutions.isSorted(arr));

//        remove duplicates
//        int[] arr=inputs.getArrayInput();
//        System.out.println("Total unique elements: "+solutions.removeDuplicates(arr));
//        System.out.println(Arrays.toString(arr));

//        Equilibrium point in the array
//        int[] arr=inputs.getArrayInput();
//        System.out.println("Equilibrium point: "+solutions.findEquilibrium(arr));

//        Left rotate by one place
//        int[] arr=inputs.getArrayInput();
//        solutions.leftRotateByOnePlace(arr);
//        System.out.println(Arrays.toString(arr));

//        left rotate by d places
//        int d=sc.nextInt();
//        int n=sc.nextInt();
//        int[] arr=inputs.getArrayInput(n);
//        solutions.leftRotateByDPlaces(arr,d);
//        System.out.println(Arrays.toString(arr));

//        move the zeroes to the end
//        int n= sc.nextInt();
//        int[] arr=inputs.getArrayInput(n);
//        solutions.moveZeroes2(arr);
//        System.out.println(Arrays.toString(arr));

//        Linear search
//        int n=sc.nextInt();
//        int[] arr = inputs.getArrayInput(n);
//        int search=sc.nextInt();
//        System.out.println(solutions.linearSearch(arr,search));

//        Union of two array
//        int n1=sc.nextInt();
//        int[] arr1=inputs.getArrayInput(n1);
//        int n2=sc.nextInt();
//        int[] arr2=inputs.getArrayInput(n2);
//        System.out.println(solutions.unionOf(arr1,arr2));

//        Find missing number in the array between 1 to n
//        int n=sc.nextInt();
//        int[] arr=inputs.getArrayInput(n-1);
//        System.out.println(solutions.findMissing2(arr,n));

//        Maximum consecutive ones
//        int n=sc.nextInt();
//        int[] arr=inputs.getArrayInput(n);
//        System.out.println(solutions.maxConsecutiveOnes(arr, arr.length));

//        Find the number that appears only once in the array, other appears twice
//        int n=sc.nextInt();
//        int[] arr = inputs.getArrayInput(n);
//        System.out.println(solutions.findElementAppearingOnce(arr));

//        length of longest subarray with sum k
//        int n=sc.nextInt();
//        int[] arr = inputs.getArrayInput(n);
//        int k=sc.nextInt();
//        System.out.println(solutions.lengthOfLongestSubArray(arr,k));

//        paint color filling (with 2d array)
//        int m= sc.nextInt();
//        int n = sc.nextInt();
//        int[][] screen = new int[m][n];
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                screen[i][j] =sc.nextInt();
//            }
//        }
//        int k = sc.nextInt();
//        int i=sc.nextInt();
//        int j=sc.nextInt();
//        solutions.changeColorIn2DMatrix(screen,m,n,k,i,j,screen[i][j]);
//        for (int[] arr : screen) {
//            System.out.println(Arrays.toString(arr));
//        }

//        longest sub array with sum k
//        int n=sc.nextInt();
//        int[] arr = inputs.getArrayInput(n);
//        int k=sc.nextInt();
//        System.out.println(solutions.lengthOfSmallestSubArray(arr,k));

//        two sum
//        int n=sc.nextInt();
//        int[] arr = inputs.getArrayInput(n);
//        int target=sc.nextInt();
//        System.out.println(Arrays.toString(solutions.moreOptimizedTwoSum(arr, target)));

//        sort the array that only contains 0,1,2
//        int n=sc.nextInt();
//        int[] arr=inputs.getArrayInput(n);
//        solutions.optimisedSort012Array(arr);
//        System.out.println(Arrays.toString(arr));\

//        majority element
//        int n=sc.nextInt();
//        int[] arr = inputs.getArrayInput(n);
//        System.out.println(solutions.majorityElement(arr));

////        binary search
//        int n=sc.nextInt();
//        int[] arr = inputs.getArrayInput(n);
//        int k=sc.nextInt();
//        System.out.println(solutions.binarySearch(arr,k,0,n-1));

//        subarray with maximum sum
//        int n=sc.nextInt();
//        int[] arr = inputs.getArrayInput(n);
//        System.out.println(solutions.maxSum(arr));

//        longest common prefix
//        String[] strs=new String[]{"flower", "flow", "flight"};
//        System.out.println(solutions.longestCommonPrefix(strs));

//        find index of the first occurence in a string
//        String haystack=sc.next();
//        String needle=sc.next();
//        System.out.println(solutions.strStr(haystack,needle));

//        length of the last word
//        String s=sc.nextLine();
//        System.out.println(solutions.lengthOfLastWord(s));

//        Plus one
//        int[] nums = inputs.getArrayInput(6);
//        System.out.println(Arrays.toString(solutions.buildArray2(nums)));

//        number of good pairs
//        int[] nums = inputs.getArrayInput(4);
//        System.out.println(solutions.numIdenticalPairs2(nums));

//        find value after operations
//        String[] operations = new String[]{"--X","X++","X++", "X--", "X++", "++X"};
//        System.out.println(solutions.finalValueAfterOperations(operations));

//        Shuffle the array
//        int[] nums = inputs.getArrayInput(8);
//        System.out.println(Arrays.toString(solutions.shuffle(nums,4)));

//        Largest Local Values in a Matrix
//        int[][] grid=new int[][] {{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
//        int[][] grid = {
//                {1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12},
//                {13, 14, 15, 16}
//        };
//
//        int[][] res = solutions.largestLocal(grid);
//        for (int i = 0; i < res.length; i++) {
//            System.out.println(Arrays.toString(res[i]));
//
//        }

//        int[] arr=inputs.getArrayInput(6);
//        int k=sc.nextInt();
//        System.out.println(Arrays.toString(solutions.rotateArray(arr,k)));

//        int n=sc.nextInt();
//        System.out.println(solutions.generateFibonacci(n));

//        String s=sc.nextLine();
//        System.out.println(solutions.isPalindrome(s));
//        int m=sc.nextInt();
//        int n=sc.nextInt();
//        List<Integer> list1=new ArrayList<>();
//        List<Integer> list2=new ArrayList<>();
//        for (int i = 0; i < m; i++) {
//            list1.add(sc.nextInt());
//        }
//        for (int i = 0; i < n; i++) {
//            list2.add(sc.nextInt());
//        }
//        System.out.println(solutions.mergeSortedLists(list1, list2));

//        String s=sc.nextLine();
//        System.out.println(solutions.lengthOfLongestSubstring(s));

//        int[] nums1=inputs.getArrayInput(6);
//        int[] nums2=inputs.getArrayInput(4);
//        solutions.merge(nums1, Math.abs(nums1.length-nums2.length), nums2, nums2.length);
//        int n=sc.nextInt();
//        System.out.println(solutions.generatePascal(n));

//        int n=sc.nextInt();
//        System.out.println(solutions.getRow(n));

//        int[] prices = inputs.getArrayInput(5);
//        System.out.println(solutions.maxProfit(prices));

//        int[] arr = inputs.getArrayInput(2);
//        System.out.println(solutions.containsNearbyDuplicate(arr,2));

//        int[] arr = inputs.getArrayInput(3);
//        int[] arr2=inputs.getArrayInput(5);
//        System.out.println(Arrays.toString(solutions.intersection(arr, arr2)));

//        int[][] grid = new int[][]{{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
//        System.out.println(solutions.islandPerimeter(grid));

//        int[] g = new int[]{262,437,433,102,438,346,131,160,281,34,219,373,466,275,51,118,209,32,108,57,385,514,439,73,271,442,366,515,284,425,491,466,322,34,484,231,450,355,106,279,496,312,96,461,446,422,143,98,444,461,142,234,416,45,271,344,446,364,216,16,431,370,120,463,377,106,113,406,406,481,304,41,2,174,81,220,158,104,119,95,479,323,145,205,218,482,345,324,253,368,214,379,343,375,134,145,268,56,206};
//        int[] s = new int[]{149,79,388,251,417,82,233,377,95,309,418,400,501,349,348,400,461,495,104,330,155,483,334,436,512,232,511,40,343,334,307,56,164,276,399,337,59,440,3,458,417,291,354,419,516,4,370,106,469,254,274,163,345,513,130,292,330,198,142,95,18,295,126,131,339,171,347,199,244,428,383,43,315,353,91,289,466,178,425,112,420,85,159,360,241,300,295,285,310,76,69,297,155,416,333,416,226,262,63,445,77,151,368,406,171,13,198,30,446,142,329,245,505,238,352,113,485,296,337,507,91,437,366,511,414,46,78,399,283,106,202,494,380,479,522,479,438,21,130,293,422,440,71,321,446,358,39,447,427,6,33,429,324,76,396,444,519,159,45,403,243,251,373,251,23,140,7,356,194,499,276,251,311,10,147,30,276,430,151,519,36,354,162,451,524,312,447,77,170,428,23,283,249,466,39,58,424,68,481,2,173,179,382,334,430,84,151,293,95,522,358,505,63,524,143,119,325,401,6,361,284,418,169,256,221,330,23,72,185,376,515,84,319,27,66,497};
//        int[] g = new int[]{3, 2, 1, 1, 1};
//        int[] s = new int[]{4, 3, 2, 2};
//        System.out.println(solutions.findContentChildren(g, s));

//        String s=sc.nextLine();
//        System.out.println(solutions.isPalindrome2(s));

//        int n=sc.nextInt();
//        System.out.println(solutions.convertToTitle(n));

//        int[] nums=new int[]{};
//        System.out.println(solutions.findLHS(nums));

//        String s=sc.nextLine();
//        String t=sc.nextLine();
//        System.out.println(solutions.isAnagram(s,t));

//        char[] chars = sc.nextLine().toCharArray();
//        solutions.reverseString(chars);
//        System.out.println(Arrays.toString(chars));
//
//        String pattern=sc.nextLine();
//        String s=sc.nextLine();
//        System.out.println(solutions.wordPattern(pattern,s));

//        String s=sc.nextLine();
//        System.out.println(solutions.reverseVowels(s));

//        String ransomNote = sc.nextLine();
//        String magazine = sc.nextLine();
//        System.out.println(solutions.canConstruct(ransomNote,magazine));

//        String s=sc.nextLine();
//        System.out.println(solutions.firstUniqChar(s));


//        MethodParser.runTheMethod("public int firstUniqChar(String s)");
//        MethodParser.runTheMethod("public boolean canConstruct(String ransomNote, String magazine)");
//        MethodParser.runTheMethod("public boolean isAnagram(String s, String t)");
//        MethodParser.runTheMethod("public char findTheDifference(String s, String t)");
//        MethodParser.callTheMethod("public char findTheDifference2(String s, String t)", Solutions.class);
//        MethodParser.callTheMethod("public int longestPalindrome(String s)", Solutions.class);
//        MethodParser.callTheMethod("public List<String> fizzBuzz(int n)", Solutions.class);
//        MethodParser.callTheMethod("public String addStrings(String num1, String num2)", Solutions.class);
//        MethodParser.callTheMethod("public boolean repeatedSubstringPattern(String s)", Solutions.class);
//        MethodParser.callTheMethod("public int countSegments(String s)", Solutions.class);
//        MethodParser.callTheMethod("public String licenseKeyFormatting2(String s, int k)", Solutions.class);
//        MethodParser.callTheMethod("public boolean detectCapitalUse2(String word)", Solutions.class);
//        MethodParser.callTheMethod("public int scoreOfString(String s)", Solutions.class);
//        MethodParser.callTheMethod("public String reverseStr(String s, int k)", Solutions.class);
//        MethodParser.callTheMethod("public int numJewelsInStones(String jewels, String stones)", Solutions.class);
//        MethodParser.callTheMethod("public int minPartitions(String n)", Solutions.class);
//        MethodParser.callTheMethod("public boolean isPowerOfTwo(int n)", Solutions.class);
//        MethodParser.callTheMethod("public boolean isPowerOfTwoOptimized(int n)", Solutions.class);
        MethodParser.callTheMethod("public String restoreString(String s, int[] indices)", Solutions.class);
        }

}
