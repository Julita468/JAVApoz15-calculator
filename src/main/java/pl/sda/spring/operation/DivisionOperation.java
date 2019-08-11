package pl.sda.spring.operation;

class DivisionOperation implements Operation{

    private String exception_message;

    public DivisionOperation(String exception_message) {
        this.exception_message = exception_message;

    }

    @Override
    public double calculate(double arg1, double arg2) {
        if (arg2 != 0) {
            return arg1 / arg2;
        }
            throw new RuntimeException(exception_message);

    }

    @Override
    public OperationType getSupportedOperationType() {
        return OperationType.DIVISION;
    }

}
