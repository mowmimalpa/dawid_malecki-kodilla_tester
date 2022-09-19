public class Grades1 {
    private int grades[];

    private int size;

    public Grades1() {
        this.grades = new int[10];
        this.size = 0;

        int numberOfElements = grades.length;



    }
    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;

    }

    public int sumAverage(){

        int sum = 0;

        for(int i = 0; i < grades.length; i++){
            sum +=grades[i];

        }
        int gradesAmount = sum /grades.length;
        return gradesAmount;
    }

    public int getLast(){
        return this.grades[this.size - 1];
    }
}
