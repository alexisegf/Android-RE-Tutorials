//
// Created by Alexis Ferreira on 5/2/22.
//

#include <string.h>
#include <jni.h>

extern "C" {
        jstring Java_com_alexisegf_badapp_BadActivity_stringFromJNI(JNIEnv * env , jobject thiz )
        {
        return env -> NewStringUTF ( "OKjCawiM2C9+kb6UIUtdb3yMifm+3+cBXu1tcxmKSlY=" ) ;
        }
}