����   0 C
  (	  )	  *	  + ,
 - . / 0
  (
 1 2 3
  4
 - 5 6 7 8 9 cipherSuite Ljava/lang/String; protocolName certificate $Ljavax/microedition/pki/Certificate; <init> K(Ljava/lang/String;Ljava/lang/String;Ljavax/microedition/pki/Certificate;)V Code LineNumberTable LocalVariableTable this $Lorg/microemu/cldc/SecurityInfoImpl; getCipherSuite ()Ljava/lang/String; getProtocolName ex Ljava/lang/RuntimeException; getProtocolVersion getServerCertificate &()Ljavax/microedition/pki/Certificate; 
SourceFile SecurityInfoImpl.java  :       TLS ; < = SSL java/lang/RuntimeException > ? @ 3.1    A B 3.0 "org/microemu/cldc/SecurityInfoImpl java/lang/Object "javax/microedition/io/SecurityInfo ()V java/lang/String 
startsWith (Ljava/lang/String;)Z org/microemu/log/Logger error (Ljava/lang/Throwable;)V equals (Ljava/lang/Object;)Z !                             l     *� *+� *,� *-� �           %  & 	 '  (  )    *                                  /     *� �           ,                     �     -*� � � �*� � � �� Y� 	�L+� 
+�   & &      "    0  1  2  3  7 & 8 ' 9 + :      '  ! "    -      #      �     -*� � � �*� � � �� Y� 	�L+� 
+�   & &      "    @  A  B  C  G & H ' I + J      '  ! "    -      $ %     /     *� �           P              &    '