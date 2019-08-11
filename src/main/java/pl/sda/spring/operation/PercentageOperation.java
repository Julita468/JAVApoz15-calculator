package pl.sda.spring.operation;

class PercentageOperation implements Operation {
    @Override
    public double calculate(double arg,  double percentage) {
        return arg * (percentage / 100);
    }

    @Override
    public OperationType getSupportedOperationType() {
        return OperationType.PERCENTAGE_OPERATION;
    }
}
