package encrypt.service;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.Single;

import javax.inject.Inject;

@Controller("/")
public class EncryptController{

    @Inject
    EncryptService encryptService;

    @Get("/encrypt/{text}")
    public Single<MyMessage> encrypt(String text){
        return encryptService.encrypt(text);
    }

}
