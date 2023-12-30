package sec02;

import courseutil.Util;
import reactor.core.publisher.Flux;

import java.time.Duration;

public class Lec08FluxInterval {
    public static void main(String[] args) {
        Flux.interval(Duration.ofSeconds(1)) // not sleep
                .log()
                .subscribe(Util.onNext());

        Util.sleepSeconds(5);
    }
}
