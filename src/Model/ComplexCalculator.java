package Model;

import Logger.ConsoleLogger;
import Logger.iLogger;

public class ComplexCalculator implements iCalculable<ComplexNumber> {
    private static final iLogger logger = new ConsoleLogger();

    @Override
    public ComplexNumber addition(ComplexNumber first, ComplexNumber second) {
        double actualPart = first.getActualPart() + second.getActualPart();
        double imaginaryPart = first.getImaginaryPart() + second.getImaginaryPart();
        ComplexNumber result = new ComplexNumber(actualPart, imaginaryPart);
        logger.log(String.format("Сложение: %s + %s = %s", first, second, result));
        return result;
    }

    @Override
    public ComplexNumber subtraction(ComplexNumber first, ComplexNumber second) {
        double actualPart = first.getActualPart() - second.getActualPart();
        double imaginaryPart = first.getImaginaryPart() - second.getImaginaryPart();
        ComplexNumber result = new ComplexNumber(actualPart, imaginaryPart);
        logger.log(String.format("Вычитание: %s - %s = %s", first, second, result));
        return result;
    }
}
