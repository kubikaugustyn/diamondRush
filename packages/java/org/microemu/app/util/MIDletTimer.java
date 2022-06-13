����   0
 I � �
  �
  � �
  �
 � �
  � �
 � �
  �	 > � �
  �	 > �	 > � �
  �	 > �
  �
 > �
 � ���������
 > �
 � �
 > �
 > �������� � � � � � � �	 " �	 " �	 " � � �
 " � � � �
 � �
 � �
 � � �	 " �
 � �	 > �
 � � �
 � �	 > � 6 � � �
 7 � 6 � 6 �
 > � 6 � � � � � �
 � � �
 � �
 � � �
 � � �
 G � � � midlets Ljava/util/Map; name Ljava/lang/String; midletContext Lorg/microemu/MIDletContext; tasks Ljava/util/List; 	cancelled Z thread $Lorg/microemu/app/util/MIDletThread; <init> ()V Code LineNumberTable LocalVariableTable this #Lorg/microemu/app/util/MIDletTimer; ste [Ljava/lang/StackTraceElement; schedule ((Ljava/util/TimerTask;Ljava/util/Date;)V task Ljava/util/TimerTask; time Ljava/util/Date; )(Ljava/util/TimerTask;Ljava/util/Date;J)V 	firstTime period J (Ljava/util/TimerTask;J)V delay (Ljava/util/TimerTask;JJ)V scheduleAtFixedRate cancel run 	candidate 'Lorg/microemu/app/util/MIDletTimerTask; it Ljava/util/Iterator; t Ljava/lang/Throwable; timeout e  Ljava/lang/InterruptedException; nextTimeTask 	terminate (Ljava/util/TimerTask;JJZ)V 	fixedRate register &(Lorg/microemu/app/util/MIDletTimer;)V timer timers 
unregister contextDestroyed (Lorg/microemu/MIDletContext;)V terminateTimers (Ljava/util/Map;)V tm o Ljava/lang/Object; iter <clinit> 
SourceFile MIDletTimer.java W X java/lang/Throwable � � java/lang/StringBuffer � � � � � . � � � � M N java/util/ArrayList Q R S T "org/microemu/app/util/MIDletThread W � U V � X } ~ � � � ` { � � � � ~ z X � � � � � � � � %org/microemu/app/util/MIDletTimerTask d i h i � T � � o X � � MIDletTimerTask throws � � � � � X � � java/lang/InterruptedException  ] � X O P � � � %Creating Timer with no MIDlet context � � K L � � java/util/Map java/util/HashMap  � � � � !org/microemu/app/util/MIDletTimer MIDlet timer created from [ ] still running unrecognized Object [	
 � ] � java/util/WeakHashMap java/util/Timer java/lang/Runnable getStackTrace  ()[Ljava/lang/StackTraceElement; java/lang/StackTraceElement getClassName ()Ljava/lang/String; append ,(Ljava/lang/String;)Ljava/lang/StringBuffer; getMethodName toString (Ljava/lang/Runnable;)V start java/util/Date getTime ()J java/lang/System currentTimeMillis java/util/List iterator ()Ljava/util/Iterator; java/util/Iterator hasNext ()Z next ()Ljava/lang/Object; oneTimeTaskExcecuted remove (Ljava/lang/Object;)Z add org/microemu/log/Logger debug *(Ljava/lang/String;Ljava/lang/Throwable;)V java/lang/Object wait (J)V notify org/microemu/MIDletBridge getMIDletContext ()Lorg/microemu/MIDletContext; error get &(Ljava/lang/Object;)Ljava/lang/Object; put 8(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; keySet ()Ljava/util/Set; java/util/Set warn (Ljava/lang/String;)V getClass ()Ljava/lang/Class; java/lang/Class getName ! > I  J  
 K L    M N    O P     Q R    S T    U V     W X  Y   �     X*� � Y� � L*� Y� +2� � 	� +2� 
� � � *� Y� � *� *� Y*� � *� � �    Z   "    A  B  C 4 D ? E D F P G W H [       X \ ]    I ^ _   ` a  Y   X     *� *+,�  � �    Z       L  M  N [         \ ]      b c     d e   ` f  Y   `     *� *+,� !� �    Z       R  S  T [   *     \ ]      b c     g e     h i   ` j  Y   Y     *� *+�  a � �    Z       X  Y  Z [         \ ]      b c     k i   ` l  Y   b     *� *+�  a� �    Z       ^  _  ` [   *     \ ]      b c     k i     h i   m f  Y   `     *� *+,� !� �    Z       d  e  f [   *     \ ]      b c     g e     h i   m l  Y   b     *� *+�  a� �    Z       j  k  l [   *     \ ]      b c     k i     h i   n X  Y   ;     	*� *� �    Z       o  q  r [       	 \ ]    o X  Y  �  
  ^*� �YL A*� Y:�*� �  :�   � l� ! � ":� #� �� � # ����� #A���+� 	L� 4� #+� #�� +� # �� +� #AL� � # �� 	� #A���+� +� $	�� +� %*� +� & Wç :��+� W+� '*� Y:�+� $	�� (+� +� $a� #*� +� ( W+� # �� +� #Aç :��� :)� **� Y:�  �� *� � +�  � e7	�� *� � ,� :ç :	�	�����   � �   � � �   � �     �
 GJ -OR  RWR    Z   � /   u  v 	 w  x  y   z * { 6 | B } L ~ U � Y � _ � l � u � z � � � � � � � � � � � � � � � � � � � � � � � � � � � � � � � � � � �
 � � � � �& �0 �7 �> �G �J �L �Z �] � [   R  6 Z p q    � r s   t u 7  v i L   w x  	Q b q  M y i   ^ \ ]    z X  Y   4     *� �    Z   
    �  � [        \ ]    ` {  Y   �  	   B*� Y:�+� "*� .+� " � #+� "� $*� +� ( W*� � /ç :���   6 9   9 > 9    Z   "    �  �  �  � ! � , � 3 � A � [   4    B \ ]     B b c    B d i    B h i    B | T  
 } ~  Y   �     Y*� 0� 
*� 1� 0*� 0� 2� Y� � 3�� 4*� 0� 5 � 6L+� � 7Y� 8L� 4*� 0+� 9 W+**� 0� 9 W�    Z   .    �  �  �  � ! � " � 2 � 6 � > � L � X � [       Y  ]   2 ' � L  
 � ~  Y   r     &*� 0� �� 4*� 0� 5 � 6L+� �+*� : W�    Z       �  �  �  �  �  � % � [       &  ]     � L  	 � �  Y   q     %*� �� 4*� 5 � 6L+� +� ;� 4*� : W�    Z       �  �  �  �  �  � $ � [       % O P     � L  
 � �  Y   �     y*� < � = L+�   � f+� ! M,� ���,� >� -,� >N� Y� ?� -� � @� � � A-� � $� Y� B� ,� C� D� E� � � F����    Z   2    �  �  �   � # � * � / � M � Q � T � u  x [   *  / " � ]   Y � �   l � s    y � L    � X  Y   #      � GY� H� 4�    Z       3  �    �