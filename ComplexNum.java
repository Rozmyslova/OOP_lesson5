import java.util.Scanner;

public class ComplexNum {
    double real;
    double image;
   
    ComplexNum () {
       Scanner sc = new Scanner(System.in);
       double real = sc.nextDouble();
       double image = sc.nextDouble();
       ComplexNum(real,image);
   }

    private void ComplexNum (double real, double image) {
        this.real = real;
        this.image = image;
    }

    ComplexNum (double real, double image) {
        this.real = real;
        this.image = image;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImage() {
        return image;
    }

    public void setImage(double image) {
        this.image = image;
    }
    // Сложение комплексных чисел
    ComplexNum add (ComplexNum a) {
        double real2 = a.getReal();
        double image2 = a.getImage();
        double newReal = real + real2;
        double newImage = image + image2;
        ComplexNum result = new ComplexNum(newReal,newImage);
        return result;
    }
    // Вычитание комплексных чисел
    ComplexNum sub (ComplexNum a) {
        double real2 = a.getReal();
        double image2 = a.getImage();
        double newReal = real - real2;
        double newImage = image - image2;
        ComplexNum result = new ComplexNum(newReal,newImage);
        return result;
    }
    // Уможение комплексных чисел
    ComplexNum mul (ComplexNum a) {
        double real2 = a.getReal();
        double image2 = a.getImage();
        double newReal = real*real2 - image*image2;
        double newImage = image*real2 + real*image2;
        ComplexNum result = new ComplexNum(newReal,newImage);
        return result;
    }
    // Деление комплексных чисел
    ComplexNum div (ComplexNum a) {
        double real2 = a.getReal();
        double image2 = a.getImage();
        double newReal = (real*real2 + image*image2)/(real2*real2 + image2*image2);
        double newImage = (image*real2 - real*image2)/(real2*real2 + image2*image2);
        ComplexNum result = new ComplexNum(newReal,newImage);
        return result;
    }
    // Вывод результата
    public void print () {
        if(image > 0){
            System.out.println(real + " + " + image + "i");
        }
        else if(image < 0){
            System.out.println(real + " " + image + "i");
        }
        else{
            System.out.println(real);
        }
    }
}

