import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaPriciple {
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(10,5,10);
//        int[] arr = new int[]{10,10,20};
//        Integer i = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
//        System.out.println(i);
//        Map<Integer,Integer> map = new HashMap<>();
//        int[] array = Arrays.stream(arr).distinct().toArray();
//        System.out.println(arr.length);
//        String s ="";
//        char[] charArray = s.toCharArray();

//String s= "anagram";
//String t = "nagaram";
//        System.out.println(isAnagram(s,t));
//
//
//    }
//
//    private static boolean isAnagram(String s, String t) {
//
//        char[] s1 = s.toCharArray();
//        char[] s2 = t.toCharArray();
//        Arrays.sort(s1);
//        Arrays.sort(s2);
//
//        if(s1.equals(s2)){
//            return true;
//        }else
//
//
//
//    }
//        String s = "aabb";
//
//        Map<String,Long> freq =Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    int[] nums = new int[]{1,2,3,4,6,7,8,8};

        System.out.println(findDuplicate(nums));

    }

    static int findDuplicate(int[] nums){
        Set<Integer> set = new HashSet<>();

        int i = Arrays.stream(nums).filter(t -> !set.add(t)).findFirst().getAsInt();//.mapToInt(Integer::valueOf).findFirst().getAsInt();
        return i;
    }
}
