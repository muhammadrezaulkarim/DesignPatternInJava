//source: https://refactoring.guru/design-patterns/proxy/java/example
// Modified to make the example simpler

package com.pattern.example.proxy.virtualproxy;

public class ProxyPatternTestClass 
{
    public static void main(String [] args[])
    {

        YoutubeCacheProxy object = new YoutubeCacheProxy();

        object.getVideo('12345');
        object.getVideo('67890');
        object.getVideo('12345');
    }
}
