package sec01;

import courseutil.Util;
import reactor.core.publisher.Mono;

public class Lec03MonoSubscribe {
    public static void main(String[] args) {

        Mono<Integer> mono = Mono.just("ball")
                        .map(String::length)
                        .map(l -> l / 1);

        mono.subscribe();

        mono.subscribe(
//                item -> System.out.println("Received: " + item),
//                err -> System.out.println("Error: " + err.getMessage()),
//                () -> System.out.println("Completed!")
                Util.onNext(),
                Util.onError(),
                Util.onComplete()
        );



    }
}
