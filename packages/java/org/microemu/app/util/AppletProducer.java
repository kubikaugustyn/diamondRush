����   0�
 � � � �
  �
  �
 � �
 � � �  � � � � �
 � �
 � �
 � � �
  � �
  � � � � � � � 
  �
 
 
 
 c	

 �

 - �
 -
 w
 0
 0
 5 �
 4
 4
 0
 C
 C	
 0 
!"#
 Y$%
 @&
'()
 C*
 4+
 4,	 �-.
 �/0
 �12
 Y3
 045
67
8
9:
 S �;<;=>?>@A>BCD	!E
 �F
GH
!IJKL
 c*MNOPQRS
 k �
 kTUVUW
 YXYZ[
 Y\]
 u �_
 c`
abc
 �d
 �e
 zf	 �gh
 �ij
 �k
 �l
mn
 �opqr *class$org$microemu$app$util$AppletProducer Ljava/lang/Class; 	Synthetic )class$org$microemu$device$j2se$J2SEDevice <init> ()V Code LineNumberTable LocalVariableTable this &Lorg/microemu/app/util/AppletProducer; 
createHtml r(Ljava/io/File;Lorg/microemu/device/impl/DeviceImpl;Ljava/lang/String;Ljava/io/File;Ljava/io/File;Ljava/io/File;)V width I height htmlOutputFile Ljava/io/File; device %Lorg/microemu/device/impl/DeviceImpl; 	className Ljava/lang/String; midletOutputFile appletPackageOutputFile deviceOutputFile writer Ljava/io/FileWriter; 
Exceptions createMidlet (Ljava/net/URL;Ljava/io/File;)V newInputBuffer [B name size read length outputBuffer 
outputSize manifest Ljava/util/jar/Manifest; inputBuffer jarEntry Ljava/util/jar/JarEntry; url Ljava/net/URL; midletInputUrl jis Ljava/util/jar/JarInputStream; ijis jos Ljava/util/jar/JarOutputStream; config 4Lorg/microemu/app/classloader/InstrumentationConfig; main ([Ljava/lang/String;)V i arg entry en Ljava/util/Enumeration; context Lorg/microemu/EmulatorContext; urls [Ljava/net/URL; classLoader Ljava/lang/ClassLoader; descriptorLocation jar Ljava/util/jar/JarFile; ex Ljava/io/IOException; args [Ljava/lang/String; midletClass appletInputFile deviceInputFile midletInputFile appletOutputFile params Ljava/util/List; argsIterator Ljava/util/Iterator; usage ()Ljava/lang/String; class$ %(Ljava/lang/String;)Ljava/lang/Class; x1 "Ljava/lang/ClassNotFoundException; x0 
SourceFile AppletProducer.javast �  java/lang/ClassNotFoundException java/lang/NoClassDefFoundError � �uvwxy *org/microemu/device/impl/DeviceDisplayImplz{|}~~����~�~ java/io/FileWriter ��  �� A<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

 <html>
 	<head>
 		<title>MicroEmulator</title>
 		</head>
 	<body>
 *		<applet code="org.microemu.applet.Main"
 java/lang/StringBuffer 				width="���� 
" height=" "
� � 				archive="� � , ">
 			<param name="midlet" value="� � 			<param name="device" value=" 		</applet>
 		</body>
 </html>
��� 2org/microemu/app/classloader/InstrumentationConfig�� java/util/jar/JarInputStream�� ���� java/util/jar/JarOutputStream java/io/FileOutputStream �� �����{ ����� .class�� java/io/ByteArrayInputStream ����� java/util/jar/JarEntry ������ � � $org.microemu.app.util.AppletProducer � � /microemu-injected.jar�� org/microemu/Injected.class�� �� 7Cannot find microemu-injected.jar resource in classpath������� java/util/ArrayList�������{�� java/lang/String� � --help -help�� � ������ --midletClass --appletInput java/io/File --deviceInput --midletInput --htmlOutput --appletOutput --deviceOutput --midletOutput java/util/jar/JarFile����{��� � .xml 
device.txt meta-inf�� &org/microemu/app/util/AppletProducer$1 InnerClasses java/net/URL����� 2org/microemu/app/classloader/ExtensionsClassLoader���� �� � � #org.microemu.device.j2se.J2SEDevice�� Error parsing device package:  � � � ��� java/io/IOException� �D--midletClass {midlet class name} 
--appletInput {emulator applet jar input file} 
--deviceInput {device jar input file} 
--midletInput {midlet jar input file} 
--htmlOutput {html output file} 
--appletOutput {emulator applet jar output file} 
--deviceOutput {device jar output file} 
--midletOutput {midlet jar output file} $org/microemu/app/util/AppletProducer java/lang/Object java/lang/Class forName 	initCause ,(Ljava/lang/Throwable;)Ljava/lang/Throwable; #org/microemu/device/impl/DeviceImpl getDeviceDisplay %()Lorg/microemu/device/DeviceDisplay; isResizable ()Z !org/microemu/device/DeviceDisplay getFullWidth ()I getFullHeight getNormalImage "()Ljavax/microedition/lcdui/Image; javax/microedition/lcdui/Image getWidth 	getHeight (Ljava/io/File;)V write (Ljava/lang/String;)V append ,(Ljava/lang/String;)Ljava/lang/StringBuffer; (I)Ljava/lang/StringBuffer; toString getName getDescriptorLocation org/microemu/app/util/IOUtils closeQuietly (Ljava/io/Writer;)V setEnhanceThreadCreation (Z)V 
openStream ()Ljava/io/InputStream; (Ljava/io/InputStream;)V getManifest ()Ljava/util/jar/Manifest; (Ljava/io/OutputStream;)V 1(Ljava/io/OutputStream;Ljava/util/jar/Manifest;)V getNextJarEntry ()Ljava/util/jar/JarEntry; isDirectory ([BII)I java/lang/System 	arraycopy *(Ljava/lang/Object;ILjava/lang/Object;II)V endsWith (Ljava/lang/String;)Z ([BII)V .org/microemu/app/classloader/ClassPreprocessor 
instrument M(Ljava/io/InputStream;Lorg/microemu/app/classloader/InstrumentationConfig;)[B putNextEntry (Ljava/util/zip/ZipEntry;)V getResource "(Ljava/lang/String;)Ljava/net/URL; equals (Ljava/lang/Object;)Z ([B)I org/microemu/log/Logger error java/util/List add iterator ()Ljava/util/Iterator; java/util/Iterator hasNext next ()Ljava/lang/Object; remove out Ljava/io/PrintStream; java/io/PrintStream println exit (I)V entries ()Ljava/util/Enumeration; java/util/Enumeration hasMoreElements nextElement toLowerCase 
startsWith toURI ()Ljava/net/URI; java/net/URI toURL ()Ljava/net/URL; getClass ()Ljava/lang/Class; getClassLoader ()Ljava/lang/ClassLoader; )([Ljava/net/URL;Ljava/lang/ClassLoader;)V create (Lorg/microemu/EmulatorContext;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;)Lorg/microemu/device/impl/DeviceImpl; copyFile (Ljava/io/File;Ljava/io/File;)V printStackTrace ! � �     � �  �      � �  �       � �  �   /     *� �    �       B �        � �   	 � �  �  �  
  p+� � � 	 � +� � 
 6+� �  6� +� � 6+� � 6:� Y*� :� � � � � � � � � Y� � � � �  � � !� � Y� "� � #� $� � !� � � Y� � #� $� � !� � Y� -� #� %� � !� � Y� &� ,� %� � !� +� '� #� Y� (� +� '� %� � !� )� *� +� � ,� :	� ,	��  =]e  ege    �   z    H  I  J ( L 1 M : P = R G S N T U U \ V c W j X q Y x Z  [ � \ � ] � ^ � ` a! b( cH eO fV g] ib je io k �   p    � �  %  � �   p � �    p � �   p � �   p � �   p � �   p � �  1? � �  :6 � �  =3 � �  �     � 	 � �  �  F    �MN:� -Y� .:� /� 0Y*� 1� 2M,� 3:� � 4Y� 5Y+� 6� 7:� � 4Y� 5Y+� 6� 8: �:,� 9Y:� �� :���� ;:	6
�6,
� <Y6� 6
`6
 6
`����
`�:�� =:���:
6	>� ?� � @Y
� A� B:�6� CY	� D� E� F��Z� G� H� IY� G� � GJ� K:		� T� 0Y	� 1� 2N-� 9Y:� B� ;L� M���� CY� ;� D� E-� NY6
� 
� F�����O� P,� Q-� Q� R� :,� Q-� Q� R��  {�  ���    �   � 2   n  o  p  q  r  t " u ( v - w A y T | [ ~ e  m � t � w � | � � � � � � � � � � � � � � � � � � � � � � � � � � � � � � �  �% �2 �< �I �Z �f �s �v �{ � �� �� �� �� �� �� � �   �  �  � �  t � � � 	 w � � � 
 � x � �  | � � �  � > � �  � : � � c  � � 
 (S � �  [  � �  b � �   [ � � 	  � � �    � � �  � � �  � � �  � � �  � � �  �     � 	 � �  �      �LMN:::::� SY� T:	6

*�� 	*
2� U W�
���	� V :

� W �h
� X � Y:
� Z [� M� \� M� � ]� ^� _� `�.a� M� 
� X � YL
� Z �b� M� � cY
� X � Y� dM
� Z � �e� M� � cY
� X � Y� dN
� Z � �f� M�  � cY
� X � Y� d:
� Z � �g� M�  � cY
� X � Y� d:
� Z � uh� M�  � cY
� X � Y� d:
� Z � Ni� M�  � cY
� X � Y� d:
� Z � 'j� M� � cY
� X � Y� d:
� Z ���+� $,�  -� � � � � � � ]� ^� _� `::� kY-� l:� m:� n � C� o � C� ;:� pq� ?� � pr� ?� � ps� t� 
:� ���� P� uY� v:� w:-� x� yS� zY� {� |� }:� ~� � IY� ~� � ~� �:� !� ]� Y� �� � � !� _� `+� �� x� y� �,� �-� �� 
:� �� `� ��� �  �  * J   �  �  �  � 	 �  �  �  �  �  � ( � 4 � : � C � M � Y � ` � t � } � � � � � � � � � � � � � � � � � � � � � � � � �  �3 �= �G �Z �d �n �� �� �� �� �� �� �� �� �� �� �� �� � � �; �? �B �E �J �S$Y%d&w'�*�+�,�/�0�1�2�5�3�4�7�8 �   �  !  � � 
 YV � �  . � � � J � � S D � � Y > � � w   � � � � � � � � � � � � � � �  � �   � � �   � � �  � � �  � � �  	� � �  � � �  � � �  � � �  � � �  � � � 	 C� � � 
 
 � �  �         ��    �      <  � �  �   N     *� �L� Y� +� �        �       � �       � �     � �   �      �    �^   
  u     