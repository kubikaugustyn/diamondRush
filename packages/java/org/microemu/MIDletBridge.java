����   0 �
 8 �	 7 �	 7 �
 1 �
 1 � �
  �
 7 �
  �
 7 �	 7 �
  � � � � �	 7 �
 7 �
 7 �
  � � � � � � � � �
 7 � � �
 7 � � � � � � � � � � � �  �  � � � � � � � � � �	 7 � �	 7 �
 5 �
 5 �
 5 �
 5 � � . �
 5 � �
 1 � �
 3 � �
 5 � � � threadMIDletContexts Ljava/lang/ThreadLocal; midletContexts Ljava/util/Map; emulator Lorg/microemu/MicroEmulator; currentMIDlet "Ljavax/microedition/midlet/MIDlet; gameCanvasAccesses players Ljava/util/ArrayList; <init> ()V Code LineNumberTable LocalVariableTable this Lorg/microemu/MIDletBridge; setMicroEmulator (Lorg/microemu/MicroEmulator;)V getMicroEmulator ()Lorg/microemu/MicroEmulator; setThreadMIDletContext (Lorg/microemu/MIDletContext;)V midletContext Lorg/microemu/MIDletContext; registerMIDletAccess (Lorg/microemu/MIDletAccess;)V accessor Lorg/microemu/MIDletAccess; c registerMIDletContext getMIDletContext @(Ljavax/microedition/midlet/MIDlet;)Lorg/microemu/MIDletContext; midlet ()Lorg/microemu/MIDletContext; setCurrentMIDlet %(Ljavax/microedition/midlet/MIDlet;)V getCurrentMIDlet $()Ljavax/microedition/midlet/MIDlet; getMIDletAccess ()Lorg/microemu/MIDletAccess; ?(Ljavax/microedition/midlet/MIDlet;)Lorg/microemu/MIDletAccess; getRecordStoreManager #()Lorg/microemu/RecordStoreManager; getAppProperty &(Ljava/lang/String;)Ljava/lang/String; key Ljava/lang/String; getResourceAsStream :(Ljava/lang/Class;Ljava/lang/String;)Ljava/io/InputStream; 	origClass Ljava/lang/Class; name notifyDestroyed destroyMIDletContext entry Entry InnerClasses Ljava/util/Map$Entry; i Ljava/util/Iterator; checkPermission (Ljava/lang/String;)I 
permission platformRequest (Ljava/lang/String;)Z URL clear test getGameCanvasKeyAccess N(Ljavax/microedition/lcdui/game/GameCanvas;)Lorg/microemu/GameCanvasKeyAccess; 
gameCanvas *Ljavax/microedition/lcdui/game/GameCanvas; registerGameCanvasKeyAccess O(Ljavax/microedition/lcdui/game/GameCanvas;Lorg/microemu/GameCanvasKeyAccess;)V access "Lorg/microemu/GameCanvasKeyAccess; addMediaPlayer $(Ljavax/microedition/media/Player;)V player !Ljavax/microedition/media/Player; removeMediaPlayer closeMediaPlayers I <clinit> 
SourceFile MIDletBridge.java D E = > 9 : � � � � org/microemu/MIDletContext O P � T X P ; < � ` � � � � � ? @ Y Z Y \ a b � d e f g j � o P p P � E � � � � � � � � � � � � java/util/Map$Entry � � � � � � w x z { "org/microemu/app/launcher/Launcher } E A <  org/microemu/GameCanvasKeyAccess B C � � � � � � � � javax/microedition/media/Player � E java/lang/ThreadLocal java/util/WeakHashMap java/util/ArrayList org/microemu/MIDletBridge java/lang/Object set (Ljava/lang/Object;)V get ()Ljava/lang/Object; setMIDletAccess 	getMIDlet java/util/Map put 8(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; &(Ljava/lang/Object;)Ljava/lang/Object; org/microemu/MicroEmulator )(Ljava/lang/String;)Ljava/io/InputStream; containsValue (Ljava/lang/Object;)Z entrySet ()Ljava/util/Set; java/util/Set iterator ()Ljava/util/Iterator; java/util/Iterator hasNext ()Z next getValue getKey remove add size ()I (I)Ljava/lang/Object; close ! 7 8     9 :    ; <    = >    ? @    A <   
 B C     D E  F   /     *� �    G       2 H        I J   	 K L  F   3     *� �    G   
    =  > H        = >   	 M N  F         � �    G       A 	 O P  F   6     � *� �    G   
    E  F H        Q R   	 S T  F   p     $� � � L+� � Y� L+� +*� 	+� 
�    G       I 
 J  L  M  O  P # Q H       $ U V   
  W R  	 X P  F   =     � *� *�  W�    G   
    T  U H        Q R   	 Y Z  F   7     � *�  � �    G       X H        [ @   	 Y \  F   M     � � � K*� *�� � �    G       \ 
 ]  ^  ` H     
  W R   	 ] ^  F   3     *� �    G   
    d  e H        [ @   	 _ `  F   E     � K*� �*� �    G       h  i  j 
 l H       W R   	 a b  F   E     � K*� �*� �    G       p  q  r 
 t H       W R   	 a c  F   2     *� � �    G       x H        [ @   	 d e  F   !      	� �  �    G       } 	 f g  F   4     
� *�  �    G       � H       
 h i   	 j k  F   >     
� +�  �    G       � H       
 l m     
 n i  	 o E  F   H     � K� *�  *� �    G       �  �  �  � H       Q R   	 p P  F   �     ^*� �� *�  � � *�  � C� �  �  L+�  � ,+�  � M,�   *� � ,� ! � " W� ��ѱ    G   2    �  �  �  �  �  � 4 � > � H � W � Z � ] � H      >  q t  + 2 u v    ^ Q R   	 w x  F   4     
� *� # �    G       � H       
 y i   	 z {  F   4     
� *� $ �    G       � H       
 | i   	 } E  F   �     c� � �  �  K*�  � B*�  � L+�   � � M,� %� !� � & � +� ! +�   �  W����� � & �    G   .    �  �  � % � 2 � 9 � A � V � W � Z � b � H      % 2 q t  2 % ~ @   H u v   	  �  F   7     � '*�  � (�    G       � H        � �   	 � �  F   D     � '*+�  W�    G   
    �  � H        � �      � �  	 � �  F   7     	� )*� *W�    G   
    �  � H       	 � �   	 � �  F   7     	� )*� +W�    G   
    �  � H       	 � �   
 � E  F   c     )� )� ,d;� � )� -� .� / � ���� )� 0�    G       �  �  � " � ( � H     	  u �    � E  F   ]      1� 1Y� 2� � 3Y� 4� � � � 3Y� 4� '� 5Y� 6� )�    G       4 
 6  8  :  � & �  �    � s   
   � r	