����   0O
BCDE
 F
 G
 �FHI
 FJ
KL
 MN
 O
 P	 �Q
 RST
UV	 �W	 �X
 �YZ
 [
 �\]
 �^
 v_`a`bc
  d
 �e
  fgh
 i
jk
 l
  m
 �n
 �o
 �p	 �qr
Us	 �tu
 ?vw
 �x
 �yz{|
 8}
 7~
�
��
 =��
 ?F
 ?�
j���
 ?�
 ��
 ��
 H}
 ?�
 H�
j��
 MF �
 ?�
 ?�
 ?l �
 =� �
 ?� �
 ������#
 ?�����
 aF�����	��
�O���������
 ?� n�
 ?� n�
��	 ��
 ���
 vF��
  �
  �
 v�	 �����������
  �
  �
  �
  �
  l
 ?�
 ?�
 ?���
 �F�
 ?�	 ���	 ���	 ���	 ��
 =�
 ?����
 ?����
 ?�
 =�
 =���	 ���
 ���
 ���� meHome Ljava/io/File; 
emulatorID Ljava/lang/String; 	configXml Lnanoxml/XMLElement; defaultDevice #Lorg/microemu/app/util/DeviceEntry; resizableDevice emulatorContext Lorg/microemu/EmulatorContext; urlsMRU Lorg/microemu/app/util/MRUList; .class$org$microemu$app$util$MidletURLReference Ljava/lang/Class; 	Synthetic <init> ()V Code LineNumberTable LocalVariableTable this Lorg/microemu/app/Config; initMEHomePath ()Ljava/io/File; e Ljava/lang/SecurityException; 
loadConfig D(Lorg/microemu/app/util/DeviceEntry;Lorg/microemu/EmulatorContext;)V entry src dst Ljava/util/Enumeration; ex Ljava/io/IOException; 
configFile loadConfigFile (Ljava/lang/String;)V b [B dis Ljava/io/InputStream; Lnanoxml/XMLParseException; configFileName is xml 
Exceptions createDefaultConfigXml 
saveConfig fw Ljava/io/FileWriter; getExtensions ()Ljava/util/Map; tmp_prop e_prop propXml een 	extension 	className 
parameters Ljava/util/Map; en 
extensions extensionsXml initSystemProperties tmp Entry InnerClasses Ljava/util/Map$Entry; xmlProperty i Ljava/util/Iterator; propertiesXml systemProperties getConfigPath getDeviceEntries ()Ljava/util/Vector; 
devDefault Z devName devFile devClass devDescriptor 
tmp_device e_device result Ljava/util/Vector; 
devicesXml addDeviceEntry &(Lorg/microemu/app/util/DeviceEntry;)V test 	deviceXml removeDeviceEntry testDescriptor changeDeviceEntry getDeviceEntryDisplaySize I(Lorg/microemu/app/util/DeviceEntry;)Lorg/microemu/device/impl/Rectangle; $Lorg/microemu/device/impl/Rectangle; rectangleXml setDeviceEntryDisplaySize J(Lorg/microemu/app/util/DeviceEntry;Lorg/microemu/device/impl/Rectangle;)V mainXml rect getRecordStoreManagerClassName ()Ljava/lang/String; recordStoreManagerXml setRecordStoreManagerClassName isLogConsoleLocationEnabled ()Z logConsoleXml setLogConsoleLocationEnabled (Z)V state isWindowOnStart (Ljava/lang/String;)Z name 
windowsXml attr 	getWindow \(Ljava/lang/String;Lorg/microemu/device/impl/Rectangle;)Lorg/microemu/device/impl/Rectangle; defaultWindow window 	setWindow :(Ljava/lang/String;Lorg/microemu/device/impl/Rectangle;Z)V onStart getRecentDirectory &(Ljava/lang/String;)Ljava/lang/String; key defaultResult filesXml setRecentDirectory '(Ljava/lang/String;Ljava/lang/String;)V recentJadDirectory recentJadDirectoryXml 
getUrlsMRU !()Lorg/microemu/app/util/MRUList; getEmulatorID setEmulatorID class$ %(Ljava/lang/String;)Ljava/lang/Class; x1 "Ljava/lang/ClassNotFoundException; x0 <clinit> 
SourceFile Config.java��;  java/lang/ClassNotFoundException java/lang/NoClassDefFoundError � ��� java/io/File java/lang/StringBuffer 	user.home��.�� /.microemulator/� � � � � �� java/lang/SecurityException Cannot access user.home��� � � � � � � config2.xml� � � 
config.xml � ������� !org/microemu/app/util/DeviceEntry 	 dev .jar �	 � � � � � � java/io/IOException�	 � � files
 recent � �   java/io/BufferedInputStream java/io/FileInputStream � � java/lang/String � nanoxml/XMLElement � nanoxml/XMLParseException config � java/io/FileWriter � java/util/HashMap� !"8#$% 
properties property&. value system-properties system-property java/util/Properties microedition.configuration CLDC-1.0 microedition.profiles MIDP-2.0 avetana.forceNativeLibrary'()*+,-./01� java/util/Map$Entry23�456�789 � � � � java/util/Vector Default device &org/microemu/device/default/device.xml �:;<  � � Resizable device (org/microemu/device/resizable/device.xml devices device default true filename class 
descriptor �= �>?@2ABC � 	rectangle "org/microemu/device/impl/Rectangle xDE�F y�F width�F height�FGHI � recordStoreManager 
logConsole locationEnabledJK false windows onstart&"LM . org/microemu/app/util/MRUList � � (org.microemu.app.util.MidletURLReference:; midlet �N org/microemu/app/Config java/lang/Object java/lang/Class forName 	initCause ,(Ljava/lang/Throwable;)Ljava/lang/Throwable; java/lang/System getProperty append ,(Ljava/lang/String;)Ljava/lang/StringBuffer; toString #(Ljava/io/File;Ljava/lang/String;)V org/microemu/log/Logger error *(Ljava/lang/String;Ljava/lang/Throwable;)V exists elements ()Ljava/util/Enumeration; java/util/Enumeration hasMoreElements nextElement ()Ljava/lang/Object; 	canRemove getFileName createTempFile B(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File; org/microemu/app/util/IOUtils copyFile (Ljava/io/File;Ljava/io/File;)V getName setFileName (Ljava/lang/Throwable;)V getChildOrNew ((Ljava/lang/String;)Lnanoxml/XMLElement; read (Lnanoxml/XMLElement;)V (Ljava/io/File;)V (Ljava/io/InputStream;)V java/io/InputStream 	available ()I ([B)I ([B)V parseString closeQuietly setName save mkdirs write (Ljava/io/Writer;)V close getChild enumerateChildren equals (Ljava/lang/Object;)Z getChildString 8(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; java/util/Map put 8(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; getStringAttribute java/lang/Boolean TRUE Ljava/lang/Boolean; entrySet ()Ljava/util/Set; java/util/Set iterator ()Ljava/util/Iterator; java/util/Iterator hasNext next addChild getValue setAttribute '(Ljava/lang/String;Ljava/lang/Object;)V getKey ,org/microemu/app/util/MIDletSystemProperties setProperties (Ljava/util/Map;)V ;(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V setDefaultDevice add X(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lorg/microemu/EmulatorContext;)V :(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V getDescriptorLocation isDefaultDevice :(Ljava/lang/String;Ljava/lang/String;)Lnanoxml/XMLElement; removeChild removeAttribute getChildInteger (Ljava/lang/String;I)I I valueOf (I)Ljava/lang/String; 
setContent getBooleanAttribute (Ljava/lang/String;Z)Z trim toLowerCase &(Ljava/lang/Class;Ljava/lang/String;)V ! � �    
 � �   
 � �   
 � �   
 � �   
 � �   
 � �   
 � �    � �  �       � �  �   /     *� �    �       6 �        � �   
 � �  �   �     <� Y� Y� 	
� � � � � K� � � Y*� � �*�K*� �    0 3  1 2 3   �       K  L % M 1 O 3 Q 4 R : S �       � �   4  � �   	 � �  �  �     �*� +� � Y� � M,� � � � �� Y� � M,� � l� � � N-�  � T-�  �  :� !� ���� "� Y� � #� :$%� � &:� '� (� )� *���� � +� ,� -� +� +� %N-� /� +� -� � +� :� -� � +�� 0� -1� 23� 2� 4� 5�   � � .  � �   � � �   � � �    �   � !   X  Y  [  ]  ^ $ ` 1 a 8 c = e M f X g ` h c k h l y m � n � o � p � q � s � u � | � } � w � x � y � | � } � | � } � � � � � � �   R  X C � �  y " � �  �  � �  D Z � �  �  � �    � � �     � � �   � � �  
 � �  �  `     �� Y� *� LM6N� 7Y� 8Y+� 9YM� ::� ;� 2� ;�:� <W� Y� 	-� � =Y� >� � N��̻ ?Y� @� -� --� A,� B� :� /� +,� B� :,� B��   l s C  l �   s } �   � � �    �   R    �  �  �  � $ � , � 5 � = � X � [ � e � l � p � s � u � z � } � � � � � � � �   H  5 # � �  $ H � �  u  � �    � � �    � � �   � � �   } � �  �     . 
 � �  �   3      � ?Y� @� -� -D� E�    �       � 
 �  � 	 � �  �   �     X� 0� -1� 23� 2� F� Y� � K� � GWL� HY*� IL� -+� J+� K+� L� M,� /+� L� 
N+� L-��  ) = D . ) = P   D I P   P Q P    �   >    �  �   � ' � ) � 2 � 9 � = � A � D � E � I � M � P � W � �      E  � �    8 � �   ) / � �   � �  �  �  
   � MY� NK� -O� PL+� *�+� QM,�  � �,�  � ?N-� RS� T� ���-U� V:� ��л MY� N:W� X� Y W-� Q:�  � b�  � ?:� RZ� T� F� Q:�  � 5�  � ?:		� R[� T� 	\� ]	^� ]� Y W��ǧ��*� Y W��=*�    �   f    �  �  �  �  � % � / � ; � > � G � L � O � X � e � u � � � � � � � � � � � � � � � � � � � � � �   f 
 � # � � 	 � < � �  � P � �  k i � �  / � � �  G � � �  X � � �   � � �   � � �    � � �  
 � �  �  �     �K� -� QL+�  � b+�  � ?M,� R_� T� I� MY� NK,� QN-�  � 3-�  � ?:� R`� T� *\� ]^� ]� Y W��ʧ��*� �� aY� bK*cd� Y W*ef� Y W*g� h� i� Y W� -_� 2L*� j � k M,� l � 8,� m � nN+`� o:^-� p � =� q\-� r � =� q��Ÿ ,*� s�    �   j    �  �  �  � ( � 0 � > � I � V � k � n � q � u � } � � � � � � � � � � � � � � � � � � � � � � � � � �   \ 	 I " � �  5 9 � �   R � �  	 h � �  � ( � �  �   � �  � > � �  � M � �   � � �   	 � �  �   0      � t� 	� u� t� t�    �       �    	 � �  �  �  	   �� vY� wK� � �  Yxy� z� � � {*� � |W� }� �  Y~� z� }� }� *� -�� PL+� *�+� QM,�  � �,�  � ?N-� R�� T� ~6-�� ]� -�� ]�� T� 6� � {-\� V:-�� V:-�� V:-�� V:� *�  Y� � �� |W� *�  Y� �� |W��f*�    �   n     	  & . 4 E K T X Z h r ~ � � � �! �" �# �$ �& �' �) �, �. �   \ 	 � x � �  � N � �  � E  �  � < �  � 3 �  r � �  _ � �   �   T � �  		  �   �     p� � L+�  � +�  �  M,� �*� �� T� ���޲ -�� 2L+�� oM*� �� ,��� q,\*� �� �W,�*� #� �W,�*� �� �W� ,�    �   :   2 3 4 (5 )7 ,9 5; << C= K? V@ aA lC oD �   4   
 �   % � �    p � �   5 ; �  < 4 �  		  �   �     f� -�� PL+� �+� QM,�  � L,�  � ?N-� R�� T� 3-�� V:� +-� �� ,���*� �� T� +-� �� ,� ����    �   F   G 	H I L M &N 2O ;Q @R ET HU KW WX \Z _[ b^ e_ �   4  ; ' �  & < �   R �    f � �   	 ] �  		  �   �     i� -�� PL+� �+� QM,�  � O,�  � ?N-� R�� T� 6-�� V:*� �� T� !*� �� -��� q� 	-�� �� ,� ����    �   >   b 	c d g h &i 2j ;k Gl Nm Yo _r bs ev hw �   4  ; * �  & ? �   U �    i � �   	 ` �  	  �  >     �� -�� PL+� �+� QM,�  � ~,�  � ?N-� R�� T� e-�� V:*� �� T� P-�� P:� C� �Y� �:�� �� ��� �� ��� �� ��� �� �����    �   F   z 	| } ~ % 1� :� F� N� S� \� i� v� �� �� �� �� �   H  \ 7  N E �  : Y �  % n �   � �    � � �   	 � �  	  �  ~     �*� �� -�� PM,� �,� QN-�  � �-�  � ?:� R�� T� |�� V:*� �� T� f�� 2:�� 2:+� �� �� ��� 2:+� �� �� ��� 2:+� �� �� ��� 2:+� �� �� �� ,� ��f�    �   ^   � � � � � � !� ,� 9� C� O� X� a� m� v� �� �� �� �� �� �� �� �� �   R  X Z �  a Q � �  C o �  , � �   � �    � � �     �   � �  	  �   L     � -�� PK*� �*�� ]�    �      � 	� � � �     	  �   	 �  �   T     � -�� 2L+�*� q� ,�    �      � 	� � � �        � �   	  �  	  �   M     � -�� PK*� �*�� ��    �      � 	� � � �     	  �   	  �   l     $� -�� 2L� +��� q� +��� q� ,�    �      � 	� � �  � #� �       $  �   	  �  	!"  �   �     7� -�� PL+� �+*� PM,� �,��� �N-� �� ��� T� ��    �   * 
  � 	� � � � � � $� 3� 5� �   *    7# �   	 .$ �   " �  $ % �  	&'  �   �     c� -�� PM,� +�,*� PN-� +�� �Y� �:-�+� �� �� �-�+� �� �� �-�+� �� �� �-�+� �� �� ��    �   2   � 	� � � � � � $� 3� B� Q� `� �   4    c# �     c(  	 Z$ �   N �  $ ?)  	*+  �       � -�� 2N-*� 2:� ��� q� 
�� ��� 2:+� �� �� ��� 2:+� �� �� ��� 2:+� �� �� ��� 2:+� �� �� �� ,�    �   >   � 	      ' 0 < E	 Q
 Z f o { ~ �   >    # �     )    , �  	 v$ �   o �  0 O � �  	-.  �   g     �L� -1� PM,� +�,*+� V�    �           �        / �    0 �   1 �  	23  �   p     � -1� 2M,*� 2N-+� �� ,�    �       	   " # �   *    / �     4 �  	 1 �   	5 �  	67  �         � 0�    �      & 	8  �         � �    �      * 	9 �  �   3     *� �    �   
   . / �        � �   :;  �   N     *� �L� Y� +� �        �       G �      <=    > �   �     ? �  �   H      ,� ?Y� @� -� �Y� �� �� �Y� �� � ��� �� 0�    �   
    ? 
 G @   A �   
  n� �	