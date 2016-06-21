package rx.plugins;

/*
 * Created by Andrew Brin on 5/26/2016.
 */
public class RxJavaTestPlugins extends RxJavaPlugins{
    RxJavaTestPlugins() {
        super();
    }
    public static void resetPlugins(){
        getInstance().reset();
    }
}
