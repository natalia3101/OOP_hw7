import Model.ComplexCalculator;
import Model.ComplexNumber;
import Model.ComplexParser;
import Model.iCalculable;
import Model.iNumberParsable;
import View.ViewCalculator;

public class Main {

 
    public static void main(String[] args) throws Exception {
        iCalculable<ComplexNumber> calculator = new ComplexCalculator();
        iNumberParsable<ComplexNumber> parser = new ComplexParser();
        ViewCalculator<ComplexNumber> viewCalculator = new ViewCalculator(calculator, parser);
        viewCalculator.run();
    }
}
