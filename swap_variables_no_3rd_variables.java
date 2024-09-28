public class swap_variables_no_3rd_variable {
    public static void main(String[] args) {
    int a = 20;
    int b = 10;
    System.out.println("Before swap: "+(a+" "+b));

    a = a +b;
    b= a-b;
    a = a-b;

    System.out.println(a+" "+b);
    }
}
