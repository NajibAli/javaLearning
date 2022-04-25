public class ControlFlow {
    public static void main(String[] args) {
        int n = 0;
        while (n < 10) {
            System.out.println(n + " " + (n+10));
            n++;
        }

        n = 0;
        int power = 1;
        while (n < 10) {
            System.out.println(n + "  2^"+n+" = " + power);
            power = power * 2;
            n++;
        }

       for (int i = 0; i < 10; i++) {
        System.out.println(i + " " + (i+10)); 
       } 

       power = 1;
       for (int i = 0; i < 10; i++) {
        System.out.println(i + "  2^"+i+" = " + power);
        power = power * 2;
       }

       int i = 5;
       if (i < 6 && i > 0) {
        System.out.println("Weekday");
           
       } else {
           System.out.println("weekend");
       }

       int day = 6;
       switch (day) {
            case 5:
                System.out.println("Weekend");
                break;
            case 6:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Weekday");    
                break;
       }

       for (int j = 0; j < 7; j++) {
            switch (j) {
                case 5:
                    System.out.println(j+ " Weekend");
                    break;
                case 6:
                    System.out.println(j+ " Weekend");
                    break;
                default:
                    System.out.println(j+ " Weekday");    
                    break;
            }
       }

       leapYear(2024);
       leapYear(2022);

    }

    static void leapYear(int year) {
        if((year % 4 == 0) && ((year%400 == 0) || (year%100 != 0))){
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

}
