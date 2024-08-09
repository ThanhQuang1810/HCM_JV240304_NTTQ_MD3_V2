package ss14.Java8;
public interface IColorable {
    default void toDisplay(String color){
        System.out.println(color);
    };
    static  void getArea(){};

}
