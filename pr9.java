import java.rmi.MarshalException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int a, b, c, small, big, middle;
    Scanner input = new Scanner(System.in);
    a = input.nextInt();
    b = input.nextInt();
    c = input.nextInt();

    int max = Math.max(a, Math.max(b, c));
    int min = Math.min(a, Math.min(b, c));

    middle = (max  - min);

    System.out.println("Max is: " + max);
    System.out.println("Min is: " +  min);
    System.out.println("Middle is: " + middle);
}