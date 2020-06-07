package Tools;


import java.util.HashMap;
import java.util.Map;

public class RunContext {
    private static Map<String, Object> context = new HashMap<String, Object>();

    public static void clear() {
        context.clear();
    }

    public static <T> void put(String key, T object) {
        context.put(key, object);
    }

    public static <T> T get(String key, Class<T> userClass) {
        Object object;
        try {
           object = context.get(key);
        } catch (NullPointerException e) {
            throw new AssertionError(key);
        }
        return userClass.cast(object);
    }
}
