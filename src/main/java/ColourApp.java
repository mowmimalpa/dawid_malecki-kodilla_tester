public class ColourApp {
    public static void main(String[] args) {
        AskCoulour getColour = new AskCoulour();
        String result = AskCoulour.getColour();
        System.out.println("Result:" + result );
    }
}
