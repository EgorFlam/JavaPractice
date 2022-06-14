public class Container
{
    public int count;

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
        String s = number.toString(); //преоброзование числовое значение в строковое значение
        Integer sum = 0; //задаем точку (индекс) отсчета для строки с начала, то есть вводим 0, так как в JAVA отсчет
                        //ничанется с 0.
        for (int i = 0; i < s.length(); i++) {
            sum += Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        return sum;
    }
}