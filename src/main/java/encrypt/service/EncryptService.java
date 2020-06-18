package encrypt.service;

import io.micronaut.runtime.server.EmbeddedServer;
import io.reactivex.Single;

import javax.inject.Inject;
import javax.inject.Singleton;


@Singleton
public class EncryptService implements EncryptClient{

    @Inject
    EmbeddedServer embeddedServer;

    public Single<MyMessage> encrypt(String text) {
        String encrypted = new StringBuilder(text).reverse().toString();
        return Single.just(new MyMessage(encrypted + embeddedServer.getPort()));
    }

}
