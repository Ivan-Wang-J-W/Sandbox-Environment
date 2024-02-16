import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    while(true){
        System.out.printf("hi, enter  two numbers ");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        double num2 = sc.nextDouble();
        System.out.println("What do you want to do?");
        sc.nextLine();
        String ans = sc.next();

        check chkans = new check(ans, num, num2);
           chkans.display();
    }
}
}

class check {
    double n, m;
    String answer;
    mathCalculate calculate = new mathCalculate();
    double calAns;


    public check(String ans, double n, double m) {
        this.answer = ans;
        this.n = n;
        this.m = m;
    }

    public String getAnswer() {
        return answer;
    }

    public double getN() {
        return n;
    }

    public double getM() {
        return m;
    }

    private double checkAns() {
            switch (getAnswer()) {
                case "add":
                    calAns = calculate.mathAdd(getN(), getM());
                    break;
                case "divide":
                    calAns = calculate.mathDivide(getN(), getM());
                    break;
                case "multiply":
                    calAns = calculate.mathMultiply(getN(), getM());
                    break;
                case "subtract":
                    calAns = calculate.mathSub(getN(), getM());
                    break;
                case "exit":
            System.out.println("Goodbye");
                System.exit(0);
                    break;
                default:
            System.out.println("Error try again\n");
            break;

            }
        return calAns;
    }
    public double getAns() {
        return checkAns();
    }
    public void display(){
        if (getAns()!=0.0)
    {        
     System.out.printf("answer is : %.2f\n", getAns());
        }   
}
}

class mathCalculate {

    public double mathAdd(double n, double m) {

        double rand = n + m;
        return rand;
    }

    public double mathSub(double n, double m) {

        double rand = n - m;
        return rand;
    }

    public double mathDivide(double n, double m) {

        double rand = (n / m);
        return rand;
    }

    public double mathMultiply(double n, double m) {

        double rand = n * m;
        return rand;

    }
}


