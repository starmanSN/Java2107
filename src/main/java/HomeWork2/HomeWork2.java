package HomeWork2;

public class HomeWork2 {
    public static void main(String[] args) {

        boolean result = isTrue(5,12);
        System.out.println(result);

        isPositive(0);

        boolean result2 = isFalse(-12);
        System.out.println(result2);

        someMethod("строка", 5);

        boolean result3 = isLeap(2021);
        System.out.println(result3);

    }
        public static boolean isTrue(int a, int b){
            int sum = a + b;
            if (sum >= 10 && sum <= 20) {
                return true;
            } else {
                return false;
            }
    }
        public static void isPositive(int i){
        if ( i >= 0) {
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }
    }
        public static boolean isFalse(int i){
        if (i < 0) {
            return true;
        }
        else{
            return false;
        }
    }

        public static void someMethod(String a, int b){
            for (int i = 1; i <= b; i++) {
                System.out.println(a);
            }
        }
        public static boolean isLeap(int y){
            if((y % 4 == 0) && (y % 100 != 0) | (y % 400 == 0)){
                return true;
            }
            else {
                return false;
            }
        }


}
