package com.hibiup.krb;

import com.sun.security.auth.callback.TextCallbackHandler;

import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;
import java.security.Principal;
import java.util.Set;

public class KrbLogin {
    public static void main(String args[]) {
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
