����   0 4
    !
   	 
 "	 
 # $ % $ & $ ' ( ) * + 	buferSize I queue Ljava/util/List; <init> (I)V Code LineNumberTable LocalVariableTable this  Lorg/microemu/log/QueueAppender; append "(Lorg/microemu/log/LoggingEvent;)V event Lorg/microemu/log/LoggingEvent; poll !()Lorg/microemu/log/LoggingEvent; 
SourceFile QueueAppender.java  , java/util/LinkedList     - . / 0 1 2 3 org/microemu/log/LoggingEvent org/microemu/log/QueueAppender java/lang/Object org/microemu/log/LoggerAppender ()V java/util/List add (Ljava/lang/Object;)Z size ()I remove (I)Ljava/lang/Object; ! 
                       U     *� *� Y� � *� �           &  $  '  (                          g     '*� +�  W*� �  *� � *� �  W�           +  ,  - & /        '       '           N     *� �  � �*� �  � 	�           2  3  5                  