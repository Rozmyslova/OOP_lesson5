import java.util.Scanner;

public class RationalNum {
    double num; 
   
    RationalNum () {
       Scanner sc = new Scanner(System.in);
       double num = sc.nextDouble();
       RationalNum(num);
    }

    private void RationalNum (double num) {
       this.num = num;
    }

    RationalNum (double num) {
        this.num = num;
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }
    // Сложение чисел
    RationalNum add (RationalNum number) {
        double num2 = number.getNum();
        double newNum = num + num2;
        RationalNum result = new RationalNum(newNum);
        return result;
    }
    // Вычитание чисел
    RationalNum sub (RationalNum number) {
        double num2 = number.getNum();
        double newNum = num - num2;
        RationalNum result = new RationalNum(newNum);
        return result;
    }
    // Умножение чисел
    RationalNum mul (RationalNum number) {
        double num2 = number.getNum();
        double newNum = num * num2;
        RationalNum result = new RationalNum(newNum);
        return result;
    }
    // Деление чисел
    RationalNum div (RationalNum number) {
        double num2 = number.getNum();
        double newNum = num / num2;
        RationalNum result = new RationalNum(newNum);
        return result;
    }
    // Вывод результата 
    public void print () {
        System.out.println(num);
    }
}

