class Application
{
    public static void main (String[] args) throws Exception
    {
        String name = "Adam";
        Double age = Double.valueOf(40.5);
        Double height = Double.valueOf(178);

        if(name != null) {
            if(age > 30 && height > 160) {
                System.out.println("User is older than 30 and higher then 160cm");
            } else {
                System.out.println("User is younger than 30 or lower than 160cm");
            }
        }
    }
}