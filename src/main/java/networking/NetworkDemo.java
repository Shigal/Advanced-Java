package networking;/*
 *
 * @author Lawshiga
 *
 */

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class NetworkDemo {
    public static void main(String[] args) {

        String url = "www.google.com";

        // InetAddress contains the internet address on which the website is hosted
        try {
            InetAddress inetAddress = Inet4Address.getByName(url);

            // to see the ip address where this website is hosted
            System.out.println("Address: " + Arrays.toString(inetAddress.getAddress())); // Address: [-114, -6, -64, 4]

            // to see host address
            System.out.println("Host Address: " + inetAddress.getHostAddress()); // Host Address: 142.250.192.4
            // 142.250.192.4 appears to be located in Mumbai, India and allocated to GOOGLE

            // any wild card address attached to the address
            System.out.println("Is any local address: " + inetAddress.isAnyLocalAddress());

            System.out.println("is link local address " + inetAddress.isLinkLocalAddress());

            System.out.println(" is loop back " + inetAddress.isLoopbackAddress());

            System.out.println(" is site local address " + inetAddress.isSiteLocalAddress());

            System.out.println("hashcode " + inetAddress.hashCode());

        } catch (UnknownHostException e) {
            System.out.println(e);
        }

    }
}
