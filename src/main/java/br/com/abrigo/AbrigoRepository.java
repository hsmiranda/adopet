package br.com.abrigo;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class AbrigoRepository implements PanacheRepository<AbrigoEntity> {

}
