����   0 b	  ?
  @ A
  @	  B C
  @	  D E
 	 F	  G H
  @	  I
 J K
  L
 M N O P
  Q
  R
  S T U V displayComponent Lorg/microemu/DisplayComponent; inputMethod !Lorg/microemu/device/InputMethod; deviceDisplay #Lorg/microemu/device/DeviceDisplay; fontManager !Lorg/microemu/device/FontManager; this$0 Lorg/microemu/app/Headless; 	Synthetic <init> (Lorg/microemu/app/Headless;)V Code LineNumberTable LocalVariableTable this   InnerClasses Lorg/microemu/app/Headless$1; getDisplayComponent !()Lorg/microemu/DisplayComponent; getDeviceInputMethod #()Lorg/microemu/device/InputMethod; getDeviceDisplay %()Lorg/microemu/device/DeviceDisplay; getDeviceFontManager #()Lorg/microemu/device/FontManager; getResourceAsStream )(Ljava/lang/String;)Ljava/io/InputStream; name Ljava/lang/String; platformRequest (Ljava/lang/String;)Z URL 
SourceFile Headless.java " # % W -org/microemu/app/ui/noui/NoUiDisplayComponent   (org/microemu/device/j2se/J2SEInputMethod   *org/microemu/device/j2se/J2SEDeviceDisplay % X   (org/microemu/device/j2se/J2SEFontManager   ! Y Z [ \ ] ^ 6 7 java/lang/Thread org/microemu/app/Headless$1$1 % _ % ` a W org/microemu/app/Headless$1 java/lang/Object org/microemu/EmulatorContext ()V !(Lorg/microemu/EmulatorContext;)V org/microemu/MIDletBridge getCurrentMIDlet $()Ljavax/microedition/midlet/MIDlet; getClass ()Ljava/lang/Class; java/lang/Class 2(Lorg/microemu/app/Headless$1;Ljava/lang/String;)V (Ljava/lang/Runnable;)V start                          !    " #  $        % &  '   q     7*+� *� *� Y� � *� Y� � *� 	Y*� 
� *� Y� � �    (       1 	 3  5  7 + 9 )       7 * -    . /  '   /     *� �    (       < )        * -    0 1  '   /     *� �    (       @ )        * -    2 3  '   /     *� �    (       D )        * -    4 5  '   /     *� �    (       H )        * -    6 7  '   ?     � � +� �    (       L )        * -      8 9   : ;  '   M     � Y� Y*+� � � �    (   
    P  V )        * -      < 9   =    > ,                  