import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

class Four {
    public static void main(String[] args) {
        // List of names
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Using a lambda expression to filter names starting with 'A'
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("Filtered Names: " + filteredNames);

        // Using a higher-order function to apply a transformation
        List<String> upperCaseNames = map(names, String::toUpperCase);
        System.out.println("Upper Case Names: " + upperCaseNames);

        // Using Optional
        Optional<String> optionalName = Optional.of("John");
        optionalName.ifPresent(name -> System.out.println("Optional Name: " + name));
    }

    public static <T, R> List<R> map(List<T> list, Function<T, R> func) {
        return list.stream().map(func).collect(Collectors.toList());
    }
}
