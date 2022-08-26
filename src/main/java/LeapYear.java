public class LeapYear {

    public static void main(String[] args) {

        // rok do sprawdzenia
        int year = 2137;
        boolean leap = false;

        // jeśli rok jest podzielony przez 4
        if (year % 4 == 0) {

            // jeśli rok to stulecie
            if (year % 100 == 0) {

                // jeśli rok jest podzielony przez 400
                // to jest rok przestępny
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }

            // jeśli rok nie jest stuleciem
            else
                leap = true;
        }

        else
            leap = false;

        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}