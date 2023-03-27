#!/bin/bash


sudo apt update -y
sudo apt install curl -y


## Criando diretorio Programas onde vao
## ficar os programaas que precisao de
## dwonloads para serem istalados
mkdir /home/$USER/Downloads/Programas/


## Entrando na para pasta de programas
cd /home/$USER/Downloads/Programas/


## Download Pasta Docker Compose
echo -e "\n\n\n Pasta Docker Compose"
if [ -d docker-compose-main ];then
    echo "O diretorio  docker-compose-main  ja existe"
else
    curl -L -o docker-compose-main.tar.gz https://www.dropbox.com/s/xm5t6568qsjbhey/docker-compose-main.tar.gz?dl=0
    tar xvzf docker-compose-main.tar.gz
    rm docker-compose-main.tar.gz
fi


cd /home/$USER/Downloads/Programas/docker-compose-main/postgres/
sudo docker-compose up -d
