����   0 �
 < �	 ; �
 ; � � �
  � �
  � �
 	 �
  �	 ; �
 � � �
  �
  �
 � �
  � �
  �
  �
  �
  �
  �
  � �
 � �
  �
 � �
 � �
 � �
  �
  �
 � �
 � �
 � �
 � �
 � �
 � �
 ; �
 � �
 � �
 � � �
 ; �
 , �
 � � �
 ; �
 0 � �
 ; � � �
 ; ���������	 ; � � � � � cn Ljava/net/URLConnection; 	connected Z allowNetworkConnection <init> ()V Code LineNumberTable LocalVariableTable this #Lorg/microemu/cldc/http/Connection; openConnection 8(Ljava/lang/String;IZ)Ljavax/microedition/io/Connection; ex  Ljava/net/MalformedURLException; name Ljava/lang/String; mode I timeouts url Ljava/net/URL; 
Exceptions close getURL ()Ljava/lang/String; getProtocol getHost getFile getRef getQuery getPort ()I port getRequestMethod setRequestMethod (Ljava/lang/String;)V method getRequestProperty &(Ljava/lang/String;)Ljava/lang/String; key setRequestProperty '(Ljava/lang/String;Ljava/lang/String;)V value getResponseCode getResponseMessage getExpiration ()J getDate getLastModified getHeaderField getHeaderFieldInt (Ljava/lang/String;I)I def getHeaderFieldDate (Ljava/lang/String;J)J J (I)Ljava/lang/String; n getHeaderFieldKey getImplIndex (I)I index openInputStream ()Ljava/io/InputStream; openDataInputStream ()Ljava/io/DataInputStream; openOutputStream ()Ljava/io/OutputStream; openDataOutputStream ()Ljava/io/DataOutputStream; getType Ljava/io/IOException; getEncoding 	getLength isAllowNetworkConnection ()Z setAllowNetworkConnection (Z)V <clinit> 
SourceFile Connection.java D E A B � � java/io/IOException 
No network D d java/net/URL java/net/MalformedURLException � Y K � ? @ � � � java/net/HttpURLConnection � � � E X � http [ Y \ Y ] Y _ ` b Y POST � � � c d f g i j � E l ` m Y n o p o q o r g s t v w | } r y { y � � java/io/DataInputStream  � D � � � java/io/DataOutputStream � � D � content-type content-encoding content-length C B !org/microemu/cldc/http/Connection java/lang/Object $javax/microedition/io/HttpConnection 5org/microemu/microedition/io/ConnectionImplementation toString ()Ljava/net/URLConnection; java/net/URLConnection setDoOutput setInstanceFollowRedirects 
disconnect ()Ljava/net/URL; java/lang/String equals (Ljava/lang/Object;)Z connect getInputStream (Ljava/io/InputStream;)V getOutputStream (Ljava/io/OutputStream;)V ! ; <  = >   ? @    A B    C B   #  D E  F   8     
*� *� �    G   
    )  - H       
 I J    K L  F   �     T� � � Y� �� Y+� :� :� Y� 
� �*� � *� � *� � � *� � � *�     	  G   .    2  3  7  :  8  9 , ; 5 < = ? G @ R B H   >    M N    T I J     T O P    T Q R    T S B   : T U  V       W E  F   `     "*� � �*� � � *� � � *� �    G       F  G  J  K  N ! O H       " I J   V       X Y  F   F     *� � �*� � � �    G       R  S 	 V H        I J    Z Y  F   -     �    G       Z H        I J    [ Y  F   F     *� � �*� � � �    G       ^  _ 	 b H        I J    \ Y  F   F     *� � �*� � � �    G       f  g 	 j H        I J    ] Y  F   F     *� � �*� � � �    G       n  o 	 r H        I J    ^ Y  F   =     *� � ��    G       v  w 	 { H        I J    _ `  F   f     *� � �*� � � <� P��    G         � 	 �  �  �  � H        I J    
 a R   b Y  F   Z      *� � �*� � � *� � � ��    G       �  � 	 �  �  � H         I J    c d  F   �     6*� � � Y� �+� � *� � *� � � *� � +� �    G       �  �  �  �   � * � 5 � H       6 I J     6 e P  V       f g  F   N     *� � �*� +� �    G       �  � 	 � H        I J      h P   i j  F   j      *� � 
*� � � Y� �*� +,� �    G       �  �  �  � H          I J       h P      k P  V       l `  F        9*� � � Y� �*� � *� � *� *� � � *� � �  ��    G   "    �  �  �  �  � " � , � 7 � H       9 I J   V       m Y  F        9*� � � Y� �*� � *� � *� *� � � *� � � !��    G   "    �  �  �  �  � " � , � 7 � H       9 I J   V       n o  F   h     **� � � Y� �*� � *� � *� *� � "�    G       �  �  �  �  � " � H       * I J   V       p o  F   h     **� � � Y� �*� � *� � *� *� � #�    G       �  �  �  �  � " � H       * I J   V       q o  F   h     **� � � Y� �*� � *� � *� *� � $�    G       �  �  �  �  � " � H       * I J   V       r g  F   s     +*� � � Y� �*� � *� � *� *� +� %�    G       �  �  �  �  � " H       + I J     + O P  V       s t  F   ~     ,*� � � Y� �*� � *� � *� *� +� &�    G         	 
 " H        , I J     , O P    , u R  V       v w  F   ~     ,*� � � Y� �*� � *� � *� *� + � '�    G           " H        , I J     , O P    , u x  V       r y  F   w     /*� � � Y� �*� � *� � *� *� *� (� )�    G          ! " "% H       / I J     / z R  V       { y  F   w     /*� � � Y� �*� � *� � *� *� *� (� *�    G      ) * , - . "1 H       / I J     / z R  V       | }  F   W     *� � *� *� � )� ��    G      5 6 8 H        I J      ~ R    �  F   R     *� � � Y� �*� *� � +�    G      < = @ B H        I J   V       � �  F   6     � ,Y*� -� .�    G      F H        I J   V       � �  F   R     *� � � Y� �*� *� � /�    G      J K N P H        I J   V       � �  F   6     � 0Y*� 1� 2�    G      T H        I J   V       � Y  F   N     
*3� 4�L�        G      Y Z [ H       M �    
 I J    � Y  F   N     
*5� 4�L�        G      a b c H       M �    
 I J    � o  F   R     *6� 7��L 8�     	   G      i 	j 
k H     
  M �     I J   	 � �  F         � :�    G      p 	 � �  F   3     � :�    G   
   t u H        C B    � E  F         � :�    G       /  �    �