ΚώΊΎ   0 
 $ Z
 % [	 $ \	 $ ]	 $ ^	 $ _	 $ `	 $ a	 $ b c d
 e f
  g
  h
 i j
 k l
 m n
 m o p q
  r
  s
  t u
 v w x y z
 $ t
 { | }
  [
  ~ 
     name Ljava/lang/String; fileName descriptorLocation defaultDevice Z 	canRemove 	className 
Deprecated emulatorContext Lorg/microemu/EmulatorContext; <init> :(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V Code LineNumberTable LocalVariableTable this #Lorg/microemu/app/util/DeviceEntry; ;(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V X(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lorg/microemu/EmulatorContext;)V ()Z getDescriptorLocation ()Ljava/lang/String; classLoader Ljava/lang/ClassLoader; deviceClass Ljava/lang/Class; device #Lcom/barteo/emulator/device/Device; 
oldContext %Lcom/barteo/emulator/EmulatorContext; ex  Ljava/net/MalformedURLException; "Ljava/lang/ClassNotFoundException; "Ljava/lang/InstantiationException; "Ljava/lang/IllegalAccessException; urls [Ljava/net/URL; getFileName setFileName (Ljava/lang/String;)V getName isDefaultDevice setDefaultDevice (Z)V b equals &(Lorg/microemu/app/util/DeviceEntry;)Z test toString 
SourceFile DeviceEntry.java 1 8 1  & ' ( ' ) ' * + , + - ' / 0 java/net/URL java/io/File    1               !com/barteo/emulator/device/Device #com/barteo/emulator/EmulatorContext 1    ; < java/net/MalformedURLException     java/lang/ClassNotFoundException  java/lang/InstantiationException  java/lang/IllegalAccessException  T  java/lang/StringBuffer   
 (default) W < !org/microemu/app/util/DeviceEntry java/lang/Object ()V org/microemu/app/Config getConfigPath ()Ljava/io/File; #(Ljava/io/File;Ljava/lang/String;)V toURI ()Ljava/net/URI; java/net/URI toURL ()Ljava/net/URL; org/microemu/app/Common createExtensionsClassLoader (([Ljava/net/URL;)Ljava/lang/ClassLoader; java/lang/Class forName =(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class; newInstance ()Ljava/lang/Object; !(Lorg/microemu/EmulatorContext;)V init ((Lcom/barteo/emulator/EmulatorContext;)V org/microemu/log/Logger error (Ljava/lang/Throwable;)V java/lang/String (Ljava/lang/Object;)Z append ,(Ljava/lang/String;)Ljava/lang/StringBuffer; ! $ %     & '    ( '    ) '    * +    , +    - '  .      / 0  .       1 2  3   a     *+,-· ±    4   
    = 
 > 5   4     6 7      & '     ( '     ) '     * +   1 8  3         *· *+΅ *,΅ *-΅ *΅ *΅ ±    4       @  A 	 B  C  D  E  F 5   >      6 7       & '      ( '      ) '      * +      , +   1 9  3   ~     *+,· *΅ *΅ 	±    4       M 	 O  P  Q 5   >     6 7      & '     ( '     * +     - '     / 0  .      , :  3   /     *΄ ¬    4       T 5        6 7    ; <  3  u     }*΄ Η t½ 
L+» YΈ *΄ · Ά Ά S+Έ M*΄ ,Έ N-Ά ΐ :» Y*΄ 	· :Ά *Ά ΅ §  M,Έ § M,Έ § M,Έ § M,Έ *΄ °   X [   X c   X k   X s   4   Z    X  Y  [ # \ ( ] 2 ^ ; ` H b O c X l [ d \ e ` l c f d g h l k h l i p l s j t k x p 5   f 
 ( 0 = >  2 & ? @  ;  A B  H  C D  \  E F  d  E G  l  E H  t  E I   l J K    } 6 7    L <  3   /     *΄ °    4       t 5        6 7    M N  3   >     *+΅ ±    4   
    {  | 5        6 7      ( '  .      O <  3   /     *΄ °    4        5        6 7    P :  3   /     *΄ ¬    4        5        6 7    Q R  3   >     *΅ ±    4   
       5        6 7      S +   T U  3   \     +Η ¬+Ά *Ά Ά  ¬¬    4                5        6 7      V 7   W <  3   U     #*΄  » Y·  *΄ Ά !"Ά !Ά #°*΄ °    4            5       # 6 7    X    Y