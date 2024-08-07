import java.util.*;

class FunctionalProgrammingRunner
{
    public static void main(String[] args)
    {
        List<String> list = List.of("Apples","Banana","Cat","Dog");
        printBasic(list);
        printWithFP(list);
        printWithFPWithFilter(list);
    }

    private static void printBasic(List<String> list)
    {
        for(String str:list)
        {
            System.out.println(str);
        }
    }

    private static void printWithFP(List<String> list)
    {
        list.stream().forEach(element -> System.out.println("element - " + element));
    }

    private static void printWithFPWithFilter(List<String> list)
    {
        list.stream()
            .filter(element -> element.endsWith("at"))
            .forEach(element -> System.out.println("element - " + element));
    }
}