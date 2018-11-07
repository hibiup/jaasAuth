package com.hibiup;

import com.sun.security.auth.callback.TextCallbackHandler;
import junit.framework.TestCase;
import org.junit.Test;

import javax.security.auth.login.*;
import java.security.Principal;
import java.util.Set;

public class JaasTestCases extends TestCase {
    @Test
    public void testKerberos() {
        try {
            LoginContext lc = new LoginContext("Sample", new TextCallbackHandler());
            // attempt authentication
            lc.login();

            Set<Principal> principals = lc.getSubject().getPrincipals();
            principals.forEach(p -> {
                System.out.println(p.getName());
            });
        }
        catch (LoginException e) {
            e.printStackTrace();
        }
        catch (SecurityException e) {
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
