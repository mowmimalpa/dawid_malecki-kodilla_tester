class Application {
    public static void main(String[] args) throws Exception {
        People Adam = new People("Adam", 40.5, 178);

        boolean validateName;
        boolean validateAge;
        boolean validateHeight;

        if (Adam.age > 30 && Adam.height > 160) {
            validateName = true;
            validateAge = true;
            validateHeight = true;
        } else {
            validateAge = false;
            validateHeight = false;
            validateName = false;
        }
        System.out.println(validateAge);
        System.out.println(validateHeight);
        System.out.println(validateName);

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




