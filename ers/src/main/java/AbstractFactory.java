package be.ucl.ingi.lingi2252;
/**
 * Created by ndizera on 28/12/2016.
 */
public abstract class AbstractFactory {
    abstract NaturalDisaster getNaturalDisaster(String type, Object ...args);
    abstract SafePlace getSafePlace(String type, Object ...args);
    abstract EntityWithLocation getObject(String type, Object ...args);
}
