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
"

IMAGE_ROOTFS_EXTRA_SPACE_append += "+ 1067008"