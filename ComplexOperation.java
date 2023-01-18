import java.util.Scanner;

public class ComplexOperation {
 
	/**
	 * @param args
	 */
        public void complexOp(String[] args) {
		System.out.print ("Введите действительную и мнимую часть первого комплексного числа (через пробел) = ");
                ComplexNum number1 = new ComplexNum();
                System.out.print ("Введите действительную и мнимую часть второго комплексного числа (через пробел) = ");
                ComplexNum number2 = new ComplexNum();
                System.out.printf("Выберите действие, которые хотите выполнить:\n");
                System.out.printf("1 - сложение чисел;\n");
                System.out.printf("2 - вычитание чисел;\n");
                System.out.printf("3 - умножние чисел;\n");
                System.out.printf("4 - деление чисел;\n");
                Scanner sc = new Scanner(System.in);
                char act = sc.next().charAt(0);
                
                switch (act) {
                        case '1': {
                                ComplexNum result_add = number1.add(number2);
                                System.out.printf("Сумма чисел равна ");
                                result_add.print();
                                break;
                        }
                        case '2': {
                                ComplexNum result_sub = number1.sub(number2);
                                System.out.printf("Разность чисел равна ");
                                result_sub.print();
                                break;
                        }
                        case '3': {
                                ComplexNum result_mul = number1.mul(number2);
                                System.out.printf("Произведение чисел равно ");
                                result_mul.print();
                                break;
                        }
                        case '4': {
                                ComplexNum result_div = number1.div(number2);
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
