����   0 �
 . c	 - d
 ' e
 ' f
 ' g
 h i
 - j k
  l
 ' m
 ' n	 - o
 - p
  q r s
 - t
  u
 ' v
 w x
 ' y
 w z
 ' {
 | } ~ 
  � �
 � � �
  c �
  �
  �
 � �
 � �
 � � �
 � � �
 ' q
 � �
 ' c
 w �
 ' � � � � � � PROTOCOL Ljava/lang/String; ConstantValue socket Ljava/net/DatagramSocket; address <init> ()V Code LineNumberTable LocalVariableTable this 'Lorg/microemu/cldc/datagram/Connection; close 
Exceptions getMaximumLength ()I getNominalLength send #(Ljavax/microedition/io/Datagram;)V dgram  Ljavax/microedition/io/Datagram; receive newDatagram #(I)Ljavax/microedition/io/Datagram; size I 5(ILjava/lang/String;)Ljavax/microedition/io/Datagram; addr datagram %([BI)Ljavax/microedition/io/Datagram; buf [B 7([BILjava/lang/String;)Ljavax/microedition/io/Datagram; getLocalAddress ()Ljava/lang/String; Ljava/net/InetAddress; getLocalPort openConnection 8(Ljava/lang/String;IZ)Ljavax/microedition/io/Connection; host name mode timeouts Z port index 
SourceFile Connection.java 8 9 5 6 ? 9 � B � B � � � A B 'org/microemu/cldc/datagram/DatagramImpl � � D � H � 7 3 I M 8 � � � � I S 8 � � � � � � T � � U W B � � � java/io/IOException 
No network 8 � datagram:// � � � java/lang/StringBuffer Invalid Protocol  � � � U � B � � � � port missing � � � java/net/DatagramSocket � � � � � � %org/microemu/cldc/datagram/Connection java/lang/Object (javax/microedition/io/DatagramConnection +javax/microedition/io/UDPDatagramConnection 5org/microemu/microedition/io/ConnectionImplementation getReceiveBufferSize getSendBufferSize java/lang/Math min (II)I getDatagramPacket ()Ljava/net/DatagramPacket; (Ljava/net/DatagramPacket;)V (I)V javax/microedition/io/Datagram 
setAddress (Ljava/lang/String;)V ([BI)V getInetAddress ()Ljava/net/InetAddress; java/net/InetAddress getLocalHost getHostAddress !org/microemu/cldc/http/Connection isAllowNetworkConnection ()Z java/lang/String 
startsWith (Ljava/lang/String;)Z append ,(Ljava/lang/String;)Ljava/lang/StringBuffer; toString length 	substring (I)Ljava/lang/String; indexOf (I)I java/lang/Integer parseInt (Ljava/lang/String;)I (II)Ljava/lang/String; 	getByName *(Ljava/lang/String;)Ljava/net/InetAddress; connect (Ljava/net/InetAddress;I)V ! - .  / 0 1   2 3  4      5 6    7 3     8 9  :   /     *� �    ;       ) <        = >    ? 9  :   6     *� � �    ;   
    ;  < <        = >   @       A B  :   <     *� � *� � � �    ;       ? <        = >   @       C B  :   /     *� �    ;       C <        = >   @       D E  :   G     *� +� � 	� 
�    ;   
    G  H <        = >      F G  @       H E  :   G     *� +� � 	� �    ;   
    K  L <        = >      F G  @       I J  :   >     
**� � �    ;       O <       
 = >     
 K L  @       I M  :   b     � Y� N-,�  -�    ;       S 	 T  U <   *     = >      K L     N 3  	 	 O G  @       I P  :   I     *+*� � �    ;       Y <         = >      Q R     K L  @       I S  :   p     � Y+� :-�  �    ;       ]  ^  _ <   4     = >      Q R     K L     N 3    O G  @       T U  :   d      *� � L+� 
� L� *� � L+� �    ;       c  d  i  n  p <         = >     7 V  @       W B  :   2     *� � �    ;       t <        = >   @       X Y  :  M     �� � � Y� �+� � � Y� Y� �  +�  � !� �*+� "� #� 6*� :� $6� � Y%� �*� `� #� &6� *� 'Y� (� � (*� � ):*� 'Y� *� *� � +� ,*�    ;   B    x  y  {  | 4  A � D � O � U � _ � o � t � � � � � � � � � <   H  �  Z 3    � = >     � [ 3    � \ L    � ] ^  D g _ L  O \ ` L  @       a    b