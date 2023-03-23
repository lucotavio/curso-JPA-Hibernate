#!/bin/bash

sudo apt update -y
sudo apt install curl -y


## Criando diretorio Programas onde vao
## ficar os programaas que precisao de
## dwonloads para serem istalados
mkdir /home/$USER/Downloads/Programas/


## Entrando na para pasta de programas
cd /home/$USER/Downloads/Programas/


## Download DBeaver
echo -e "\n\n\n DBeaver"
if [ -e dbeaver-ce_23.0.0_amd64.deb ];then
    echo "O arquivo  dbeaver-ce_23.0.0_amd64.deb  ja existe"
else
    curl -L -o dbeaver-ce_23.0.0_amd64.deb https://www.dropbox.com/s/4l7u0l7d1yxn6bp/dbeaver-ce_23.0.0_amd64.deb?dl=0
fi

chmod +x dbeaver-ce_23.0.0_amd64.deb
sudo dpkg -i dbeaver-ce_23.0.0_amd64.deb 
sudo apt --fix-broken install -y
