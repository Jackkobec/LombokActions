/**
 * Created by Jack on 04.03.2017.
 */
@lombok.Data
@lombok.Builder
public class Builder {

    private String name;
    private String title;
    private int age;
    private long code;

    public static void main(String[] args) {

        Builder builder = Builder.builder().age(25).name("Jack").build();
        System.out.println(builder);
    }
}
