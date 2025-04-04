����   0
 C � �
  �	 B �	 B �	 B �	 B � �
  �	 B �	 B �
 � �	 B �
 � �	 B �
 � �
 � �
 � �
 � � �
  �
  � �
 � �
 � �
 � �
  � � � � �
  �
  � ]
 � � �
 " �
  �
 B � � �
  � � �
  �
  �
  � �
 , � �
 . �
 � �
 � � � �
 B �
  � �
 5 �
 B �
 B � �
 9 �
  � � � = � < � < � < � � � records Ljava/util/Hashtable; recordStoreName Ljava/lang/String; version I lastModified J nextRecordID open Z recordStoreManager !Lorg/microemu/RecordStoreManager; recordListeners Ljava/util/Vector; <init> 6(Lorg/microemu/RecordStoreManager;Ljava/lang/String;)V Code LineNumberTable LocalVariableTable this #Lorg/microemu/util/RecordStoreImpl; =(Lorg/microemu/RecordStoreManager;Ljava/io/DataInputStream;)V recordId data [B ex Ljava/io/EOFException; dis Ljava/io/DataInputStream; 
Exceptions � write (Ljava/io/DataOutputStream;)V key Ljava/lang/Integer; dos Ljava/io/DataOutputStream; en Ljava/util/Enumeration; isOpen ()Z setOpen (Z)V closeRecordStore ()V � getName ()Ljava/lang/String; 
getVersion ()I getNumRecords getSize keys size getSizeAvailable getLastModified ()J addRecordListener *(Ljavax/microedition/rms/RecordListener;)V listener 'Ljavax/microedition/rms/RecordListener; removeRecordListener getNextRecordID 	addRecord ([BII)I offset numBytes 
recordData curRecordID deleteRecord (I)V getRecordSize (I)I 	getRecord (I[BI)I buffer 
recordSize (I)[B 	setRecord (I[BII)V id newData enumerateRecords {(Ljavax/microedition/rms/RecordFilter;Ljavax/microedition/rms/RecordComparator;Z)Ljavax/microedition/rms/RecordEnumeration; filter %Ljavax/microedition/rms/RecordFilter; 
comparator )Ljavax/microedition/rms/RecordComparator; keepUpdated getHeaderSize getRecordHeaderSize fireRecordListener (II)V l e type 	timestamp 
SourceFile RecordStoreImpl.java S q java/util/Hashtable D E H I J K L I java/util/Vector Q R O P � � v F G � � M N � � t � v � } � � java/lang/Integer S � � � java/io/EOFException � � � � � � � y � � � m  v d 2javax/microedition/rms/RecordStoreNotOpenException q s t	 z v {
 java/lang/NullPointerException /javax/microedition/rms/RecordStoreFullException } � � /javax/microedition/rms/InvalidRecordIDException � � � � 'org/microemu/util/RecordEnumerationImpl S � %javax/microedition/rms/RecordListener (org/microemu/util/ExtendedRecordListener !org/microemu/util/RecordStoreImpl "javax/microedition/rms/RecordStore java/io/IOException +javax/microedition/rms/RecordStoreException java/lang/String length 	substring (II)Ljava/lang/String; java/io/DataInputStream readUTF readInt readLong read put 8(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; java/io/DataOutputStream writeUTF (Ljava/lang/String;)V writeInt 	writeLong (J)V ()Ljava/util/Enumeration; java/util/Enumeration hasMoreElements nextElement ()Ljava/lang/Object; intValue get &(Ljava/lang/Object;)Ljava/lang/Object; ([B)V removeAllElements org/microemu/RecordStoreManager fireRecordStoreListener (ILjava/lang/String;)V &(Lorg/microemu/util/RecordStoreImpl;)I contains (Ljava/lang/Object;)Z 
addElement (Ljava/lang/Object;)V removeElement java/lang/System 	arraycopy *(Ljava/lang/Object;ILjava/lang/Object;II)V currentTimeMillis saveChanges &(Lorg/microemu/util/RecordStoreImpl;)V remove u(Lorg/microemu/util/RecordStoreImpl;Ljavax/microedition/rms/RecordFilter;Ljavax/microedition/rms/RecordComparator;Z)V elements recordEvent *(IJLjavax/microedition/rms/RecordStore;I)V recordAdded ((Ljavax/microedition/rms/RecordStore;I)V recordChanged recordDeleted ! B C     D E    F G    H I    J K    L I   � M N   � O P   � Q R     S T  U   �     P*� *� Y� � *� *	� *� *� Y� 	� 
*+� ,�  � *,� � *, � � *� �    V   2    B  3  6  7  8  > ) C . D 7 E ? G J I O J W        P X Y     P O P    P F G   S Z  U  %     }*� *� Y� � *� *	� *� *� Y� 	� 
*+� *,� � *,� � *,� � *,� � ,� >,� �:,�� W*� � Y� � W���N�  N { {   V   J    O  3  6  7  8  > ) P . R 6 S > T F U N Y S Z [ [ f \ x ] { ^ | ` W   >  S % [ I  [  \ ]  |   ^ _    } X Y     } O P    } ` a  b     c  d e  U   �     d+*� � +*� � +*� � +*� � *� � M,�  � 5,�  � N+-� � *� -� �  �  :+�� +� !��ȱ    V   6    f  g  h  i   k ( l 1 m ; n C o S p Z q ` r c s W   4  ; % f g  S  \ ]    d X Y     d h i  ( < j k  b     c  l m  U   /     *� �    V       x W        X Y    n o  U   >     *� �    V   
    ~   W        X Y      M N   p q  U   t     2*� � � "Y� #�*� 
� 
*� 
� $*� 	*� %� & *� �    V       �  �  �  �  � , � 1 � W       2 X Y   b     " r  s t  U   F     *� � � "Y� #�*� �    V       �  �  � W        X Y   b     "  u v  U   i     *� � � "Y� #�*YL�*� +ìM+�,�             V       �  �  �  �  � W        X Y   b     "  w v  U   l     "*� � � "Y� #�*YL�*� � '+ìM+�,�              V       �  �  �  �  � W       " X Y   b     "  x v  U   �     >*� � � "Y� #�<*� � M,�  � *� ,�  � �  �  �`<����    V       �  �  �  � " � < � W       # y k    > X Y    - z I  b     "  { v  U   L     *� � � "Y� #�*� *� ( �    V       �  �  � W        X Y   b     "  | }  U   i     *� � � "Y� #�*YL�*� +íM+�,�             V       �  �  �  �  � W        X Y   b     "  ~   U   P     *� 
+� )� *� 
+� *�    V       �  �  � W        X Y      � �   �   U   B     
*� 
+� +W�    V   
    � 	 � W       
 X Y     
 � �   � v  U   i     *� � � "Y� #�*YL�*� +ìM+�,�             V       �  �  �  �  � W        X Y   b     " r  � �  U  X     �*� � � "Y� #�+� � � ,Y� -�*� *� ( � � .Y� /��:+� +� 0*Y:�*� � Y*� � � W*Y� `� *� 6*Y� `� *� 1� ç :��*� *� 2 *� 3�  L � �   � � �    V   N    �  �     - 5 : >	 G L a k q { � � � � W   >    � X Y     � \ ]    � � I    � � I  : j � ]  q 3 � I  b     " r .  � �  U   �     Y*� � � "Y� #�*YM�*� � Y� � 4� � 5Y� 6�*Y� `� *� 1� ,ç N,�-�*� *� 2 *� 3�   @ C   C F C    V   .     ! $ % %& -( 7) >* H, R. X/ W       Y X Y     Y [ I  b     " 5 r  � �  U   �     A*� � � "Y� #�*YM�*� � Y� � �  �  N-� � 5Y� 6�-�,ì:,��   9 :   : > :    V   "   5 6 9 : ); -< 5? :@ W      )  \ ]    A X Y     A [ I  b     " 5 r  � �  U   �     :*Y:�*� 76*� � Y� � ,� 0ç :��*� 3�   & )   ) . )    V      H I J #L 1N 7P W   4    : X Y     : [ I    : � ]    : � I   . � I  b     " 5 r  � �  U   �     ,*YN�*� 7�M*,� 8W-ç 
:-��,�� � ,�             V      Y Z [ \  ^ W        , X Y     , [ I     \ ]  b     " 5 r  � �  U  K  	   �*� � � "Y� #�*� *� ( � � .Y� /��:,� 0*Y:» Y� :*� � 4� � 5Y� 6�*� � W*Y� `� *� 1� ç :��*� *� 2 *� 3�  ; y |   | � |    V   F   e f j k &n ,o 6q ;r Es Qt Yv ew ox vy �{ �} �~ W   H  E 1 � g    � X Y     � [ I    � � ]    � � I    � � I  , i � ]  b   
  " 5 r .  � �  U   k     *� � � "Y� #�� 9Y*+,� :�    V      � � � W   *     X Y      � �     � �     � N  b     "  � v  U   9     *� � ```�    V      � W        X Y    � v  U   -     �    V      � W        X Y    � �  U       �� 1B*� 
� �*� 
� ;:�  � m�  � <:� =� � =!*� > � E�      A             A   ,   8*� ? � *� @ � *� A ����    V   :   � � � � *� 2� C� d� m� p� y� |� �� �� W   >  * [ � �   t � k    � X Y     � � I    � [ I   � � K   �    �