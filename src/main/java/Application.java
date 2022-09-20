class Application {
    public static void main(String[] args) throws Exception {
        People Adam = new People("Adam", 40.5, 178);

        boolean validateName = true;
        boolean validateAge = true;
        boolean validateHeight = true;

        boolean notValidateName = false;
        boolean notValidateAge = false;
        boolean notValidateHeight = false;

        if(Adam.age > 30 && Adam.height > 160){
            System.out.println(validateAge);
            System.out.println(validateHeight);
            System.out.println(validateName);
        } else if(Adam.age < 30 && Adam.height < 160) {
            System.out.println(notValidateAge);
            System.out.println(notValidateHeight);
            System.out.println(notValidateName);
        }
    }
}

