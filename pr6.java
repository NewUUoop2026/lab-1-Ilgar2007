//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner input=new Scanner(System.in);
    double cost, tip, tax, total;
    System.out.print("Enter meal cost: ");
    cost = input.nextDouble();

    tip = 0.18 * cost;
    tax = 0.15 * cost;
    total = cost + tip + tax;

    System.out.print("The meal cost is ");
    System.out.printf("%.2f\n",cost);
    System.out.print("The tax amount is ");
    System.out.printf("%.2f\n",tax);
    System.out.print("The tip amount is ");
    System.out.printf("%.2f\n",tip);
    System.out.print("The total amount you have to pay is ");
    System.out.printf("%.2f\n",total);
}