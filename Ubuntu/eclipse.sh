#!/bin/bash


sudo apt update -y
sudo apt install curl -y


## Criando diretorio Programas onde vao
## ficar os programaas que precisao de
## dwonloads para serem istalados
mkdir /home/$USER/Downloads/Programas/


## Entrando na para pasta de programas
cd /home/$USER/Downloads/Programas/


## Download Eclipse
echo -e "\n\n\n Eclipse"
if [ -e eclipse-jee-2022-12.deb ];then
    echo "O arquivo  eclipse-jee-2022-12.deb  ja existe"
else
    curl -L -o eclipse-jee-2022-12.deb https://www.dropbox.com/s/xx17d0igllesigq/eclipse-jee-2022-12.deb?dl=0
fi

chmod +x eclipse-jee-2022-12.deb
sudo dpkg -i eclipse-jee-2022-12.deb
sudo apt --fix-broken install -y
