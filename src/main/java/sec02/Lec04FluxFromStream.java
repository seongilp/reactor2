package sec02;

import courseutil.Util;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.stream.Stream;

public class Lec04FluxFromStream {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);

        Stream<Integer> stream = list.stream();

//        stream.forEach(System.out::println);

//        stream.forEach(System.out::println); // java.lang.IllegalStateException: stream has already been operated upon or closed

        // stream은 한번 사용하면 닫히기 때문에 다시 사용할 수 없다.
        // stream을 다시 사용하고 싶다면, list.stream()을 다시 호출해야 한다.

        Flux<Integer> integerFlux = Flux.fromStream(() -> list.stream());

        integerFlux.subscribe(Util.onNext(),
                Util.onError(),
                Util.onComplete());

        integerFlux.subscribe(Util.onNext(),
                Util.onError(),
                Util.onComplete());

    }
}
