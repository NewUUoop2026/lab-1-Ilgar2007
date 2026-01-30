//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    double length, height, area, volume;
    Scanner input = new Scanner(System.in);
    length = input.nextDouble();
    height = input.nextDouble();
    area = length*length*(Math.sqrt(3)/4);
    volume = area * height;

    System.out.printf("Area: "  + area );
    System.out.println("Volume: "  + volume);



}