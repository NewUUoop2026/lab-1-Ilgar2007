//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int number;
    int sum = 0;
    System.out.println("Enter a four digit number: ");
    Scanner input = new Scanner(System.in);
    number = input.nextInt();
    for(int i = 0; i< 4; i++){
        sum += number%10;
        number = number/10;
    }
    System.out.println(sum);

}