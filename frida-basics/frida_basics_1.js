Java.perform(function(){
    console.log('\n[+] Loaded frida_basics_1.js');

    // Hooking decrypt method
    Java.use('b1.a').a.overload('java.lang.String').implementation = function(str) {
        var result = this.a(str);
        console.log('[+] Decrypted ', str, '=> ', result);
        return result;
    }
});