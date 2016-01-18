/* 10 процентов
Реализуйте метод addTenPercent, который увеличивает переданное целое число на 10%.
Исправьте ошибку в сигнатуре метода.
Подсказка: подумайте, какие у этого метода входные и выходные данные.
*/
public class ConvertToUsd {
    public static double addTenPercent(int i) {
        //напишите тут ваш код
        double result=0;
        result = result + (i*1.1);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(10));
    }
}