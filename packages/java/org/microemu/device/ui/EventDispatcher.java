ΚώΊΎ   0 
  U	  V	  W	  X	  Y	  Z [	  \	  ]	  ^ _
 ` a
  b c	 ) d e
  f
  g
  h
  i
  j
  k
  l
  m
  n
  o p
  q
  r
 ) s t u RunnableEvent InnerClasses v HideNotifyEvent w ShowNotifyEvent PointerEvent 
PaintEvent x Event EVENT_DISPATCHER_NAME Ljava/lang/String; ConstantValue y maxFps I 	cancelled Z head .Lorg/microemu/device/ui/EventDispatcher$Event; tail scheduledPaintEvent 3Lorg/microemu/device/ui/EventDispatcher$PaintEvent; scheduledPointerDraggedEvent 5Lorg/microemu/device/ui/EventDispatcher$PointerEvent; serviceRepaintsLock Ljava/lang/Object; lastPaintEventTime J <init> ()V Code LineNumberTable LocalVariableTable this (Lorg/microemu/device/ui/EventDispatcher; run e  Ljava/lang/InterruptedException; 
difference event cancel put 1(Lorg/microemu/device/ui/EventDispatcher$Event;)V (Ljava/lang/Runnable;)V runnable Ljava/lang/Runnable; serviceRepaints post <clinit> 
SourceFile EventDispatcher.java > ? 1 2 3 4 5 4 6 7 8 9 java/lang/Object : ; < = / 0 1org/microemu/device/ui/EventDispatcher$PaintEvent z { | } ~ java/lang/InterruptedException  4 3org/microemu/device/ui/EventDispatcher$PointerEvent   } ? Q L  ?  ?           4org/microemu/device/ui/EventDispatcher$RunnableEvent >  K L E ? &org/microemu/device/ui/EventDispatcher java/lang/Runnable 6org/microemu/device/ui/EventDispatcher$HideNotifyEvent 6org/microemu/device/ui/EventDispatcher$ShowNotifyEvent ,org/microemu/device/ui/EventDispatcher$Event event-thread java/lang/System currentTimeMillis ()J wait (J)V next 
access$000 8(Lorg/microemu/device/ui/EventDispatcher$PointerEvent;)S 	notifyAll notify merge 6(Lorg/microemu/device/ui/EventDispatcher$PaintEvent;)V 
access$100 8(Lorg/microemu/device/ui/EventDispatcher$PointerEvent;)I 
access$102 9(Lorg/microemu/device/ui/EventDispatcher$PointerEvent;I)I 
access$200 
access$202 ?(Lorg/microemu/device/ui/EventDispatcher;Ljava/lang/Runnable;)V !      	  + ,  -    . 	 / 0   B 1 2    3 4    5 4    6 7    8 9    : ;    < =     > ?  @   x     .*· *΅ *΅ *΅ *΅ *΅ *» Y· ΅ *	΅ 	±    A   & 	   1  # 	 %  '  )  +  - ( / - 2 B       . C D    E ?  @  Ϋ     Ω*΄  ΤL*YMΒ*΄ Ζ r*΄ L² 
 5+Α  .Έ *΄ 	eB!θ² 
l L*θ² 
l!eΆ § :+Ζ 9*+΄ ΅ *΄ Η *΅ +Α  +ΐ Έ   *΅ § *Ά § N,Γ§ 
:,ΓΏ+Ζ =+Α  1*΄ YMΒ*΅ *Έ ΅ 	*+Ά *΄ Ά ,Γ§ 
:,ΓΏ§ *+Ά §?+±  > L O                © Γ Ζ   Ζ Κ Ζ    A    !   6  7 	 8  9  :  < & = / > < ? > A L C O B Q G U H ] I d J i L { M  R  T  S  V  X  Y ’ Z © [ ? \ ΅ ] Ί ^ Α _ Π a Υ d Ψ e B   4  Q   F G  / " H =     F G  	 Μ I 4    Ω C D    J ?  @   b     *΅ *YLΒ*Ά +Γ§ M+Γ,Ώ±  	           A       k  l 	 m  n  o B        C D    K L  @  :     ²*YMΒ+Α  *΄ Ζ *΄ +ΐ Ά § +Α  6*΄ Ζ /+ΐ Έ   $*΄ +ΐ Έ Έ W*΄ +ΐ Έ Έ W§ P+Α  *+ΐ ΅ +Α  +ΐ Έ   *+ΐ ΅ *΄ Ζ *΄ +΅ *+΅ *΄ Η *+΅ *Ά ,Γ§ N,Γ-Ώ±   © ¬   ¬ ― ¬    A   J    r  s  t   u 9 w H x Z z a { i } { ~           £  §  ±  B       ² C D     ² I 4   K M  @   F     *» Y*+· Ά ±    A   
       B        C D      N O   P ?  @   Ι     9*΄ YLΒ*YMΒ*΄ Η ,Γ+Γ±,Γ§ N,Γ-Ώ*΄ Ά § M+Γ§ 
:+ΓΏ±                 ! ( +    1    . 1   1 5 1    A   * 
            !  (  +  ,  8  B     ,   F G    9 C D    Q L  @   =     +Ά ±    A   
    ’  £ B        C D      I 4   R ?  @         ³ 
±    A       !  S    T "   2    !  #  $  %  &    '    (  )  *