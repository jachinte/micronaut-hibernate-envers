package com.example.myservice;

import io.micronaut.core.annotation.TypeHint;
import io.micronaut.runtime.Micronaut;

@TypeHint(typeNames = {
    "org.postgresql.Driver",
    "org.hibernate.dialect.PostgreSQL10Dialect"
})
public final class Application {

    public static void main(final String... args) {
        Micronaut.run(Application.class);
    }

}
