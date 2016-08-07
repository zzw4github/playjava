package controllers;

import models.Person;
import play.api.cache.CacheApi;
import play.mvc.*;

import scala.concurrent.duration.Duration;
import scala.reflect.ClassTag;
import views.html.*;

import javax.inject.Inject;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2016-08-04.
 */
public class CacheController extends Controller {
    private CacheApi cache;

    @Inject
    public CacheController(CacheApi cache) {
        this.cache = cache;
    }

    public void cache() {
        Person person = Person.find.byId(90000001L);
        cache.set("item.key", person, Duration.Zero());
    }

    // Cache for 15 minutes
    public void setCacheTime(long time) {
        Person person = Person.find.byId(90000001L);
    cache.set("item.key",person,Duration.create(time, TimeUnit.MINUTES));
}
//    You can retrieve the data later:
public void getKey() {
//    Person person = (Person)cache.get("item.key") ;
}
//    You can also supply a Callable that generates stores the value if no value is found in the cache:

    public void getKeyOrElse() {
//        Person maybeCached = cache.getOrElse("item.key", () -> lookUpPerson());
    }
//    To remove an item from the cache use the remove method:
public void remove() {
    cache.remove("item.key");
}
    private Person lookUpPerson() {
       return  Person.find.byId(9000001L);
    }
}
