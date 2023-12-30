package sec02;

import courseutil.Util;
import reactor.core.publisher.Flux;

public class Lec01FluxIntro {
    public static void main(String[] args) {
        Flux<Integer> flux = Flux.just(1,2,3,4,5,6,7,8,9,10);
        Flux<Object> flux2 = Flux.just(1,2,3,"a",Util.faker().name().fullName());

        flux2.subscribe(
                Util.onNext(),
                Util.onError(),
                Util.onComplete());

    }
}
