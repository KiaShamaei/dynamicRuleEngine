package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Map<String, Object> data = new HashMap<>();
        data.put("condition_a", true);
        data.put("condition_b", false);
        data.put("condition_c", true);
        data.put("condition_d", false);
        RuleEngine.run(data);
    }
}
