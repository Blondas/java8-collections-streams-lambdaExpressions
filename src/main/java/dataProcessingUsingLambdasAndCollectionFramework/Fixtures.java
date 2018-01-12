package dataProcessingUsingLambdasAndCollectionFramework;

import com.krisdrum.lambdaExpressions.commonHelperClasses.City;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fixtures {
    public static final Person alice = new Person("Alice", 23);
    public static final Person brian = new Person("Brian", 56);
    public static final Person chelsea = new Person("Chelsea", 46);
    public static final Person david = new Person("David", 28);
    public static final Person erica = new Person("Erica", 37);
    public static final Person francisco = new Person("Francisco", 18);

    public static final City krakow = new City("Krakow");
    public static final City warszawa = new City("Warszawa");

    public static final List<Person> citizenK= new ArrayList<>(Arrays.asList(alice, brian, chelsea));
    public static final List<Person> citizenW= new ArrayList<>(Arrays.asList(david, erica, francisco));
}
