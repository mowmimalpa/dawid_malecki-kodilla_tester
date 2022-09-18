public class Grades {
    private int[] grades;
    private int size;

    public Grades(){
        this.grades = new int[10];
        this.size = 0;

    }

    public void add (int value){
        if (this.size ==10){
            return;

        }
        this.grades[this.size] = value;
        this.size++;

        public int theLastOne (int value) {
            return value;

            public double avarageOfgrades() {
                int suma=0;
                for (int i = 0; i < this.size; i++) {
                    suma += grades[i];
                }
                int average = suma/(size+1);
                return(average());
            }

        }
