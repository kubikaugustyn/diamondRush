����   0 "   getName ()Ljava/lang/String; deleteRecordStore (Ljava/lang/String;)V 
Exceptions    openRecordStore 9(Ljava/lang/String;Z)Ljavax/microedition/rms/RecordStore; listRecordStores ()[Ljava/lang/String; saveChanges &(Lorg/microemu/util/RecordStoreImpl;)V ! getSizeAvailable &(Lorg/microemu/util/RecordStoreImpl;)I init (Lorg/microemu/MicroEmulator;)V deleteStores ()V setRecordListener -(Lorg/microemu/util/ExtendedRecordListener;)V fireRecordStoreListener (ILjava/lang/String;)V 
SourceFile RecordStoreManager.java org/microemu/RecordStoreManager java/lang/Object 3javax/microedition/rms/RecordStoreNotFoundException +javax/microedition/rms/RecordStoreException 2javax/microedition/rms/RecordStoreNotOpenException       
              	 
        	              	                          