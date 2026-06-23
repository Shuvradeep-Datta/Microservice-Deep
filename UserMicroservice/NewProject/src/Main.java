import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        int arr [] = {1,0,2,0,3,4,0,5};
        List<Integer> nonZeroList = Arrays.stream(arr).filter(num-> num != 0).boxed().collect(Collectors.toList());



//        int arr[] = {10,5,20,5,10,5};
//
//        List<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toList());
//
//        Map<Integer,Long> map =  Arrays.stream(arr).boxed().collect(Collectors.groupingBy(e->e,Collectors.counting()));
//
//        List<Integer> collect1 = Arrays.stream(arr).boxed().sorted(Comparator.<Integer>comparingLong(map::get).reversed().thenComparingInt(a -> a)).collect(Collectors.toList());
//
//        System.out.println(Arrays.toString(arr));

//        int a[] = new int[]{};
//
//        for(int i=0;i<a.length-1;i++){
//
//        }


//        String s1 = "abcd";
//        String s2 = "abcdd";
//        Map<Character, Long> freq1 = s1.codePoints().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        Map<Character, Long> freq2 = s2.codePoints().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//
//        for(Map.Entry<Character, Long> entry:freq2.entrySet()){
//            char ch = entry.getKey();
//
//
//            long secondCount =entry.getValue();
//
//
//            long firstCount = freq1.getOrDefault(ch,0l);
//
//        Map<String,Integer> mp = new TreeMap<>();
//            String maxword=  Collections.max(mp.keySet(),(a,b)->{
//
//                int cmp = mp.get(b).compareTo(mp.get(a));
//                if(cmp ==0){
//                    return a.compareTo(b);
//                }
//                return cmp;
//            });


//            if (secondCount>firstCount){
//                System.out.println("Extra count is"+ch);
//                break;
//            }
//
//        int[] arr ={10,10,10};
//
//        List<Integer> list = Arrays.stream(arr).sorted().boxed().toList();
//
//        Integer i = list.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get();
//        System.out.println(i);

//        Queue<Integer> q = new ArrayDeque<>();
//
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        q.add(2);
//        System.out.println(q);
//        List<Integer>list = new ArrayList<>(q);
//


    }
    }


//    public static void coordinates(int[][] arr) {
//        List<int[]> list = Arrays.stream(arr).collect(Collectors.toList());
//        ArrayList<Integer> ans =new ArrayList<>();
//        ans.add()
//
//        Collections.sort(list, Comparator.comparingInt(a -> a[0]));
//        for (int[] pair : list) {
//            System.out.print(Arrays.toString(pair));
//        }
//    }

