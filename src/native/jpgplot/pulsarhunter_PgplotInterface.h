/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class pulsarhunter_PgplotInterface */

#ifndef _Included_pulsarhunter_PgplotInterface
#define _Included_pulsarhunter_PgplotInterface
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     pulsarhunter_PgplotInterface
 * Method:    pgopen
 * Signature: (Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_pulsarhunter_PgplotInterface_pgopen
  (JNIEnv *, jclass, jstring);

/*
 * Class:     pulsarhunter_PgplotInterface
 * Method:    pgclose
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_pulsarhunter_PgplotInterface_pgclose
  (JNIEnv *, jclass);

/*
 * Class:     pulsarhunter_PgplotInterface
 * Method:    pgtext
 * Signature: (Ljava/lang/String;FF)V
 */
JNIEXPORT void JNICALL Java_pulsarhunter_PgplotInterface_pgtext
  (JNIEnv *, jclass, jstring, jfloat, jfloat);

/*
 * Class:     pulsarhunter_PgplotInterface
 * Method:    pgsch
 * Signature: (F)V
 */
JNIEXPORT void JNICALL Java_pulsarhunter_PgplotInterface_pgsch
  (JNIEnv *, jclass, jfloat);

/*
 * Class:     pulsarhunter_PgplotInterface
 * Method:    pgscf
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_pulsarhunter_PgplotInterface_pgscf
  (JNIEnv *, jclass, jint);

/*
 * Class:     pulsarhunter_PgplotInterface
 * Method:    pgsvp
 * Signature: (FFFF)V
 */
JNIEXPORT void JNICALL Java_pulsarhunter_PgplotInterface_pgsvp
  (JNIEnv *, jclass, jfloat, jfloat, jfloat, jfloat);

/*
 * Class:     pulsarhunter_PgplotInterface
 * Method:    pgswin
 * Signature: (FFFF)V
 */
JNIEXPORT void JNICALL Java_pulsarhunter_PgplotInterface_pgswin
  (JNIEnv *, jclass, jfloat, jfloat, jfloat, jfloat);

/*
 * Class:     pulsarhunter_PgplotInterface
 * Method:    pgqwin
 * Signature: ([F)V
 */
JNIEXPORT void JNICALL Java_pulsarhunter_PgplotInterface_pgqwin
  (JNIEnv *, jclass, jfloatArray);

/*
 * Class:     pulsarhunter_PgplotInterface
 * Method:    pgmove
 * Signature: (FF)V
 */
JNIEXPORT void JNICALL Java_pulsarhunter_PgplotInterface_pgmove
  (JNIEnv *, jclass, jfloat, jfloat);

/*
 * Class:     pulsarhunter_PgplotInterface
 * Method:    pgdraw
 * Signature: (FF)V
 */
JNIEXPORT void JNICALL Java_pulsarhunter_PgplotInterface_pgdraw
  (JNIEnv *, jclass, jfloat, jfloat);

/*
 * Class:     pulsarhunter_PgplotInterface
 * Method:    pglab
 * Signature: (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_pulsarhunter_PgplotInterface_pglab
  (JNIEnv *, jclass, jstring, jstring, jstring);

/*
 * Class:     pulsarhunter_PgplotInterface
 * Method:    pggray
 * Signature: ([FIIIIIIFF[F)V
 */
JNIEXPORT void JNICALL Java_pulsarhunter_PgplotInterface_pggray
  (JNIEnv *, jclass, jfloatArray, jint, jint, jint, jint, jint, jint, jfloat, jfloat, jfloatArray);

/*
 * Class:     pulsarhunter_PgplotInterface
 * Method:    pgbox
 * Signature: (Ljava/lang/String;FILjava/lang/String;FI)V
 */
JNIEXPORT void JNICALL Java_pulsarhunter_PgplotInterface_pgbox
  (JNIEnv *, jclass, jstring, jfloat, jint, jstring, jfloat, jint);

/*
 * Class:     pulsarhunter_PgplotInterface
 * Method:    quikgray
 * Signature: ([FIII)V
 */
JNIEXPORT void JNICALL Java_pulsarhunter_PgplotInterface_quikgray
  (JNIEnv *, jclass, jfloatArray, jint, jint, jint);

/*
 * Class:     pulsarhunter_PgplotInterface
 * Method:    pgshls
 * Signature: (IFFF)V
 */
JNIEXPORT void JNICALL Java_pulsarhunter_PgplotInterface_pgshls
  (JNIEnv *, jclass, jint, jfloat, jfloat, jfloat);

/*
 * Class:     pulsarhunter_PgplotInterface
 * Method:    pgsci
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_pulsarhunter_PgplotInterface_pgsci
  (JNIEnv *, jclass, jint);

/*
 * Class:     pulsarhunter_PgplotInterface
 * Method:    pgcirc
 * Signature: (FFF)V
 */
JNIEXPORT void JNICALL Java_pulsarhunter_PgplotInterface_pgcirc
  (JNIEnv *, jclass, jfloat, jfloat, jfloat);

/*
 * Class:     pulsarhunter_PgplotInterface
 * Method:    pgsfs
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_pulsarhunter_PgplotInterface_pgsfs
  (JNIEnv *, jclass, jint);

/*
 * Class:     pulsarhunter_PgplotInterface
 * Method:    pgslw
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_pulsarhunter_PgplotInterface_pgslw
  (JNIEnv *, jclass, jint);

/*
 * Class:     pulsarhunter_PgplotInterface
 * Method:    pgtxt
 * Signature: (FFFFLjava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_pulsarhunter_PgplotInterface_pgtxt
  (JNIEnv *, jclass, jfloat, jfloat, jfloat, jfloat, jstring);

#ifdef __cplusplus
}
#endif
#endif
