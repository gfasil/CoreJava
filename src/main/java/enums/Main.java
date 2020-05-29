package enums;

import lombok.val;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        Severity value=Severity.valueOf("HIGH");

        Arrays.stream(Severity.values()).filter(s-> {
            final val b = s == value;

            return b;
        })
                .collect(Collectors
                        .groupingBy(s->s.getColor())).
                forEach((s,l)->System.out.println(s +"---"+ l));

        // --------enum sets-------------
                // includes all elements
        EnumSet<Severity> allSets=EnumSet.allOf(Severity.class);
        EnumSet<Severity> noneSets=EnumSet.noneOf(Severity.class);
        EnumSet<Severity> copySet=EnumSet.copyOf(allSets);

    }
}
