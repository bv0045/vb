import java.util.Date;

public interface Printer {

    void printId();

    default void printCurrentDate(){
        System.out.println("current " + new Date());
    }
}
