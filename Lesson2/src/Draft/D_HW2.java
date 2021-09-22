package Draft;

public class D_HW2 {

    public static void main(String[] args){

    Checksum ( 5, 6 );



        // 1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
        // если да – вернуть true, в противном случае – false.

        public static boolean Checksum (int a, int b){
         if ((a + b) >=10 && (a + b) <= 20)
             return true;
         else
             return false;
        }

    }


}
