#!/bin/bash

## Download JDK-17
echo -e "\n\n\n JDK-17"
if [ -e jdk-17.0.6_linux-x64_bin.rpm ];then
    echo "O arquivo  jdk-17.0.6_linux-x64_bin.rpm  ja existe"
else
    curl -L -o jdk-17.0.6_linux-x64_bin.rpm https://www.dropbox.com/s/5ycket71xq9v4qk/jdk-17.0.6_linux-x64_bin.rpm?dl=0
fi

chmod +x jdk-17.0.6_linux-x64_bin.rpm

sudo dnf localinstall jdk-17.0.6_linux-x64_bin.rpm -y

sudo mv /usr/lib/jvm/jdk-17-oracle-x64/ /usr/lib/jvm/jdk-17/


if [ -e /home/$USER/.bashrc ];then
    echo "O arquivo  /home/$USER/.bashrc  ja existe"
else
    touch .bashrc
fi

echo "export JAVA_HOME=/usr/lib/jvm/jdk-17" >> /home/$USER/.bashrc
echo "export PATH=\$PATH:\$JAVA_HOME/bin" >> /home/$USER/.bashrc

source /home/luciano/.bashrc
