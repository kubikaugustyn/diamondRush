����   0 �
 4 n	 3 o p
  n	 3 q	 3 r	 3 s	 3 t u v
 4 w
 x y
 
 z
  {
  |
  }
  ~
  
  �
 3 �	 3 � � � �
  n
 ' � =
 � �
 ' �
  � � � � �
 ' � 	 �
  �
 ' �
 ' � � � � � �
 ' y
 � �
 x � 	 � � �
 - � �
  � � � � � � � serialVersionUID J ConstantValue        MAXCAPACITY_DEFAULT I   
 maxCapacity items Ljava/util/Stack; 	itemsName Ljava/lang/String; classXMLItem Ljava/lang/Class; listener 'Lorg/microemu/app/util/MRUListListener; modified Z <init> &(Ljava/lang/Class;Ljava/lang/String;)V Code LineNumberTable LocalVariableTable this Lorg/microemu/app/util/MRUList; push &(Ljava/lang/Object;)Ljava/lang/Object; item Ljava/lang/Object; fireListener (Ljava/lang/Object;)V setListener *(Lorg/microemu/app/util/MRUListListener;)V l getMaxCapacity ()I setMaxCapacity (I)V save (Lnanoxml/XMLElement;)V element Lorg/microemu/app/util/XMLItem; iter Ljava/util/Iterator; xml Lnanoxml/XMLElement; read e "Ljava/lang/InstantiationException; "Ljava/lang/IllegalAccessException; xmlChild en Ljava/util/Enumeration; Ljava/util/ListIterator; 
SourceFile MRUList.java H � = ; java/util/Stack > ? F G B C @ A org/microemu/app/util/XMLItem java/lang/ClassCastException � � � � � H � � Y � � � � � � � � � � S T D E � � T "java/lang/IllegalArgumentException � � � � � � � � � � � � � � � � \ ] � � � � � � � � � � � nanoxml/XMLElement � � � � d ]  java/lang/InstantiationException java/lang/RuntimeException H �  java/lang/IllegalAccessException � � � � � � � org/microemu/app/util/MRUList java/lang/Object ()V getClass ()Ljava/lang/Class; java/lang/Class getName ()Ljava/lang/String; (Ljava/lang/String;)V size pop ()Ljava/lang/Object; remove (Ljava/lang/Object;)Z empty ()Z add insertElementAt (Ljava/lang/Object;I)V %org/microemu/app/util/MRUListListener listItemChanged removeChildren java/lang/String valueOf (I)Ljava/lang/String; setAttribute '(Ljava/lang/String;Ljava/lang/Object;)V iterator ()Ljava/util/Iterator; java/util/Iterator hasNext next addChild ((Ljava/lang/String;)Lnanoxml/XMLElement; removeAllElements getIntAttribute (Ljava/lang/String;I)I enumerateChildren ()Ljava/util/Enumeration; java/util/Enumeration hasMoreElements nextElement equals newInstance (Ljava/lang/Throwable;)V listIterator (I)Ljava/util/ListIterator; java/util/ListIterator hasPrevious previous ! 3 4  	   5 6  7    8  : ;  7    <  = ;    > ?    @ A    B C    D E    F G     H I  J   {     %*� *
� *� Y� � *� *+� *,� �    K       <  0 
 2  :  =  > $ ? L        % M N     % B C    % @ A   O P  J   �     `+� 	� � 
Y+� � � �*� *� � *� � *� � W*� +� W*� � � *� +� W� *� +� *+� +�    K   .    B  C  E  F ) G 1 I : J D K P M Y O ^ P L       ` M N     ` Q R   S T  J   N     *� � *� +�  �    K       T  U  X L        M N      Q R   U V  J   U     *� � � Y� �*+� �    K       [  \  ^  _ L        M N      W E   X Y  J   /     *� �    K       b L        M N    Z [  J   >     *� �    K   
    f  g L        M N      = ;   \ ]  J   �     K*� � �+� +*� � � *� � M,�  � ,�  � 	N-+*� �  � ! ���*� �    K   * 
   j  k  m  n  o * p 4 q B r E s J t L   *  4  ^ _  ! $ ` a    K M N     K b c   d ]  J  �     �*� *� � "*+
� #� +� $M,� % � W,� & � 'N-� (*� � )� <*� � *� 	:-� + *� � W� :� -Y� .�:� -Y� .����*� � � -*� *� � � 0M,� 1 � ,� 2 � 	N*-� ���  > \ _ , > \ k /  K   V    w  x  y  z & { 0 | > ~ J  R � \ � _ � a � k � m � w � z � � � � � � � � � � � L   \ 	 J  ^ _  a 
 e f  m 
 e g  0 G h c   ] i j  �  ^ _  �  ` k    � M N     � b c   l    m