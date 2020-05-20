import java.util.List;
import java.util.stream.Collectors;

public class Util {


    public static TriFunction<List<Passenger>,String,Integer,List<Passenger>>  name= (x,y,z)->
        x.stream().collect(Collectors.toList());

}
