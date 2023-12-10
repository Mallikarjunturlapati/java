import java.util.Scanner;

class Family {
    private double income;
    private int size;

    public Family(double income, int size) {
        this.income = income;
        this.size = size;
    }

    public boolean isPoor(double housingCost, double foodCost) {
        return (housingCost + foodCost * size) > (income / 2);
    }

    public String toString() {
        return "Income: " + income + ", Size: " + size;
    }
}

public class CountPoor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of families: ");
        int k = scanner.nextInt();
        Family[] families = new Family[k];

        for (int i = 0; i < k; i++) {
            System.out.print("Enter the income and size for family " + (i + 1) + ": ");
            double income = scanner.nextDouble();
            int size = scanner.nextInt();
            families[i] = new Family(income, size);
        }

        System.out.print("Enter the average housing cost and average food cost: ");
        double housingCost = scanner.nextDouble();
        double foodCost = scanner.nextDouble();

        System.out.println("Poor families:");
        for (int i = 0; i < k; i++) {
            if (families[i].isPoor(housingCost, foodCost)) {
                System.out.println("Family " + (i + 1) + ": " + families[i]);
            }
        }
    }
}