DESCRIPTION = "Indoor Comfort production image"

inherit core-image

IMAGE_FEATURES_append = " \
    splash \
"

IMAGE_INSTALL_append = " \
    kernel-modules \
    ntp \
    aufs-util \
    docker \
    waired-network \
    linux-firmware-brcm43430 \
    bluez5 \
    i2c-tools \
    python-smbus \
    bridge-utils \
    hostapd \
    dhcp-server \
    iptables \
    wpa-supplicant \
"

IMAGE_ROOTFS_EXTRA_SPACE_append += "+ 1067008"