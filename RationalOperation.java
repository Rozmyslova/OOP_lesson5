import java.util.Scanner;

public class RationalOperation {
    /**
	 * @param args
	 */
	public void rationalOp(String[] args) {
		System.out.print ("Введите первое число = ");
        RationalNum number1 = new RationalNum();
        System.out.print ("Введите второе число = ");
        RationalNum number2 = new RationalNum();
        System.out.printf("Выберите действие, которые хотите выполнить:\n");
        System.out.printf("1 - сложение чисел;\n");
        System.out.printf("2 - вычитание чисел;\n");
        System.out.printf("3 - умножние чисел;\n");
        System.out.printf("4 - деление чисел;\n");
        Scanner sc = new Scanner(System.in);
        char act = sc.next().charAt(0);
        
        switch (act) {
            case '1': {
                RationalNum result_add = number1.add(number2);
                System.out.printf("Сумма чисел равна ");
                result_add.print();
                break;
            }
            case '2': {
                RationalNum result_sub = number1.sub(number2);
                System.out.printf("Разность чисел равна ");
                result_sub.print();
                break;
            }
            case '3': {
                RationalNum result_mul = number1.mul(number2);
                System.out.printf("Произведение чисел равно ");
                result_mul.print();
                break;
            }
            case '4': {
                RationalNum result_div = number1.div(number2);
                System.out.printf("Частное чисел равно ");
                result_div.print();
                break;
            }
            default: {
                System.out.println("Проверьте, верна ли операция ");
                break;
            }
        }
        sc.close();
    }
}
