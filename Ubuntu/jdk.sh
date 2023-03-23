#!/bin/bash


sudo apt update -y
sudo apt install curl -y


## Criando diretorio Programas onde vao
## ficar os programaas que precisao de
## dwonloads para serem istalados
mkdir /home/$USER/Downloads/Programas/


## Entrando na para pasta de programas
cd /home/$USER/Downloads/Programas/


## Download JDK-17
echo -e "\n\n\n JDK-17"
if [ -e jdk-17.0.6_linux-x64_bin.deb ];then
    echo "O arquivo  jdk-17.0.6_linux-x64_bin.deb  ja existe"
else
    curl -L -o jdk-17.0.6_linux-x64_bin.deb https://www.dropbox.com/s/85mabivjndd9k2l/jdk-17.0.6_linux-x64_bin.deb?dl=0
fi


chmod +x jdk-17.0.6_linux-x64_bin.deb
sudo dpkg -i jdk-17.0.6_linux-x64_bin.deb
sudo apt --fix-broken install -y
