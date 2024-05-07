public class GradeConverTer {
    public GradeConverTer() {
    }

    public String convert(int score) {
        if (score <= 100 && score >= 90) {
            return "A";
        } else if (score <= 89 && score > 80) {
            return "B";
        } else if (score <= 79 && score >= 70) {
            return "C";
        } else if (score <= 69 && score >= 60) {
            return "D";
        } else {
            return score <= 59 && score > 0 ? "E" : "Invalid";
        }
    }
}
