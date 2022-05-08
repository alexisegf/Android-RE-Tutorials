Java.perform(function(){
    console.log('\n[+] Loaded frida_basics_2.js');

    // Hooking "native" method
    Java.use('com.alexisegf.badapp.BadActivity').stringFromJNI.implementation = function() {
        var result = this.stringFromJNI();
        console.log('[+] stringFromJNI => ', result);
        
        return result;
    }
});