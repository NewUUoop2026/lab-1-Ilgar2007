//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    double radius;
    double length;
    Scanner input = new Scanner(System.in);
    radius =input.nextDouble();
    length =input.nextDouble();
    double area = radius*radius*Math.PI;
    double volume = area * length;

    System.out.println("Area: "+ area );
    System.out.println("Volume: "+ volume );

}