import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class KnapsackProblem implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Knapsack k1 = (Knapsack) o1;
        Knapsack k2 = (Knapsack) o2;
        Double profitPerUnit_a = (double) (k1.profit/ k1.weight);
        Double profitPerUnit_b = (double) (k2.profit/k2.weight);
        return profitPerUnit_b.compareTo(profitPerUnit_a);
    }
    public static class Knapsack{
        double profit;
        double weight;
        public Knapsack(double profit, double weight){
            this .profit = profit;
            this .weight = weight;
        }
    }

    public static void main(String [] arg){

        Knapsack k1 = new Knapsack(25,18);
        Knapsack k2 = new Knapsack(24,15);
        Knapsack k3 = new Knapsack(15,10);

        ArrayList<Knapsack> knapsackArrayList = new ArrayList<>();
        knapsackArrayList.add(k1);
        knapsackArrayList.add(k2);
        knapsackArrayList.add(k3);

        int maxBagSize = 20;
        double maximumProfit = greedyKnapsack(knapsackArrayList,maxBagSize);
        System.out.println(maximumProfit);


    }
    public static double greedyKnapsack(ArrayList<Knapsack> knapsackArrayList, int maxBagSize){
        Comparator comparator = new KnapsackProblem();

        Collections.sort(knapsackArrayList,comparator);

        for(Knapsack k : knapsackArrayList){
            System.out.println(k.weight);
        }
        double maxProfit =0;

        while (maxBagSize>0){
            Knapsack k = knapsackArrayList.get(0);

            if(k.weight<maxBagSize){
                maxBagSize = (int) (maxBagSize-k.weight);
                maxProfit = maxProfit+k.profit;
                knapsackArrayList.remove(k);
            }else {
                double profit =maxBagSize*(k.profit/k.weight);
                maxProfit= maxProfit+k.profit;
                maxBagSize = maxBagSize-maxBagSize;
            }
        }
        return maxProfit;
    }

}












