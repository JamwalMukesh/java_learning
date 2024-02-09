import java.util.Arrays;
import java.util.List;

class First
{
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("Sahil","Mehak","Misha","Neha","Mukesh");
        names.stream().filter(name -> name.startsWith("M")).forEach(System.out::println);
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = Arrays.stream(numbers)
                        .map(x -> x * x)
                        .reduce(0, Integer::sum);

        System.out.println("Sum of squares: " + sum);
    }
}