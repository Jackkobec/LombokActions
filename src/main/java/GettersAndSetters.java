import lombok.Getter;
import lombok.Setter;

/**
 * Created by Jack on 04.03.2017.
 */
public class GettersAndSetters {
    @Getter
    @Setter
    private String field;

    public static void main(String[] args) {

        new GettersAndSetters().getField();
        new GettersAndSetters().setField("...");

    }
}
