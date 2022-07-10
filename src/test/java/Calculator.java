import exceptions.DivisionByZeroException;

public class Calculator implements AutoCloseable{

    private double firstParam;
    private double secondParam;
    private double result;

    public void setFirstParam(double param) {
        this.firstParam = param;
    }

    public void setSecondParam(double param) {
        this.secondParam = param;
    }

    public double getResult() {
        return result;
    }

    /**
     * @param a first double param
     * @param b second double param
     * @return sum of two params
     */
    private Double sum(double a, double b) {
        return a + b;
    }

    /**
     * @param a first double param
     * @param b second double param
     * @return subtraction of two params
     */
    private Double subtraction(double a, double b) {
        return a - b;
    }

    /**
     * @param a first double param
     * @param b second double param
     * @return multiplication of two params
     */
    private Double multiplication(double a, double b) {
        return a * b;
    }

    /**
     * @param a first double param
     * @param b second double param
     * @return division of two params
     */
    private Double division(double a, double b) throws DivisionByZeroException {
        if (b == 0) throw new DivisionByZeroException("Делить на ноль нельзя");
        return a / b;
    }

    public void doOperation(String oper) throws Exception {
        switch (oper) {
            case "1":
                result = sum(this.firstParam, this.secondParam);
                break;
            case "2":
                result = subtraction(this.firstParam, this.secondParam);
                break;
            case "3":
                result = multiplication(this.firstParam, this.secondParam);
                break;
            case "4":
                result = division(this.firstParam, this.secondParam);
                break;
            default:
                throw new Exception("Указан не верный номер операции.");
        }
    }

    @Override
    public void close() throws Exception {

    }
}
