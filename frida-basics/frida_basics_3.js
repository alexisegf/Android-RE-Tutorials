Java.perform(function(){
    console.log('\n[+] Loaded frida_basics_3.js');

    Java.use('x0.a').a.overload('java.lang.String').implementation = function(str) {
        var result = this.a(str);
        console.log('[+] Decrypted ', str, '=> ', result);
        return result;
    }

    Java.use('com.alexisegf.badapp.BadActivity').onCreate.overload('android.os.Bundle').implementation = function(bundle) {
        this.onCreate(bundle);

        console.log('[+] Decrypted ', this.stringFromJNI(), ' => ', Java.use('x0.a').a(this.stringFromJNI()))
    }
});