public class User1 {



    public static void main(String[] args) {
        User Ola  = new User("Ola",  18);
        User Kasia = new User("Kasia",  28);
        User Basia = new User("Basia" ,  35);

        String[] usersName = {Ola.getNames(), Basia.getNames(),Kasia.getNames(),Basia.getNames()};

        double[] usersAge = {Ola.getAge(),Kasia.getAge(),Basia.getAge()};
        System.out.println(usersName.length);


        double sum = 0.0;
        int usersQuantity = usersAge.length;

        for(int i=0; i < usersAge.length;i++){
            sum += usersAge[i];
            if (usersAge[i] < usersQuantity) {
                System.out.println(usersName[i] + usersAge[i]);
            }

        }

        double averageAge = sum / usersQuantity;
        System.out.println(averageAge );


            }
        }




