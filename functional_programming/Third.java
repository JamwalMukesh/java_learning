import java.util.List;

class Third {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);
        // numbers.stream().forEach(element -> System.out.println(element));

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Sum: " + sum);

        int sum1 = numbers.stream().reduce(0, (num1,num2) -> num1 + num2);

        System.out.println("Sum: " + sum1);

    }
}
