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





    public boolean validateName() {
        if(this.name != null){
            return true;
        } else {
            return false;
        }
    }

    public boolean validateAge() {
        if(this.age >30 ) {
            return true;
        }else{
            return false;
        }

    }



    public boolean validateHeight() {
        if(this.height >160) {
            return true;
        }else{
            return false;
        }

    }






}
