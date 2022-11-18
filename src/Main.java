import java.util.*;

public class Main {
    private static class Pair
    {
        public int first;
        public int second;

        public Pair(int first, int second)
        {
            this.first = first;
            this.second = second;
        }

        @Override
        public String toString() {
            return first + "*" + second;
        }
    }

    public static void main(String[] args) {
        List<Pair> allPairs = new ArrayList<>();
        for (int first = 2; first <= 9; first++)
        {
            for (int second = first; second <= 9; second++)
            {
                allPairs.add(new Pair(first, second));
            }
        }
        Collections.shuffle(allPairs);
        List<Pair> chosenPairs = allPairs.subList(0, 15);

        System.out.print(chosenPairs);
    }
}