package ss7.design;

public interface IGenericCrud <T,E>{
    void add(T t);
    void update(T t);
    void delete(E id);
    void display();
}
