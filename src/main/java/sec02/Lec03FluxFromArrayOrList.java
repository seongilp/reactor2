package sec02;

import reactor.core.publisher.Flux;
import courseutil.Util;

import java.util.Arrays;
import java.util.List;

public class Lec03FluxFromArrayOrList {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("a", "b", "c");

        Flux.fromIterable(strings)
                .subscribe(Util.onNext());

        Integer[] arr = {2,5,7,8};

        Flux.fromArray(arr)
                .subscribe(Util.onNext());

    }
}
