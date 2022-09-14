public class Notebook {
    int weight;
    int price;

    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }


    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap");
        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("The price is good");
        } else {
            System.out.println("This notebook is expensive");
        }

    }



    public void checkWeight() {
        if (this.weight < 800) {
            System.out.println("This is light notebook");
        } else if (this.weight >= 800 && this.weight <= 1500) {
            System.out.println("This notebook is not too heavy");
        } else {
            System.out.println("This is very heavy notebook");
        }
    }

    public void discountConditions() {
        if (this.price >= 800 && this.year > 2015) {
            System.out.println("Special promotion - 8% off");
        } else if (this.price < 1250 && this.price > 1650 && this.year >= 2018 && this.year < 2020) {
            System.out.println("Special promotion - 4% off");
        } else {
            System.out.println("Regular price");
        }
    }
}



