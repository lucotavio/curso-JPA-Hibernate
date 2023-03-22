#!/bin/bash


## Criando diretorio Programas onde vao
## ficar os programaas que precisao de
## dwonloads para serem istalados
mkdir /home/$USER/Downloads/Programas/


## Entrando na para pasta de programas
cd /home/$USER/Downloads/Programas/


## Download DBeaver
echo -e "\n\n\n DBeaver"
if [ -e dbeaver-ce-23.0.0-stable.x86_64.rpm ];then
    echo "O arquivo  dbeaver-ce-23.0.0-stable.x86_64.rpm  ja existe"
else
    curl -L -o dbeaver-ce-23.0.0-stable.x86_64.rpm https://www.dropbox.com/s/y5w6no06nbejys5/dbeaver-ce-23.0.0-stable.x86_64.rpm?dl=0
fi

chmod +x dbeaver-ce-23.0.0-stable.x86_64.rpm
sudo dnf localinstall dbeaver-ce-23.0.0-stable.x86_64.rpm -y
