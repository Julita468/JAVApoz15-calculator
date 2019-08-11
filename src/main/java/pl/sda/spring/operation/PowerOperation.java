package pl.sda.spring.operation;

import org.springframework.stereotype.Component;

@Component
class PowerOperation implements Operation {

    @Override
    public double calculate(double arg, double power) {
        return Math.pow(arg, power);
    }

    @Override
    public OperationType getSupportedOperationType() {
        return OperationType.POWER_OPERATION;
    }
}
