class People
{
    public String name;
    public double age;
    public double height;

    public People(String name, double age, double height)
    {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public String getName() {
        return name;
    }




    public void validateName(String name) {
        this.name = name;
    }

    public double validateAge() {
        return age;
    }

    public void validateAge(double age) {
        this.age = age;
    }

    public double validateHeight() {
        return height;
    }

    public void validateHeight(double height) {
        this.height = height;
    }



}
