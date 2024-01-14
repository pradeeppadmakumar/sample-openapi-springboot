package org.pradeep.padmakumar.order.config;


import org.pradeep.padmakumar.person.client.ApiClient;
import org.pradeep.padmakumar.person.client.api.PersonApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class ApiClientConfig {

   private final WebClient webclient;
   private final String personBasePath;

   public ApiClientConfig(
           WebClient webclient,
           @Value("${client.person.base-path}") String personBasePath
   ) {
      this.webclient = webclient;
      this.personBasePath = personBasePath;
   }

   @Bean
   public PersonApi personApiClient() {
      return new PersonApi(new ApiClient((webclient)).setBasePath(personBasePath));
   }



}