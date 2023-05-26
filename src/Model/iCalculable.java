package Model;

public interface iCalculable<T> {
  
    //  Сложение двух чисел.
    //  @param first Первое число.
    //  @param second Второе число.
    //  @return Сумма чисел.
     
    T addition(T first, T second);

    
    // Вычитание двух чисел.
    // @param first Первое число.
    // @param second Второе число.
    // @return Разность чисел.
    
    T subtraction(T first, T second);
}
