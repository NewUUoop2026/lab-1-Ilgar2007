//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    double distance, miles_gallon, price_gallon, total_cost;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the driving distance: ");
    distance = input.nextDouble();

    System.out.println("Enter miles per gallon: ");
    miles_gallon = input.nextDouble();

    System.out.println("Enter the price per gallon: ");
    price_gallon = input.nextDouble();

    total_cost = (distance/miles_gallon)*price_gallon;
    System.out.println("Total cost is: "+total_cost);


}