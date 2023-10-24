import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();
        measureTime(linkedList);
        measureTime(arrayList);
    }

    private static void measureTime(List<Integer> list) {


        long start = System.currentTimeMillis();

        for (int i=0; i < 100000; i++) {
         //   list.add(i); // при таком методе кадое следующее число добавляется в конец листа [] -> [0] -> [0][1] -> [0][1][2]...
            list.add(0, i); // при таком случае метод в качестве аргументов принимает на вход сперва индекс,
            // куда вставить элемент, а затем вторым аргументом сам элемент [] -> [0] -> [1][0] -> [2][1][0]...
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }


}
