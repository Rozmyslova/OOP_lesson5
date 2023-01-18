import java.util.Scanner;

public class UImenu {
    public void mainMenu() {
        System.out.printf("Представляю вам мой новый калькулятор. \n");
        System.out.printf("Выберите, с какими числами вы хотите работать: \n");
        System.out.printf("1 - рациональные числа; \n");
        System.out.printf("2 - комплексные числа. \n");
        System.out.printf("Ваш выбор: ");
        Scanner sc = new Scanner(System.in);
        char action = sc.next().charAt(0);
        switch (action) {
            case '1': {
                RationalOperation operation = new RationalOperation();
                operation.rationalOp(null);
                break;
            }
            case '2': {
                ComplexOperation operation = new ComplexOperation();
                operation.complexOp(null);
                break;
            }
            default: {
                System.out.println("Пункта меню с таким номером нет, проверьте правильность вводимого числа ");
                break;
            }
        }
        sc.close();
    }
}
