package sec01;

import courseutil.Util;
import reactor.core.publisher.Mono;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

public class Lec05MonoFromSupplier {
    public static void main(String[] args) {
        Mono<String> mono = Mono.just(getName());

        Supplier<String> stringSupplier = () -> getName();
        Mono<String> mono1 = Mono.fromSupplier(stringSupplier);
        mono1.subscribe(Util.onNext());

        Callable<String> stringCallable = () -> getName();
        Mono<String> mono2 = Mono.fromCallable(stringCallable);
        mono2.subscribe(Util.onNext());

    }

    private static String getName() {
        System.out.println("Generating name...");
        return Util.faker().name().fullName();
    }
}
