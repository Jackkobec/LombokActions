/**
 * Created by Jack on 04.03.2017.
 */

@lombok.Data
public class Data {

    private String name;
    private String title;

    public static void main(String[] args) {

        new Data().getName();
        new Data().hashCode();
    }
}
