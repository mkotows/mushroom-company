
package pl.coderslab.pieczarki.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import pl.coderslab.pieczarki.model.MushroomHall;
import pl.coderslab.pieczarki.repository.MushroomHallRepository;

@Component
//@ConfigurationProperties
public class MushroomHallConverter implements Converter<String, MushroomHall> {

    @Autowired
    private MushroomHallRepository mushroomHallRepository;

    public MushroomHallConverter() {
    }

    @Override
    public MushroomHall convert(String source) {
        MushroomHall mushroomHall = mushroomHallRepository.getOne(Long.parseLong(source));
        return mushroomHall;
    }
}