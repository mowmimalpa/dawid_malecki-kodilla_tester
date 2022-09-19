class Application {
    public static void main(String[] args) throws Exception {
        People Adam = new People("Adam", 40.5, 178);

        if(Adam.age > 30 && Adam.height > 160){
            System.out.println("User is older than 30 and higher then 160cm");
        } else {
            System.out.println("User is younger than 30 or lower than 160cm");
        }
    }
}

