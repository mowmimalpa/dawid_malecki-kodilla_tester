class Application {
    public static void main(String[] args) throws Exception {
        People Adam = new People("Adam", 40.5, 178);



        if (Adam.validateName()) {
            if (Adam.validateAge() && Adam.validateHeight()) {
                System.out.println("User is older than 30 and taller than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }

    }
}






















       // if(Adam.age > 30 && Adam.height > 160){
            //System.out.println(validateAge);
            //System.out.println(validateHeight);
            //System.out.println(validateName);
       // } else if(Adam.age < 30 && Adam.height < 160) {
            //System.out.println(notValidateAge);
            //System.out.println(notValidateHeight);
            //System.out.println(notValidateName);




