����   0 �	   L	   M
 ! N	   O
 P Q
 R S
 T U
 P V W
 	 Z
 T [ \
 ] ^ _ `
  Z
 T a
   b
   c d e
  f g h
  f i
  N j
  k
  l
 m n o p img Ljava/awt/Image; width I height <init> (Ljava/awt/Image;)V Code LineNumberTable LocalVariableTable this -Lorg/microemu/device/j2se/J2SEImmutableImage; image .(Lorg/microemu/device/j2se/J2SEMutableImage;)V +Lorg/microemu/device/j2se/J2SEMutableImage; 	getHeight ()I ex  Ljava/lang/NullPointerException;  Ljava/lang/InterruptedException; observer Ljava/awt/image/ImageObserver; getImage ()Ljava/awt/Image; getWidth getRGB ([IIIIIII)V e argb [I offset 
scanlength x y 
access$002 1(Lorg/microemu/device/j2se/J2SEImmutableImage;I)I x0 x1 	Synthetic 
access$102 
SourceFile J2SEImmutableImage.java & % $ % ' q " # r s t u 8 9 v w x y z -org/microemu/device/j2se/J2SEImmutableImage$1   InnerClasses ' { 1 | java/lang/NullPointerException } ~ q java/lang/InterruptedException -org/microemu/device/j2se/J2SEImmutableImage$2 : | : 2 1 2 "java/lang/IllegalArgumentException &Specified area exceeds bounds of image '  *abs value of scanlength is less than width null rgbData (java/lang/ArrayIndexOutOfBoundsException java/awt/image/PixelGrabber ' � � � � � � +org/microemu/device/j2se/J2SEImmutableImage javax/microedition/lcdui/Image ()V java/awt/Toolkit getDefaultToolkit ()Ljava/awt/Toolkit; )org/microemu/device/j2se/J2SEMutableImage java/awt/Image 	getSource  ()Ljava/awt/image/ImageProducer; createImage 0(Ljava/awt/image/ImageProducer;)Ljava/awt/Image; 0(Lorg/microemu/device/j2se/J2SEImmutableImage;)V !(Ljava/awt/image/ImageObserver;)I java/lang/Object wait (Ljava/lang/String;)V (Ljava/awt/Image;IIII[III)V 
grabPixels ()Z org/microemu/log/Logger error (Ljava/lang/Throwable;)V !   !     " #    $ %    & %     ' (  )   X     *� *+� *� *� �    *       +  , 	 -  .  / +        , -      . #   ' /  )   d      *� *� +� � � � *� *� �    *       1  2  3  4  5 +         , -       . 0   1 2  )   �     F*� � <� 	Y*� 
L+YM�**� +� � � N*� � +� � N,ç 
:,��*� �   ! $  - 1 4   7 :   : > :    *   2    8  9  I  L ! N $ M % O - Q 1 S 4 R 5 U A X +   *  %   3 4  5   3 5   0 6 7    F , -    8 9  )   /     *� �    *       \ +        , -    : 2  )   �     F*� � <� Y*� L+YM�**� +� � � N*� � +� � N,ç 
:,��*� �   ! $  - 1 4   7 :   : > :    *   2    `  a  q  t ! v $ u % w - y 1 { 4 z 5 } A � +   *  %   3 4  5   3 5   0 6 7    F , -    ; <  )  � 
 	   �� � ��  � `*� � `*� � � Y� �� t� � � Y� �+� � Y� �� `+�� � Y� �� dh`� #� Y� �dh``+�� � Y� �� Y*� +� � W� 
:� �  � � �   *   R    � 
 �  � - � 7 � F � P � T � ^ � k � s � w � � � � � � � � � � � � � � � � � +   \ 	 �  = 5    � , -     � > ?    � @ %    � A %    � B %    � C %    � $ %    � & %   D E  )   ;     *Z� �    *       $ +        F -      G %  H      I E  )   ;     *Z� �    *       $ +        F -      G %  H      J    K Y     	             