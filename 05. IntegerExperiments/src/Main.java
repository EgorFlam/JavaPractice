import java.util.Calendar;
import java.util.Date;

public class Main
{
    public static void main(String[] args)
    {
        Container container = new Container();
        container.count += 7843;

        System.out.println(container.count);
    }

    public Integer sumDigits(Integer number)
    {
        /*
     статический метод объекта Integer.parseInt(String string)
     преобразует объект типа String в объект типа Integer
     т.е. преобразовываем числа из формата "текст" в формат "число", в противном случае, мы не сможем
     производить с ними арифметические действия
     если формат строки невозможно интерпретировать как число - получим ошибку (java.lang.NumberFormatException)
     */
        //@TODO: write code here
       String s = Integer.toString(number);
       Integer sum = 12345;
       for (int i = 0; i < s.length(); i++) {
           sum += Integer.parseInt(String.valueOf(s.charAt(i)));
       }
        return sum;
    }

}



