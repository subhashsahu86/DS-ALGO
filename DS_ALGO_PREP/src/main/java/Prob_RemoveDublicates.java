import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Input:
list1 = [5, 3, 9, 3, 1]
list2 = [4, 9, 1, 7]

combine both list and remove duplicates then sort it to desc order
combine the list and Return frequency of each value

 */
public class Prob_RemoveDublicates {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(5,3,9,3,1);
        List<Integer> list2 = Arrays.asList(4,9,1,7);

        List<Integer> result = Stream.concat(list1.stream() , list2.stream())
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(result);

        //probem 2

        Map<Integer, Long> frqMap = Stream.concat(list1.stream(), list2.stream())
                .collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()
                ));

        System.out.println(frqMap);

        // i have a map in that we need to find the

        Map<String, String> map = new HashMap<>();
        map.put("RAM" , "MALE");
        map.put("SITA", "FEMALE");
        map.put("SITARAM", "MALE");
        map.put("SIYA", "FEMALE");

    /*    Map<String, Long> genderCount = map.values().stream()
                .collect(Collectors.groupingBy(
                        //Preson :: getGender, //*-pesrom -> person.geGender
                         Collectors.counting()
                ));
*/
       // System.out.println(genderCount);

        List<String> list = Arrays.asList("a","b");
        List<String> listt = new ArrayList<>(list);
        listt.add("Ram");

        System.out.println(listt);





    }


}
