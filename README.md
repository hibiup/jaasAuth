reference to: 
  https://docs.oracle.com/javase/8/docs/technotes/guides/security/jgss/tutorials/AcnOnly.html

Debug with parameter:

```
-Djava.security.auth.login.config=src/main/resources/jaas.conf -Djava.security.krb5.conf=src/main/resources/krb5.conf
```