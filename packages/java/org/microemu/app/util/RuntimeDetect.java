����   0 a
  :	  ;
  <
  =
  > ?
 @ A	  B C
  D	  E
 F G
 F H
 	 :
 	 H
 I J K
 L M	  N
  O	  P Q R java13 Z java14 java15 inEclipseUnitTests runtimeDetected <init> ()V Code LineNumberTable LocalVariableTable this %Lorg/microemu/app/util/RuntimeDetect; detect detectJava14 ()Z ignore Ljava/lang/Throwable; detectJava15 java5Function detectEclipse s Ljava/lang/StackTraceElement; i I ste [Ljava/lang/StackTraceElement; isJava13 isJava14 isJava15 isInEclipseUnitTests <clinit> 
SourceFile RuntimeDetect.java     & ' * ' ,  java.lang.StackTraceElement S T U   java/lang/Throwable + '   V W X Y Z [ \ ] org.eclipse.jdt ^ _ `   %    #org/microemu/app/util/RuntimeDetect java/lang/Object java/lang/Class forName %(Ljava/lang/String;)Ljava/lang/Class; java/lang/Thread currentThread ()Ljava/lang/Thread; getStackTrace  ()[Ljava/lang/StackTraceElement; java/lang/StackTraceElement getClassName ()Ljava/lang/String; java/lang/String 
startsWith (Ljava/lang/String;)Z !      
     
     
     
     
              /     *� �    !       " "        # $   * %       I      � � �� � 
� W� � �    !       /  0  2  3  4  6  7 * & '      T     � W� � K� �    
  	  !       ;  < 
 >  =  ? "        ( )   
 * '      R     � 
W� � K� �      	  !       D  E  G  F  H "        ( )   
 + '      '      � � � � �    !       L 
 ,       �     1� 	Y� � K<*��  *2M,� � � 
� � 	����    !   "    P  Q  R  S # T ' U * Q 0 X "        - .   # / 0   & 1 2   	 3 '      #      � � �    !   
    [  \ 	 4 '      #      � � �    !   
    `  a 	 5 '      #      � � �    !   
    e  f 	 6 '      #      � � �    !   
    j  k  7       =      � � � � � �    !       $  &  (  *  ,  8    9