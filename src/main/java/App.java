public class App {
    public App() {
    }

    public static void main(String[] args) {
        GradeConverTer converte = new GradeConverTer();

        for(int i = 0; i < 105; ++i) {
            System.out.println("" + i + ";" + converte.convert(i));
        }

    }
}
