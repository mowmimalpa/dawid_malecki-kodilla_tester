public class User1 {



    public static void main(String[] args) {

        User[] uczniowie = new User[3];


        User user1 = new User("Ola",  18);
        User user2 = new User("Kasia",  28);
        User user3 = new User("Basia" ,  35);

        uczniowie[0] = user1;
        uczniowie[1] = user2;
        uczniowie[2] = user3;
        System.out.println(uczniowie[0].name);
        System.out.println(uczniowie[1].name);
        System.out.println(uczniowie[2].name);



        String[] usersName = {user1.getNames(), user2.getNames(),user3.getNames()};

        double[] usersAge = {user1.getAge(),user2.getAge(),user3.getAge()};
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




