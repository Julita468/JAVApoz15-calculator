package pl.sda.spring;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.sda.spring.operation.OperationType;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class CalculatorTest {

    @Autowired
    private Calculator calculator;

    @Test
    public void shouldReturnFiveForGivenArgumentsOnAdditionOperation() {
        //given
        double arg1 = 2.0;
        double arg2 = 3.0;

        //when
        double actual = calculator.calculate(OperationType.ADDITION, arg1, arg2);

        //then
        Assert.assertEquals(5.0, actual, 0.00000001);
    }

    @Test
    public void shouldReturnExpectedResultForGivenArgumentsOnSubtractionOperation() {
        //given
        double arg1 = 5.0;
        double arg2 = 3.0;

        //when
        double actual = calculator.calculate(OperationType.SUBTRACTION, arg1, arg2);

        //then
        Assert.assertEquals(2.0, actual, 0.000000001);
    }

    @Test
    public void shouldReturnExpectedResultForGivenArgumentsOnMultiplicationOperation() {
        //given
        double arg1 = 3.0;
        double arg2 = 3.0;

        //when
        double actual = calculator.calculate(OperationType.MULTIPLICATION, arg1, arg2);

        //then
        Assert.assertEquals(9.0, actual, 0.000000001);
    }

    @Test
    public void shouldReturnExpectedResultForGivenArgumentsOnDivisionOperation() {
        //given
        double arg1 = 9.0;
        double arg2 = 0.0;

        //when
        double actual = calculator.calculate(OperationType.DIVISION, arg1, arg2);

        //then
        Assert.assertEquals(3.0, actual, 0.000000001);
    }

    @Test
    public void shouldReturnExpectedResultForGivenArgumentsOnPercentageOperation() {
        //given
        double arg = 50.0;
        double percentage = 20.0;

        //when
        double actual = calculator.calculate(OperationType.PERCENTAGE_OPERATION, arg, percentage);

        //then
        Assert.assertEquals(10.0, actual, 0.000000001);
    }

    @Test
    public void shouldReturnExpectedResultForGivenArgumentsOnPowerOperation() {
        //given
        double arg = 3.0;
        double percentage = 2.0;

        //when
        double actual = calculator.calculate(OperationType.POWER_OPERATION, arg, percentage);

        //then
        Assert.assertEquals(9.0, actual, 0.000000001);
    }

}
