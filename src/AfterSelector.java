import java.util.Scanner; // Импортирует нам класс Scanner из пакета java.util
public class AfterSelector {
    public static void main(String[] args) { //Главный метод; ( String[] args )-Параметры метода
        System.out.println("Введите 1, 2, 3 или 4");
        Scanner sc = new Scanner(System.in); /* Объявляет сканер. С помощью Scanner sc мы объявили,что переменная
                                                будет называться "sc" и попадёт в класс Scanner
                                              */
        int i = sc.nextInt(); /* Объявляет переменную x типа int; sc.nextInt();-это метод считывания введённого
                                 числа из консоли
                              */

    /*    switch ( переменная , подлежащая проверке) {
(case-метка ,соответствует переменной цикла i) значение  случая 1:
            код, который нужно выполнить, если переменная == значение1;
            break;

     (case) значение случая  2:
            код, который нужно выполнить, если переменная == значение2;
            break;

     (case) значение случая  3:
            код, который нужно выполнить, если переменная == значение3;
            break;

     (case) значения случая 4:
            код, который нужно выполнить, если переменная == значение4;
            break;
  (default) по умолчанию:
            код, который нужно выполнить, если значение не задано в регистре;
            break;


            switch (expression 'i' ) {
      case value1:
            // последовательность операторов1
            break;
      case value2:
            // последовательность операторов2
            break;.
.
.
.
      case valueN:
            // последовательность операторовN
            break;
      default:
            // последовательность операторов no умолчанию
}
        */

        switch ( i ) {
            case 1:
            System.out.println("Вы ввели число 1");
            break;
            case 2:
            System.out.println("Вы ввели число 2");
            break;
            case 3:
            System.out.println("Вы ввели число 3");
            break;
            case 4:
            System.out.println("Вы ввели число 4");
            break;
            default:
            System.out.println("Вы ввели неправильное число");
            break;

        }
    }
}
