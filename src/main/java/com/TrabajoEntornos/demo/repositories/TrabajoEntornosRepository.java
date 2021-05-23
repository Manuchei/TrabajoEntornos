package com.TrabajoEntornos.demo.repositories;


import com.TrabajoEntornos.demo.models.TrabajoEntornosModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/*indica las consultas que se van a lanzar contra la base de datos*/
@Repository

/*se le indica el modelo con el que se va a trabajar y el tipo de la clave primaria*/
/*CrudRepository (el JPA) va a encargarse de hacer las consultas de forma automática
si se necesitaran hacer consultas más complejas, se pueden añadir de forma manual*/
public interface TrabajoEntornosRepository extends CrudRepository<TrabajoEntornosModel,Long>{

}
