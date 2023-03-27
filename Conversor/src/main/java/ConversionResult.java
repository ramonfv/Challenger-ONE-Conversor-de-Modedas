public class ConversionResult {
    private String date;
    private double result;

    public ConversionResult(String date, double result) {
        this.date = date;
        this.result = result;
    }

    public String getDate() {
        return date;
    }

    public double getResult() {
        return result;
    }
}