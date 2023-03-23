#!/bin/bash


sudo apt update -y
sudo apt install curl -y

## Criando diretorio Programas onde vao
## ficar os programaas que precisao de
## dwonloads para serem istalados
mkdir /home/$USER/Downloads/Programas/


## Entrando na para pasta de programas
cd /home/$USER/Downloads/Programas/


## Download Docker Compose
echo -e "\n\n\n Docker Compose"
if [ -e docker-compose ];then
    echo "O arquivo  docker-compose  ja existe"
else
    curl -L -o docker-compose https://www.dropbox.com/s/auvvs0rh9hvn9qr/docker-compose?dl=0
fi

sudo chmod +x docker-compose
sudo cp docker-compose /usr/local/bin/
