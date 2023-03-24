package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class Duck5 {
    private Egg6 egg;
    @Autowired
    public void setEgg(Egg6 egg) {
        this.egg = egg;
    }
    @Override
    public String toString() {
        return ", в утке яйцо " + egg.toString();
    }


}
