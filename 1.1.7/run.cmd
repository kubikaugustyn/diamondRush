@echo off
:run
del /F "C:\Users\Radek Augustyn\Desktop\Kubik\diamondRush\1.1.7\DiamondRush.jar"
"C:\Program Files\7-Zip\7z.exe" a -tzip "C:\Users\Radek Augustyn\Desktop\Kubik\diamondRush\1.1.7\DiamondRush.jar" "C:\Users\Radek Augustyn\Desktop\Kubik\diamondRush\1.1.7\build\classes\*"
cd C:\KubaPrograms\KEmulator
start C:\KubaPrograms\KEmulator\KEmulator.exe "C:\Users\Radek Augustyn\Desktop\Kubik\diamondRush\1.1.7\DiamondRush.jar"
pause
goto run