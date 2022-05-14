Java.perform(function(){
    console.log('\n[+] Loaded frida_basics_1.js');

    // Hook onCreate and call super to avoid error where other hooks are not applied
    Java.use('com.alexisegf.badapp.MainActivity').onCreate.overload('android.os.Bundle').implementation = function(bundle) {
        this.onCreate(bundle);
    }

    // Hooking decrypt method
    Java.use('x0.a').a.overload('java.lang.String').implementation = function(str) {
        var result = this.a(str);
        console.log('[+] Decrypted ', str, '=> ', result);
        return result;
    }
});